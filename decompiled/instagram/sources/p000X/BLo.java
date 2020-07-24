package p000X;

import android.os.Build;

/* renamed from: X.BLo */
public final class BLo {
    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }
}
