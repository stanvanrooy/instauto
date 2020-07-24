package p000X;

/* renamed from: X.B57 */
public final class B57 {
    public final C60292jf A00 = new C60292jf();

    public final void A00(Exception exc) {
        C60292jf r2 = this.A00;
        AnonymousClass0a2.A03(exc, "Exception must not be null");
        synchronized (r2.A04) {
            if (!r2.A02) {
                r2.A02 = true;
                r2.A00 = exc;
                r2.A03.A00(r2);
            }
        }
    }

    public final void A01(Object obj) {
        this.A00.A0I(obj);
    }
}
