package com.example.csvread.service;

import com.example.csvread.dto.MetaData;

@FunctionalInterface
public interface CsvService {
    public MetaData getCsvDataList();
}
