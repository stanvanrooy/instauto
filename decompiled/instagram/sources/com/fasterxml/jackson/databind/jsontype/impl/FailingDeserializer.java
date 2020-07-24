package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class FailingDeserializer extends StdDeserializer {
    public final String A00 = "No _valueDeserializer assigned";

    public FailingDeserializer() {
        super(Object.class);
    }
}
