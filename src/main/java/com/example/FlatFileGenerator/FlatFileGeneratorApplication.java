package com.example.FlatFileGenerator;

import com.example.FlatFileGenerator.controller.FlatFileController;
import com.example.FlatFileGenerator.controller.JasperFileController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlatFileGeneratorApplication {


	public static void main(String[] args) {

		SpringApplication.run(FlatFileGeneratorApplication.class, args);


		FlatFileController flatFileController = new FlatFileController();
		flatFileController.writeFlatFile();

		JasperFileController jasperFileController = new JasperFileController();
		jasperFileController.generateJasperFile();



	}

}
