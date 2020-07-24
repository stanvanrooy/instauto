package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$ByteDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$ByteDeserializer A00 = new NumberDeserializers$ByteDeserializer(Byte.TYPE, (byte) 0);
    public static final NumberDeserializers$ByteDeserializer A01 = new NumberDeserializers$ByteDeserializer(Byte.class, (Byte) null);

    public NumberDeserializers$ByteDeserializer(Class cls, Byte b) {
        super(cls, b);
    }
}
