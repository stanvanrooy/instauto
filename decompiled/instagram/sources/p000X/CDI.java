package p000X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.CDI */
public final class CDI extends C17920r1 {
    public final /* synthetic */ CD0 A00;

    public CDI(CD0 cd0) {
        this.A00 = cd0;
    }

    public final void onFail(C43791v5 r5) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-806962653);
        CD0.A05(this.A00, (String) null);
        Throwable th = r5.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0B(this.A00.A08, C27398CBr.REVIEW, str);
        AnonymousClass0Z0.A0A(-1585707054, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(1973559550);
        super.onFinish();
        CD0.A06(this.A00, false);
        AnonymousClass0Z0.A0A(626933652, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        CD3 cd3;
        C27398CBr cBr;
        String str;
        int A03 = AnonymousClass0Z0.A03(1411303725);
        CG3 cg3 = (CG3) obj;
        int A032 = AnonymousClass0Z0.A03(355052427);
        if (cg3.A01 != null && C27500CFq.A00(this.A00.A0C).booleanValue()) {
            CGB cgb = cg3.A01;
            CD0.A05(this.A00, cgb.A02);
            cd3 = this.A00.A08;
            cBr = C27398CBr.REVIEW;
            str = cgb.A03;
        } else if (cg3.A02) {
            CCZ.A05(this.A00.A08, C27398CBr.REVIEW);
            CD0 cd0 = this.A00;
            AnonymousClass0a4.A06(cd0.getActivity());
            if (cd0.A08.A13) {
                AnonymousClass0C1 r3 = cd0.A0C;
                AnonymousClass0L7 r2 = AnonymousClass0L7.QUICK_PROMOTE;
                if (((Boolean) AnonymousClass0L6.A02(r3, r2, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    if (((Boolean) AnonymousClass0L6.A02(this.A00.A0C, r2, "show_bottom_sheet", false, (AnonymousClass04H) null)).booleanValue()) {
                        Context context = this.A00.getContext();
                        AnonymousClass0a4.A06(context);
                        C31201Wx.A01(context).A0F(new C27443CDl());
                    } else {
                        CD0 cd02 = this.A00;
                        cd02.A05.A02(cd02.A0U);
                    }
                    CD0 cd03 = this.A00;
                    AnonymousClass6J3.A00(cd03.getActivity(), cd03.A08.A0P, cd03.A0C);
                    C14120jn.A00(this.A00.getContext()).A01(new Intent("IGBoostPostSubmitSuccessNotification"));
                    CD0 cd04 = this.A00;
                    C12810hQ.A02(C16160o8.A03(cd04.A08.A0Z, cd04.A0C));
                    AnonymousClass0Z0.A0A(-2053123347, A032);
                    AnonymousClass0Z0.A0A(1139316361, A03);
                }
            }
            this.A00.requireActivity().setResult(1793);
            this.A00.requireActivity().finish();
            CD0 cd032 = this.A00;
            AnonymousClass6J3.A00(cd032.getActivity(), cd032.A08.A0P, cd032.A0C);
            C14120jn.A00(this.A00.getContext()).A01(new Intent("IGBoostPostSubmitSuccessNotification"));
            CD0 cd042 = this.A00;
            C12810hQ.A02(C16160o8.A03(cd042.A08.A0Z, cd042.A0C));
            AnonymousClass0Z0.A0A(-2053123347, A032);
            AnonymousClass0Z0.A0A(1139316361, A03);
        } else {
            C27519CGj cGj = cg3.A00;
            AnonymousClass0a4.A07(cGj, "In submission failure cases, message should never be null");
            CD0.A05(this.A00, cGj.A00);
            cd3 = this.A00.A08;
            cBr = C27398CBr.REVIEW;
            str = cGj.A00;
        }
        CCZ.A0B(cd3, cBr, str);
        AnonymousClass0Z0.A0A(-2053123347, A032);
        AnonymousClass0Z0.A0A(1139316361, A03);
    }
}
