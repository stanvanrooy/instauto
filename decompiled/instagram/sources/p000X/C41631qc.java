package p000X;

/* renamed from: X.1qc  reason: invalid class name and case insensitive filesystem */
public final class C41631qc extends AnonymousClass1SZ {
    public final C701435a A00;
    public final C27371Ho A01;
    public final AnonymousClass358 A02;
    public final AnonymousClass0C1 A03;

    public C41631qc(C13740j9 r3, C701435a r4, AnonymousClass358 r5) {
        super(r3, new C702935p(r4.A02));
        this.A00 = r4;
        this.A01 = r4.A00;
        this.A03 = r4.A05;
        this.A02 = r5;
    }

    private void A00(C39941no r7, String str, AnonymousClass3FM r9) {
        C27371Ho r5 = this.A01;
        C701435a r4 = this.A00;
        C37141jB A012 = C36901in.A01(str, new AnonymousClass3GU(r5, r4.A01, r9.A00.A0A, this.A03), (C37121j9) null);
        A012.A04();
        A012.A14 = r9.A02.A09;
        A012.A4c = r4.A04.AaT();
        C37311jS.A08(A012, r7, r9, r4);
        C37311jS.A05(A012, r9.A00.A0A);
        AnonymousClass358 r2 = this.A02;
        C66352vL r0 = (C66352vL) r2.A02.get(r9.A00.A0C());
        if (r0 != null) {
            C37311jS.A0A(A012, r0);
        }
        AnonymousClass3GW.A00(A012, this.A00);
        C36901in.A03(AnonymousClass0WN.A01(this.A03), A012.A03(), Constants.ONE);
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        A00((C39941no) obj, AnonymousClass366.A00("instagram_netego_impression", this.A00.A09), (AnonymousClass3FM) obj2);
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        A00((C39941no) obj, AnonymousClass366.A00("instagram_netego_sub_impression", this.A00.A09), (AnonymousClass3FM) obj2);
    }
}
