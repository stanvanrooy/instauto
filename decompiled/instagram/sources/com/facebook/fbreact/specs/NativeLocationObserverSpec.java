package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeLocationObserverSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void getCurrentPosition(C23043A0y a0y, Callback callback, Callback callback2);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void requestAuthorization();

    @ReactMethod
    public abstract void setConfiguration(C23043A0y a0y);

    @ReactMethod
    public abstract void startObserving(C23043A0y a0y);

    @ReactMethod
    public abstract void stopObserving();

    public NativeLocationObserverSpec(A44 a44) {
        super(a44);
    }
}
