package p000X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1gI  reason: invalid class name and case insensitive filesystem */
public final class C35391gI {
    public static AnonymousClass0OT A00;
    public static final BlockingQueue A01 = new LinkedBlockingQueue();
    public static final ThreadFactory A02 = new C35401gJ();

    public static AnonymousClass0OT A00() {
        if (A00 == null) {
            A00 = new AnonymousClass0M7(new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, A01, A02));
        }
        return A00;
    }
}
