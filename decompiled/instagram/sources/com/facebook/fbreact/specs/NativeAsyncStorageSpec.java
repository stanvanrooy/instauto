package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeAsyncStorageSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void clear(Callback callback);

    @ReactMethod
    public abstract void getAllKeys(Callback callback);

    @ReactMethod
    public abstract void multiGet(A1e a1e, Callback callback);

    @ReactMethod
    public abstract void multiMerge(A1e a1e, Callback callback);

    @ReactMethod
    public abstract void multiRemove(A1e a1e, Callback callback);

    @ReactMethod
    public abstract void multiSet(A1e a1e, Callback callback);

    public NativeAsyncStorageSpec(A44 a44) {
        super(a44);
    }
}
