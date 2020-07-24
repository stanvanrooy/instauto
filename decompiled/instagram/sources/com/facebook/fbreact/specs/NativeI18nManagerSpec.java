package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeI18nManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void allowRTL(boolean z);

    @ReactMethod
    public abstract void forceRTL(boolean z);

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void swapLeftAndRightInRTL(boolean z);

    public NativeI18nManagerSpec(A44 a44) {
        super(a44);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
