package com.facebook.jni;

import p000X.AnonymousClass0YD;

public class CpuCapabilitiesJni {
    public static native boolean nativeDeviceSupportsNeon();

    public static native boolean nativeDeviceSupportsVFPFP16();

    public static native boolean nativeDeviceSupportsX86();

    static {
        AnonymousClass0YD.A01("fb");
    }
}
