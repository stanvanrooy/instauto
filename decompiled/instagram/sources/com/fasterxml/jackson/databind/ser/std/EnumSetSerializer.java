package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.EnumSet;
import p000X.C0L;
import p000X.C27148BzD;
import p000X.C27204C1t;

public final class EnumSetSerializer extends AsArraySerializerBase {
    public EnumSetSerializer(C0L c0l) {
        super(EnumSet.class, c0l, true, (C27204C1t) null, (C27148BzD) null, (JsonSerializer) null);
    }

    public EnumSetSerializer(EnumSetSerializer enumSetSerializer, C27148BzD bzD, C27204C1t c1t, JsonSerializer jsonSerializer) {
        super(enumSetSerializer, bzD, c1t, jsonSerializer);
    }
}
