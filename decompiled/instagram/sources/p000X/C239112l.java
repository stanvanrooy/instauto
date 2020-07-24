package p000X;

import android.content.Context;

/* renamed from: X.12l  reason: invalid class name and case insensitive filesystem */
public final class C239112l {
    public static boolean A00(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null || !"com.android.vending".equals(installerPackageName)) {
            return false;
        }
        return true;
    }
}
