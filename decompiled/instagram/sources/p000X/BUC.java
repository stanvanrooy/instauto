package p000X;

/* renamed from: X.BUC */
public final class BUC extends C14510kq {
    public final boolean A02(C14460kf r2, C14540kv r3, C14540kv r4) {
        synchronized (r2) {
            if (r2.listeners != r3) {
                return false;
            }
            r2.listeners = r4;
            return true;
        }
    }

    public final boolean A03(C14460kf r2, C14530ku r3, C14530ku r4) {
        synchronized (r2) {
            if (r2.waiters != r3) {
                return false;
            }
            r2.waiters = r4;
            return true;
        }
    }

    public final boolean A04(C14460kf r2, Object obj, Object obj2) {
        synchronized (r2) {
            if (r2.value != obj) {
                return false;
            }
            r2.value = obj2;
            return true;
        }
    }

    public final void A00(C14530ku r1, C14530ku r2) {
        r1.next = r2;
    }

    public final void A01(C14530ku r1, Thread thread) {
        r1.thread = thread;
    }
}
