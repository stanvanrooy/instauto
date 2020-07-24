package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.LinkedHashMap;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C27123ByY;

@JacksonStdImpl
public final class UntypedObjectDeserializer extends StdDeserializer {
    public static final UntypedObjectDeserializer A00 = new UntypedObjectDeserializer();
    public static final Object[] A01 = new Object[0];

    public UntypedObjectDeserializer() {
        super(Object.class);
    }

    public final Object A0L(C13080hr r8, C27123ByY byY) {
        C13120hv A0g = r8.A0g();
        if (A0g == C13120hv.START_OBJECT) {
            A0g = r8.A0p();
        }
        C13120hv r0 = C13120hv.FIELD_NAME;
        if (A0g != r0) {
            return new LinkedHashMap(4);
        }
        String A0t = r8.A0t();
        r8.A0p();
        Object A06 = A06(r8, byY);
        if (r8.A0p() != r0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(4);
            linkedHashMap.put(A0t, A06);
            return linkedHashMap;
        }
        String A0t2 = r8.A0t();
        r8.A0p();
        Object A062 = A06(r8, byY);
        if (r8.A0p() != r0) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(A0t, A06);
            linkedHashMap2.put(A0t2, A062);
            return linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(A0t, A06);
        linkedHashMap3.put(A0t2, A062);
        do {
            String A0t3 = r8.A0t();
            r8.A0p();
            linkedHashMap3.put(A0t3, A06(r8, byY));
        } while (r8.A0p() != C13120hv.END_OBJECT);
        return linkedHashMap3;
    }
}
