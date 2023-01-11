package com.hhparser;

import com.hhparser.models.AggregatedResult;
import com.hhparser.util.FileReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@Slf4j
public class ApplicationController {
    private final FileReader fileReader;
    private final AggregateService aggregateService;

    public ApplicationController(FileReader fileReader, AggregateService aggregateService) {
        this.fileReader = fileReader;
        this.aggregateService = aggregateService;
    }

    @CrossOrigin
    @PostMapping
    public List<AggregatedResult> getResults(@RequestParam("file") MultipartFile[] files) {
        List<String> strings = fileReader.readFiles(files);
        List<AggregatedResult> aggregate = aggregateService.aggregate(strings);
        AggregatedResult total = aggregate.get(aggregate.size() - 1);
        log.info("aggregate finished " + total.getHands() + " " + total.getProfit());
        return aggregate;
    }
}
