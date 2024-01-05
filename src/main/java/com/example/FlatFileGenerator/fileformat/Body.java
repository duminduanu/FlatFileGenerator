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
public class Body {

    @Field(length = 14, at = 20)
    private String referenceNo;

    @Field(length = 16, at = 40)
    private String amount;
}
