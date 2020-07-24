package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeNetworkingAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void abortRequest(double d);

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void clearCookies(Callback callback);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void sendRequest(String str, String str2, double d, A1e a1e, C23043A0y a0y, String str3, boolean z, double d2, boolean z2);

    public NativeNetworkingAndroidSpec(A44 a44) {
        super(a44);
    }
}
