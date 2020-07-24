package com.facebook.common.jit.profile;

import java.lang.reflect.Field;

public final class PGOUtilsNative {
    public static Field A00;
    public static boolean A01;
    public static final boolean A02;

    public static native void nativeAddProfilerCodePaths(String[] strArr);

    public static native boolean nativeChangeOldPgoProfilerOptions(int i, int i2, int i3, double d, double d2);

    public static native boolean nativeDisableProfiler();

    public static native void nativeForcePgoProfileSave();

    public static native String nativeGetErrorMessage();

    public static native boolean nativeGetPgoData(String str, String str2, int[] iArr, double[] dArr, boolean z);

    public static native Object nativeGetPgoMethodInfo(String str, Object[] objArr);

    public static native boolean nativeInitialize(boolean z, boolean z2, int i, String str);

    public static native boolean nativeIsProfileChangeSignificant(String str, String str2, boolean z);

    public static native boolean nativeIsProfilerStarted();

    public static native boolean nativeStartProfiler(long j);

    static {
        boolean z;
        try {
            z = ((IPgoLoader) Class.forName("com.facebook.common.jit.profile.PgoLibLoader").newInstance()).load();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            z = false;
        }
        A02 = z;
    }
}
