package com.instagram.payout.activity;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1H6;
import p000X.C06590Pq;
import p000X.C13150hy;
import p000X.C18640sB;
import p000X.CKT;

public final class PayoutOnboardingFlowActivity extends BaseFragmentActivity {
    public AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ C06590Pq A0L() {
        AnonymousClass0C1 r1 = this.A00;
        if (r1 == null) {
            C13150hy.A03("userSession");
        }
        return r1;
    }

    public final void A0V(Bundle bundle) {
        if (A05().A0L(C0003R.C0005id.layout_container_main) == null) {
            C18640sB.A00().A00();
            CKT ckt = new CKT();
            Intent intent = getIntent();
            C13150hy.A01(intent, "intent");
            ckt.setArguments(intent.getExtras());
            AnonymousClass1H6 A0Q = A05().A0Q();
            A0Q.A02(C0003R.C0005id.layout_container_main, ckt);
            A0Q.A09();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(593531208);
        super.onCreate(bundle);
        Intent intent = getIntent();
        C13150hy.A01(intent, "intent");
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(intent.getExtras());
        C13150hy.A01(A06, "IgSessionManager.getUserSession(intent.extras)");
        this.A00 = A06;
        AnonymousClass0Z0.A07(1145426397, A002);
    }
}
