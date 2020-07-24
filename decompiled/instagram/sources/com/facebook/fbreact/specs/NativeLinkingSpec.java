package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C2102594w;

public abstract class NativeLinkingSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void canOpenURL(String str, C2102594w r2);

    @ReactMethod
    public abstract void getInitialURL(C2102594w r1);

    @ReactMethod
    public abstract void openSettings(C2102594w r1);

    @ReactMethod
    public abstract void openURL(String str, C2102594w r2);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void sendIntent(String str, A1e a1e, C2102594w r3);

    public NativeLinkingSpec(A44 a44) {
        super(a44);
    }
}
