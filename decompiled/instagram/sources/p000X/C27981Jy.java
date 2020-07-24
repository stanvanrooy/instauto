package p000X;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1Jy  reason: invalid class name and case insensitive filesystem */
public final class C27981Jy extends C27811Jh {
    public static final AnonymousClass2E6[] A07 = new AnonymousClass2E6[0];
    public static final AnonymousClass2E6[] A08 = new AnonymousClass2E6[0];
    public static final Object[] A09 = new Object[0];
    public long A00;
    public final AtomicReference A01 = new AtomicReference();
    public final ReadWriteLock A02;
    public final AtomicReference A03 = new AtomicReference(A07);
    public final AtomicReference A04 = new AtomicReference();
    public final Lock A05;
    public final Lock A06 = this.A02.writeLock();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r3.test(r2) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r3.A07 != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        if (r1 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        r3.A03 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        r3.A02 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0063, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        r1.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    public final void A03(C27841Jk r7) {
        boolean z;
        AnonymousClass2E6 r3 = new AnonymousClass2E6(r7, this);
        r7.BPT(r3);
        while (true) {
            AnonymousClass2E6[] r5 = (AnonymousClass2E6[]) this.A03.get();
            if (r5 != A08) {
                int length = r5.length;
                AnonymousClass2E6[] r1 = new AnonymousClass2E6[(length + 1)];
                System.arraycopy(r5, 0, r1, 0, length);
                r1[length] = r3;
                if (this.A03.compareAndSet(r5, r1)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            Throwable th = (Throwable) this.A01.get();
            if (th == C29938DHo.A00) {
                r7.onComplete();
                return;
            } else {
                r7.B2m(th);
                return;
            }
        } else if (r3.A07) {
            A04(r3);
            return;
        } else if (!r3.A07) {
            synchronized (r3) {
                try {
                    if (!r3.A07 && !r3.A04) {
                        C27981Jy r2 = r3.A06;
                        Lock lock = r2.A05;
                        lock.lock();
                        r3.A01 = r2.A00;
                        Object obj = r2.A04.get();
                        lock.unlock();
                        boolean z2 = false;
                        if (obj != null) {
                            z2 = true;
                        }
                        r3.A03 = z2;
                        r3.A04 = true;
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                    }
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public final void A04(AnonymousClass2E6 r8) {
        AnonymousClass2E6[] r6;
        AnonymousClass2E6[] r1;
        do {
            r6 = (AnonymousClass2E6[]) this.A03.get();
            int length = r6.length;
            if (length != 0) {
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
                if (length == 1) {
                    r1 = A07;
                } else {
                    r1 = new AnonymousClass2E6[(length - 1)];
                    System.arraycopy(r6, 0, r1, 0, i);
                    System.arraycopy(r6, i + 1, r1, i, (length - i) - 1);
                }
            } else {
                return;
            }
        } while (!this.A03.compareAndSet(r6, r1));
    }

    public final AnonymousClass2E6[] A05(Object obj) {
        AtomicReference atomicReference = this.A03;
        AnonymousClass2E6[] r0 = A08;
        AnonymousClass2E6[] r4 = (AnonymousClass2E6[]) atomicReference.getAndSet(r0);
        if (r4 != r0) {
            this.A06.lock();
            this.A00++;
            this.A04.lazySet(obj);
            this.A06.unlock();
        }
        return r4;
    }

    public final void B2m(Throwable th) {
        AnonymousClass1J6.A01(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.A01.compareAndSet((Object) null, th)) {
            AnonymousClass1J9.A03(th);
            return;
        }
        C24010AgS agS = new C24010AgS(th);
        for (AnonymousClass2E6 A002 : A05(agS)) {
            A002.A00(agS, this.A00);
        }
    }

    public final void BD2(Object obj) {
        AnonymousClass1J6.A01(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.A01.get() == null) {
            this.A06.lock();
            this.A00++;
            this.A04.lazySet(obj);
            this.A06.unlock();
            for (AnonymousClass2E6 A002 : (AnonymousClass2E6[]) this.A03.get()) {
                A002.A00(obj, this.A00);
            }
        }
    }

    public final void BPT(C27711Ix r2) {
        if (this.A01.get() != null) {
            r2.dispose();
        }
    }

    public final void onComplete() {
        if (this.A01.compareAndSet((Object) null, C29938DHo.A00)) {
            C30104DQj dQj = C30104DQj.A01;
            for (AnonymousClass2E6 A002 : A05(dQj)) {
                A002.A00(dQj, this.A00);
            }
        }
    }

    public C27981Jy() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A02 = reentrantReadWriteLock;
        this.A05 = reentrantReadWriteLock.readLock();
    }
}
