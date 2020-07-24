package p000X;

/* renamed from: X.CME */
public final class CME implements AnonymousClass2MC {
    public final /* synthetic */ CML A00;
    public final /* synthetic */ CMD A01;

    public final void B0E() {
    }

    public CME(CMD cmd, CML cml) {
        this.A01 = cmd;
        this.A00 = cml;
    }

    public final void B0C() {
        CMD cmd = this.A01;
        AnonymousClass0C1 r2 = cmd.A05;
        CML cml = this.A00;
        boolean equals = cml.equals(cmd.A01);
        CMM.A00(r2).A00.put(cml.A01, cml);
        C23300zv.A00(r2).BXT(new CMU(cml.A01, equals));
        CMD cmd2 = this.A01;
        AnonymousClass0RN r5 = cmd2.A02;
        AnonymousClass0C1 r1 = cmd2.A05;
        String str = this.A00.A01;
        C06270Ok r3 = cmd2.A00;
        AnonymousClass0RU A012 = AnonymousClass0WN.A01(r1);
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("instagram_category_selection_select_click", r5);
        A002.A0G("category_id", str);
        if (r3 != null) {
            A002.A04(r3);
        }
        A012.BcG(A002);
    }
}
