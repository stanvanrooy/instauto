package p000X;

/* renamed from: X.1Sq  reason: invalid class name and case insensitive filesystem */
public final class C30131Sq extends C28241Ky {
    public final C29951Rx A00;
    public final C27371Ho A01;
    public final AnonymousClass0C1 A02;

    private void A00(String str, AnonymousClass1NJ r9, C44521wI r10) {
        AnonymousClass1NJ r3 = r9;
        C37141jB A04 = this.A00.A04(str, this.A01, r9, r10.A01.getPosition());
        if (A04 != null) {
            A04.A13 = 24;
            A04.A04();
            C36901in.A0I(this.A02, A04, r3, this.A01, r10.A00, true);
        }
    }

    public static AnonymousClass1L0 createKeyGenerator() {
        return new C30151Ss();
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2, long j) {
        A00("sub_viewed_impression", (AnonymousClass1NJ) obj, (C44521wI) obj2);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2, long j) {
        A00("viewed_impression", (AnonymousClass1NJ) obj, (C44521wI) obj2);
    }

    public C30131Sq(AnonymousClass0C1 r1, C29951Rx r2, C27371Ho r3, AnonymousClass1L0 r4, C13740j9 r5) {
        super(r4, r5);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r1;
    }
}
