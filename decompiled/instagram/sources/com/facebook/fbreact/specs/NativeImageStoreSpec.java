package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeImageStoreSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addImageFromBase64(String str, Callback callback, Callback callback2);

    @ReactMethod
    public abstract void getBase64ForTag(String str, Callback callback, Callback callback2);

    @ReactMethod
    public abstract void hasImageForTag(String str, Callback callback);

    @ReactMethod
    public abstract void removeImageForTag(String str);

    public NativeImageStoreSpec(A44 a44) {
        super(a44);
    }
}
