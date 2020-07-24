package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.21e  reason: invalid class name and case insensitive filesystem */
public enum C468621e {
    NOT_INTERESTED("not_interested"),
    IN_GRACEFUL_REVIEW("in_graceful_review"),
    APPROVED("approved"),
    ONBOARDED("onboarded"),
    DISABLED("disabled");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C468621e r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C468621e(String str) {
        this.A00 = str;
    }
}
