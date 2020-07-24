package com.instagram.business.instantexperiences.p028ui;

import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1HD;
import p000X.C06590Pq;
import p000X.C25114B1k;

/* renamed from: com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserActivity */
public class InstantExperiencesBrowserActivity extends IgFragmentActivity {
    public AnonymousClass1HD A00;
    public AnonymousClass0C1 A01;

    public final void onBackPressed() {
        if (!((C25114B1k) this.A00).onBackPressed()) {
            super.onBackPressed();
        }
    }

    public final C06590Pq A0L() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(410757087);
        super.onCreate(bundle);
        this.A01 = AnonymousClass0J1.A06(getIntent().getExtras());
        setContentView((int) C0003R.layout.instant_experiences_browser_main);
        if (bundle == null) {
            C25114B1k b1k = new C25114B1k();
            this.A00 = b1k;
            b1k.setArguments(getIntent().getExtras());
            AnonymousClass1H6 A0Q = A05().A0Q();
            A0Q.A01(C0003R.C0005id.instant_experience_fragment_container, this.A00);
            A0Q.A09();
        } else {
            this.A00 = A05().A0M(bundle, "instant_experiences_browser_fragment");
        }
        AnonymousClass0Z0.A07(499206163, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A05().A0Z(bundle, "instant_experiences_browser_fragment", this.A00);
    }
}
