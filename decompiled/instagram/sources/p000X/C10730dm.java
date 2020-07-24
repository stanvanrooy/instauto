package p000X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.0dm  reason: invalid class name and case insensitive filesystem */
public final class C10730dm extends FutureTask implements AnonymousClass0U3 {
    public final AnonymousClass0U0 A00 = new AnonymousClass0U0();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r2.A01.isEmpty() != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r2.A01.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return;
     */
    public final void done() {
        AnonymousClass0U0 r2 = this.A00;
        synchronized (r2.A01) {
            if (!r2.A00) {
                r2.A00 = true;
            }
        }
    }

    public C10730dm(Runnable runnable, Object obj) {
        super(runnable, obj);
    }

    public C10730dm(Callable callable) {
        super(callable);
    }
}
