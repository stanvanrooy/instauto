package p000X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Kv  reason: invalid class name and case insensitive filesystem */
public final class C05510Kv extends AnonymousClass0OU {
    public static final AtomicInteger A00 = new AtomicInteger();

    public final AnonymousClass0OU A00() {
        C05510Kv r1 = new C05510Kv(this.A04);
        r1.start();
        return r1;
    }

    public final void run() {
        setPriority(10);
        setName(AnonymousClass000.A05("NormalWorker", A00.getAndIncrement()));
        while (!this.A01) {
            try {
                AnonymousClass0O9 r0 = (AnonymousClass0O9) this.A04.take();
                this.A00 = r0;
                if (r0 != null) {
                    try {
                        A01(r0);
                    } catch (Throwable th) {
                        AnonymousClass0QD.A0A("IG_EXECUTOR_TASK", th);
                    }
                }
            } catch (InterruptedException e) {
                AnonymousClass0QD.A0A("IG_EXECUTOR_TASK", e);
            }
            this.A00 = null;
        }
    }

    public C05510Kv(PriorityBlockingQueue priorityBlockingQueue) {
        super(priorityBlockingQueue);
    }
}
