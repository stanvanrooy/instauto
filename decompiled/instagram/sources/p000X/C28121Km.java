package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Km  reason: invalid class name and case insensitive filesystem */
public final class C28121Km {
    public final Map A00 = new HashMap();

    public final AnonymousClass1TY A00(String str) {
        AnonymousClass1TY r0 = (AnonymousClass1TY) this.A00.get(str);
        if (r0 == null) {
            return AnonymousClass1TY.A05;
        }
        return r0;
    }

    public final void A01(String str, AnonymousClass1TY r3) {
        this.A00.put(str, r3);
    }
}
