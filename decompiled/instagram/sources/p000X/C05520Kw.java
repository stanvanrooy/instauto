package p000X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Kw  reason: invalid class name and case insensitive filesystem */
public final class C05520Kw extends AnonymousClass0OU {
    public static final AtomicInteger A00 = new AtomicInteger();

    public final AnonymousClass0OU A00() {
        C05520Kw r1 = new C05520Kw(this.A04);
        r1.start();
        return r1;
    }

    public final void run() {
        setPriority(10);
        setName(AnonymousClass000.A05("SensWorker", A00.getAndIncrement()));
        while (!this.A01) {
            try {
                this.A00 = (AnonymousClass0O9) this.A04.take();
                while (!AnonymousClass0OK.A00().A01()) {
                    try {
                        synchronized (this.A03) {
                            this.A03.wait(1);
                        }
                    } catch (InterruptedException unused) {
                        this.A04.add(this.A00);
                    }
                }
                AnonymousClass0O9 r0 = this.A00;
                if (r0 != null) {
                    try {
                        A01(r0);
                    } catch (Throwable th) {
                        AnonymousClass0QD.A09("IG_EXECUTOR_TASK", th);
                    }
                    this.A00 = null;
                }
            } catch (InterruptedException e) {
                AnonymousClass0QD.A09("IG_EXECUTOR_INTERRUPTED", e);
            }
        }
    }

    public C05520Kw(PriorityBlockingQueue priorityBlockingQueue) {
        super(priorityBlockingQueue);
    }
}
