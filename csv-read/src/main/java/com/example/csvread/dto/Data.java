package com.example.csvread.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data

public class Data {

    @CsvBindByName(column = "No")
    private Integer no;
    @CsvBindByName(column = "Country")
    private String  country;
    @CsvBindByName(column = "Level of development")
    private String levelOfDevelopment;
    @CsvBindByName(column = "European Union Membership")
    private String europeanUnionMembership;
    @CsvBindByName(column = "Currency")
    private Float currency;
    @CsvBindByName(column = "Women Entrepreneurship Index")
    private Float womenEntrepreneurshipIndex;
    @CsvBindByName(column = "Entrepreneurship Index")
    private Float entrepreneurshipIndex;
    @CsvBindByName(column = "Inflation rate")
    private Float inflationRate;
    @CsvBindByName(column = "Female Labor Force Participation Rate")
    private Float femaleLaborParticipationRate;



}
