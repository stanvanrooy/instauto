package p000X;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.BFM */
public final class BFM {
    public Queue A00;
    public boolean A01;
    public final Object A02 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = (p000X.BFY) r2.A00.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r2.A01 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        r0.A2C(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r1 = r2.A02;
     */
    public final void A00(BFP bfp) {
        synchronized (this.A02) {
            try {
                if (this.A00 != null && !this.A01) {
                    this.A01 = true;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final void A01(BFY bfy) {
        synchronized (this.A02) {
            if (this.A00 == null) {
                this.A00 = new ArrayDeque();
            }
            this.A00.add(bfy);
        }
    }
}
