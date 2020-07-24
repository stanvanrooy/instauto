package p000X;

import android.content.Context;
import android.os.Build;
import com.facebook.voltron.runtime.ModuleApkUtil$ModuleResolver;
import java.io.File;

/* renamed from: X.0Zp  reason: invalid class name and case insensitive filesystem */
public final class C09000Zp {
    public static File A00(String str, Context context) {
        String str2;
        if (Build.VERSION.SDK_INT >= 21) {
            str2 = ModuleApkUtil$ModuleResolver.A00(str, context);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = context.getApplicationInfo().sourceDir;
        }
        return new File(str2);
    }

    public static boolean A01(String str, Context context) {
        String A00;
        if (Build.VERSION.SDK_INT < 21 || (A00 = ModuleApkUtil$ModuleResolver.A00(str, context)) == null) {
            return false;
        }
        return new File(A00).exists();
    }
}
