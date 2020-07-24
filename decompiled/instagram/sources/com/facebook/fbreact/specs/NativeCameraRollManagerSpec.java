package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C2102594w;
import p000X.C23043A0y;

public abstract class NativeCameraRollManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void deletePhotos(A1e a1e, C2102594w r2);

    @ReactMethod
    public abstract void getPhotos(C23043A0y a0y, C2102594w r2);

    @ReactMethod
    public abstract void saveToCameraRoll(String str, String str2, C2102594w r3);

    public NativeCameraRollManagerSpec(A44 a44) {
        super(a44);
    }
}
