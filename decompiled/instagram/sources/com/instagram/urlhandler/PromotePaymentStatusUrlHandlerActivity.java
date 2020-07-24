package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C15790nX;
import p000X.C16920pO;

public class PromotePaymentStatusUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        double d;
        int i;
        int A002 = AnonymousClass0Z0.A00(-342962974);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        this.A00 = AnonymousClass0J1.A00(bundleExtra);
        String stringExtra = intent.getStringExtra("account");
        String stringExtra2 = intent.getStringExtra("contextID");
        String stringExtra3 = intent.getStringExtra("paymentID");
        bundleExtra.putString("account", stringExtra);
        bundleExtra.putString("contextID", stringExtra2);
        bundleExtra.putString("paymentID", stringExtra3);
        String stringExtra4 = intent.getStringExtra("originRootTag");
        if (!TextUtils.isEmpty(stringExtra4)) {
            d = Double.parseDouble(stringExtra4);
        } else {
            d = 0.0d;
        }
        bundleExtra.putDouble("originRootTag", d);
        C06590Pq r1 = this.A00;
        if (!r1.AgN() || !C05210Iq.A02(r1).A06.A0Q()) {
            C15790nX.A00.A00(this, this.A00, bundleExtra);
            i = -166226737;
        } else {
            finish();
            C16920pO.getInstance().navigateToReactNativeApp(this.A00, "AdsPaymentsPrepayPaymentStatusRoute", bundleExtra);
            i = 246019928;
        }
        AnonymousClass0Z0.A07(i, A002);
    }
}
