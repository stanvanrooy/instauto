package p000X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1Jg  reason: invalid class name and case insensitive filesystem */
public final class C27801Jg extends C27811Jh {
    public static final C27851Jl[] A02 = new C27851Jl[0];
    public static final C27851Jl[] A03 = new C27851Jl[0];
    public Throwable A00;
    public final AtomicReference A01 = new AtomicReference(A02);

    public final void A03(C27841Jk r7) {
        boolean z;
        C27851Jl r5 = new C27851Jl(r7, this);
        r7.BPT(r5);
        while (true) {
            C27851Jl[] r4 = (C27851Jl[]) this.A01.get();
            if (r4 != A03) {
                int length = r4.length;
                C27851Jl[] r1 = new C27851Jl[(length + 1)];
                System.arraycopy(r4, 0, r1, 0, length);
                r1[length] = r5;
                if (this.A01.compareAndSet(r4, r1)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            Throwable th = this.A00;
            if (th != null) {
                r7.B2m(th);
            } else {
                r7.onComplete();
            }
        } else if (r5.get()) {
            A04(r5);
        }
    }

    public final void A04(C27851Jl r8) {
        C27851Jl[] r6;
        C27851Jl[] r5;
        do {
            r6 = (C27851Jl[]) this.A01.get();
            if (r6 != A03 && r6 != (r5 = A02)) {
                int length = r6.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (r6[i2] == r8) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length != 1) {
                    r5 = new C27851Jl[(length - 1)];
                    System.arraycopy(r6, 0, r5, 0, i);
                    System.arraycopy(r6, i + 1, r5, i, (length - i) - 1);
                }
            } else {
                return;
            }
        } while (!this.A01.compareAndSet(r6, r5));
    }

    public final void B2m(Throwable th) {
        AnonymousClass1J6.A01(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.A01.get();
        Object obj2 = A03;
        if (obj == obj2) {
            AnonymousClass1J9.A03(th);
            return;
        }
        this.A00 = th;
        for (C27851Jl r1 : (C27851Jl[]) this.A01.getAndSet(obj2)) {
            if (r1.get()) {
                AnonymousClass1J9.A03(th);
            } else {
                r1.A01.B2m(th);
            }
        }
    }

    public final void BD2(Object obj) {
        AnonymousClass1J6.A01(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C27851Jl r1 : (C27851Jl[]) this.A01.get()) {
            if (!r1.get()) {
                r1.A01.BD2(obj);
            }
        }
    }

    public final void BPT(C27711Ix r3) {
        if (this.A01.get() == A03) {
            r3.dispose();
        }
    }

    public final void onComplete() {
        Object obj = this.A01.get();
        Object obj2 = A03;
        if (obj != obj2) {
            for (C27851Jl r1 : (C27851Jl[]) this.A01.getAndSet(obj2)) {
                if (!r1.get()) {
                    r1.A01.onComplete();
                }
            }
        }
    }
}
