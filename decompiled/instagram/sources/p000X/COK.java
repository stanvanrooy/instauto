package p000X;

import com.facebook.C0003R;

/* renamed from: X.COK */
public final class COK implements BY8 {
    public final /* synthetic */ COH A00;

    public COK(COH coh) {
        this.A00 = coh;
    }

    public final void B3q(Throwable th, C13300iJ r7, COS cos) {
        String message;
        COP cop = this.A00.A03;
        Integer num = cos.A00;
        String id = r7.getId();
        if (th == null) {
            message = null;
        } else {
            message = th.getMessage();
        }
        C37141jB A03 = C37591ju.A03(COZ.A01(num), cop.A00);
        A03.A4B = id;
        if (message != null) {
            A03.A3R = message;
        }
        COP.A00(cop.A01, A03);
    }

    public final void BPg(C13300iJ r6, COS cos) {
        if (cos == COS.REMOVE) {
            C51512Ky r2 = new C51512Ky();
            r2.A09 = this.A00.getResources().getString(C0003R.string.partner_account_removed_toast);
            r2.A08 = this.A00.getResources().getString(C0003R.string.action_undo);
            r2.A0B = true;
            r2.A00 = 3000;
            r2.A05 = new COU(this, r6);
            C11130eT.A01.BXT(new C33441cv(r2.A00()));
        } else {
            this.A00.A04.A00();
        }
        COP cop = this.A00.A03;
        Integer num = cos.A00;
        String id = r6.getId();
        AnonymousClass0C1 r22 = cop.A01;
        C37141jB A03 = C37591ju.A03(COZ.A02(num), cop.A00);
        A03.A4B = id;
        COP.A00(r22, A03);
    }
}
