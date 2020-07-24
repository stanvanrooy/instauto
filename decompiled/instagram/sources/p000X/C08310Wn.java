package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Wn  reason: invalid class name and case insensitive filesystem */
public enum C08310Wn {
    GET_PREF_BASED_CONFIG(0, true),
    SET_PREF_BASED_CONFIG(1, false),
    GET_APPS_STATISTICS(2, true),
    GET_ANALYTICS_CONFIG(3, true),
    SET_ANALYTICS_CONFIG(4, false),
    GET_FLYTRAP_REPORT(5, true),
    GET_PREF_IDS(6, true),
    SET_PREF_IDS(7, false),
    NOT_EXIST(Integer.MAX_VALUE, false);
    
    public static final Map A02 = null;
    public final int A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    static {
        int i;
        A02 = new HashMap();
        for (C08310Wn r2 : values()) {
            A02.put(Integer.valueOf(r2.A00), r2);
        }
    }

    /* access modifiers changed from: public */
    C08310Wn(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
