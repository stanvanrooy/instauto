package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1hR  reason: invalid class name and case insensitive filesystem */
public final class C36101hR {
    public static boolean[] A00 = new boolean[3];

    public static void A00(AnonymousClass1ZU r5, int i, int i2) {
        int i3 = i << 1;
        AnonymousClass1ZV[] r1 = r5.A0u;
        AnonymousClass1ZW r3 = r1[i3].A05;
        r3.A05 = r5.A0h.A0e.A05;
        r3.A01 = (float) i2;
        r3.A00 = 1;
        AnonymousClass1ZW r12 = r1[i3 + 1].A05;
        r12.A05 = r3;
        r12.A01 = (float) r5.A03(i);
        r12.A00 = 1;
    }

    public static boolean A01(AnonymousClass1ZU r4, int i) {
        int i2;
        if (r4.A0x[i] == Constants.A0C && r4.A01 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            if (i == 0) {
                if (r4.A0F == 0 && r4.A0J == 0) {
                    i2 = r4.A0H;
                }
            } else if (r4.A0E == 0 && r4.A0I == 0) {
                i2 = r4.A0G;
            }
            if (i2 == 0) {
                return true;
            }
        }
        return false;
    }
}
