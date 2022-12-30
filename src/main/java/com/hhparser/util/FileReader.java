package com.hhparser.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Slf4j
@Component
public class FileReader {

    private static final String PLAIN_TEXT = "text/plain";
    private static final String ZIP_APPLICATION = "application/zip";
    private static final String GG_HAND_HISTORY_SEPARATOR = "\n\n\n";

    public List<String> readFiles(MultipartFile[] files) {
        if (files == null || files.length == 0) {
            return Collections.emptyList();
        }
        List<String> readFiles = new ArrayList<>();
        for (MultipartFile multipartFile : files) {
            readFiles.add(readFile(multipartFile));
        }
        return readFiles.stream()
                .map(strings -> strings.split(GG_HAND_HISTORY_SEPARATOR))
                .flatMap(Arrays::stream)
                .filter(hand -> hand.startsWith("Poker Hand"))
                .toList();
    }

    private String readFile(MultipartFile file) {
        String data = "";
        if (isText(file)) {
            data = readTxtFile(file);
        } else if (isZip(file)) {
            data = readZipFile(file);
        } else {
            log.info("Unsupported file only txt or zip");
        }
        return data;
    }

    private boolean isZip(MultipartFile file) {
        return file.getContentType().equals(ZIP_APPLICATION);
    }

    private boolean isText(MultipartFile file) {
        return file.getContentType().equals(PLAIN_TEXT);
    }

    private String readZipFile(MultipartFile file) {
        StringBuilder hands = new StringBuilder();
        try (ZipInputStream zis = new ZipInputStream(file.getInputStream())) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                if (!entry.isDirectory()) {
                    int read;
                    while ((read = zis.read()) != -1) {
                        hands.append((char) read);
                    }
                }
            }
        } catch (IOException e) {
            log.error("File not found or bad file: " + e.getMessage());
        }
        return hands.toString();
    }

    private String readTxtFile(MultipartFile file) {
        StringBuilder hands = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                hands.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            log.error("File not found or bad file: " + e.getMessage());
        }
        return hands.toString();
    }

}
