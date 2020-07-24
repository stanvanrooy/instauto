package p000X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.0Pu  reason: invalid class name and case insensitive filesystem */
public final class C06630Pu {
    public static String A00;

    public static String A01(Context context) {
        String str = A00;
        if (str != null) {
            return str;
        }
        try {
            String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            A00 = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static int A00(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }
}
