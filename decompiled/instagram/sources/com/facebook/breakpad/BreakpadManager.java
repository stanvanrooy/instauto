package com.facebook.breakpad;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.logcatinterceptor.LogcatInterceptor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.TreeMap;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Y1;

public class BreakpadManager {
    public static volatile File mCrashDirectory;
    public static String mNativeLibraryName;

    public static native boolean containsKey(String str);

    public static native void crashProcessByAssert(String str);

    public static native void crashThisProcess();

    public static native void crashThisProcessAsan();

    public static native void crashThisProcessGWPAsan();

    public static native boolean disableCoreDumpingImpl();

    public static native boolean enableCoreDumpingImpl(String str);

    public static native String getCustomData(String str);

    public static native long getMinidumpFlags();

    public static native void install(String str, String str2, String str3, int i);

    public static native boolean isCoreResourceHardUnlimited();

    public static native boolean isPrivacyModeEnabled();

    public static native void nativeGetCustomDataSnapshot(TreeMap treeMap);

    public static native void nativeSetCustomData(String str, String str2);

    public static native boolean nativeSetJvmStreamEnabled(boolean z, boolean z2);

    public static native void removeCustomData(String str);

    public static void setCustomData(String str, String str2, Object... objArr) {
        if (objArr.length > 0 && str2 != null) {
            StringBuilder sb = new StringBuilder();
            Formatter formatter = new Formatter(sb);
            formatter.format(str2, objArr);
            formatter.close();
            str2 = sb.toString();
        }
        nativeSetCustomData(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0 != false) goto L_0x001d;
     */
    public static synchronized void setJvmStreamEnabled(boolean z) {
        boolean z2;
        synchronized (BreakpadManager.class) {
            String property = System.getProperty("java.vm.version");
            if (property != null && !property.startsWith("1.")) {
                boolean startsWith = property.startsWith("0.");
                z2 = true;
            }
            z2 = false;
            if (z2) {
                AnonymousClass0Y1.A08("breakpad_cpp_helper");
            }
            nativeSetJvmStreamEnabled(z2, true);
        }
    }

    public static native void setMinidumpFlags(long j);

    public static native void setVersionInfo(int i, String str);

    public static native boolean simulateSignalDelivery(int i, String str);

    public static native void uninstall();

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    public static boolean enableCoreDumping(Context context) {
        boolean z;
        File file;
        if (mNativeLibraryName == null) {
            AnonymousClass0Y1.A08("breakpad");
            mNativeLibraryName = "breakpad";
        }
        if (Build.VERSION.SDK_INT < 24) {
            File file2 = null;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/sys/kernel/core_pattern")));
                try {
                    file2 = new File(bufferedReader.readLine());
                } catch (IOException e) {
                    Log.e("BreakpadManager", "There was a problem reading core pattern file", e);
                }
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    Log.e("BreakpadManager", "There was a problem closing core pattern file", e2);
                }
            } catch (FileNotFoundException e3) {
                Log.w("BreakpadManager", AnonymousClass000.A0E("Core pattern file not found or blocked by SELinux", e3.getMessage()));
            }
            if (file2 != null) {
                file = file2.getParentFile();
            } else {
                file = null;
            }
            if (file2 != null && file2.isAbsolute() && file != null && !file.canWrite()) {
                z = false;
                if (z) {
                    return false;
                }
                return enableCoreDumpingImpl(context.getApplicationInfo().dataDir);
            }
        }
        z = isCoreResourceHardUnlimited();
        if (z) {
        }
    }

    public static File getCrashDirectory() {
        if (mCrashDirectory != null) {
            return mCrashDirectory;
        }
        throw new RuntimeException("Breakpad not installed");
    }

    public static boolean isActive() {
        if (mCrashDirectory != null) {
            return true;
        }
        return false;
    }

    public static void start(Context context, long j) {
        String str;
        synchronized (BreakpadManager.class) {
            boolean z = false;
            if ((Long.MIN_VALUE & j) != 0) {
                z = true;
            }
            if (mNativeLibraryName == null) {
                if (z) {
                    str = "breakpad_static";
                } else {
                    str = "breakpad";
                }
                AnonymousClass0Y1.A08(str);
                mNativeLibraryName = str;
            }
            if (mCrashDirectory == null) {
                File dir = context.getDir(LogcatInterceptor.LOGCAT_DIRECTORY, 0);
                if (dir != null) {
                    install(dir.getAbsolutePath(), "", "", 1536000);
                    mCrashDirectory = dir;
                    setMinidumpFlags(j | getMinidumpFlags() | 2 | 4);
                    setVersionInfo(227299068, "148.0.0.33.121");
                    setCustomData("Fingerprint", Build.FINGERPRINT, new Object[0]);
                } else {
                    throw new RuntimeException("Breakpad init failed to create crash directory: minidumps");
                }
            }
        }
    }
}
