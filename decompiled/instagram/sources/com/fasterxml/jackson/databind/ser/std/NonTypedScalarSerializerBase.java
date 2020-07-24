package com.fasterxml.jackson.databind.ser.std;

public abstract class NonTypedScalarSerializerBase extends StdScalarSerializer {
    public NonTypedScalarSerializerBase(Class cls) {
        super(cls);
    }
}
