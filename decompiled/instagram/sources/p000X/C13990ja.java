package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.0ja  reason: invalid class name and case insensitive filesystem */
public final class C13990ja {
    public int A00 = 0;
    public final C14000jb[] A01 = new C14000jb[7];

    public final synchronized int A00() {
        int i;
        int i2 = 0;
        C14000jb r6 = null;
        C14000jb r5 = null;
        int i3 = 0;
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        while (true) {
            C14000jb[] r1 = this.A01;
            if (i2 < r1.length) {
                C14000jb r3 = r1[i2];
                if (r3 != null) {
                    i3++;
                    float f3 = r3.A01;
                    float f4 = r3.A00;
                    f += f3 * f4;
                    f2 += f4;
                    if (r6 == null || f3 > r6.A01) {
                        r6 = r3;
                    }
                    if (r5 == null || f3 < r5.A01) {
                        r5 = r3;
                    }
                }
                i2++;
            } else {
                i = -1;
                if (i3 != 0) {
                    if (i3 >= 3) {
                        float f5 = r6.A01;
                        float f6 = r6.A00;
                        float f7 = r5.A01;
                        float f8 = r5.A00;
                        f -= (f5 * f6) + (f7 * f8);
                        f2 -= f6 + f8;
                    }
                    i = (int) (f / f2);
                }
            }
        }
        return i;
    }
}
