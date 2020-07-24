package p000X;

import android.os.Handler;

/* renamed from: X.ASP */
public final class ASP implements ARG {
    public int A00 = 0;
    public int A01 = 0;
    public Handler A02 = new Handler();
    public Runnable A03;

    public final void BqK() {
        this.A01 = 0;
        this.A00 = 0;
        Runnable runnable = this.A03;
        if (runnable != null) {
            AnonymousClass0ZA.A08(this.A02, runnable);
        }
    }

    public final void A6A() {
        if (this.A01 < 10) {
            AnonymousClass0ZA.A09(this.A02, this.A03, (long) this.A00, 694670510);
        }
    }

    public ASP(AQ8 aq8) {
        this.A03 = new ASQ(this, aq8);
    }
}
