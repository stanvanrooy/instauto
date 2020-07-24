package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.Map;
import p000X.C0K;
import p000X.C0L;
import p000X.C27164Bzc;
import p000X.C27175Bzn;

public final class AbstractDeserializer extends JsonDeserializer implements Serializable {
    public final C0L A00;
    public final C27164Bzc A01;
    public final Map A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r3.isAssignableFrom(java.lang.Boolean.class) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r3.isAssignableFrom(java.lang.Integer.class) != false) goto L_0x0035;
     */
    public AbstractDeserializer(C27175Bzn bzn, C0K c0k, Map map) {
        C0L c0l = c0k.A00;
        this.A00 = c0l;
        this.A01 = bzn.A03;
        this.A02 = map;
        Class cls = c0l.A00;
        this.A06 = cls.isAssignableFrom(String.class);
        boolean z = false;
        boolean z2 = cls != Boolean.TYPE ? false : z2;
        z2 = true;
        this.A03 = z2;
        boolean z3 = cls != Integer.TYPE ? false : z3;
        z3 = true;
        this.A05 = z3;
        this.A04 = (cls == Double.TYPE || cls.isAssignableFrom(Double.class)) ? true : z;
    }
}
