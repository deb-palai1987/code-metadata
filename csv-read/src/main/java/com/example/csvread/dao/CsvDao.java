package com.example.csvread.dao;

import com.example.csvread.dto.MetaData;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Optional;

@FunctionalInterface
public interface CsvDao {
    public static final String CSV_SOURCE_URL="https://raw.githubusercontent.com/vamstar/challenge/master/Dataset3.csv";
    public MetaData loadCsv();

    public default MetaData processCsvReader(Reader reader) throws IOException, CsvValidationException {
        MetaData metaData= new MetaData();

        if(Optional.ofNullable(reader).isPresent()){
            CSVReader csvReader=new CSVReader(reader);
            int counter =1;
            String[] strings = null;
            while((strings =csvReader.readNext())!=null){
                if(counter==1){
                    for (String s : strings){
                        metaData.addColumn(s);
                    }
                }
                counter++;
            }
            metaData.setNoOfRows(counter);
            metaData.setCsvFileSizeInKB(getCsvFileSizeInKb(new URL(CSV_SOURCE_URL)));
        }
        return metaData;
    }

    private double getCsvFileSizeInKb(URL url) throws IOException {
        URLConnection urlConnection=url.openConnection();
        if(urlConnection instanceof HttpURLConnection) {
            ((HttpURLConnection)urlConnection).setRequestMethod("HEAD");
        }
        urlConnection.getInputStream();
        return urlConnection.getContentLength()/1024;
    }
}
