package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeLeadGenHelperSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public void onAppPrepareToClose() {
    }

    @ReactMethod
    public void onScroll(double d) {
    }

    @ReactMethod
    public abstract void openAdUrl(String str, String str2, double d, double d2, String str3);

    @ReactMethod
    public abstract void openDialer(String str, String str2, double d, double d2, String str3);

    @ReactMethod
    public abstract void submitForm(String str, String str2);

    public NativeLeadGenHelperSpec(A44 a44) {
        super(a44);
    }
}
