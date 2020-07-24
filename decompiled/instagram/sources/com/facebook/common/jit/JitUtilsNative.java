package com.facebook.common.jit;

import android.content.Context;
import android.util.Log;
import com.facebook.common.jit.common.MethodInfo;
import java.util.List;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;

public final class JitUtilsNative {
    public static final boolean PLATFORM_SUPPORTED;

    public static native boolean nativeDisableJit();

    public static native boolean nativeEnableJit(long j, boolean z, boolean z2, boolean z3);

    public static native Object nativeGetDefaultJITStatus();

    public static native String nativeGetErrorMessage();

    public static native Object nativeGetJITStatus();

    public static native Object nativeGetPgoMethodInfo(String str, Object[] objArr);

    public static native boolean nativeInitialize(boolean z, MethodInfo[] methodInfoArr, MethodInfo methodInfo, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str);

    public static native boolean nativeIsJitEnabled();

    public static native boolean nativeIsProfileChangeSignificant(String str, String str2, boolean z);

    public static native void nativeMarkAsPriorityThread();

    public static native boolean nativeStartJit();

    public static native void nativeStartPerfSensitiveScenario(int i);

    public static native boolean nativeStopJit();

    public static native void nativeStopPerfSensitiveScenario();

    public static native void nativeUnmarkAsPriorityThread();

    static {
        boolean z;
        try {
            AnonymousClass0Y1.A08("fbjitjni");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            AnonymousClass0DB.A05(JitUtilsNative.class, "Error loading JitUtils", e);
            z = false;
        }
        PLATFORM_SUPPORTED = z;
    }

    public static boolean initialize(Context context, boolean z, List list, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Class<JitUtilsNative> cls = JitUtilsNative.class;
        if (!PLATFORM_SUPPORTED) {
            return false;
        }
        String absolutePath = context.getDir("jitutils", 0).getAbsolutePath();
        Class cls2 = Boolean.TYPE;
        MethodInfo method = MethodInfo.getMethod((Class) cls, "initialize", Context.class, cls2, List.class, Integer.TYPE, cls2, cls2, cls2, cls2, cls2, cls2);
        if (method == null) {
            Log.e("JitUtilsNative", String.format("Jit initing failed: Cannot find %s.%s function.", new Object[]{cls.getName(), "initialize"}));
            return false;
        }
        List list2 = list;
        return nativeInitialize(z, (MethodInfo[]) list2.toArray(new MethodInfo[list2.size()]), method, i, z2, z3, z4, z5, z6, z7, absolutePath);
    }
}
