package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeToastAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void show(String str, double d);

    @ReactMethod
    public abstract void showWithGravity(String str, double d, double d2);

    @ReactMethod
    public abstract void showWithGravityAndOffset(String str, double d, double d2, double d3, double d4);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeToastAndroidSpec(A44 a44) {
        super(a44);
    }
}
