package com.fasterxml.jackson.databind.deser.std;

public final class NullifyingDeserializer extends StdDeserializer {
    public static final NullifyingDeserializer A00 = new NullifyingDeserializer();

    public NullifyingDeserializer() {
        super(Object.class);
    }
}
