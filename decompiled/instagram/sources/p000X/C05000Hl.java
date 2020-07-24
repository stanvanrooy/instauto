package p000X;

/* renamed from: X.0Hl  reason: invalid class name and case insensitive filesystem */
public class C05000Hl extends C05580Ld {
    public final Object A00(C06590Pq r5) {
        return AnonymousClass0L6.A00(r5, this.A01, this.A04, this.A03, this.A00);
    }

    public final Object A01(AnonymousClass0C1 r5) {
        return AnonymousClass0L6.A02(r5, this.A01, this.A04, this.A03, this.A00);
    }

    public final void A02(AnonymousClass0C1 r5) {
        AnonymousClass0L7 r3 = this.A01;
        String str = this.A04;
        AnonymousClass04H r1 = this.A00;
        AnonymousClass0LQ r0 = AnonymousClass0LQ.A01;
        if (r0 == null) {
            C05560Lb.A03(r3, str);
            return;
        }
        C05040Hq A07 = r0.A07(r5);
        if (A07 != null) {
            C05560Lb.A02(r5, r3, str, r1, A07);
        }
    }

    public C05000Hl(String str, AnonymousClass0L7 r2, Object obj, String[] strArr, AnonymousClass04H r5) {
        super(str, r2, obj, strArr, r5);
    }
}
