package p000X;

/* renamed from: X.1Sn  reason: invalid class name and case insensitive filesystem */
public final class C30101Sn extends C28241Ky {
    public final C29951Rx A00;
    public final C27371Ho A01;
    public final AnonymousClass0C1 A02;

    private void A00(String str, AnonymousClass1NJ r6, C36841ih r7) {
        C37141jB A05 = this.A00.A05(str, this.A01, r6, r7.getPosition());
        if (A05 != null) {
            A05.A13 = 24;
            A05.A04();
            C36901in.A0H(this.A02, A05, r6, this.A01, r7.AHt());
        }
    }

    public static AnonymousClass1L0 createKeyGenerator() {
        return new C30121Sp();
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2, long j) {
        A00("sub_viewed_impression", (AnonymousClass1NJ) obj, (C36841ih) obj2);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2, long j) {
        A00("viewed_impression", (AnonymousClass1NJ) obj, (C36841ih) obj2);
    }

    public C30101Sn(AnonymousClass0C1 r1, C29951Rx r2, C27371Ho r3, AnonymousClass1L0 r4, C13740j9 r5) {
        super(r4, r5);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r1;
    }
}
