package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1DU;
import p000X.AnonymousClass38B;
import p000X.C06590Pq;
import p000X.C139165x9;
import p000X.C15790nX;
import p000X.C26421Df;
import p000X.C59032gv;

public class FbeAppStoreUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        C139165x9 r2;
        String str;
        int i;
        String str2;
        int A002 = AnonymousClass0Z0.A00(-1487891979);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra != null) {
            this.A00 = AnonymousClass0J1.A00(bundleExtra);
        }
        C06590Pq r1 = this.A00;
        if (!r1.AgN()) {
            C15790nX.A00.A00(this, r1, bundleExtra);
        } else {
            boolean A003 = AnonymousClass38B.A00(r1, false);
            String stringExtra = intent.getStringExtra("app_id");
            String stringExtra2 = intent.getStringExtra("app_name");
            String stringExtra3 = intent.getStringExtra("app_logo_url");
            String stringExtra4 = intent.getStringExtra("authentication_url");
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra4)) {
                r2 = new C139165x9(this.A00);
                if (A003) {
                    str = "com.instagram.fbe.screens.partner_list";
                } else {
                    str = "com.instagram.ldp.app_store.partner_list";
                }
                r2.A03(str);
                i = C0003R.string.choose_partner;
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("app_id", stringExtra);
                hashMap.put("app_name", stringExtra2);
                hashMap.put("app_logo_url", stringExtra3);
                hashMap.put("authentication_url", stringExtra4);
                r2 = new C139165x9(this.A00);
                if (A003) {
                    str2 = "com.instagram.fbe.screens.value_prop";
                } else {
                    str2 = "com.instagram.ldp.app_store.confirmation";
                }
                r2.A03(str2);
                r2.A05(hashMap);
                i = C0003R.string.connect_website;
            }
            r2.A04(getString(i));
            Bundle A01 = r2.A01();
            C26421Df.A00().Bl4(AnonymousClass1DU.PROFILE, false);
            C59032gv.A03(ModalActivity.class, "bloks", A01, getApplicationContext());
            finish();
        }
        AnonymousClass0Z0.A07(-1128475934, A002);
    }
}
