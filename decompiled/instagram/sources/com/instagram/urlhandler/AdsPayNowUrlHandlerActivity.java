package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BX;
import p000X.C06590Pq;
import p000X.C15790nX;
import p000X.C16920pO;
import p000X.C52362Om;
import p000X.C53832Un;

public class AdsPayNowUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-880405724);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra != null) {
            this.A00 = AnonymousClass0J1.A00(bundleExtra);
        }
        String stringExtra = intent.getStringExtra("adAccountID");
        bundleExtra.putString("paymentAccountID", stringExtra);
        bundleExtra.putString("entryPoint", "instagram");
        C06590Pq r1 = this.A00;
        if (!r1.AgN()) {
            C15790nX.A00.A00(this, r1, bundleExtra);
        } else if (!AnonymousClass1BX.A00(stringExtra)) {
            C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(this.A00);
            newReactNativeLauncher.BlH(getString(C0003R.string.promote_error_pay_now_label));
            newReactNativeLauncher.Bjt(bundleExtra);
            newReactNativeLauncher.BkI("AdsPaymentsPayNowRoute");
            C52362Om BrT = newReactNativeLauncher.BrT(this);
            BrT.A08 = false;
            BrT.A02();
        }
        AnonymousClass0Z0.A07(558623511, A002);
    }
}
