package p000X;

import android.os.Bundle;

/* renamed from: X.CJP */
public final class CJP extends AnonymousClass6S5 implements C27592CJl {
    public AnonymousClass2TI A00;
    public AnonymousClass0C1 A01;
    public C27572CIq A02;
    public C27591CJk A03;
    public C27582CJb A04;
    public String A05;

    public final String getModuleName() {
        return "hashtag_reporting_self_remediation_bottom_sheet";
    }

    public final void BIi() {
        this.A02.A06(this, (C13300iJ) null, "REPORT_THIS_HASHTAG");
    }

    public final void BIj() {
        this.A02.A05(this, (C13300iJ) null, "REPORT_THIS_HASHTAG");
        C27591CJk cJk = this.A03;
        if (cJk != null) {
            cJk.BIp();
        }
    }

    public final void A00(AnonymousClass2TI r1) {
        this.A00 = r1;
    }

    public final void A01(C27591CJk cJk) {
        this.A03 = cJk;
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0Z0.A02(301140423);
        super.onCreate(bundle);
        if (bundle != null) {
            AnonymousClass6NI.A04(getActivity());
            i = 733951245;
        } else {
            Bundle bundle2 = this.mArguments;
            AnonymousClass11J.A00(bundle2);
            AnonymousClass0C1 A06 = AnonymousClass0J1.A06(bundle2);
            this.A01 = A06;
            this.A02 = C27572CIq.A00(A06);
            this.A05 = bundle2.getString(AnonymousClass40t.$const$string(84));
            C27582CJb cJb = new C27582CJb(getContext(), this.A01, this);
            this.A04 = cJb;
            setListAdapter(cJb);
            C27582CJb cJb2 = this.A04;
            cJb2.clear();
            cJb2.addModel(C27583CJc.HASHTAG, cJb2.A00);
            cJb2.updateListView();
            this.A02.A04(this, (C13300iJ) null, this.A05);
            i = -548804976;
        }
        AnonymousClass0Z0.A09(i, A022);
    }
}
