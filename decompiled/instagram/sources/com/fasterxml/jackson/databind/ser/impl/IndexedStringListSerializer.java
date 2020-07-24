package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.List;
import p000X.C06;
import p000X.C13460iZ;
import p000X.C27148BzD;
import p000X.C27200C1k;
import p000X.C35;

@JacksonStdImpl
public final class IndexedStringListSerializer extends StaticListSerializerBase implements C35 {
    public static final IndexedStringListSerializer A01 = new IndexedStringListSerializer((JsonSerializer) null);
    public final JsonSerializer A00;

    public static final void A00(IndexedStringListSerializer indexedStringListSerializer, List list, C13460iZ r5, C06 c06, int i) {
        try {
            JsonSerializer jsonSerializer = indexedStringListSerializer.A00;
            for (int i2 = 0; i2 < i; i2++) {
                String str = (String) list.get(i2);
                if (str == null) {
                    c06.A0D(r5);
                } else {
                    jsonSerializer.A0B(str, r5, c06);
                }
            }
        } catch (Exception e) {
            StdSerializer.A02(c06, e, list, 0);
        }
    }

    public static final void A05(List list, C13460iZ r3, C06 c06, int i) {
        int i2 = 0;
        while (i2 < i) {
            try {
                String str = (String) list.get(i2);
                if (str == null) {
                    c06.A0D(r3);
                } else {
                    r3.A0g(str);
                }
                i2++;
            } catch (Exception e) {
                StdSerializer.A02(c06, e, list, i2);
                return;
            }
        }
    }

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
        return new IndexedStringListSerializer(A012);
    }

    public IndexedStringListSerializer(JsonSerializer jsonSerializer) {
        super(List.class);
        this.A00 = jsonSerializer;
    }
}
