package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeActionSheetManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void showActionSheetWithOptions(C23043A0y a0y, Callback callback);

    @ReactMethod
    public abstract void showShareActionSheetWithOptions(C23043A0y a0y, Callback callback, Callback callback2);

    public NativeActionSheetManagerSpec(A44 a44) {
        super(a44);
    }
}
