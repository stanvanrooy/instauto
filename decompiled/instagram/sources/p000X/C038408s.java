package p000X;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;

/* renamed from: X.08s  reason: invalid class name and case insensitive filesystem */
public final class C038408s {
    public static boolean A00() {
        if (Build.VERSION.SDK_INT < 21 || !"x86".contains("64") || Build.SUPPORTED_64_BIT_ABIS.length == 0) {
            return false;
        }
        try {
            return Os.readlink("/proc/self/exe").contains("64");
        } catch (ErrnoException unused) {
            return false;
        }
    }
}
