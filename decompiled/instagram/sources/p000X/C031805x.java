package p000X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: X.05x  reason: invalid class name and case insensitive filesystem */
public abstract class C031805x extends C10740dn {
    public final Handler A00;

    public C031805x(Handler handler) {
        this.A00 = handler;
    }

    public final Object get() {
        boolean z = false;
        if (Looper.myLooper() == this.A00.getLooper()) {
            z = true;
        }
        if (!z || isDone()) {
            return super.get();
        }
        throw new IllegalStateException("Must not call get() function from this Handler thread. Will deadlock!");
    }

    public final Object get(long j, TimeUnit timeUnit) {
        boolean z = false;
        if (Looper.myLooper() == this.A00.getLooper()) {
            z = true;
        }
        if (!z || isDone()) {
            return super.get(j, timeUnit);
        }
        throw new IllegalStateException("Must not call get() function from this Handler thread. Will deadlock!");
    }
}
