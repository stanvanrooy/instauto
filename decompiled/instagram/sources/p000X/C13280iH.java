package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0iH  reason: invalid class name and case insensitive filesystem */
public enum C13280iH {
    ON("on"),
    OFF("off"),
    UNSET("unset");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C13280iH r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C13280iH(String str) {
        this.A00 = str;
    }
}
