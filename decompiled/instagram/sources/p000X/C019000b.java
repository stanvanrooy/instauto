package p000X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.00b  reason: invalid class name and case insensitive filesystem */
public class C019000b {
    public static final Object A00 = new Object();

    public static File[] A08(Context context) {
        return context.getExternalFilesDirs((String) null);
    }

    public static int A00(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    public static int A01(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static ColorStateList A02(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static Drawable A03(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        return context.getResources().getDrawable(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        return r4;
     */
    public static File A04(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        File file = new File(context.getApplicationInfo().dataDir, "no_backup");
        synchronized (C019000b.class) {
            if (!file.exists() && !file.mkdirs() && !file.exists()) {
                Log.w("ContextCompat", AnonymousClass000.A0E("Unable to create files subdir ", file.getPath()));
                return null;
            }
        }
    }

    public static Executor A05(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return context.getMainExecutor();
        }
        return new C018900a(new Handler(context.getMainLooper()));
    }

    public static boolean A06(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    public static File[] A07(Context context) {
        return context.getExternalCacheDirs();
    }
}
