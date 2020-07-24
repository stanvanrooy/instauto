package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeIGShoppingBusinessSignupModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void registerGetStarted(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void registerNotInterestedInShopping();

    @ReactMethod
    public abstract void syncShoppingOnboardingState(Callback callback, Callback callback2);

    public NativeIGShoppingBusinessSignupModuleSpec(A44 a44) {
        super(a44);
    }
}
