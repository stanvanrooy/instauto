package com.facebook.profilo.core;

public final class TraceEvents {
    public static boolean sInitialized;
    public static int sLastNameRefreshProvidersState;
    public static volatile int sProviders;

    public static native void nativeClearAllProviders();

    public static native int nativeDisableProviders(int i);

    public static native int nativeEnableProviders(int i);

    public static native void nativeRefreshProviderNames(int[] iArr, String[] strArr);

    public static boolean isEnabled(int i) {
        if ((i & sProviders) != 0) {
            return true;
        }
        return false;
    }
}
