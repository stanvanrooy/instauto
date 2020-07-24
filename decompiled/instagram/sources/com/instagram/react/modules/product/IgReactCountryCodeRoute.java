package com.instagram.react.modules.product;

import com.facebook.fbreact.specs.NativeIGReactCountryCodeRouteSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A44;
import p000X.C06590Pq;
import p000X.C139035wG;
import p000X.C228039ra;

@ReactModule(name = "IGReactCountryCodeRoute")
public class IgReactCountryCodeRoute extends NativeIGReactCountryCodeRouteSpec {
    public static final String MODULE_NAME = "IGReactCountryCodeRoute";
    public final C06590Pq mSession;

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactCountryCodeRoute(A44 a44, C06590Pq r2) {
        super(a44);
        this.mSession = r2;
    }

    public void presentCountryCodeSelector(String str, Callback callback) {
        if (getCurrentActivity() != null) {
            C228039ra.A01(new C139035wG(this, callback));
        }
    }
}
