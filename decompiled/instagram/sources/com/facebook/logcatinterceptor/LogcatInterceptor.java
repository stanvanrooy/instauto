package com.facebook.logcatinterceptor;

import android.content.Context;
import java.io.File;
import p000X.AnonymousClass0Y1;

public final class LogcatInterceptor {
    public static final String LOGCAT_DIRECTORY = "minidumps";
    public static volatile boolean sInstalled;

    public static native void nativeInstall(String str, int i);

    public static native void nativeIntegrateWithBreakpad(boolean z);

    static {
        AnonymousClass0Y1.A08("logcat-interceptor");
    }

    public static String getLogcatDir(Context context) {
        File dir = context.getDir(LOGCAT_DIRECTORY, 0);
        if (dir != null) {
            return dir.getAbsolutePath();
        }
        throw new RuntimeException("Logcat Install failed to create crash directory: minidumps");
    }

    public static synchronized void install(Context context, int i) {
        synchronized (LogcatInterceptor.class) {
            if (!sInstalled) {
                nativeInstall(getLogcatDir(context), i);
                sInstalled = true;
            }
        }
    }

    public static void integrateWithBreakpad() {
        integrateWithBreakpad(false);
    }

    public static void integrateWithBreakpad(boolean z) {
        if (sInstalled) {
            nativeIntegrateWithBreakpad(z);
            return;
        }
        throw new RuntimeException("Logcat interceptor not installed");
    }
}
