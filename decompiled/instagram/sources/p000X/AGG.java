package p000X;

/* renamed from: X.AGG */
public final class AGG implements Runnable {
    public final /* synthetic */ AGC A00;
    public final /* synthetic */ boolean A01;

    public AGG(AGC agc, boolean z) {
        this.A00 = agc;
        this.A01 = z;
    }

    public final void run() {
        synchronized (this.A00.A0B) {
            if (this.A01) {
                AGC agc = this.A00;
                if (!agc.A02) {
                    agc.A09.A01(Constants.A0Y, agc.A07);
                    agc.A02 = true;
                }
            } else {
                AGC agc2 = this.A00;
                if (agc2.A02) {
                    agc2.A09.A02(Constants.A0Y, agc2.A07);
                    agc2.A02 = false;
                }
            }
        }
    }
}
