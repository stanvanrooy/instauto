package p000X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1bp  reason: invalid class name and case insensitive filesystem */
public final class C32771bp {
    public final Map A00 = new HashMap();
    public final Set A01 = new HashSet();

    public static void A00(C32771bp r4) {
        r4.A00.clear();
        for (AnonymousClass1TY r2 : r4.A01) {
            r4.A00.put(r2.A03, r2);
        }
        r4.A01.clear();
    }
}
