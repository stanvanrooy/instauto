package com.instagram.urlhandler;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass4DC;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C15790nX;
import p000X.C17480qJ;
import p000X.C52362Om;

public class FollowAndInviteFriendsUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0Z0.A00(420524709);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            i = -1223845455;
        } else {
            C06590Pq A003 = AnonymousClass0J1.A00(bundleExtra);
            this.A00 = A003;
            if (A003 == null) {
                i = 504009681;
            } else {
                if (!A003.AgN()) {
                    C15790nX.A00.A00(this, A003, getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"));
                } else {
                    C52362Om r1 = new C52362Om(this, C05210Iq.A02(A003));
                    r1.A08 = false;
                    r1.A0B = true;
                    C17480qJ.A00.A00();
                    r1.A02 = new AnonymousClass4DC();
                    r1.A02();
                }
                i = 761299018;
            }
        }
        AnonymousClass0Z0.A07(i, A002);
    }
}
