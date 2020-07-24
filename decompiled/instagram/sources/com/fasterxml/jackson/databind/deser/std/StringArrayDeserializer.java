package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import p000X.C27105Bxz;
import p000X.C27123ByY;
import p000X.C27148BzD;

@JacksonStdImpl
public final class StringArrayDeserializer extends StdDeserializer implements C27105Bxz {
    public static final StringArrayDeserializer A01 = new StringArrayDeserializer();
    public JsonDeserializer A00;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r2.getClass().getAnnotation(com.fasterxml.jackson.databind.annotation.JacksonStdImpl.class) == null) goto L_0x0025;
     */
    public final JsonDeserializer AAK(C27123ByY byY, C27148BzD bzD) {
        boolean z;
        JsonDeserializer A012 = StdDeserializer.A01(byY, bzD, this.A00);
        if (A012 == null) {
            A012 = byY.A08(byY.A00.A03(String.class), bzD);
        } else if (A012 instanceof C27105Bxz) {
            A012 = ((C27105Bxz) A012).AAK(byY, bzD);
        }
        if (A012 != null) {
            if (A012 != null) {
                z = true;
            }
            z = false;
            if (z) {
                A012 = null;
            }
        }
        if (this.A00 != A012) {
            return new StringArrayDeserializer(A012);
        }
        return this;
    }

    public StringArrayDeserializer() {
        super(String[].class);
        this.A00 = null;
    }

    public StringArrayDeserializer(JsonDeserializer jsonDeserializer) {
        super(String[].class);
        this.A00 = jsonDeserializer;
    }
}
