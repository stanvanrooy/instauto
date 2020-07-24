package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeVibrationSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void cancel();

    @ReactMethod
    public abstract void vibrate(double d);

    @ReactMethod
    public abstract void vibrateByPattern(A1e a1e, double d);

    public NativeVibrationSpec(A44 a44) {
        super(a44);
    }
}
