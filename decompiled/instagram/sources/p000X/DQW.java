package p000X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.DQW */
public final class DQW extends AtomicLong implements DRQ, C30126DRi {
    public DRQ A00;
    public boolean A01;
    public final DR5 A02;

    public final void B2m(Throwable th) {
        if (this.A01) {
            AnonymousClass1J9.A03(th);
            return;
        }
        this.A01 = true;
        this.A02.B2m(th);
    }

    public final void BD2(Object obj) {
        if (this.A01) {
            return;
        }
        if (get() != 0) {
            this.A02.BD2(obj);
            DQS.A01(this, 1);
            return;
        }
        B2m(new DFK("could not emit value due to lack of requests"));
    }

    public final void BPU(DRQ drq) {
        if (DQV.A01(this.A00, drq)) {
            this.A00 = drq;
            this.A02.BPU(this);
            drq.BdE(Long.MAX_VALUE);
        }
    }

    public final void cancel() {
        this.A00.cancel();
    }

    public final void onComplete() {
        if (!this.A01) {
            this.A01 = true;
            this.A02.onComplete();
        }
    }

    public DQW(DR5 dr5) {
        this.A02 = dr5;
    }

    public final void BdE(long j) {
        if (DQV.A00(j)) {
            DQS.A00(this, j);
        }
    }
}
