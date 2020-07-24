package p000X;

/* renamed from: X.BFG */
public final class BFG {
    public final BFL A00 = new BFL();

    public final void A00(Exception exc) {
        BFL bfl = this.A00;
        if (exc != null) {
            synchronized (bfl.A04) {
                if (!bfl.A02) {
                    bfl.A02 = true;
                    bfl.A00 = exc;
                    bfl.A03.A00(bfl);
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("Exception must not be null");
    }

    public final void A01(Object obj) {
        BFL bfl = this.A00;
        synchronized (bfl.A04) {
            if (!bfl.A02) {
                bfl.A02 = true;
                bfl.A01 = obj;
                bfl.A03.A00(bfl);
            }
        }
    }
}
