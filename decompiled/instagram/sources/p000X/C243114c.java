package p000X;

/* renamed from: X.14c  reason: invalid class name and case insensitive filesystem */
public final class C243114c implements C243214d {
    public static final Class A05 = C243114c.class;
    public boolean A00;
    public final C243414f A01 = new C243414f();
    public final C243014b A02;
    public final AnonymousClass14W A03;
    public final AnonymousClass0OT A04;

    public final synchronized void Ad8() {
        if (!this.A00) {
            this.A00 = true;
            this.A04.ADc(new AnonymousClass16Q(this));
        }
    }

    public final void A00(AnonymousClass16T r6, String str, AnonymousClass15G r8) {
        r6.ABb("results", "operation_id = ? AND txn_id = ?", new String[]{Long.toString(this.A02.A01(r6, str, r8)), str});
    }

    public final void A8g(String str, AnonymousClass15G r4) {
        this.A01.A8g(str, r4);
        this.A04.ADc(new C108124lJ(this, str, r4));
    }

    public final C106364iO AOd(String str, AnonymousClass15G r3) {
        return this.A01.AOd(str, r3);
    }

    public final void Bce(String str, AnonymousClass15G r4, C106364iO r5) {
        this.A01.Bce(str, r4, r5);
        this.A04.ADc(new C108064lD(this, str, r4, r5));
    }

    public C243114c(AnonymousClass14W r2, AnonymousClass0OT r3, C243014b r4) {
        this.A03 = r2;
        this.A04 = r3;
        this.A02 = r4;
    }
}
