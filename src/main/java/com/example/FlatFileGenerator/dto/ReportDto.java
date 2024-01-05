package com.example.FlatFileGenerator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReportDto {

    private Date date;
    private String referenceNo;
    private BigDecimal amount;
    private String status;
    private String remark;


}
