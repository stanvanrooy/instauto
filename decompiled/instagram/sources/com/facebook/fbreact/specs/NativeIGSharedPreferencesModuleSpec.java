package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C2102594w;

public abstract class NativeIGSharedPreferencesModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void getBoolean(String str, String str2, boolean z, C2102594w r4);

    @ReactMethod
    public abstract void getString(String str, String str2, String str3, C2102594w r4);

    public NativeIGSharedPreferencesModuleSpec(A44 a44) {
        super(a44);
    }
}
