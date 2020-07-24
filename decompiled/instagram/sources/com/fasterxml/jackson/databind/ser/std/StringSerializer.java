package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class StringSerializer extends NonTypedScalarSerializerBase {
    public StringSerializer() {
        super(String.class);
    }
}
