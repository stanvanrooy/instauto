package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import p000X.C27204C1t;

public final class TypeWrappedSerializer extends JsonSerializer {
    public final JsonSerializer A00;
    public final C27204C1t A01;

    public TypeWrappedSerializer(C27204C1t c1t, JsonSerializer jsonSerializer) {
        this.A01 = c1t;
        this.A00 = jsonSerializer;
    }
}
