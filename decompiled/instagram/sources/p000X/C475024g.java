package p000X;

import android.os.Build;
import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* renamed from: X.24g  reason: invalid class name and case insensitive filesystem */
public final class C475024g {
    public static long A00;
    public static boolean A01;

    public static double A00(String[] strArr, int i, long j) {
        if (i >= strArr.length) {
            return 0.0d;
        }
        if (j > 0) {
            String str = strArr[i];
            try {
                return ((double) Long.parseLong(str)) / ((double) j);
            } catch (NumberFormatException e) {
                AnonymousClass0DB.A0H("CpuInfoUtils", String.format(Locale.US, "Error parsing %d /proc/[pid]/stat field as long: %s", new Object[]{Integer.valueOf(i), str}), e);
                return 0.0d;
            }
        } else {
            throw new IllegalArgumentException("clockTicksPerSecond should be positive.");
        }
    }

    public static C475124h A01(String[] strArr) {
        long j;
        if (strArr == null) {
            return null;
        }
        if (!A01) {
            if (Build.VERSION.SDK_INT >= 21) {
                j = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else {
                try {
                    int i = Class.forName("libcore.io.OsConstants").getField("_SC_CLK_TCK").getInt((Object) null);
                    Class<?> cls = Class.forName("libcore.io.Libcore");
                    Class<?> cls2 = Class.forName("libcore.io.Os");
                    Object obj = cls.getField("os").get((Object) null);
                    j = ((Long) cls2.getMethod("sysconf", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)})).longValue();
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                    AnonymousClass0DB.A0I("CpuInfoUtils", "Unable to read _SC_CLK_TCK by reflection", e);
                    j = 100;
                }
            }
            A00 = j;
            A01 = true;
        }
        long j2 = A00;
        double A002 = A00(strArr, 13, j2);
        double A003 = A00(strArr, 14, j2);
        A00(strArr, 15, j2);
        A00(strArr, 16, j2);
        return new C475124h(A002, A003);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[SYNTHETIC, Splitter:B:21:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[SYNTHETIC, Splitter:B:31:0x007e] */
    public static String[] A02(String str) {
        RandomAccessFile randomAccessFile;
        if (!new File(str).exists()) {
            AnonymousClass0DB.A0E("CpuInfoUtils", AnonymousClass000.A0E("stat file not found ", str));
            return null;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            randomAccessFile = new RandomAccessFile(str, "r");
            try {
                String readLine = randomAccessFile.readLine();
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    AnonymousClass0DB.A0H("CpuInfoUtils", String.format(Locale.US, "Error closing procfs file: %s", new Object[]{str}), e);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return readLine.split(" ");
            } catch (Exception e2) {
                e = e2;
                try {
                    AnonymousClass0DB.A0H("CpuInfoUtils", String.format(Locale.US, "Error reading cpu time from procfs file: %s", new Object[]{str}), e);
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e3) {
                            AnonymousClass0DB.A0H("CpuInfoUtils", String.format(Locale.US, "Error closing procfs file: %s", new Object[]{str}), e3);
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    if (randomAccessFile != null) {
                    }
                    throw th;
                }
            }
        } catch (Exception e4) {
            e = e4;
            randomAccessFile = null;
            AnonymousClass0DB.A0H("CpuInfoUtils", String.format(Locale.US, "Error reading cpu time from procfs file: %s", new Object[]{str}), e);
            if (randomAccessFile != null) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e5) {
                    AnonymousClass0DB.A0H("CpuInfoUtils", String.format(Locale.US, "Error closing procfs file: %s", new Object[]{str}), e5);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
            throw th;
        }
    }
}
