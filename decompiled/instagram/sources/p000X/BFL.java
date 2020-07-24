package p000X;

/* renamed from: X.BFL */
public final class BFL extends BFP {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public final BFM A03 = new BFM();
    public final Object A04 = new Object();

    public static final void A00(BFL bfl) {
        synchronized (bfl.A04) {
            if (bfl.A02) {
                bfl.A03.A00(bfl);
            }
        }
    }

    public final void A07(Exception exc) {
        if (exc != null) {
            synchronized (this.A04) {
                if (!this.A02) {
                    this.A02 = true;
                    this.A00 = exc;
                } else {
                    throw new IllegalStateException(String.valueOf("Task is already complete"));
                }
            }
            this.A03.A00(this);
            return;
        }
        throw new NullPointerException("Exception must not be null");
    }

    public final void A08(Object obj) {
        synchronized (this.A04) {
            if (!this.A02) {
                this.A02 = true;
                this.A01 = obj;
            } else {
                throw new IllegalStateException(String.valueOf("Task is already complete"));
            }
        }
        this.A03.A00(this);
    }
}
