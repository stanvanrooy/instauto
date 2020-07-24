package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$DoubleDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$DoubleDeserializer A00 = new NumberDeserializers$DoubleDeserializer(Double.class, Double.valueOf(0.0d));
    public static final NumberDeserializers$DoubleDeserializer A01 = new NumberDeserializers$DoubleDeserializer(Double.TYPE, (Double) null);

    public NumberDeserializers$DoubleDeserializer(Class cls, Double d) {
        super(cls, d);
    }
}
