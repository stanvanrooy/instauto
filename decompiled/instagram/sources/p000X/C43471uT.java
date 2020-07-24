package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1uT  reason: invalid class name and case insensitive filesystem */
public enum C43471uT {
    SUGGESTED_USER("user_card"),
    FBC_UPSELL("upsell_fbc_card"),
    CI_UPSELL("upsell_ci_card"),
    SEE_ALL_SU_UPSELL("upsell_see_all_su_card"),
    COMPLETE_PROFILE_UPSELL("upsell_complete_profile_card"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C43471uT r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C43471uT(String str) {
        this.A00 = str;
    }
}
