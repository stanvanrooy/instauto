package p000X;

import android.os.Process;

/* renamed from: X.1xM  reason: invalid class name and case insensitive filesystem */
public final class C45141xM extends C12380ge {
    public final int A00;

    public final int AGu() {
        return 6;
    }

    public C45141xM(int i) {
        super(5000);
        this.A00 = i;
    }

    public final void A03() {
        if (C45271xZ.A01.get() != 0) {
            int decrementAndGet = C45271xZ.A01.decrementAndGet();
            if (decrementAndGet == 0) {
                int A002 = C45281xa.A00();
                boolean z = false;
                if (A002 >= 0) {
                    z = true;
                }
                if (z) {
                    Process.setThreadPriority(A002, C45271xZ.A02);
                    C45271xZ.A00.set(false);
                }
            } else if (decrementAndGet < 0) {
                C45271xZ.A01.compareAndSet(decrementAndGet, 0);
            }
        }
    }

    public final boolean A04() {
        int i = this.A00;
        int A002 = C45281xa.A00();
        boolean z = false;
        if (A002 >= 0) {
            z = true;
        }
        if (!z) {
            return true;
        }
        if (C45271xZ.A00.compareAndSet(false, true)) {
            C45271xZ.A02 = Process.getThreadPriority(A002);
        }
        Process.setThreadPriority(A002, i);
        C45271xZ.A01.incrementAndGet();
        return true;
    }
}
