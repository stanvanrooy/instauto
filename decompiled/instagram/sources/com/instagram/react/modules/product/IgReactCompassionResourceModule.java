package com.instagram.react.modules.product;

import android.os.Handler;
import android.os.Looper;
import com.facebook.fbreact.specs.NativeCompassionResourceModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A2P;
import p000X.A44;
import p000X.AnonymousClass0ZA;

@ReactModule(name = "CompassionResourceModule")
public class IgReactCompassionResourceModule extends NativeCompassionResourceModuleSpec {
    public static final String MODULE_NAME = "CompassionResourceModule";

    public String getName() {
        return MODULE_NAME;
    }

    public void closeCompassionResource(double d) {
        AnonymousClass0ZA.A0E(new Handler(Looper.getMainLooper()), new A2P(this), 926722285);
    }

    public IgReactCompassionResourceModule(A44 a44) {
        super(a44);
    }
}
