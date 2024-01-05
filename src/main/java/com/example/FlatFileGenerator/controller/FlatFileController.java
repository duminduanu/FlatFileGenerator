package com.example.FlatFileGenerator.controller;

import com.example.FlatFileGenerator.FlatFileGeneratorApplication;
import com.example.FlatFileGenerator.configuration.BeanIOConfig;
import com.example.FlatFileGenerator.service.FlatFileService;
import org.springframework.stereotype.Controller;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class FlatFileController {

    public void writeFlatFile(){

        try {

            BeanIOConfig beanIOConfig = new BeanIOConfig();

            FlatFileService flatFileService = new FlatFileService(beanIOConfig.streamFactory());

            flatFileService.writeFlatFile();

        }catch(Exception e){
            Logger.getLogger(FlatFileGeneratorApplication.class.getName()).log(Level.WARNING, "", e);
        }



    }


}
