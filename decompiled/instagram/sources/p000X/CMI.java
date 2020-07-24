package p000X;

/* renamed from: X.CMI */
public final class CMI implements AnonymousClass2RQ {
    public final /* synthetic */ CMG A00;

    public CMI(CMG cmg) {
        this.A00 = cmg;
    }

    public final void B9a() {
        CMH cmh = this.A00.A02;
        cmh.A01 = false;
        CMH.A00(cmh);
    }

    public final void B9f(CML cml) {
        CMG cmg = this.A00;
        CML cml2 = cmg.A01;
        boolean equals = cml2.A01.equals(cml.A01);
        AnonymousClass11J.A03(equals);
        if (equals) {
            cml2.A03 = cml.A03;
            cml2.A04 = cml.A04;
            cml2.A02 = cml.A02;
            cml2.A00 = cml.A00;
            cml2.A05 = cml.A05;
        }
        CMH cmh = cmg.A02;
        AnonymousClass11J.A00(cml2);
        cmh.A00 = cml2;
        CMH.A00(cmh);
    }
}
