package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C2102594w;
import p000X.C23043A0y;

public abstract class NativeIGReactAPISpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void get(String str, C23043A0y a0y, C2102594w r3);

    @ReactMethod
    public abstract void post(String str, C23043A0y a0y, C2102594w r3);

    public NativeIGReactAPISpec(A44 a44) {
        super(a44);
    }
}
