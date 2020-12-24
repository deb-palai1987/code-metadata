package com.vamstar.csvread.dao.impl;

import com.vamstar.csvread.dao.CsvDao;
import com.vamstar.csvread.dto.MetaData;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Collections;

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
