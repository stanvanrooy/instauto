package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1oE  reason: invalid class name and case insensitive filesystem */
public enum C40181oE {
    EXPLORE_ALL("explore_all"),
    IGTV("igtv"),
    SHOPPING("shopping"),
    WELLNESS("wellness"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C40181oE r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C40181oE(String str) {
        this.A00 = str;
    }
}
