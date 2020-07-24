package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class CxxModuleWrapper extends CxxModuleWrapperBase {
    public static native CxxModuleWrapper makeDsoNative(String str, String str2);

    public static CxxModuleWrapper makeDso(String str, String str2) {
        AnonymousClass0Y1.A08(str);
        return makeDsoNative(AnonymousClass0Y1.A01(str).getAbsolutePath(), str2);
    }

    public CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }
}
