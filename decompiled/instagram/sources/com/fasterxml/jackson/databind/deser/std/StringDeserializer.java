package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C25930Bch;
import p000X.C27123ByY;

@JacksonStdImpl
public final class StringDeserializer extends StdScalarDeserializer {
    public static final StringDeserializer A00 = new StringDeserializer();

    public StringDeserializer() {
        super(String.class);
    }

    public final String A0L(C13080hr r4, C27123ByY byY) {
        String A0r = r4.A0r();
        if (A0r != null) {
            return A0r;
        }
        C13120hv A0g = r4.A0g();
        if (A0g == C13120hv.VALUE_EMBEDDED_OBJECT) {
            Object A0Z = r4.A0Z();
            if (A0Z == null) {
                return null;
            }
            if (A0Z instanceof byte[]) {
                return C25930Bch.A01.A02((byte[]) A0Z, false);
            }
            return A0Z.toString();
        }
        throw byY.A0B(this.A00, A0g);
    }
}
