package com.hhparser;

import com.hhparser.models.AggregatedResult;
import com.hhparser.models.Stake;
import com.hhparser.util.FileReader;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
public class ApplicationController {
    private final FileReader fileReader;
    private final AggregateService aggregateService;

    public ApplicationController(FileReader fileReader, AggregateService aggregateService) {
        this.fileReader = fileReader;
        this.aggregateService = aggregateService;
    }

    @CrossOrigin
    @PostMapping
    public Map<Stake, AggregatedResult> getResults(@RequestParam("file") MultipartFile[] files) {
        List<String> strings = fileReader.readFiles(files);
        return aggregateService.aggregate(strings);
    }

    @CrossOrigin
    @GetMapping
    public String getResults() {
        return "test";
    }
}
