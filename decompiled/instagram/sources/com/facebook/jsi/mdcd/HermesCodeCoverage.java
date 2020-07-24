package com.facebook.jsi.mdcd;

public class HermesCodeCoverage {
    public static native void disableNative();

    public static native void enableNative();

    public static native long[] getExecutedFunctions();

    public static native boolean isEnabledNative();
}
