package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class BooleanSerializer extends NonTypedScalarSerializerBase {
    public BooleanSerializer() {
        super(Boolean.class);
    }
}
