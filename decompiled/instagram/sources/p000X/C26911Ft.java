package p000X;

import android.os.Build;

/* renamed from: X.1Ft  reason: invalid class name and case insensitive filesystem */
public final class C26911Ft {
    public static Boolean A00;
    public static Boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d5, code lost:
        if (r1.contains("Multilaser Orion") != false) goto L_0x00d7;
     */
    public static boolean A00() {
        boolean z;
        if (A01 == null) {
            String str = Build.MODEL;
            if (!str.contains("GT-S5360") && !str.contains("GT-S5830M") && !str.contains("GT-S5830i") && !str.contains("GT-S5830C") && !str.contains("GT-S5570I") && !str.contains("GT-S5363") && !str.contains("GT-S5367") && !str.contains("GT-S6102") && !str.contains("GT-S6102B") && !str.contains("GT-S5300") && !str.contains("GT-S5839i") && !str.contains("GT-S6802B") && !str.contains("Vodafone Smart II") && !str.contains("ZTE V768") && !str.contains("GT-S5369") && !str.contains("GT-B5330") && !str.contains("GT-B5512B") && !str.contains("GT-S5302B") && !str.contains("GT-S6802") && !str.contains("ONE TOUCH 983") && !str.contains("ALCATEL_one_touch_983") && !str.contains("TREND") && !str.contains("OMNI") && !str.contains("MS1") && !str.contains("PSPR355")) {
                z = false;
            }
            z = true;
            A01 = Boolean.valueOf(z);
        }
        return A01.booleanValue();
    }
}
