package p000X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.DI1 */
public final class DI1 extends AnonymousClass1JN {
    public final C27701Iw A00 = new C27701Iw();
    public final C29940DHq A01;
    public final C29940DHq A02;
    public final AnonymousClass1JL A03;
    public volatile boolean A04;

    public final C27711Ix A00(Runnable runnable) {
        if (this.A04) {
            return DQm.INSTANCE;
        }
        return this.A03.A02(runnable, 0, TimeUnit.MILLISECONDS, this.A02);
    }

    public final C27711Ix A01(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.A04) {
            return DQm.INSTANCE;
        }
        return this.A03.A02(runnable, j, timeUnit, this.A00);
    }

    public final void dispose() {
        if (!this.A04) {
            this.A04 = true;
            this.A01.dispose();
        }
    }

    public DI1(AnonymousClass1JL r3) {
        this.A03 = r3;
        C29940DHq dHq = new C29940DHq();
        this.A02 = dHq;
        C29940DHq dHq2 = new C29940DHq();
        this.A01 = dHq2;
        dHq2.A2X(dHq);
        this.A01.A2X(this.A00);
    }
}
