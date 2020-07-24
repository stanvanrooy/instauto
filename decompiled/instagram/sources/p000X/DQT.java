package p000X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DQT */
public final class DQT extends AtomicInteger implements DRQ, C30126DRi {
    public final C29939DHp A00 = new C29939DHp();
    public final AtomicBoolean A01 = new AtomicBoolean();
    public final AtomicLong A02 = new AtomicLong();
    public final AtomicReference A03 = new AtomicReference();
    public final DR5 A04;
    public volatile boolean A05;

    public final void B2m(Throwable th) {
        this.A05 = true;
        DR5 dr5 = this.A04;
        C29939DHp dHp = this.A00;
        if (!dHp.A01(th)) {
            AnonymousClass1J9.A03(th);
        } else if (getAndIncrement() == 0) {
            dr5.B2m(dHp.A00());
        }
    }

    public final void onComplete() {
        this.A05 = true;
        DR5 dr5 = this.A04;
        C29939DHp dHp = this.A00;
        if (getAndIncrement() == 0) {
            Throwable A002 = dHp.A00();
            if (A002 != null) {
                dr5.B2m(A002);
            } else {
                dr5.onComplete();
            }
        }
    }

    public final void BD2(Object obj) {
        DR5 dr5 = this.A04;
        C29939DHp dHp = this.A00;
        if (get() == 0 && compareAndSet(0, 1)) {
            dr5.BD2(obj);
            if (decrementAndGet() != 0) {
                Throwable A002 = dHp.A00();
                if (A002 != null) {
                    dr5.B2m(A002);
                } else {
                    dr5.onComplete();
                }
            }
        }
    }

    public final void BPU(DRQ drq) {
        boolean z;
        if (this.A01.compareAndSet(false, true)) {
            this.A04.BPU(this);
            AtomicReference atomicReference = this.A03;
            AtomicLong atomicLong = this.A02;
            AnonymousClass1J6.A01(drq, "s is null");
            if (!atomicReference.compareAndSet((Object) null, drq)) {
                drq.cancel();
                if (atomicReference.get() != DQV.A01) {
                    AnonymousClass1J9.A03(new DRR("Subscription already set!"));
                }
                z = false;
            } else {
                z = true;
            }
            if (z) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    drq.BdE(andSet);
                    return;
                }
                return;
            }
            return;
        }
        drq.cancel();
        cancel();
        B2m(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public final void BdE(long j) {
        if (j <= 0) {
            cancel();
            B2m(new IllegalArgumentException(AnonymousClass000.A0B("§3.9 violated: positive request amount required but it was ", j)));
            return;
        }
        AtomicReference atomicReference = this.A03;
        AtomicLong atomicLong = this.A02;
        DRQ drq = (DRQ) atomicReference.get();
        if (drq != null) {
            drq.BdE(j);
        } else if (DQV.A00(j)) {
            DQS.A00(atomicLong, j);
            DRQ drq2 = (DRQ) atomicReference.get();
            if (drq2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    drq2.BdE(andSet);
                }
            }
        }
    }

    public final void cancel() {
        DRQ drq;
        if (!this.A05) {
            AtomicReference atomicReference = this.A03;
            DRQ drq2 = (DRQ) atomicReference.get();
            DQV dqv = DQV.A01;
            if (drq2 != dqv && (drq = (DRQ) atomicReference.getAndSet(dqv)) != dqv && drq != null) {
                drq.cancel();
            }
        }
    }

    public DQT(DR5 dr5) {
        this.A04 = dr5;
    }
}
