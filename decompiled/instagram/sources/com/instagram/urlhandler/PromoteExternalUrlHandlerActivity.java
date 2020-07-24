package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C140125yt;
import p000X.C15790nX;

public class PromoteExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1496152663);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        this.A00 = AnonymousClass0J1.A00(bundleExtra);
        String stringExtra = intent.getStringExtra("media_id");
        String stringExtra2 = intent.getStringExtra("coupon_offer_id");
        String stringExtra3 = intent.getStringExtra("objective");
        bundleExtra.putString("coupon_offer_id", stringExtra2);
        bundleExtra.putString("media_id", stringExtra);
        bundleExtra.putString("objective", stringExtra3);
        intent.getStringExtra("access_token");
        intent.getStringExtra(MemoryDumpUploadJob.EXTRA_USER_ID);
        C06590Pq r1 = this.A00;
        if (!r1.AgN() || !C05210Iq.A02(r1).A06.A0Q()) {
            C15790nX.A00.A00(this, this.A00, bundleExtra);
        } else {
            C140125yt.A05(this.A00, this, bundleExtra);
        }
        AnonymousClass0Z0.A07(-994416039, A002);
    }
}
