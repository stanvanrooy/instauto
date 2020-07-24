package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public final class UnknownSerializer extends StdSerializer {
    public UnknownSerializer() {
        super(Object.class);
    }
}
