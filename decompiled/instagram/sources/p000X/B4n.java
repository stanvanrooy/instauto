package p000X;

/* renamed from: X.B4n */
public final class B4n implements Runnable {
    public final /* synthetic */ C60302jg A00;
    public final /* synthetic */ B4o A01;

    public B4n(B4o b4o, C60302jg r2) {
        this.A01 = b4o;
        this.A00 = r2;
    }

    public final void run() {
        C60292jf r0;
        Exception exc;
        if (this.A00.A0D()) {
            this.A01.A01.A0G();
            return;
        }
        try {
            this.A01.A01.A0I(this.A01.A00.BrJ(this.A00));
        } catch (C25173B4t e) {
            if (e.getCause() instanceof Exception) {
                r0 = this.A01.A01;
                exc = (Exception) e.getCause();
            } else {
                r0 = this.A01.A01;
                exc = e;
            }
            r0.A0H(exc);
        } catch (Exception e2) {
            this.A01.A01.A0H(e2);
        }
    }
}
