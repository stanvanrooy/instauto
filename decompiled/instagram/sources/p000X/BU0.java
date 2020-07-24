package p000X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.BU0 */
public final class BU0 extends BTz implements Runnable {
    public static final BU0 A00;
    public static final long A01;
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2 == 3) goto L_0x000a;
     */
    private final synchronized void A00() {
        boolean z;
        int i = debugStatus;
        if (i != 2) {
            z = false;
        }
        z = true;
        if (z) {
            debugStatus = 3;
            this._queue = null;
            this._delayed = null;
            notifyAll();
        }
    }

    static {
        Long l;
        BU0 bu0 = new BU0();
        A00 = bu0;
        bu0.A04(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        A01 = timeUnit.toNanos(l.longValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0060, code lost:
        if (r4 == 3) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r2 == 3) goto L_0x0011;
     */
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        BU5.A00.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2) {
                    z = false;
                }
                z = true;
                if (z) {
                    z2 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z2 = true;
                }
            }
            if (z2) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long A09 = A09();
                    if (A09 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = A01 + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            break;
                        } else if (A09 > j2) {
                            A09 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (A09 > 0) {
                        int i2 = debugStatus;
                        if (i2 != 2) {
                            z3 = false;
                        }
                        z3 = true;
                        if (z3) {
                            break;
                        }
                        LockSupport.parkNanos(this, A09);
                    }
                }
            }
            _thread = null;
            A00();
            if (!A0C()) {
                A08();
            }
        } catch (Throwable th) {
            _thread = null;
            A00();
            if (!A0C()) {
                A08();
            }
            throw th;
        }
    }
}
