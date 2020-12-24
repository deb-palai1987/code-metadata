package com.example.csvread.dao.impl;

import com.example.csvread.dto.MetaData;
import com.example.csvread.dao.CsvDao;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

@Component
public class CsvDaoImpl implements CsvDao {
    @Override
    public MetaData loadCsv() {

        try(Reader reader = new BufferedReader(new InputStreamReader(new URL(CsvDao.CSV_SOURCE_URL).openStream()))){
            return this.processCsvReader(reader);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
