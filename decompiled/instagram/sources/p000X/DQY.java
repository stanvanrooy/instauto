package p000X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.DQY */
public final class DQY extends AtomicLong implements DRQ, C30126DRi {
    public DRQ A00;
    public boolean A01;
    public final C30123DRf A02;
    public final DR5 A03;

    public final void B2m(Throwable th) {
        if (this.A01) {
            AnonymousClass1J9.A03(th);
            return;
        }
        this.A01 = true;
        this.A03.B2m(th);
    }

    public final void BD2(Object obj) {
        if (this.A01) {
            return;
        }
        if (get() != 0) {
            this.A03.BD2(obj);
            DQS.A01(this, 1);
            return;
        }
        try {
            this.A02.accept(obj);
        } catch (Throwable th) {
            C29942DHs.A00(th);
            cancel();
            B2m(th);
        }
    }

    public final void BPU(DRQ drq) {
        if (DQV.A01(this.A00, drq)) {
            this.A00 = drq;
            this.A03.BPU(this);
            drq.BdE(Long.MAX_VALUE);
        }
    }

    public final void cancel() {
        this.A00.cancel();
    }

    public final void onComplete() {
        if (!this.A01) {
            this.A01 = true;
            this.A03.onComplete();
        }
    }

    public DQY(DR5 dr5, C30123DRf dRf) {
        this.A03 = dr5;
        this.A02 = dRf;
    }

    public final void BdE(long j) {
        if (DQV.A00(j)) {
            DQS.A00(this, j);
        }
    }
}
