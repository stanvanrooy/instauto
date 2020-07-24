package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeRelayConfigSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public void getSandbox(Callback callback) {
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public void setSandbox(String str) {
    }

    public NativeRelayConfigSpec(A44 a44) {
        super(a44);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
