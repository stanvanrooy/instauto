package com.instagram.react.modules.product;

import android.os.Bundle;
import com.facebook.fbreact.specs.NativeIGGeoGatingReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashSet;
import p000X.A1e;
import p000X.A44;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.C145156In;
import p000X.C16180oA;
import p000X.C23300zv;

@ReactModule(name = "IGGeoGatingReactModule")
public class IgReactGeoGatingModule extends NativeIGGeoGatingReactModuleSpec {
    public static final String FRAGMENT_ARGUMENTS = "fragment_arguments";
    public static final String MODULE_NAME = "IGGeoGatingReactModule";
    public static final String SETTING_TYPE_FEED = "feed";
    public AnonymousClass0C1 mUserSession;

    public String getName() {
        return MODULE_NAME;
    }

    public void updateGeoGatingSettings(boolean z, A1e a1e, String str) {
        AnonymousClass0C1 r0 = this.mUserSession;
        if (r0 != null) {
            C16180oA.A00(r0).A0X(str, z);
            HashSet hashSet = new HashSet();
            for (int i = 0; i < a1e.size(); i++) {
                hashSet.add(a1e.getString(i));
            }
            C16180oA A00 = C16180oA.A00(this.mUserSession);
            A00.A00.edit().remove(AnonymousClass000.A0E(str, "_limit_location_list")).apply();
            A00.A00.edit().putStringSet(AnonymousClass000.A0E(str, "_limit_location_list"), hashSet).apply();
            if (str.equals(SETTING_TYPE_FEED)) {
                C23300zv.A00(this.mUserSession).A04(new C145156In());
            }
        }
    }

    public IgReactGeoGatingModule(A44 a44) {
        super(a44);
    }

    public void setupNativeModule() {
        if (getCurrentActivity() == null || getCurrentActivity().getIntent() == null) {
            this.mUserSession = null;
            return;
        }
        Bundle extras = getCurrentActivity().getIntent().getExtras();
        if (extras.getBundle(FRAGMENT_ARGUMENTS) != null) {
            extras = extras.getBundle(FRAGMENT_ARGUMENTS);
        }
        this.mUserSession = AnonymousClass0J1.A06(extras);
    }
}
