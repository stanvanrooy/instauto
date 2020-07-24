package p000X;

import android.os.SystemClock;

/* renamed from: X.BOR */
public final class BOR implements C25584BQq {
    public final /* synthetic */ BQV A00;

    public BOR(BQV bqv) {
        this.A00 = bqv;
    }

    public final C25521BOf ADg() {
        return new BOQ(SystemClock.elapsedRealtime(), this.A00.A01(), new C25360BFy(this.A00.A00));
    }
}
