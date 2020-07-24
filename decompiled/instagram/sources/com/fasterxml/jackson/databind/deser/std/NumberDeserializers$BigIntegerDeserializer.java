package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigInteger;

@JacksonStdImpl
public final class NumberDeserializers$BigIntegerDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$BigIntegerDeserializer A00 = new NumberDeserializers$BigIntegerDeserializer();

    public NumberDeserializers$BigIntegerDeserializer() {
        super(BigInteger.class);
    }
}
