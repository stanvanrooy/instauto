package p000X;

import android.view.View;

/* renamed from: X.DTQ */
public final class DTQ implements View.OnClickListener {
    public final /* synthetic */ C2114199x A00;
    public final /* synthetic */ AnonymousClass3T9 A01;

    public DTQ(AnonymousClass3T9 r1, C2114199x r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-453208333);
        this.A00.A00(Constants.A14, Constants.ONE, AnonymousClass3T9.A00((AnonymousClass3TA) null));
        AnonymousClass3T9 r2 = this.A01;
        int i = DTW.A00[r2.A02.ordinal()];
        if (i == 1) {
            AnonymousClass3T9.A04(r2);
        } else if (i != 2) {
            AnonymousClass3T9.A0A(r2, AnonymousClass3TA.A04, new DTS(this));
        } else {
            AnonymousClass3T9.A0B(r2, (C13300iJ) null, false);
            AnonymousClass3T9.A0A(this.A01, AnonymousClass3TA.A04, new DTR(this));
        }
        AnonymousClass0Z0.A0C(1852594045, A05);
    }
}
