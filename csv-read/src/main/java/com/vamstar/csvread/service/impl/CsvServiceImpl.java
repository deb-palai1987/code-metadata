package com.vamstar.csvread.service.impl;

import com.vamstar.csvread.dao.CsvDao;
import com.vamstar.csvread.dto.MetaData;
import com.vamstar.csvread.service.CsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CsvServiceImpl implements CsvService {
    @Autowired
    private CsvDao csvDao;
    @Override
    public MetaData getCsvDataList() {
        return csvDao.loadCsv();
    }
}
