package com.example.FlatFileGenerator.configuration;

import org.beanio.StreamFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;

@Configuration
public class BeanIOConfig {

    @Bean
    public StreamFactory streamFactory() throws Exception {
        StreamFactory factory = StreamFactory.newInstance();
        InputStream mappingStream = BeanIOConfig.class.getClassLoader().getResourceAsStream("BeanMappingFile.xml");
        factory.load(mappingStream);
        return factory;
    }

}
