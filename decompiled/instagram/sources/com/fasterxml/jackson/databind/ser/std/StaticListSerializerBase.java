package com.fasterxml.jackson.databind.ser.std;

public abstract class StaticListSerializerBase extends StdSerializer {
    public StaticListSerializerBase(Class cls) {
        super(cls, false);
    }
}
