package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeWebSocketModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void close(double d, String str, double d2);

    @ReactMethod
    public abstract void connect(String str, A1e a1e, C23043A0y a0y, double d);

    @ReactMethod
    public abstract void ping(double d);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void send(String str, double d);

    @ReactMethod
    public abstract void sendBinary(String str, double d);

    public NativeWebSocketModuleSpec(A44 a44) {
        super(a44);
    }
}
