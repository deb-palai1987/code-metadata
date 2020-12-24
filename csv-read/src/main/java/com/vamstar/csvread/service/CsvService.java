package com.vamstar.csvread.service;

import com.vamstar.csvread.dto.MetaData;

import java.util.List;

@FunctionalInterface
public interface CsvService {
    public MetaData getCsvDataList();
}
