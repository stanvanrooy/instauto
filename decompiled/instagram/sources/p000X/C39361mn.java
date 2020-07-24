package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1mn  reason: invalid class name and case insensitive filesystem */
public enum C39361mn {
    MAJOR("major_unit"),
    MINOR("minor_unit");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C39361mn r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C39361mn(String str) {
        this.A00 = str;
    }
}
