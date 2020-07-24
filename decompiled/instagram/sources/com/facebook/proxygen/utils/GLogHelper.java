package com.facebook.proxygen.utils;

import com.facebook.proxygen.utils.GLogHandler;

public class GLogHelper {
    public static native void log(int i, String str);

    public static native void vlog(int i, String str);

    public static void log(GLogHandler.GLogSeverity gLogSeverity, String str) {
        log(gLogSeverity.ordinal(), str);
    }
}
