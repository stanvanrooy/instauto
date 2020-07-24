package p000X;

/* renamed from: X.1we  reason: invalid class name and case insensitive filesystem */
public abstract class C44721we extends AnonymousClass1TG {
    public final C27371Ho A00;
    public final AnonymousClass0C1 A01;
    public final String A02;

    public abstract Integer A01();

    public abstract String A02();

    public abstract void A03(C37141jB r1, C58442fx r2, C162806x6 r3, AnonymousClass0C1 r4);

    public C44721we(AnonymousClass0C1 r3, String str, C27371Ho r5) {
        super(500);
        this.A01 = r3;
        this.A02 = str;
        this.A00 = r5;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj, Object obj2, long j) {
        C58442fx r8 = (C58442fx) obj;
        C162806x6 r9 = (C162806x6) obj2;
        C37141jB A03 = C37591ju.A03(A02(), this.A00);
        A03.A3B = r8.AI0();
        A03.A14 = r9.A00;
        A03.A1t = j;
        A03.A3l = this.A02;
        A03(A03, r8, r9, this.A01);
        C36901in.A0J(this.A01, A03, r8.APe(), this.A00, -1, false, A01());
    }
}
