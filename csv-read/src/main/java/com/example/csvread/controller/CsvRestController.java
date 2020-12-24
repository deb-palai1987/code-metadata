package com.example.csvread.controller;

import com.example.csvread.dto.MetaData;
import com.example.csvread.service.CsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/csv")
public class CsvRestController {

    @Autowired
    private CsvService csvService;

    @GetMapping("/read")
    public ResponseEntity readCsvData(){
        MetaData dataList = csvService.getCsvDataList();
        return  new ResponseEntity(dataList, HttpStatus.OK);
    }
}
