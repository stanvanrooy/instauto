package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeAnalyticsFunnelLoggerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addActionToFunnel(String str, double d, String str2, String str3, C23043A0y a0y);

    @ReactMethod
    public abstract void addFunnelTag(String str, double d, String str2);

    @ReactMethod
    public abstract void cancelFunnel(String str, double d);

    @ReactMethod
    public abstract void endFunnel(String str, double d);

    @ReactMethod
    public abstract void startFunnel(String str, double d);

    @ReactMethod
    public void startFunnel_DEV_MODE(String str, double d) {
    }

    public NativeAnalyticsFunnelLoggerSpec(A44 a44) {
        super(a44);
    }
}
