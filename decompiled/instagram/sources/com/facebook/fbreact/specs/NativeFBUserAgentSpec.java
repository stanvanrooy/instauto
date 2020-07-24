package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeFBUserAgentSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void getWebViewLikeUserAgent(Callback callback);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeFBUserAgentSpec(A44 a44) {
        super(a44);
    }
}
