package com.instagram.react.modules.base;

import com.facebook.fbreact.specs.NativeFBUserAgentSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A44;
import p000X.C14300kE;

@ReactModule(name = "FBUserAgent")
public class IgReactFBUserAgentModule extends NativeFBUserAgentSpec {
    public static final String NAME = "FBUserAgent";

    public String getName() {
        return NAME;
    }

    public void getWebViewLikeUserAgent(Callback callback) {
        callback.invoke(C14300kE.A00());
    }

    public Map getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("webViewLikeUserAgent", C14300kE.A00());
        return hashMap;
    }

    public IgReactFBUserAgentModule(A44 a44) {
        super(a44);
    }
}
