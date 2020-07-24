package com.instagram.business.activity;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.fragment.EditBusinessFBPageFragment;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.C06590Pq;
import p000X.C16310oO;
import p000X.C52362Om;

public class FbConnectPageActivity extends BaseFragmentActivity {
    public AnonymousClass0C1 A00;

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void A0V(Bundle bundle) {
        this.A00 = AnonymousClass0J1.A06(getIntent().getExtras());
        C16310oO.A00.A00();
        Bundle extras = getIntent().getExtras();
        EditBusinessFBPageFragment editBusinessFBPageFragment = new EditBusinessFBPageFragment();
        editBusinessFBPageFragment.setArguments(extras);
        C52362Om r1 = new C52362Om(this, this.A00);
        r1.A02 = editBusinessFBPageFragment;
        r1.A02();
    }
}
