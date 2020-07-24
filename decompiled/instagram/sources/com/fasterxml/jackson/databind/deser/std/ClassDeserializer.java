package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class ClassDeserializer extends StdScalarDeserializer {
    public static final ClassDeserializer A00 = new ClassDeserializer();

    public ClassDeserializer() {
        super(Class.class);
    }
}
