package p000X;

import android.view.View;

/* renamed from: X.21b  reason: invalid class name and case insensitive filesystem */
public final class C468321b {
    public static int A00(AnonymousClass1Xv r1, C31491Yk r2, View view, View view2, C31391Ya r5, boolean z) {
        if (r5.A0R() == 0 || r1.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(C31391Ya.A0G(view) - C31391Ya.A0G(view2)) + 1;
        }
        return Math.min(r2.A07(), r2.A08(view2) - r2.A0B(view));
    }

    public static int A01(AnonymousClass1Xv r3, C31491Yk r4, View view, View view2, C31391Ya r7, boolean z) {
        int A00;
        if (r7.A0R() == 0 || (A00 = r3.A00()) == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return A00;
        }
        return (int) ((((float) (r4.A08(view2) - r4.A0B(view))) / ((float) (Math.abs(C31391Ya.A0G(view) - C31391Ya.A0G(view2)) + 1))) * ((float) r3.A00()));
    }

    public static int A02(AnonymousClass1Xv r4, C31491Yk r5, View view, View view2, C31391Ya r8, boolean z, boolean z2) {
        int i = 0;
        if (!(r8.A0R() == 0 || r4.A00() == 0 || view == null || view2 == null)) {
            int min = Math.min(C31391Ya.A0G(view), C31391Ya.A0G(view2));
            int max = Math.max(C31391Ya.A0G(view), C31391Ya.A0G(view2));
            if (z2) {
                i = Math.max(0, (r4.A00() - max) - 1);
            } else {
                i = Math.max(0, min);
            }
            if (z) {
                return Math.round((((float) i) * (((float) Math.abs(r5.A08(view2) - r5.A0B(view))) / ((float) (Math.abs(C31391Ya.A0G(view) - C31391Ya.A0G(view2)) + 1)))) + ((float) (r5.A06() - r5.A0B(view))));
            }
        }
        return i;
    }
}
