package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.direct.fragment.quickreply.manager.QuickReplyTextManager;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass4JP;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C15790nX;
import p000X.C17480qJ;
import p000X.C52362Om;
import p000X.C96124Dx;

public class DirectQuickReplySettingsUriHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        C52362Om r1;
        int i;
        int A002 = AnonymousClass0Z0.A00(-1184822954);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            i = -115629336;
        } else {
            C06590Pq A003 = AnonymousClass0J1.A00(bundleExtra);
            this.A00 = A003;
            if (A003 == null) {
                i = 544286450;
            } else {
                if (!A003.AgN()) {
                    C15790nX.A00.A00(this, A003, getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"));
                } else {
                    AnonymousClass0C1 A02 = C05210Iq.A02(A003);
                    Integer num = A02.A06.A1b;
                    if (num == Constants.A0C || (num == Constants.A0N && ((Boolean) AnonymousClass0L6.A02(A02, AnonymousClass0L7.CREATOR_QUICK_REPLY, "is_enabled", false, (AnonymousClass04H) null)).booleanValue())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if ("business_hub".equals(intent.getStringExtra("entrypoint"))) {
                            QuickReplyTextManager.A00(C05210Iq.A02(this.A00)).A04();
                            r1 = new C52362Om(this, this.A00);
                            r1.A08 = false;
                        } else {
                            C52362Om r12 = new C52362Om(this, this.A00);
                            r12.A08 = false;
                            r12.A0B = true;
                            C17480qJ.A00.A00();
                            r12.A02 = new C96124Dx();
                            r12.A02();
                            r1 = new C52362Om(this, this.A00);
                        }
                        r1.A0B = true;
                        r1.A02 = new AnonymousClass4JP();
                        r1.A02();
                    }
                }
                i = 578654110;
            }
        }
        AnonymousClass0Z0.A07(i, A002);
    }
}
