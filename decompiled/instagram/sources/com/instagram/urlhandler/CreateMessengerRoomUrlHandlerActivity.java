package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.C05210Iq;
import p000X.C05230Is;
import p000X.C06590Pq;
import p000X.C139395xb;
import p000X.C139405xc;
import p000X.C15790nX;
import p000X.C21880xR;

public class CreateMessengerRoomUrlHandlerActivity extends IgFragmentActivity {
    public C06590Pq A00;

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1099379121);
        super.onCreate(bundle);
        setContentView((int) C0003R.layout.activity_bottom_sheet_container);
        onNewIntent(getIntent());
        AnonymousClass0Z0.A07(639758366, A002);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        C06590Pq A002 = AnonymousClass0J1.A00(bundleExtra);
        this.A00 = A002;
        boolean AgN = A002.AgN();
        if (!AgN) {
            C15790nX.A00.A00(this, A002, bundleExtra);
            return;
        }
        C139405xc r2 = new C139405xc(this);
        AnonymousClass0C1 A02 = C05210Iq.A02(A002);
        C05230Is.A00(A02, bundleExtra);
        if (AgN) {
            C139395xb A01 = C21880xR.A00.A01(this, A02);
            A01.A00 = r2;
            A01.A02(Constants.A0N);
        }
        overridePendingTransition(0, 0);
    }
}
