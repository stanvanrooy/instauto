package p000X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.1rn  reason: invalid class name and case insensitive filesystem */
public final class C42171rn {
    public static boolean A00(Context context) {
        if (Build.VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            return false;
        }
        return true;
    }

    public static boolean A01(Context context) {
        if (Build.VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26) {
            return false;
        }
        return true;
    }
}
