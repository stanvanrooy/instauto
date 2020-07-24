package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.UUID;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass2A5;
import p000X.AnonymousClass3AT;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C13300iJ;
import p000X.C15790nX;
import p000X.C16310oO;
import p000X.C52362Om;

public class SmbSelectPartnerUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(478971854);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra != null) {
            this.A00 = AnonymousClass0J1.A00(bundleExtra);
        }
        String uuid = UUID.randomUUID().toString();
        AnonymousClass2A5 A003 = AnonymousClass2A5.A00(intent.getStringExtra("servicetype"));
        AnonymousClass0a4.A07(A003, "service type in deep link should not be null");
        String stringExtra = intent.getStringExtra("entrypoint");
        C06590Pq r6 = this.A00;
        if (r6 == null || !r6.AgN()) {
            C15790nX.A00.A00(this, r6, bundleExtra);
        } else {
            C13300iJ r4 = C05210Iq.A02(r6).A06;
            AnonymousClass2A5[] values = AnonymousClass2A5.values();
            int length = values.length;
            int i = 0;
            while (i < length && AnonymousClass3AT.A00(r4, values[i]) == null) {
                i++;
            }
            AnonymousClass1HD A02 = C16310oO.A00.A00().A02(stringExtra, uuid, A003);
            C52362Om r1 = new C52362Om(this, r6);
            r1.A02 = A02;
            r1.A08 = false;
            r1.A02();
        }
        AnonymousClass0Z0.A07(-1458883981, A002);
    }
}
