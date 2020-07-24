package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeIGReactAlertBarSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void showErrors(C23043A0y a0y);

    @ReactMethod
    public abstract void showMessage(String str, double d);

    public NativeIGReactAlertBarSpec(A44 a44) {
        super(a44);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
