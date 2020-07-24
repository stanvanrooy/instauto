package p000X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1gJ  reason: invalid class name and case insensitive filesystem */
public final class C35401gJ implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        return new AnonymousClass0O2(runnable, AnonymousClass000.A05("ImgDecoderExecutor #", this.A00.getAndIncrement()), 10);
    }
}
