package com.example.FlatFileGenerator.controller;

import com.example.FlatFileGenerator.FlatFileGeneratorApplication;
import com.example.FlatFileGenerator.dto.ReportDto;
import com.example.FlatFileGenerator.fileformat.Body;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Controller;

import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class JasperFileController {

    public void generateJasperFile(){

        try(InputStream inputStream = getClass().getResourceAsStream("/static/reports/ItemsReport.jrxml")) {

            JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);


            List<ReportDto> reportDtos = new ArrayList<>();

            ReportDto dto1 = new ReportDto();
            dto1.setDate(new Date());
            dto1.setReferenceNo("6813162459");
            dto1.setAmount(new BigDecimal("2.00"));
            dto1.setStatus("Active");
            dto1.setRemark("test value");

            reportDtos.add(dto1);

            ReportDto dto2 = new ReportDto();
            dto2.setDate(new Date());
            dto2.setReferenceNo("2039229524");
            dto2.setAmount(new BigDecimal("10.00"));
            dto2.setStatus("Active");
            dto2.setRemark("test value");

            reportDtos.add(dto2);

            ReportDto dto3 = new ReportDto();
            dto3.setDate(new Date());
            dto3.setReferenceNo("2299488320");
            dto3.setAmount(new BigDecimal("5.00"));
            dto3.setStatus("Active");
            dto3.setRemark("test value");

            reportDtos.add(dto3);


            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(reportDtos);

            Map<String, Object> parameters = new HashMap<>();

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

            JasperExportManager.exportReportToPdfFile(jasperPrint, "itemReort.pdf");

        } catch (Exception e) {
            Logger.getLogger(FlatFileGeneratorApplication.class.getName()).log(Level.WARNING, "", e);
        }


    }

}
