package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeJSDevSupportSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void onFailure(double d, String str);

    @ReactMethod
    public abstract void onSuccess(String str);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeJSDevSupportSpec(A44 a44) {
        super(a44);
    }
}
