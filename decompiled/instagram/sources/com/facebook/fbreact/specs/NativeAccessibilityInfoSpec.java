package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void announceForAccessibility(String str);

    @ReactMethod
    public abstract void isReduceMotionEnabled(Callback callback);

    @ReactMethod
    public abstract void isTouchExplorationEnabled(Callback callback);

    @ReactMethod
    public abstract void setAccessibilityFocus(double d);

    public NativeAccessibilityInfoSpec(A44 a44) {
        super(a44);
    }
}
