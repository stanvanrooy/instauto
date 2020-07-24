package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import p000X.C06;
import p000X.C0L;
import p000X.C27148BzD;
import p000X.C27200C1k;
import p000X.C27204C1t;
import p000X.C27207C1y;
import p000X.C27217C2o;
import p000X.C35;

@JacksonStdImpl
public final class ObjectArraySerializer extends ArraySerializerBase implements C35 {
    public JsonSerializer A00;
    public C27207C1y A01;
    public final C0L A02;
    public final C27204C1t A03;
    public final boolean A04;

    public final JsonSerializer AAL(C06 c06, C27148BzD bzD) {
        C27200C1k APy;
        Object A0T;
        C27204C1t c1t = this.A03;
        if (c1t != null) {
            c1t = c1t.A00(bzD);
        }
        JsonSerializer jsonSerializer = null;
        if (!(bzD == null || (APy = bzD.APy()) == null || (A0T = c06.A05.A01().A0T(APy)) == null)) {
            jsonSerializer = c06.A08(APy, A0T);
        }
        if (jsonSerializer == null) {
            jsonSerializer = this.A00;
        }
        JsonSerializer A012 = StdSerializer.A01(c06, bzD, jsonSerializer);
        if (A012 == null) {
            if (this.A02 != null && (this.A04 || ContainerSerializer.A05(c06, bzD))) {
                A012 = c06.A07(this.A02, bzD);
            }
        } else if (A012 instanceof C35) {
            A012 = ((C35) A012).AAL(c06, bzD);
        }
        if (this.A00 == bzD && A012 == this.A00 && this.A03 == c1t) {
            return this;
        }
        return new ObjectArraySerializer(this, bzD, c1t, A012);
    }

    public ObjectArraySerializer(C0L c0l, boolean z, C27204C1t c1t, JsonSerializer jsonSerializer) {
        super(Object[].class, (C27148BzD) null);
        this.A02 = c0l;
        this.A04 = z;
        this.A03 = c1t;
        this.A01 = C27217C2o.A00;
        this.A00 = jsonSerializer;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, C27148BzD bzD, C27204C1t c1t, JsonSerializer jsonSerializer) {
        super((ArraySerializerBase) objectArraySerializer, bzD);
        this.A02 = objectArraySerializer.A02;
        this.A03 = c1t;
        this.A04 = objectArraySerializer.A04;
        this.A01 = objectArraySerializer.A01;
        this.A00 = jsonSerializer;
    }
}
