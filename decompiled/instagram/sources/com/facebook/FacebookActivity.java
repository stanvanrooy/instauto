package com.facebook;

import android.content.res.Configuration;
import android.os.Bundle;
import com.instagram.common.switchoffactivity.SwitchOffBaseFragmentActivity;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1HD;
import p000X.C25188B5r;

public class FacebookActivity extends SwitchOffBaseFragmentActivity {
    public AnonymousClass1HD A00;

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass1HD r0 = this.A00;
        if (r0 != null) {
            r0.onConfigurationChanged(configuration);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1526783036);
        super.onCreate(bundle);
        setContentView(C0003R.layout.com_facebook_activity_layout);
        AnonymousClass1AM A05 = A05();
        AnonymousClass1HD A0N = A05.A0N("SingleFragment");
        if (A0N == null) {
            A0N = new C25188B5r();
            A0N.setRetainInstance(true);
            AnonymousClass1H6 A0Q = A05.A0Q();
            A0Q.A03(C0003R.C0005id.com_facebook_fragment_container, A0N, "SingleFragment");
            A0Q.A09();
        }
        this.A00 = A0N;
        AnonymousClass0Z0.A07(-309335048, A002);
    }
}
