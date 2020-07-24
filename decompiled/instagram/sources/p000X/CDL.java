package p000X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.CDL */
public final class CDL extends C17920r1 {
    public final /* synthetic */ CDG A00;

    public CDL(CDG cdg) {
        this.A00 = cdg;
    }

    public final void onFail(C43791v5 r5) {
        int A03 = AnonymousClass0Z0.A03(-617216947);
        String str = "";
        CDG.A00(this.A00, str);
        Throwable th = r5.A01;
        if (th != null) {
            str = th.getMessage();
        }
        CCZ.A0B(this.A00.A01, C27398CBr.QUICK_PROMOTE_SAVE_SETTING, str);
        AnonymousClass0Z0.A0A(-1319263826, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(1877011358);
        super.onFinish();
        this.A00.A00.A03(false);
        AnonymousClass0Z0.A0A(1115318799, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(-1288727238);
        super.onStart();
        this.A00.A00.A03(true);
        AnonymousClass0Z0.A0A(1501238995, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(426288214);
        CG3 cg3 = (CG3) obj;
        int A032 = AnonymousClass0Z0.A03(-1055973783);
        if (cg3.A02) {
            CCZ.A05(this.A00.A01, C27398CBr.QUICK_PROMOTE_SAVE_SETTING);
            this.A00.requireActivity().setResult(1793);
            this.A00.requireActivity().finish();
            CDG cdg = this.A00;
            FragmentActivity activity = cdg.getActivity();
            AnonymousClass0a4.A06(activity);
            AnonymousClass6J3.A00(activity, cdg.A01.A0P, cdg.A04);
            Context context = this.A00.getContext();
            AnonymousClass0a4.A06(context);
            C14120jn.A00(context).A01(new Intent("IGBoostPostSubmitSuccessNotification"));
            CDG cdg2 = this.A00;
            C12810hQ.A02(C16160o8.A03(cdg2.A01.A0Z, cdg2.A04));
        } else {
            C27519CGj cGj = cg3.A00;
            AnonymousClass0a4.A07(cGj, "In submission failure cases, message should never be null");
            CDG.A00(this.A00, cGj.A00);
            CCZ.A0B(this.A00.A01, C27398CBr.QUICK_PROMOTE_SAVE_SETTING, cGj.A00);
        }
        AnonymousClass0Z0.A0A(-419885543, A032);
        AnonymousClass0Z0.A0A(-1749155731, A03);
    }
}
