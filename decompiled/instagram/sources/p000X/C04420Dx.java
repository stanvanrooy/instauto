package p000X;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: X.0Dx  reason: invalid class name and case insensitive filesystem */
public final class C04420Dx {
    public static long A00 = 1;

    public static synchronized long A01() {
        synchronized (C04420Dx.class) {
            long j = A00;
            if (j != 1) {
                return j;
            }
            long totalBytes = new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes();
            A00 = totalBytes;
            return totalBytes;
        }
    }

    public static long A00() {
        return Math.max(0, new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes());
    }
}
