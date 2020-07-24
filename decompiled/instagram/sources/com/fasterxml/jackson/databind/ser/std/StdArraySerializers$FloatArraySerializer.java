package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import p000X.C0L;
import p000X.C0w;
import p000X.C27148BzD;
import p000X.C27204C1t;

@JacksonStdImpl
public final class StdArraySerializers$FloatArraySerializer extends StdArraySerializers$TypedPrimitiveArraySerializer {
    public static final C0L A00 = new C0w(Float.TYPE);

    public StdArraySerializers$FloatArraySerializer() {
        super(float[].class);
    }

    public StdArraySerializers$FloatArraySerializer(StdArraySerializers$FloatArraySerializer stdArraySerializers$FloatArraySerializer, C27148BzD bzD, C27204C1t c1t) {
        super(stdArraySerializers$FloatArraySerializer, bzD, c1t);
    }
}
