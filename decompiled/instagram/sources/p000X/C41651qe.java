package p000X;

/* renamed from: X.1qe  reason: invalid class name and case insensitive filesystem */
public abstract class C41651qe extends AnonymousClass1SZ {
    public String A00;
    public final C27371Ho A01;
    public final AnonymousClass0C1 A02;
    public final String A03;

    public abstract Integer A03();

    public abstract String A04();

    public abstract String A05();

    public abstract void A06(C37141jB r1, C58442fx r2, C162806x6 r3, AnonymousClass0C1 r4);

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        C58442fx r9 = (C58442fx) obj;
        C162806x6 r10 = (C162806x6) obj2;
        AnonymousClass1NJ APe = r9.APe();
        C37141jB A032 = C37591ju.A03(A04(), this.A01);
        String str = this.A03;
        if (str != null) {
            A032.A3l = str;
        }
        A032.A14 = r10.A00;
        A032.A3q = AnonymousClass0Q7.A03().A08();
        A032.A3r = C26441Dh.A00(this.A02).A05;
        boolean z = false;
        if (C26441Dh.A00(this.A02).A03 != null) {
            z = true;
        }
        A032.A2b = Boolean.valueOf(z);
        A032.A3B = r9.AI0();
        A032.A3g = this.A00;
        A06(A032, r9, r10, this.A02);
        C36901in.A0J(this.A02, A032, APe, this.A01, -1, false, A03());
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        C58442fx r8 = (C58442fx) obj;
        C162806x6 r9 = (C162806x6) obj2;
        AnonymousClass1NJ APe = r8.APe();
        C37141jB A032 = C37591ju.A03(A05(), this.A01);
        String str = this.A03;
        if (str != null) {
            A032.A3l = str;
        }
        A032.A14 = r9.A00;
        A032.A3B = r8.AI0();
        A06(A032, r8, r9, this.A02);
        C36901in.A0J(this.A02, A032, APe, this.A01, -1, false, A03());
    }

    public C41651qe(AnonymousClass0C1 r1, C13740j9 r2, C27371Ho r3, String str) {
        super(r2);
        this.A02 = r1;
        this.A01 = r3;
        this.A03 = str;
    }
}
