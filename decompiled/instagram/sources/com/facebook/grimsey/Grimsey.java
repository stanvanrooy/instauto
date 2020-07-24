package com.facebook.grimsey;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.HashMap;
import p000X.AnonymousClass0Y1;

public class Grimsey {
    public static final Class TAG = Grimsey.class;

    public static native void clearAllocations();

    public static native void closeLogFile();

    public static native void collectStackTraces(boolean z);

    public static native void enterInstrumentedScope();

    public static native void exitInstrumentedScope();

    public static native void getAllocations(HashMap hashMap, HashMap hashMap2);

    public static native boolean isAllocationTracking();

    public static native boolean isNativeAllocationTracking();

    public static native void setInstrumentedPlatform(String str);

    public static native void setNativeInstrumentedPlatform();

    public static native void setOutputDestination(String str);

    public static native void startAllocationTracking(boolean z);

    public static native void startNativeAllocationTracking(int i, int i2, int i3, int i4);

    public static native void stopAllocationTracking();

    public static native void stopNativeAllocationTracking();

    public static native void trackMethod(Method method, boolean z);

    public static native void untrackMethod(Method method);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r1.startsWith("0.") != false) goto L_0x0020;
     */
    static {
        boolean z;
        String str;
        AnonymousClass0Y1.A08("grimsey");
        String property = System.getProperty("java.vm.version");
        if (!property.startsWith("1.")) {
            z = true;
        }
        z = false;
        if (z) {
            if (Build.VERSION.SDK_INT < 24) {
                AnonymousClass0Y1.A08("cpp_helper");
                str = "art";
            }
            setNativeInstrumentedPlatform();
        }
        str = "dalvik";
        setInstrumentedPlatform(str);
        setNativeInstrumentedPlatform();
    }
}
