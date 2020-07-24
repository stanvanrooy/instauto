package p000X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DQU */
public final class DQU extends AtomicInteger implements DRQ, C30126DRi {
    public DRQ A00;
    public Throwable A01;
    public final AtomicLong A02 = new AtomicLong();
    public final AtomicReference A03 = new AtomicReference();
    public final DR5 A04;
    public volatile boolean A05;
    public volatile boolean A06;

    public final void onComplete() {
        this.A05 = true;
        A00();
    }

    public final void B2m(Throwable th) {
        this.A01 = th;
        this.A05 = true;
        A00();
    }

    public final void BD2(Object obj) {
        this.A03.lazySet(obj);
        A00();
    }

    public final void BPU(DRQ drq) {
        if (DQV.A01(this.A00, drq)) {
            this.A00 = drq;
            this.A04.BPU(this);
            drq.BdE(Long.MAX_VALUE);
        }
    }

    public final void cancel() {
        if (!this.A06) {
            this.A06 = true;
            this.A00.cancel();
            if (getAndIncrement() == 0) {
                this.A03.lazySet((Object) null);
            }
        }
    }

    public DQU(DR5 dr5) {
        this.A04 = dr5;
    }

    public final void A00() {
        boolean z;
        boolean z2;
        boolean z3;
        if (getAndIncrement() == 0) {
            DR5 dr5 = this.A04;
            AtomicLong atomicLong = this.A02;
            AtomicReference atomicReference = this.A03;
            int i = 1;
            do {
                long j = 0;
                while (true) {
                    z = false;
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z4 = this.A05;
                    Object andSet = atomicReference.getAndSet((Object) null);
                    boolean z5 = false;
                    if (andSet == null) {
                        z5 = true;
                    }
                    if (this.A06) {
                        atomicReference.lazySet((Object) null);
                        z3 = true;
                    } else {
                        if (z4) {
                            Throwable th = this.A01;
                            if (th != null) {
                                atomicReference.lazySet((Object) null);
                                dr5.B2m(th);
                                z3 = true;
                            } else if (z5) {
                                dr5.onComplete();
                                z3 = true;
                            }
                        }
                        z3 = false;
                    }
                    if (!z3) {
                        if (z5) {
                            break;
                        }
                        dr5.BD2(andSet);
                        j++;
                    } else {
                        return;
                    }
                }
                if (j == atomicLong.get()) {
                    boolean z6 = this.A05;
                    if (atomicReference.get() == null) {
                        z = true;
                    }
                    if (this.A06) {
                        atomicReference.lazySet((Object) null);
                        z2 = true;
                    } else {
                        if (z6) {
                            Throwable th2 = this.A01;
                            if (th2 != null) {
                                atomicReference.lazySet((Object) null);
                                dr5.B2m(th2);
                                z2 = true;
                            } else if (z) {
                                dr5.onComplete();
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                    if (z2) {
                        return;
                    }
                }
                if (j != 0) {
                    DQS.A01(atomicLong, j);
                }
                i = addAndGet(-i);
            } while (i != 0);
        }
    }

    public final void BdE(long j) {
        if (DQV.A00(j)) {
            DQS.A00(this.A02, j);
            A00();
        }
    }
}
