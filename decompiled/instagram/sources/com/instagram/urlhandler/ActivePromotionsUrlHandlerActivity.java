package com.instagram.urlhandler;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass2VW;
import p000X.AnonymousClass609;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C15790nX;

public class ActivePromotionsUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1573000255);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        C06590Pq A003 = AnonymousClass0J1.A00(bundleExtra);
        this.A00 = A003;
        if (!A003.AgN()) {
            C15790nX.A00.A00(this, A003, bundleExtra);
        } else {
            AnonymousClass0C1 A02 = C05210Iq.A02(A003);
            AnonymousClass2VW.A01(A02, "DEEPLINK_UNKNOWN");
            AnonymousClass609.A00(this, A02);
        }
        AnonymousClass0Z0.A07(-636479309, A002);
    }
}
