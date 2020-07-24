package com.instagram.urlhandler;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.C06590Pq;
import p000X.C140125yt;

public class FollowExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final void A0V(Bundle bundle) {
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(1313217593);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        this.A00 = AnonymousClass0J1.A00(bundleExtra);
        bundleExtra.putString("short_url", bundleExtra.getString("original_url"));
        bundleExtra.putBoolean("UserDetailFragment.EXTRA_SHOULD_SHOW_NAMETAG_RESULT_CARD", true);
        C140125yt.A06(this.A00, this, bundleExtra);
        AnonymousClass0Z0.A07(-494312899, A002);
    }
}
