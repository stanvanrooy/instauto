package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class ToStringSerializer extends StdSerializer {
    public static final ToStringSerializer A00 = new ToStringSerializer();

    public ToStringSerializer() {
        super(Object.class);
    }
}
