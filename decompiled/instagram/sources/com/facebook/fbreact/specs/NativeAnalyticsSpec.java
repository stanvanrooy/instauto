package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeAnalyticsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void logCounter(String str, double d);

    @ReactMethod
    public abstract void logEvent(String str, C23043A0y a0y, String str2);

    @ReactMethod
    public abstract void logRealtimeEvent(String str, C23043A0y a0y, String str2);

    public NativeAnalyticsSpec(A44 a44) {
        super(a44);
    }
}
