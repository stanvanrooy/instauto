package p000X;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.DI2 */
public final class DI2 extends AnonymousClass1JN {
    public final C27701Iw A00 = new C27701Iw();
    public final ScheduledExecutorService A01;
    public volatile boolean A02;

    public final C27711Ix A01(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        if (this.A02) {
            return DQm.INSTANCE;
        }
        DI4 di4 = new DI4(AnonymousClass1J9.A02(runnable), this.A00);
        this.A00.A2X(di4);
        if (j <= 0) {
            try {
                future = AnonymousClass0Z9.A02(this.A01, di4, 71320867);
            } catch (RejectedExecutionException e) {
                dispose();
                AnonymousClass1J9.A03(e);
                return DQm.INSTANCE;
            }
        } else {
            future = this.A01.schedule(di4, j, timeUnit);
        }
        di4.A00(future);
        return di4;
    }

    public final void dispose() {
        if (!this.A02) {
            this.A02 = true;
            this.A00.dispose();
        }
    }

    public DI2(ScheduledExecutorService scheduledExecutorService) {
        this.A01 = scheduledExecutorService;
    }
}
