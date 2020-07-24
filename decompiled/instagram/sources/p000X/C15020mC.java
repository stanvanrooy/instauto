package p000X;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* renamed from: X.0mC  reason: invalid class name and case insensitive filesystem */
public final class C15020mC {
    public static File A01(Context context, String str, boolean z) {
        File file;
        if (!z || !Environment.getExternalStorageState().equals("mounted")) {
            file = null;
        } else {
            try {
                file = context.getExternalCacheDir();
            } catch (NullPointerException unused) {
                file = null;
            }
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file == null || str == null) {
            return null;
        }
        return new File(file, str);
    }

    public static long A00(File file, float f, long j) {
        if (file == null) {
            return 0;
        }
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
            StatFs statFs = new StatFs(file.getPath());
            long blockSizeLong = statFs.getBlockSizeLong();
            long blockCountLong = statFs.getBlockCountLong();
            long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
            long min = Math.min((long) (((float) (blockCountLong * blockSizeLong)) * f), j);
            if (min <= availableBlocksLong) {
                return min;
            }
            long A01 = AnonymousClass0P6.A01(file);
            if (min > A01) {
                return Math.min(min - A01, availableBlocksLong / 2) + A01;
            }
            return min;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }
}
