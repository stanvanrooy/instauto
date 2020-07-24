package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeIGReactQESpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean booleanValueForConfiguration(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean booleanValueForUniverse(String str, String str2, String str3, String str4, boolean z, boolean z2);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double doubleValueForConfiguration(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double doubleValueForUniverse(String str, String str2, String str3, String str4, double d, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double integerValueForConfiguration(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double integerValueForUniverse(String str, String str2, String str3, String str4, double d, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String stringValueForConfiguration(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String stringValueForUniverse(String str, String str2, String str3, String str4, String str5, boolean z);

    public NativeIGReactQESpec(A44 a44) {
        super(a44);
    }
}
