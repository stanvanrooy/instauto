package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public void dismissRedbox() {
    }

    @ReactMethod
    public void reportException(C23043A0y a0y) {
    }

    @ReactMethod
    public abstract void reportFatalException(String str, A1e a1e, double d);

    @ReactMethod
    public abstract void reportSoftException(String str, A1e a1e, double d);

    @ReactMethod
    public abstract void updateExceptionMessage(String str, A1e a1e, double d);

    public NativeExceptionsManagerSpec(A44 a44) {
        super(a44);
    }
}
