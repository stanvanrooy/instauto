package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.Iterator;
import p000X.C0L;
import p000X.C27148BzD;
import p000X.C27204C1t;

@JacksonStdImpl
public final class IteratorSerializer extends AsArraySerializerBase {
    public IteratorSerializer(C0L c0l, boolean z, C27204C1t c1t, C27148BzD bzD) {
        super(Iterator.class, c0l, z, c1t, bzD, (JsonSerializer) null);
    }

    public IteratorSerializer(IteratorSerializer iteratorSerializer, C27148BzD bzD, C27204C1t c1t, JsonSerializer jsonSerializer) {
        super(iteratorSerializer, bzD, c1t, jsonSerializer);
    }
}
