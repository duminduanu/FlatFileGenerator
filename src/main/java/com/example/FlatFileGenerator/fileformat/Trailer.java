package com.example.FlatFileGenerator.fileformat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Record;
@Record
@Getter
@Setter
@NoArgsConstructor
public class Trailer {
    @Field(length = 1, at = 1)
    private String recordType;

    @Field(length = 15, at = 14)
    private String fileType;
}
