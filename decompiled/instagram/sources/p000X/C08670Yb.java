package p000X;

import com.facebook.systrace.Systrace;

/* renamed from: X.0Yb  reason: invalid class name and case insensitive filesystem */
public final class C08670Yb {
    public static volatile boolean A00;

    public static long A00(long j) {
        boolean z = false;
        if ((1 & C08800Yq.A01) != 0) {
            z = true;
        }
        if (z && !A00) {
            A00 = true;
            Systrace.A05(1, "fburl.com/fbsystrace", 1000);
            Systrace.A05(1, "USE fbsystrace", 1000);
            Systrace.A05(1, "DO NOT USE systrace", 1000);
        } else if (A00) {
            boolean z2 = false;
            if ((1 & C08800Yq.A01) != 0) {
                z2 = true;
            }
            if (!z2) {
                A00 = false;
            }
        }
        return j - System.nanoTime();
    }
}
