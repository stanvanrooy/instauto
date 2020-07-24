package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeSettingsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void deleteValues(A1e a1e);

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void setValues(C23043A0y a0y);

    public NativeSettingsManagerSpec(A44 a44) {
        super(a44);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
