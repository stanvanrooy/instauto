package p000X;

/* renamed from: X.1Sz  reason: invalid class name and case insensitive filesystem */
public final class C30221Sz extends AnonymousClass1T0 {
    public final C29951Rx A00;
    public final C27371Ho A01;
    public final AnonymousClass0C1 A02;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2, long j) {
        AnonymousClass1NJ r5 = (AnonymousClass1NJ) obj;
        C44521wI r11 = (C44521wI) obj2;
        C29951Rx r2 = this.A00;
        C27371Ho r4 = this.A01;
        int position = r11.A01.getPosition();
        AnonymousClass0C1 r22 = r2.A00;
        C37141jB A012 = C37591ju.A01(AnonymousClass000.A0E("carousel_", "time_spent"), r5, r4);
        A012.A0B(r22, r5);
        A012.A14 = position;
        A012.A1t = j;
        A012.A13 = 24;
        A012.A04();
        C36901in.A0I(this.A02, A012, r5, this.A01, r11.A00, true);
    }

    public C30221Sz(AnonymousClass0C1 r1, C29951Rx r2, C27371Ho r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r1;
    }
}
