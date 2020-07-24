package p000X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.CDK */
public final class CDK extends C17920r1 {
    public final /* synthetic */ CD1 A00;

    public CDK(CD1 cd1) {
        this.A00 = cd1;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-136891430);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0C(this.A00.A03, C27398CBr.REVIEW, "tax_payment_fetch", str);
        CD1 cd1 = this.A00;
        FragmentActivity activity = cd1.getActivity();
        AnonymousClass0a4.A06(activity);
        AnonymousClass1AM r0 = cd1.mFragmentManager;
        AnonymousClass0a4.A06(r0);
        r0.A10();
        AnonymousClass1HD A01 = C16310oO.A00.A02().A01(Constants.A08);
        C52362Om r1 = new C52362Om(activity, this.A00.A05);
        r1.A02 = A01;
        r1.A02();
        AnonymousClass0Z0.A0A(126971050, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(1323949714);
        super.onFinish();
        CD1.A04(this.A00, false);
        AnonymousClass0Z0.A0A(2092790656, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(-1466620452);
        super.onStart();
        CD1.A04(this.A00, true);
        AnonymousClass0Z0.A0A(-747356789, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-504209519);
        C27496CFm cFm = (C27496CFm) obj;
        int A032 = AnonymousClass0Z0.A03(1844031925);
        this.A00.A04.A0E(true);
        CD3 cd3 = this.A00.A03;
        cd3.A0N = cFm.A03;
        cd3.A0K = cFm.A02;
        cd3.A0G = cFm.A00;
        cd3.A0J = cFm.A01;
        CCZ.A09(cd3, C27398CBr.REVIEW, "tax_payment_fetch");
        CD1.A01(this.A00);
        CD1 cd1 = this.A00;
        CD1.A03(cd1, cd1.A03.A04());
        AnonymousClass0Z0.A0A(-199247991, A032);
        AnonymousClass0Z0.A0A(1879106603, A03);
    }
}
