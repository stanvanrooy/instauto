package p000X;

/* renamed from: X.1qh  reason: invalid class name and case insensitive filesystem */
public final class C41681qh extends AnonymousClass1SZ {
    public final C27371Ho A00;
    public final AnonymousClass0C1 A01;

    private void A00(C159326r4 r9, String str) {
        C37141jB A002;
        AnonymousClass1NJ A003 = r9.A01.A00();
        if (A003 != null && (A002 = C37591ju.A00(this.A01, str, (AnonymousClass1I6) null, A003, this.A00, Integer.valueOf(r9.A00 - 1))) != null) {
            A002.A3q = AnonymousClass0Q7.A03().A08();
            A002.A3r = C26441Dh.A00(this.A01).A05;
            boolean z = false;
            if (C26441Dh.A00(this.A01).A03 != null) {
                z = true;
            }
            A002.A2b = Boolean.valueOf(z);
            A002.A13 = 24;
            A002.A04();
            AnonymousClass0C1 r3 = this.A01;
            C27371Ho r2 = this.A00;
            int i = -1;
            if (A003.A1W()) {
                i = 0;
            }
            C36901in.A0H(r3, A002, A003, r2, i);
        }
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        A00((C159326r4) obj, "impression");
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        A00((C159326r4) obj, "sub_impression");
    }

    public C41681qh(C13740j9 r1, C27371Ho r2, AnonymousClass0C1 r3) {
        super(r1);
        this.A00 = r2;
        this.A01 = r3;
    }
}
