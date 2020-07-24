package p000X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AX5 */
public final class AX5 implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, AnonymousClass000.A0E("gcm-task#", Integer.toString(this.A00.getAndIncrement())));
        thread.setPriority(4);
        return thread;
    }
}
