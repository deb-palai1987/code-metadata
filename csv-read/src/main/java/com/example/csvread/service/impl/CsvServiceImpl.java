package com.example.csvread.service.impl;

import com.example.csvread.dao.CsvDao;
import com.example.csvread.dto.MetaData;
import com.example.csvread.service.CsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CsvServiceImpl implements CsvService {
    @Autowired
    private CsvDao csvDao;
    @Override
    public MetaData getCsvDataList() {
        return csvDao.loadCsv();
    }
}
