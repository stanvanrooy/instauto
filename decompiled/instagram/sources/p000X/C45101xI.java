package p000X;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1xI  reason: invalid class name and case insensitive filesystem */
public final class C45101xI implements Runnable {
    public int A00;
    public C12380ge A01;
    public AtomicBoolean A02 = new AtomicBoolean(false);
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public final void run() {
        C12410gh[] r5;
        int length;
        C12380ge r0 = this.A01;
        synchronized (r0.A07) {
            try {
                r5 = r0.A03;
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        if (r5 != null && (length = r5.length) > 0) {
            int i = 0;
            while (i < length) {
                C12410gh r6 = r5[i];
                if (!this.A02.get()) {
                    if (this.A05) {
                        if (!this.A04) {
                            r6.onPostRequestBoost(this.A01, this.A03, this.A00);
                        }
                    } else if (this.A04) {
                        r6.onPreReleaseBoost(this.A01, this.A00, this.A03);
                    } else {
                        r6.onPostReleaseBoost(this.A01, this.A00, this.A03);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
        Queue queue = C12380ge.A09;
        synchronized (queue) {
            try {
                queue.offer(this);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
