package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1DW;
import p000X.AnonymousClass6D4;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C12810hQ;
import p000X.C140125yt;
import p000X.C15790nX;
import p000X.C16160o8;
import p000X.C17850qu;
import p000X.C36981iv;

public class InsightsExternalUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0RN {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final String getModuleName() {
        return "insights_external_url_handler";
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0Z0.A00(-504197619);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        this.A00 = AnonymousClass0J1.A00(bundleExtra);
        bundleExtra.putString("media_id", intent.getStringExtra("media_id"));
        C06590Pq r1 = this.A00;
        if (!r1.AgN()) {
            C15790nX.A00.A00(this, r1, bundleExtra);
        } else {
            AnonymousClass0C1 A02 = C05210Iq.A02(r1);
            String string = bundleExtra.getString("media_id");
            if (string != null) {
                bundleExtra.putString("IgSessionManager.SESSION_TOKEN_KEY", A02.getToken());
                C17850qu A03 = C16160o8.A03(string, A02);
                A03.A00 = new AnonymousClass6D4(this, A02);
                C12810hQ.A02(A03);
                i = -1544419389;
            } else {
                String stringExtra = intent.getStringExtra("pk");
                if (stringExtra == null || stringExtra.equals(A02.A04())) {
                    C36981iv.A06(A02, A02.A06, this, this, true);
                } else {
                    bundleExtra.putString("destination_id", AnonymousClass1DW.A01(Constants.ZERO));
                    C140125yt.A01(this, bundleExtra);
                    i = 11055134;
                }
            }
            AnonymousClass0Z0.A07(i, A002);
        }
        i = 2033175907;
        AnonymousClass0Z0.A07(i, A002);
    }
}
