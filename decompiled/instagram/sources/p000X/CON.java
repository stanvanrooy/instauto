package p000X;

import com.facebook.C0003R;

/* renamed from: X.CON */
public final class CON implements BY8 {
    public final /* synthetic */ C27722COq A00;

    public CON(C27722COq cOq) {
        this.A00 = cOq;
    }

    public final void B3q(Throwable th, C13300iJ r7, COS cos) {
        String message;
        C27723COr cOr = this.A00.A02;
        COS cos2 = COS.ADD;
        boolean z = false;
        if (cos != cos2) {
            z = true;
        }
        cOr.A0J(r7, z);
        int i = C0003R.string.remove_shopping_partner_error_msg;
        if (cos == cos2) {
            i = C0003R.string.add_shopping_partner_error_msg;
        }
        C51512Ky r1 = new C51512Ky();
        r1.A07 = Constants.A0C;
        r1.A09 = this.A00.getContext().getString(i);
        C11130eT.A01.BXT(new C33441cv(r1.A00()));
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
        COP cop = this.A00.A03;
        Integer num = cos.A00;
        String id = r6.getId();
        AnonymousClass0C1 r2 = cop.A01;
        C37141jB A03 = C37591ju.A03(COZ.A02(num), cop.A00);
        A03.A4B = id;
        COP.A00(r2, A03);
    }
}
