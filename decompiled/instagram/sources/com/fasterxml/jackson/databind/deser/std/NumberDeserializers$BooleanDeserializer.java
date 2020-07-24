package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$BooleanDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$BooleanDeserializer A00 = new NumberDeserializers$BooleanDeserializer(Boolean.class, Boolean.FALSE);
    public static final NumberDeserializers$BooleanDeserializer A01 = new NumberDeserializers$BooleanDeserializer(Boolean.TYPE, (Boolean) null);

    public NumberDeserializers$BooleanDeserializer(Class cls, Boolean bool) {
        super(cls, bool);
    }
}
