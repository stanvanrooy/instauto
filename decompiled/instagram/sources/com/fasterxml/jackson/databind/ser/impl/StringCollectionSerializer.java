package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Collection;
import java.util.Iterator;
import p000X.C06;
import p000X.C13460iZ;
import p000X.C27148BzD;
import p000X.C27200C1k;
import p000X.C35;

@JacksonStdImpl
public final class StringCollectionSerializer extends StaticListSerializerBase implements C35 {
    public static final StringCollectionSerializer A01 = new StringCollectionSerializer((JsonSerializer) null);
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
        return new StringCollectionSerializer(A012);
    }

    public StringCollectionSerializer(JsonSerializer jsonSerializer) {
        super(Collection.class);
        this.A00 = jsonSerializer;
    }

    public static void A00(StringCollectionSerializer stringCollectionSerializer, Collection collection, C13460iZ r5, C06 c06) {
        JsonSerializer jsonSerializer = stringCollectionSerializer.A00;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                try {
                    c06.A0D(r5);
                } catch (Exception e) {
                    StdSerializer.A02(c06, e, collection, 0);
                }
            } else {
                jsonSerializer.A0B(str, r5, c06);
            }
        }
    }

    public static final void A05(StringCollectionSerializer stringCollectionSerializer, Collection collection, C13460iZ r4, C06 c06) {
        if (stringCollectionSerializer.A00 != null) {
            A00(stringCollectionSerializer, collection, r4, c06);
            return;
        }
        int i = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                try {
                    c06.A0D(r4);
                } catch (Exception e) {
                    StdSerializer.A02(c06, e, collection, i);
                }
            } else {
                r4.A0g(str);
            }
            i++;
        }
    }
}
