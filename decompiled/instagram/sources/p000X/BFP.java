package p000X;

/* renamed from: X.BFP */
public abstract class BFP {
    public BFP A01(BFW bfw) {
        BFL bfl = (BFL) this;
        bfl.A03.A01(new BFT(C108544m2.A01, bfw));
        BFL.A00(bfl);
        return bfl;
    }

    public BFP A02(BFX bfx) {
        BFL bfl = (BFL) this;
        bfl.A03.A01(new BFR(C108544m2.A01, bfx));
        BFL.A00(bfl);
        return bfl;
    }

    public BFP A03(C25346BFi bFi) {
        BFL bfl = (BFL) this;
        bfl.A03.A01(new BFQ(C108544m2.A01, bFi));
        BFL.A00(bfl);
        return bfl;
    }

    public Exception A04() {
        Exception exc;
        BFL bfl = (BFL) this;
        synchronized (bfl.A04) {
            exc = bfl.A00;
        }
        return exc;
    }

    public Object A05() {
        Object obj;
        BFL bfl = (BFL) this;
        synchronized (bfl.A04) {
            if (bfl.A02) {
                Exception exc = bfl.A00;
                if (exc == null) {
                    obj = bfl.A01;
                } else {
                    throw new BFZ(exc);
                }
            } else {
                throw new IllegalStateException(String.valueOf("Task is not yet complete"));
            }
        }
        return obj;
    }

    public boolean A06() {
        boolean z;
        BFL bfl = (BFL) this;
        synchronized (bfl.A04) {
            z = false;
            if (bfl.A02 && bfl.A00 == null) {
                z = true;
            }
        }
        return z;
    }
}
