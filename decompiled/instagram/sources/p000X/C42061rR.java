package p000X;

import android.os.Build;

/* renamed from: X.1rR  reason: invalid class name and case insensitive filesystem */
public final class C42061rR {
    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 20) {
            return true;
        }
        return false;
    }

    public static boolean A01() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public static boolean A02() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public static boolean A03() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }
}
