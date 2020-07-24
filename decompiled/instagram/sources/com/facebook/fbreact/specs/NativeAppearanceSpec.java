package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeAppearanceSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getColorScheme();

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeAppearanceSpec(A44 a44) {
        super(a44);
    }
}
