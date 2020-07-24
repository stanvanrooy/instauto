package p000X;

/* renamed from: X.1Sf  reason: invalid class name and case insensitive filesystem */
public final class C30021Sf extends AnonymousClass1SZ {
    public final C29951Rx A00;
    public final C27371Ho A01;
    public final AnonymousClass0C1 A02;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        AnonymousClass1NJ r4 = (AnonymousClass1NJ) obj;
        C44521wI r10 = (C44521wI) obj2;
        C37141jB A04 = this.A00.A04("impression", this.A01, r4, r10.A01.getPosition());
        if (A04 != null) {
            A04.A13 = 24;
            A04.A04();
            C36901in.A0I(this.A02, A04, r4, this.A01, r10.A00, true);
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        AnonymousClass1NJ r4 = (AnonymousClass1NJ) obj;
        C44521wI r10 = (C44521wI) obj2;
        C37141jB A04 = this.A00.A04("sub_impression", this.A01, r4, r10.A01.getPosition());
        if (A04 != null) {
            A04.A13 = 24;
            A04.A04();
            C36901in.A0I(this.A02, A04, r4, this.A01, r10.A00, true);
        }
    }

    public C30021Sf(AnonymousClass0C1 r2, C13740j9 r3, C29951Rx r4, C27371Ho r5) {
        super(r3, new C30031Sg(r2));
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r2;
    }

    public static AnonymousClass1L0 createKeyGenerator(AnonymousClass0C1 r1) {
        return new C30031Sg(r1);
    }
}
