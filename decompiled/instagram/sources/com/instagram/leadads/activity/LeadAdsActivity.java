package com.instagram.leadads.activity;

import android.os.Bundle;
import com.facebook.C0003R;
import com.facebook.flipper.core.StateSummary;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass25N;
import p000X.AnonymousClass25O;
import p000X.AnonymousClass25P;
import p000X.AnonymousClass25R;
import p000X.AnonymousClass95B;
import p000X.AnonymousClass9S2;
import p000X.AnonymousClass9S6;
import p000X.AnonymousClass9SA;
import p000X.AnonymousClass9SC;
import p000X.AnonymousClass9SF;
import p000X.AnonymousClass9ST;
import p000X.C06590Pq;
import p000X.C15330mi;
import p000X.C168617Hz;
import p000X.C22760yx;
import p000X.C26581Eb;
import p000X.C28605Cjj;
import p000X.C52362Om;

public class LeadAdsActivity extends IgFragmentActivity implements AnonymousClass9SF {
    public AnonymousClass0C1 A00;
    public SpinnerImageView A01;
    public String A02;
    public String A03;

    public final void BPa(AnonymousClass25R r5) {
        AnonymousClass1HD cjj;
        AnonymousClass9S2.A00(this.A00, this.A03, "form_load_success");
        this.A01.setLoadingStatus(C168617Hz.SUCCESS);
        Bundle extras = getIntent().getExtras();
        if (extras.getBoolean("submitted")) {
            cjj = new AnonymousClass9S6();
            extras.putBoolean(StateSummary.$const$string(11), true);
        } else if (r5.A00.A01 != null) {
            cjj = new AnonymousClass9SA();
        } else {
            cjj = new C28605Cjj();
        }
        C52362Om r1 = new C52362Om(this, this.A00);
        r1.A08(cjj, extras);
        r1.A08 = false;
        r1.A02();
    }

    public final void onFailure() {
        AnonymousClass9S2.A00(this.A00, this.A03, "form_load_error");
        this.A01.setLoadingStatus(C168617Hz.FAILED);
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void finish() {
        super.finish();
        C22760yx.A00(this.A00).A00.ADC(AnonymousClass9S2.A00, (long) this.A03.hashCode());
        AnonymousClass9ST A002 = AnonymousClass9ST.A00(this.A00);
        String str = this.A02;
        A002.A02.remove(str);
        A002.A00.remove(str);
        A002.A01.remove(str);
        AnonymousClass95B.A00 = null;
        overridePendingTransition(C0003R.anim.fade_in, C0003R.anim.bottom_out);
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(2038850393);
        super.onCreate(bundle);
        C26581Eb.A00(this, 1);
        Bundle extras = getIntent().getExtras();
        this.A00 = AnonymousClass0J1.A06(extras);
        C15330mi.A01(this);
        setContentView((int) C0003R.layout.lead_ads_activity);
        this.A01 = (SpinnerImageView) findViewById(C0003R.C0005id.lead_ads_loading_spinner);
        this.A03 = extras.getString("mediaID");
        this.A02 = extras.getString("formID");
        String string = extras.getString("trackingToken");
        this.A01.setLoadingStatus(C168617Hz.LOADING);
        AnonymousClass25N r1 = new AnonymousClass25N(this.A02, this.A00);
        r1.A01 = string;
        r1.A02 = false;
        r1.A00 = this;
        AnonymousClass25P.A00(new AnonymousClass25O(r1));
        this.A01.setOnClickListener(new AnonymousClass9SC(this, string));
        overridePendingTransition(C0003R.anim.bottom_in, C0003R.anim.fade_out);
        AnonymousClass0Z0.A07(1990127963, A002);
    }
}
