package com.instagram.urlhandler;

import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.BY5;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C15790nX;

public class PromotionPaymentsUrlHandlerActivity extends IgFragmentActivity {
    public C06590Pq A00;

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(817085825);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A01(this);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        C06590Pq r1 = this.A00;
        if (!r1.AgN()) {
            C15790nX.A00.A00(this, r1, bundleExtra);
        } else {
            BY5.A00(this, 1007, C05210Iq.A02(r1));
        }
        AnonymousClass0Z0.A07(-436809714, A002);
    }
}
