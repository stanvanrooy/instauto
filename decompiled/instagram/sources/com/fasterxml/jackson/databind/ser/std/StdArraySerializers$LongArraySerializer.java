package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import p000X.C0L;
import p000X.C0w;
import p000X.C27148BzD;
import p000X.C27204C1t;

@JacksonStdImpl
public final class StdArraySerializers$LongArraySerializer extends StdArraySerializers$TypedPrimitiveArraySerializer {
    public static final C0L A00 = new C0w(Long.TYPE);

    public StdArraySerializers$LongArraySerializer() {
        super(long[].class);
    }

    public StdArraySerializers$LongArraySerializer(StdArraySerializers$LongArraySerializer stdArraySerializers$LongArraySerializer, C27148BzD bzD, C27204C1t c1t) {
        super(stdArraySerializers$LongArraySerializer, bzD, c1t);
    }
}
