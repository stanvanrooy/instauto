package p000X;

/* renamed from: X.10d  reason: invalid class name and case insensitive filesystem */
public abstract class C233710d extends C233810e {
    public final AnonymousClass2GC A00;
    public transient C233910f A01;

    public void A02() {
        C233910f r2 = this.A01;
        if (!(r2 == null || r2 == this)) {
            AnonymousClass2GH r0 = AIs().get(AnonymousClass2GN.A00);
            if (r0 == null) {
                C13150hy.A00();
            }
            ((AnonymousClass2GN) r0).releaseInterceptedContinuation(r2);
        }
        this.A01 = C51602Lj.A00;
    }

    public AnonymousClass2GC AIs() {
        AnonymousClass2GC r0 = this.A00;
        if (r0 == null) {
            C13150hy.A00();
        }
        return r0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C233710d(C233910f r2) {
        this(r2, r2 != null ? r2.AIs() : null);
    }

    public C233710d(C233910f r1, AnonymousClass2GC r2) {
        super(r1);
        this.A00 = r2;
    }
}
