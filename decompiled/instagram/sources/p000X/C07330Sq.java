package p000X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Sq  reason: invalid class name and case insensitive filesystem */
public final class C07330Sq implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        return new C07350Ss(runnable, AnonymousClass000.A05("RtiExecutor #", this.A00.getAndIncrement()));
    }
}
