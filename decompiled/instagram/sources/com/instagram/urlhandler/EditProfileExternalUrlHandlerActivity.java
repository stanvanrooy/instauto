package com.instagram.urlhandler;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C15790nX;
import p000X.C18980sj;
import p000X.C27341Hl;
import p000X.C52362Om;

public class EditProfileExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(322713052);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        C06590Pq A003 = AnonymousClass0J1.A00(bundleExtra);
        this.A00 = A003;
        if (!A003.AgN()) {
            C15790nX.A00.A00(this, A003, bundleExtra);
        } else {
            bundleExtra.putString("IgSessionManager.SESSION_TOKEN_KEY", C05210Iq.A02(A003).getToken());
            C27341Hl A06 = C18980sj.A00.A00().A06("deeplink_unknown");
            bundleExtra.putString("edit_profile_entry", "deeplink_unknown");
            A06.setArguments(bundleExtra);
            C52362Om r1 = new C52362Om(this, A003);
            r1.A02 = A06;
            r1.A08 = false;
            r1.A02();
        }
        AnonymousClass0Z0.A07(-586059239, A002);
    }
}
