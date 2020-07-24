package com.instagram.react.modules.product;

import android.app.Activity;
import com.facebook.fbreact.specs.NativeIGPostInsightsReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.business.insights.activity.PostInsightsActivity;
import p000X.A44;
import p000X.AnonymousClass6RZ;
import p000X.C147226Ra;
import p000X.C228039ra;

@ReactModule(name = "IGPostInsightsReactModule")
public class IgReactPostInsightsModule extends NativeIGPostInsightsReactModuleSpec {
    public static final String MODULE_NAME = "IGPostInsightsReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactPostInsightsModule(A44 a44) {
        super(a44);
    }

    public void didFinishLoading(double d) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity instanceof PostInsightsActivity) {
            C228039ra.A01(new AnonymousClass6RZ(this, currentActivity));
        }
    }

    public void toggleNavigationBar(double d, boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity instanceof PostInsightsActivity) {
            C228039ra.A01(new C147226Ra(this, currentActivity, z));
        }
    }
}
