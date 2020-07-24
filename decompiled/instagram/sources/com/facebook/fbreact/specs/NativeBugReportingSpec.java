package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeBugReportingSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void setCategoryID(String str);

    @ReactMethod
    public abstract void setExtraData(C23043A0y a0y, C23043A0y a0y2);

    @ReactMethod
    public abstract void startReportAProblemFlow();

    public NativeBugReportingSpec(A44 a44) {
        super(a44);
    }
}
