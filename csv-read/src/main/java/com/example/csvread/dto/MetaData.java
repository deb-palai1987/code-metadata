package com.example.csvread.dto;

import lombok.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MetaData {
    private List<String> columnNames = new ArrayList<>();
    private double csvFileSizeInKB;
    private Integer noOfRows;
    public void addColumn(String column){
        columnNames.add(column);
    }
}
