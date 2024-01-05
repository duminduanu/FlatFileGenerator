package com.example.FlatFileGenerator.service;

import com.example.FlatFileGenerator.fileformat.Body;
import com.example.FlatFileGenerator.fileformat.HeaderFile;
import com.example.FlatFileGenerator.fileformat.Trailer;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class FlatFileService {

    private final StreamFactory streamFactory;

    @Autowired
    public FlatFileService(StreamFactory streamFactory) {
        this.streamFactory = streamFactory;
    }

    public void writeFlatFile(){

        BeanWriter writer = streamFactory.createWriter("textFlatFile", new File("text.txt"));

        HeaderFile header = new HeaderFile();
        writer.write(header);

        Body body1 = new Body();
        body1.setReferenceNo("6813162459");
        body1.setAmount("RM2.00");
        writer.write(body1);

        Body body2 = new Body();
        body2.setReferenceNo("2039229524");
        body2.setAmount("RM10.00");
        writer.write(body1);

        Body body3 = new Body();
        body3.setReferenceNo("2299488320");
        body3.setAmount("RM5.00");
        writer.write(body1);

        Trailer trailer = new Trailer();
        writer.write(trailer);

        writer.close();

    }


}
