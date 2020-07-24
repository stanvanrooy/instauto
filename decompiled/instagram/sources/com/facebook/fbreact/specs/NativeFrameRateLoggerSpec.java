package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeFrameRateLoggerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void beginScroll();

    @ReactMethod
    public abstract void endScroll();

    @ReactMethod
    public abstract void setContext(String str);

    @ReactMethod
    public abstract void setGlobalOptions(C23043A0y a0y);

    public NativeFrameRateLoggerSpec(A44 a44) {
        super(a44);
    }
}
