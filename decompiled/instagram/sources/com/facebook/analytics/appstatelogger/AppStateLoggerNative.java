package com.facebook.analytics.appstatelogger;

public class AppStateLoggerNative {
    public static volatile boolean sAppStateLoggerNativeInited = false;
    public static volatile int sSelfSignalFunctionsSuccessfullyHooked = -1;

    public static native void appInForeground(boolean z, boolean z2);

    public static native void disableSelfSigkillHandlers();

    public static native void enableSelfSigkillHandlingForFADv2();

    public static native boolean isShuttingDownNative();

    public static native boolean registerOomHandler();

    public static native int registerSelfSigkillHandlers();

    public static native void registerStreamWithBreakpad();

    public static native void registerWithNativeCrashHandler(String str, String str2, String str3);

    public static native void selfSigkillWithoutUpdatingAppStateLogStatus();

    public static native void setBreakpadStreamDataNative(byte[] bArr);
}
