package p000X;

/* renamed from: X.CMD */
public final class CMD {
    public final /* synthetic */ C06270Ok A00;
    public final /* synthetic */ CML A01;
    public final /* synthetic */ AnonymousClass0RN A02;
    public final /* synthetic */ C25654BTn A03;
    public final /* synthetic */ AnonymousClass2TI A04;
    public final /* synthetic */ AnonymousClass0C1 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public CMD(C25654BTn bTn, AnonymousClass2TI r2, AnonymousClass0C1 r3, CML cml, AnonymousClass0RN r5, C06270Ok r6, String str, String str2) {
        this.A03 = bTn;
        this.A04 = r2;
        this.A05 = r3;
        this.A01 = cml;
        this.A02 = r5;
        this.A00 = r6;
        this.A07 = str;
        this.A06 = str2;
    }

    public final boolean A00() {
        if (this.A03.A01()) {
            return false;
        }
        C25654BTn bTn = this.A03;
        if (bTn.A01.size() != 1) {
            bTn.A01.pop();
        }
        AnonymousClass0C1 r2 = this.A05;
        AnonymousClass2TI r1 = this.A04;
        C25654BTn bTn2 = this.A03;
        String str = this.A07;
        String str2 = this.A06;
        String moduleName = this.A02.getModuleName();
        int[] iArr = AnonymousClass2TH.A0c;
        CML cml = (CML) bTn2.A01.peek();
        CMG A002 = CMF.A00(r2, this, cml, str, str2, moduleName);
        AnonymousClass2TH r5 = new AnonymousClass2TH(r2);
        CMF.A01(r5, this, A002, cml, bTn2, iArr);
        r1.A09(r5, A002, false);
        return true;
    }
}
