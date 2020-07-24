package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import p000X.C06;
import p000X.C0L;
import p000X.C0w;
import p000X.C27148BzD;
import p000X.C27200C1k;
import p000X.C35;

@JacksonStdImpl
public final class StringArraySerializer extends ArraySerializerBase implements C35 {
    public static final StringArraySerializer A01 = new StringArraySerializer();
    public static final C0L A02 = new C0w(String.class);
    public final JsonSerializer A00;

    public final JsonSerializer AAL(C06 c06, C27148BzD bzD) {
        JsonSerializer jsonSerializer;
        C27200C1k APy;
        Object A0T;
        if (bzD == null || (APy = bzD.APy()) == null || (A0T = c06.A05.A01().A0T(APy)) == null) {
            jsonSerializer = null;
        } else {
            jsonSerializer = c06.A08(APy, A0T);
        }
        if (jsonSerializer == null) {
            jsonSerializer = this.A00;
        }
        JsonSerializer A012 = StdSerializer.A01(c06, bzD, jsonSerializer);
        if (A012 == null) {
            A012 = c06.A0A(String.class, bzD);
        } else if (A012 instanceof C35) {
            A012 = ((C35) A012).AAL(c06, bzD);
        }
        if (StdSerializer.A04(A012)) {
            A012 = null;
        }
        if (A012 == this.A00) {
            return this;
        }
        return new StringArraySerializer(this, bzD, A012);
    }

    public StringArraySerializer() {
        super(String[].class, (C27148BzD) null);
        this.A00 = null;
    }

    public StringArraySerializer(StringArraySerializer stringArraySerializer, C27148BzD bzD, JsonSerializer jsonSerializer) {
        super((ArraySerializerBase) stringArraySerializer, bzD);
        this.A00 = jsonSerializer;
    }
}
