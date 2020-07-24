package p000X;

/* renamed from: X.0qq  reason: invalid class name and case insensitive filesystem */
public final class C17810qq extends C17780qn {
    public final /* synthetic */ C16090o1 A00;
    public final /* synthetic */ C17780qn A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17810qq(C17780qn r1, int i, C16090o1 r3) {
        super(i);
        this.A01 = r1;
        this.A00 = r3;
    }

    public final void run() {
        C17780qn r2 = this.A01;
        r2.run();
        if (!r2.A0A()) {
            try {
                A09(this.A00.then(r2.A07()));
            } catch (Exception e) {
                if (!(e instanceof RuntimeException)) {
                    A08(e);
                    return;
                }
                throw ((RuntimeException) e);
            }
        } else {
            A08(r2.A06());
        }
    }

    public final String toString() {
        return AnonymousClass000.A0E("HttpEngine", this.A01.toString());
    }
}
