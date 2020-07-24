package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.business.activity.BusinessConversionActivity;
import p000X.Constants;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BH;
import p000X.C05210Iq;
import p000X.C05230Is;
import p000X.C06590Pq;
import p000X.C15790nX;
import p000X.C53882Us;
import p000X.C53892Uu;

public class BusinessSignUpExternalUrlHandlerActivity extends IgFragmentActivity {
    public C06590Pq A00;

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(55748722);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A01(this);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        C06590Pq r1 = this.A00;
        if (!r1.AgN() || bundleExtra == null) {
            C15790nX.A00.A00(this, r1, bundleExtra);
        } else {
            String stringExtra = intent.getStringExtra("entry_ref");
            String stringExtra2 = intent.getStringExtra("fb_user_id");
            String stringExtra3 = intent.getStringExtra("page_id");
            Intent intent2 = new Intent(this, BusinessConversionActivity.class);
            C05230Is.A00(C05210Iq.A02(this.A00), bundleExtra);
            C53882Us.A01();
            bundleExtra.putString("entry_point", stringExtra);
            bundleExtra.putInt("business_account_flow", C53892Uu.A00(Constants.ONE));
            bundleExtra.putString("upsell_fb_user_id", stringExtra2);
            bundleExtra.putString("upsell_page_id", stringExtra3);
            intent2.putExtras(bundleExtra);
            AnonymousClass1BH.A0A(intent2, 12, this);
            finish();
        }
        AnonymousClass0Z0.A07(-115816514, A002);
    }
}
