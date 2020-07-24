package p000X;

import android.content.Context;

/* renamed from: X.CMH */
public final class CMH extends AnonymousClass1PF {
    public CML A00;
    public boolean A01 = false;
    public final CMA A02;
    public final C29081On A03 = new CMP(this);
    public final AnonymousClass1QU A04;

    public CMH(Context context, CMT cmt) {
        CMA cma = new CMA(cmt);
        this.A02 = cma;
        AnonymousClass1QU r2 = new AnonymousClass1QU(context);
        this.A04 = r2;
        A0I(cma, r2);
    }

    public static void A00(CMH cmh) {
        cmh.A0E();
        CML cml = cmh.A00;
        if (cml != null) {
            cmh.A0C(cml, true, cmh.A02);
            for (CML A0C : cmh.A00.A05) {
                cmh.A0C(A0C, false, cmh.A02);
            }
        }
        cmh.A0G(cmh.A03, cmh.A04);
        cmh.notifyDataSetChanged();
    }
}
