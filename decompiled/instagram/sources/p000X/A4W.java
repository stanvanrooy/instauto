package p000X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.A4W */
public final class A4W implements Future {
    public Exception A00;
    public Object A01;
    public final CountDownLatch A02 = new CountDownLatch(1);

    public final boolean isCancelled() {
        return false;
    }

    public final boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    public final boolean isDone() {
        if (this.A02.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final Object get() {
        this.A02.await();
        Exception exc = this.A00;
        if (exc == null) {
            return this.A01;
        }
        throw new ExecutionException(exc);
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (this.A02.await(j, timeUnit)) {
            Exception exc = this.A00;
            if (exc == null) {
                return this.A01;
            }
            throw new ExecutionException(exc);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
