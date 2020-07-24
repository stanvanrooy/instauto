package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeStatusBarManagerAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void setColor(double d, boolean z);

    @ReactMethod
    public abstract void setHidden(boolean z);

    @ReactMethod
    public abstract void setStyle(String str);

    @ReactMethod
    public abstract void setTranslucent(boolean z);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeStatusBarManagerAndroidSpec(A44 a44) {
        super(a44);
    }
}
