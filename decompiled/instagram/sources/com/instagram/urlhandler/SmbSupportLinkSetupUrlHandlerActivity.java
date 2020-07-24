package com.instagram.urlhandler;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.fragment.SupportLinksFragment;
import java.util.UUID;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.C06590Pq;
import p000X.C15790nX;
import p000X.C16310oO;
import p000X.C52362Om;

public class SmbSupportLinkSetupUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1105824084);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra != null) {
            this.A00 = AnonymousClass0J1.A00(bundleExtra);
        }
        String uuid = UUID.randomUUID().toString();
        String stringExtra = intent.getStringExtra("entrypoint");
        C06590Pq r2 = this.A00;
        if (r2 == null || !r2.AgN()) {
            C15790nX.A00.A00(this, r2, bundleExtra);
        } else {
            C16310oO.A00.A00();
            Bundle bundle2 = new Bundle();
            bundle2.putString("args_entry_point", stringExtra);
            bundle2.putString("args_session_id", uuid);
            SupportLinksFragment supportLinksFragment = new SupportLinksFragment();
            supportLinksFragment.setArguments(bundle2);
            C52362Om r1 = new C52362Om(this, r2);
            r1.A02 = supportLinksFragment;
            r1.A08 = false;
            r1.A02();
        }
        AnonymousClass0Z0.A07(-853357156, A002);
    }
}
