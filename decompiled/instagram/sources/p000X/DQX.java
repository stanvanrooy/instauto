package p000X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.DQX */
public final class DQX extends DR9 implements C30126DRi {
    public Throwable A00;
    public DRQ A01;
    public boolean A02;
    public final C30125DRh A03;
    public final AnonymousClass1KI A04;
    public final AtomicLong A05 = new AtomicLong();
    public final DR5 A06;
    public volatile boolean A07;
    public volatile boolean A08;

    public final int BdM(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.A02 = true;
        return 2;
    }

    public final void onComplete() {
        this.A08 = true;
        if (this.A02) {
            this.A06.onComplete();
        } else {
            A00();
        }
    }

    public final boolean A01(boolean z, boolean z2, DR5 dr5) {
        if (this.A07) {
            this.A04.clear();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.A00;
            if (th != null) {
                this.A04.clear();
                dr5.B2m(th);
                return true;
            } else if (!z2) {
                return false;
            } else {
                dr5.onComplete();
                return true;
            }
        }
    }

    public final void B2m(Throwable th) {
        this.A00 = th;
        this.A08 = true;
        if (this.A02) {
            this.A06.B2m(th);
        } else {
            A00();
        }
    }

    public final void BD2(Object obj) {
        if (!this.A04.offer(obj)) {
            this.A01.cancel();
            B2m(new DFK("Buffer is full"));
        } else if (this.A02) {
            this.A06.BD2((Object) null);
        } else {
            A00();
        }
    }

    public final void BPU(DRQ drq) {
        if (DQV.A01(this.A01, drq)) {
            this.A01 = drq;
            this.A06.BPU(this);
            drq.BdE(Long.MAX_VALUE);
        }
    }

    public final void BdE(long j) {
        if (!this.A02 && DQV.A00(j)) {
            DQS.A00(this.A05, j);
            A00();
        }
    }

    public final void cancel() {
        if (!this.A07) {
            this.A07 = true;
            this.A01.cancel();
            if (getAndIncrement() == 0) {
                this.A04.clear();
            }
        }
    }

    public final void clear() {
        this.A04.clear();
    }

    public final boolean isEmpty() {
        return this.A04.isEmpty();
    }

    public final Object poll() {
        return this.A04.poll();
    }

    public DQX(DR5 dr5, int i, boolean z, C30125DRh dRh) {
        AnonymousClass1KI di5;
        this.A06 = dr5;
        this.A03 = dRh;
        if (z) {
            di5 = new AnonymousClass1KQ(i);
        } else {
            di5 = new DI5(i);
        }
        this.A04 = di5;
    }

    public final void A00() {
        if (getAndIncrement() == 0) {
            AnonymousClass1KI r6 = this.A04;
            DR5 dr5 = this.A06;
            int i = 1;
            while (!A01(this.A08, r6.isEmpty(), dr5)) {
                long j = this.A05.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.A08;
                    Object poll = r6.poll();
                    boolean z2 = false;
                    if (poll == null) {
                        z2 = true;
                    }
                    if (!A01(z, z2, dr5)) {
                        if (z2) {
                            break;
                        }
                        dr5.BD2(poll);
                        j2++;
                    } else {
                        return;
                    }
                }
                if (j2 != j || !A01(this.A08, r6.isEmpty(), dr5)) {
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        this.A05.addAndGet(-j2);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
