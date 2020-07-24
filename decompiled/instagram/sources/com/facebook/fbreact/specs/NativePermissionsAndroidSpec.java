package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C2102594w;

public abstract class NativePermissionsAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void checkPermission(String str, C2102594w r2);

    @ReactMethod
    public abstract void requestMultiplePermissions(A1e a1e, C2102594w r2);

    @ReactMethod
    public abstract void requestPermission(String str, C2102594w r2);

    @ReactMethod
    public abstract void shouldShowRequestPermissionRationale(String str, C2102594w r2);

    public NativePermissionsAndroidSpec(A44 a44) {
        super(a44);
    }
}
