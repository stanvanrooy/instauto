package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeTimingSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void createTimer(double d, double d2, double d3, boolean z);

    @ReactMethod
    public abstract void deleteTimer(double d);

    @ReactMethod
    public abstract void setSendIdleEvents(boolean z);

    public NativeTimingSpec(A44 a44) {
        super(a44);
    }
}
