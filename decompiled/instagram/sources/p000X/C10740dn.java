package p000X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0dn  reason: invalid class name and case insensitive filesystem */
public abstract class C10740dn extends AnonymousClass0U1 implements Future {
    /* renamed from: A01 */
    public abstract Future A00();

    public boolean cancel(boolean z) {
        return A00().cancel(z);
    }

    public final boolean isCancelled() {
        return A00().isCancelled();
    }

    public final boolean isDone() {
        return A00().isDone();
    }

    public Object get() {
        return A00().get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return A00().get(j, timeUnit);
    }
}
