package p000X;

import android.view.View;

/* renamed from: X.CMC */
public final class CMC implements View.OnClickListener {
    public final /* synthetic */ CML A00;
    public final /* synthetic */ CMT A01;
    public final /* synthetic */ CMB A02;

    public CMC(CMB cmb, CMT cmt, CML cml) {
        this.A02 = cmb;
        this.A01 = cmt;
        this.A00 = cml;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-340661121);
        CMT cmt = this.A01;
        CML cml = this.A00;
        CMD cmd = cmt.A00.A03;
        if (cmd != null) {
            boolean z = false;
            if (cml.A00.intValue() == 0) {
                z = true;
            }
            if (z || cml.equals((CML) cmd.A03.A01.peek())) {
                cmd.A04.A0A(new CME(cmd, cml));
            } else {
                C25654BTn bTn = cmd.A03;
                CML cml2 = (CML) bTn.A01.peek();
                for (CML equals : cml2.A05) {
                    if (equals.equals(cml)) {
                        bTn.A01.push(cml);
                        AnonymousClass0C1 r2 = cmd.A05;
                        AnonymousClass2TI r1 = cmd.A04;
                        C25654BTn bTn2 = cmd.A03;
                        String str = cmd.A07;
                        String str2 = cmd.A06;
                        String moduleName = cmd.A02.getModuleName();
                        int[] iArr = AnonymousClass2TH.A0d;
                        CML cml3 = (CML) bTn2.A01.peek();
                        CMG A002 = CMF.A00(r2, cmd, cml3, str, str2, moduleName);
                        AnonymousClass2TH r7 = new AnonymousClass2TH(r2);
                        CMF.A01(r7, cmd, A002, cml3, bTn2, iArr);
                        r1.A09(r7, A002, false);
                    }
                }
                throw new IllegalStateException(AnonymousClass000.A0O("Results are in, and Category (", cml2.A01, ") is not the parent of Category (", cml.A01, ")!"));
            }
        }
        AnonymousClass0Z0.A0C(-240983777, A05);
    }
}
