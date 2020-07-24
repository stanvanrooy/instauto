package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import p000X.C0L;
import p000X.C27148BzD;
import p000X.C27204C1t;

@JacksonStdImpl
public final class IterableSerializer extends AsArraySerializerBase {
    public IterableSerializer(C0L c0l, boolean z, C27204C1t c1t, C27148BzD bzD) {
        super(Iterable.class, c0l, z, c1t, bzD, (JsonSerializer) null);
    }

    public IterableSerializer(IterableSerializer iterableSerializer, C27148BzD bzD, C27204C1t c1t, JsonSerializer jsonSerializer) {
        super(iterableSerializer, bzD, c1t, jsonSerializer);
    }
}
