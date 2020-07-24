package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C2102594w;

public abstract class NativeClipboardSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void getString(C2102594w r1);

    @ReactMethod
    public abstract void setString(String str);

    public NativeClipboardSpec(A44 a44) {
        super(a44);
    }
}
