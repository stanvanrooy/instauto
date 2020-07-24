package com.instagram.urlhandler;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass2UZ;
import p000X.C06590Pq;
import p000X.C15790nX;
import p000X.C52362Om;

public class ReelExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        boolean AgN;
        int A002 = AnonymousClass0Z0.A00(-2058561425);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        this.A00 = AnonymousClass0J1.A00(bundleExtra);
        bundleExtra.putString("com.instagram.url.constants.ARGUMENTS_KEY_REEL_SHORT_URL", bundleExtra.getString("original_url"));
        C06590Pq r3 = this.A00;
        if (r3 == null || !(AgN = r3.AgN()) || !AgN) {
            C15790nX.A00.A00(this, r3, bundleExtra);
        } else {
            AnonymousClass1HD A0A = AnonymousClass2UZ.A00().A0A();
            bundleExtra.putString("IgSessionManager.SESSION_TOKEN_KEY", r3.getToken());
            A0A.setArguments(bundleExtra);
            C52362Om r1 = new C52362Om(this, r3);
            r1.A02 = A0A;
            r1.A08 = false;
            r1.A02();
        }
        AnonymousClass0Z0.A07(-644339325, A002);
    }
}
