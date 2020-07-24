package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void addMenuItem(String str);

    @ReactMethod
    public void onFastRefresh() {
    }

    @ReactMethod
    public abstract void reload();

    @ReactMethod
    public void reloadWithReason(String str) {
    }

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z);

    @ReactMethod
    public abstract void setIsDebuggingRemotely(boolean z);

    @ReactMethod
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z);

    @ReactMethod
    public abstract void setProfilingEnabled(boolean z);

    @ReactMethod
    public abstract void toggleElementInspector();

    public NativeDevSettingsSpec(A44 a44) {
        super(a44);
    }
}
