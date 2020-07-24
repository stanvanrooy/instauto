package p000X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0iN  reason: invalid class name and case insensitive filesystem */
public enum C13340iN {
    ELIGIBLE("eligible"),
    INELIGIBLE("ineligible");
    
    public static final C13350iO A01 = null;
    public static final Map A02 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new C13350iO();
        int A002 = C13360iP.A00(r3);
        if (A002 < 16) {
            A002 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A002);
        for (C13340iN r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A02 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C13340iN(String str) {
        this.A00 = str;
    }
}
