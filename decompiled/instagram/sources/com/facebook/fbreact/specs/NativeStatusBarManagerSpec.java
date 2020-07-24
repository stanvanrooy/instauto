package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeStatusBarManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void getHeight(Callback callback);

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void setColor(double d, boolean z);

    @ReactMethod
    public abstract void setHidden(boolean z, String str);

    @ReactMethod
    public abstract void setNetworkActivityIndicatorVisible(boolean z);

    @ReactMethod
    public abstract void setStyle(String str, Boolean bool);

    @ReactMethod
    public abstract void setTranslucent(boolean z);

    public NativeStatusBarManagerSpec(A44 a44) {
        super(a44);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
