package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.UUID;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2A5;
import p000X.AnonymousClass3AT;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C13300iJ;
import p000X.C15790nX;
import p000X.C16310oO;
import p000X.C28351Lj;
import p000X.C29087Crf;
import p000X.C29124CsJ;
import p000X.C52362Om;
import p000X.C57942f3;

public class SmbEditPartnerUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass1HD A02;
        int A002 = AnonymousClass0Z0.A00(1153133150);
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
        AnonymousClass0C1 A022 = C05210Iq.A02(this.A00);
        C13300iJ r7 = A022.A06;
        C57942f3 A004 = AnonymousClass3AT.A00(r7, A003);
        C06590Pq r4 = this.A00;
        if (r4 == null || !r4.AgN()) {
            C15790nX.A00.A00(this, r4, bundleExtra);
        } else {
            if (A004 != null) {
                String str = A004.A00;
                String str2 = A004.A02;
                String str3 = A004.A03;
                A02 = C16310oO.A00.A00().A04(uuid, str, str2, str3, str3, stringExtra, A003);
            } else if (AnonymousClass2A5.DONATION == A003) {
                C29124CsJ.A01(A022, new C28351Lj(this, AnonymousClass1L8.A00(this)), new C29087Crf(this, this, A003, uuid, stringExtra));
            } else {
                AnonymousClass2A5[] values = AnonymousClass2A5.values();
                int length = values.length;
                int i = 0;
                while (i < length && AnonymousClass3AT.A00(r7, values[i]) == null) {
                    i++;
                }
                A02 = C16310oO.A00.A00().A02(stringExtra, uuid, A003);
            }
            C52362Om r1 = new C52362Om(this, r4);
            r1.A02 = A02;
            r1.A08 = false;
            r1.A02();
        }
        AnonymousClass0Z0.A07(1252156934, A002);
    }
}
