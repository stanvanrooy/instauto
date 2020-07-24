package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$IntegerDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$IntegerDeserializer A00 = new NumberDeserializers$IntegerDeserializer(Integer.class, 0);
    public static final NumberDeserializers$IntegerDeserializer A01 = new NumberDeserializers$IntegerDeserializer(Integer.TYPE, (Integer) null);

    public NumberDeserializers$IntegerDeserializer(Class cls, Integer num) {
        super(cls, num);
    }
}
