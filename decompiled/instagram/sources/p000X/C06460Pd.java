package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.0Pd  reason: invalid class name and case insensitive filesystem */
public final class C06460Pd {
    public static int A00;
    public static String A01;

    public static int A00() {
        if (A00 == 0) {
            try {
                Context context = StoredPreferences.A00;
                A00 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return A00;
    }

    public static String A01(Context context) {
        if (A01 == null) {
            A01 = String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
        }
        return A01;
    }

    public static String A02(Context context) {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, DexStore.LOAD_RESULT_PGO_ATTEMPTED);
            if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
                return "";
            }
            return activityInfo.packageName;
        } catch (RuntimeException unused) {
            return "";
        }
    }

    public static boolean A03(String str) {
        try {
            StoredPreferences.A00.getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return false;
        }
    }
}
