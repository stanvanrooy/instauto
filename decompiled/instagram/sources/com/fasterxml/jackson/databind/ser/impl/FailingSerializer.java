package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public final class FailingSerializer extends StdSerializer {
    public final String A00 = "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)";

    public FailingSerializer() {
        super(Object.class);
    }
}
