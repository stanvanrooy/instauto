package p000X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.CDJ */
public final class CDJ extends C17920r1 {
    public final /* synthetic */ CD0 A00;

    public CDJ(CD0 cd0) {
        this.A00 = cd0;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-567234718);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0C(this.A00.A08, C27398CBr.REVIEW, "tax_payment_fetch", str);
        CD0 cd0 = this.A00;
        FragmentActivity activity = cd0.getActivity();
        AnonymousClass0a4.A06(activity);
        AnonymousClass1AM r0 = cd0.mFragmentManager;
        AnonymousClass0a4.A06(r0);
        r0.A10();
        AnonymousClass1HD A01 = C16310oO.A00.A02().A01(Constants.A08);
        C52362Om r1 = new C52362Om(activity, this.A00.A0C);
        r1.A02 = A01;
        r1.A02();
        AnonymousClass0Z0.A0A(-2071737723, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        int A03 = AnonymousClass0Z0.A03(633071328);
        C27496CFm cFm = (C27496CFm) obj;
        int A032 = AnonymousClass0Z0.A03(-1231074948);
        CGB cgb = cFm.A00;
        if (cgb != null) {
            switch (cgb.A01.intValue()) {
                case C120125Dh.VIEW_TYPE_BRANDING:
                case C120125Dh.NUM_VIEW_TYPES:
                case 23:
                case 24:
                case 25:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (!z) {
                if (C27500CFq.A00(this.A00.A0C).booleanValue()) {
                    CCZ.A0C(this.A00.A08, C27398CBr.REVIEW, "tax_payment_fetch", cgb.A03);
                    AnonymousClass1AM r0 = this.A00.mFragmentManager;
                    AnonymousClass0a4.A06(r0);
                    r0.A10();
                    AnonymousClass1HD A02 = C16310oO.A00.A02().A02(Constants.A0J);
                    CD0 cd0 = this.A00;
                    C52362Om r2 = new C52362Om(cd0.getActivity(), cd0.A0C);
                    r2.A02 = A02;
                    r2.A02();
                }
                AnonymousClass0Z0.A0A(1377138001, A032);
                AnonymousClass0Z0.A0A(396482826, A03);
            }
        }
        CCZ.A09(this.A00.A08, C27398CBr.REVIEW, "tax_payment_fetch");
        this.A00.A09.A0E(true);
        CD0 cd02 = this.A00;
        CD3 cd3 = cd02.A08;
        cd3.A0N = cFm.A03;
        cd3.A0K = cFm.A02;
        cd3.A0G = cgb;
        cd3.A0J = cFm.A01;
        CD0.A07(cd02, false);
        this.A00.A0B.A02();
        CD0.A02(this.A00);
        CD0.A03(this.A00);
        CD0.A04(this.A00);
        AnonymousClass0Z0.A0A(1377138001, A032);
        AnonymousClass0Z0.A0A(396482826, A03);
    }
}
