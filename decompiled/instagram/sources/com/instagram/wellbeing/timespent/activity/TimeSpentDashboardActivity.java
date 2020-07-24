package com.instagram.wellbeing.timespent.activity;

import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1HD;
import p000X.C06590Pq;
import p000X.C16100o2;

public class TimeSpentDashboardActivity extends BaseFragmentActivity {
    public AnonymousClass0C1 A00;

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void A0V(Bundle bundle) {
        if (A05().A0L(C0003R.C0005id.layout_container_main) == null) {
            AnonymousClass1HD A002 = C16100o2.A00.A00().A00(Constants.A0C, this.A00);
            A002.setArguments(getIntent().getExtras());
            AnonymousClass1H6 A0Q = A05().A0Q();
            A0Q.A02(C0003R.C0005id.layout_container_main, A002);
            A0Q.A09();
        }
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(C0003R.anim.left_in, C0003R.anim.right_out);
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(595417369);
        this.A00 = AnonymousClass0J1.A06(getIntent().getExtras());
        super.onCreate(bundle);
        overridePendingTransition(C0003R.anim.right_in, C0003R.anim.left_out);
        AnonymousClass0Z0.A07(-746640960, A002);
    }
}
