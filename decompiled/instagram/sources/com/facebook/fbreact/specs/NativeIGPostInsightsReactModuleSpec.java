package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeIGPostInsightsReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void didFinishLoading(double d);

    @ReactMethod
    public abstract void toggleNavigationBar(double d, boolean z);

    public NativeIGPostInsightsReactModuleSpec(A44 a44) {
        super(a44);
    }
}
