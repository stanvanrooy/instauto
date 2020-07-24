package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Collection;
import p000X.C0L;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C27105Bxz;
import p000X.C27109ByB;
import p000X.C27123ByY;
import p000X.C27148BzD;
import p000X.C27183C0d;

@JacksonStdImpl
public final class StringCollectionDeserializer extends ContainerDeserializerBase implements C27105Bxz {
    public final C0L A00;
    public final JsonDeserializer A01;
    public final JsonDeserializer A02;
    public final C27183C0d A03;

    public StringCollectionDeserializer(C0L c0l, C27183C0d c0d, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2) {
        super(c0l.A00);
        this.A00 = c0l;
        this.A02 = jsonDeserializer2;
        this.A03 = c0d;
        this.A01 = jsonDeserializer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r4.getClass().getAnnotation(com.fasterxml.jackson.databind.annotation.JacksonStdImpl.class) == null) goto L_0x0038;
     */
    public final JsonDeserializer AAK(C27123ByY byY, C27148BzD bzD) {
        JsonDeserializer jsonDeserializer;
        boolean z;
        C27183C0d c0d = this.A03;
        if (c0d == null || c0d.A04() == null) {
            jsonDeserializer = null;
        } else {
            jsonDeserializer = byY.A08(c0d.A01(byY.A00), bzD);
        }
        JsonDeserializer jsonDeserializer2 = this.A02;
        if (jsonDeserializer2 == null) {
            jsonDeserializer2 = StdDeserializer.A01(byY, bzD, jsonDeserializer2);
            if (jsonDeserializer2 == null) {
                jsonDeserializer2 = byY.A08(this.A00.A03(), bzD);
            }
        } else if (jsonDeserializer2 instanceof C27105Bxz) {
            jsonDeserializer2 = ((C27105Bxz) jsonDeserializer2).AAK(byY, bzD);
        }
        if (jsonDeserializer2 != null) {
            z = true;
        }
        z = false;
        if (z) {
            jsonDeserializer2 = null;
        }
        if (this.A02 == jsonDeserializer2 && this.A01 == jsonDeserializer) {
            return this;
        }
        return new StringCollectionDeserializer(this.A00, this.A03, jsonDeserializer, jsonDeserializer2);
    }

    public final void A0M(C13080hr r4, C27123ByY byY, Collection collection) {
        String A022;
        String str;
        String str2;
        if (r4.A0P()) {
            JsonDeserializer jsonDeserializer = this.A02;
            if (jsonDeserializer != null) {
                while (true) {
                    C13120hv A0p = r4.A0p();
                    if (A0p != C13120hv.END_ARRAY) {
                        if (A0p == C13120hv.VALUE_NULL) {
                            str = null;
                        } else {
                            str = (String) jsonDeserializer.A06(r4, byY);
                        }
                        collection.add(str);
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    C13120hv A0p2 = r4.A0p();
                    if (A0p2 != C13120hv.END_ARRAY) {
                        if (A0p2 == C13120hv.VALUE_NULL) {
                            A022 = null;
                        } else {
                            A022 = StdDeserializer.A02(r4, byY);
                        }
                        collection.add(A022);
                    } else {
                        return;
                    }
                }
            }
        } else if (byY.A0O(C27109ByB.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            JsonDeserializer jsonDeserializer2 = this.A02;
            if (r4.A0g() == C13120hv.VALUE_NULL) {
                str2 = null;
            } else if (jsonDeserializer2 == null) {
                str2 = StdDeserializer.A02(r4, byY);
            } else {
                str2 = (String) jsonDeserializer2.A06(r4, byY);
            }
            collection.add(str2);
        } else {
            throw byY.A0A(this.A00.A00);
        }
    }
}
