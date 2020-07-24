package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigDecimal;

@JacksonStdImpl
public final class NumberDeserializers$BigDecimalDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$BigDecimalDeserializer A00 = new NumberDeserializers$BigDecimalDeserializer();

    public NumberDeserializers$BigDecimalDeserializer() {
        super(BigDecimal.class);
    }
}
