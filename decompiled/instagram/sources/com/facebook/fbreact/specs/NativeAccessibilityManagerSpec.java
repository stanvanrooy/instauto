package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeAccessibilityManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void announceForAccessibility(String str);

    @ReactMethod
    public abstract void getCurrentBoldTextState(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void getCurrentGrayscaleState(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void getCurrentInvertColorsState(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void getCurrentReduceMotionState(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void getCurrentReduceTransparencyState(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void getCurrentVoiceOverState(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void setAccessibilityContentSizeMultipliers(C23043A0y a0y);

    @ReactMethod
    public abstract void setAccessibilityFocus(double d);

    public NativeAccessibilityManagerSpec(A44 a44) {
        super(a44);
    }
}
