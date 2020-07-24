package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.List;
import p000X.C0L;
import p000X.C27148BzD;
import p000X.C27204C1t;

@JacksonStdImpl
public final class IndexedListSerializer extends AsArraySerializerBase {
    public IndexedListSerializer(C0L c0l, boolean z, C27204C1t c1t, C27148BzD bzD, JsonSerializer jsonSerializer) {
        super(List.class, c0l, z, c1t, bzD, jsonSerializer);
    }

    public IndexedListSerializer(IndexedListSerializer indexedListSerializer, C27148BzD bzD, C27204C1t c1t, JsonSerializer jsonSerializer) {
        super(indexedListSerializer, bzD, c1t, jsonSerializer);
    }
}
