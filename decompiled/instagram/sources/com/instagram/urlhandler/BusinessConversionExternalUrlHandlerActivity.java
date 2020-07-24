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

public class BusinessConversionExternalUrlHandlerActivity extends IgFragmentActivity {
    public C06590Pq A00;

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(1310888281);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A01(this);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        C06590Pq r1 = this.A00;
        if (!r1.AgN()) {
            C15790nX.A00.A00(this, r1, bundleExtra);
        } else {
            C05230Is.A00(C05210Iq.A02(r1), bundleExtra);
            C53882Us.A01();
            Intent intent = new Intent(this, BusinessConversionActivity.class);
            bundleExtra.putString("entry_point", "deep_link");
            bundleExtra.putInt("intro_entry_position", 0);
            bundleExtra.putInt("business_account_flow", C53892Uu.A00(Constants.A0N));
            intent.putExtras(bundleExtra);
            AnonymousClass1BH.A0A(intent, 11, this);
            finish();
        }
        AnonymousClass0Z0.A07(-1563376496, A002);
    }
}
