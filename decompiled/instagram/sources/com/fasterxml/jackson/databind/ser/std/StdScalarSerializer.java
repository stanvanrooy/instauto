package com.fasterxml.jackson.databind.ser.std;

public abstract class StdScalarSerializer extends StdSerializer {
    public StdScalarSerializer(Class cls) {
        super(cls);
    }

    public StdScalarSerializer(Class cls, boolean z) {
        super(cls);
    }
}
