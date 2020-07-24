package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeIGBloksNavigationReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void navigate(double d, String str, String str2, C23043A0y a0y);

    @ReactMethod
    public abstract void runAction(double d, String str, C23043A0y a0y);

    public NativeIGBloksNavigationReactModuleSpec(A44 a44) {
        super(a44);
    }
}
