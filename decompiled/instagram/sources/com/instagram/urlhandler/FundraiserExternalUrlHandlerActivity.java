package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.HashMap;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1D9;
import p000X.AnonymousClass4MC;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C12810hQ;
import p000X.C140165yx;
import p000X.C15790nX;
import p000X.C162486wZ;
import p000X.C53562Th;
import p000X.C53572Ti;
import p000X.C98034Ll;

public class FundraiserExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;
    public final AnonymousClass1D9 A01 = new C162486wZ(this);

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(592719153);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        this.A00 = AnonymousClass0J1.A00(bundleExtra);
        HashMap hashMap = new HashMap();
        hashMap.put("fundraiser_id", intent.getStringExtra("fundraiser_id"));
        A05().A0r(this.A01);
        C06590Pq r1 = this.A00;
        if (!r1.AgN()) {
            C15790nX.A00.A00(this, r1, bundleExtra);
        } else {
            AnonymousClass0C1 A02 = C05210Iq.A02(r1);
            AnonymousClass4MC r2 = new AnonymousClass4MC(A02, this, new C140165yx());
            C53562Th A003 = C53572Ti.A00(A02, "com.instagram.social_impact.fundraiser.personal.details.full_screen_action", hashMap);
            A003.A00 = new C98034Ll(r2);
            C12810hQ.A02(A003);
        }
        AnonymousClass0Z0.A07(424582435, A002);
    }
}
