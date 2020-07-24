package com.instagram.react.modules.product;

import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGBrandedContentReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import p000X.A44;
import p000X.Constants;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1N4;
import p000X.AnonymousClass40t;
import p000X.C06590Pq;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C2102594w;
import p000X.C2102794y;
import p000X.C28351Lj;

@ReactModule(name = "IGBrandedContentReactModule")
public class IgReactBrandedContentModule extends NativeIGBrandedContentReactModuleSpec {
    public static final String MODULE_NAME = "IGBrandedContentReactModule";
    public C06590Pq mSession;

    public String getName() {
        return MODULE_NAME;
    }

    public void updateWhitelistSettings(boolean z, String str, String str2, C2102594w r7) {
        String str3;
        C15890nh r2 = new C15890nh(this.mSession);
        r2.A09 = Constants.ONE;
        r2.A0C = "business/branded_content/update_whitelist_settings/";
        if (z) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        r2.A09(AnonymousClass40t.$const$string(287), str3);
        r2.A0B("added_user_ids", str);
        r2.A0B("removed_user_ids", str2);
        r2.A06(AnonymousClass1N4.class, false);
        r2.A0G = true;
        scheduleTask(r2.A03(), r7);
    }

    public IgReactBrandedContentModule(A44 a44, C06590Pq r2) {
        super(a44);
        this.mSession = r2;
    }

    private void scheduleTask(C17850qu r3, C2102594w r4) {
        if (getCurrentActivity() != null && (getCurrentActivity() instanceof FragmentActivity)) {
            r3.A00 = new C2102794y(this, r4);
            C28351Lj.A00(getReactApplicationContext(), AnonymousClass1L8.A00((FragmentActivity) getCurrentActivity()), r3);
        }
    }
}
