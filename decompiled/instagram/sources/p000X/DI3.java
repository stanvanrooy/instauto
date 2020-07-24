package p000X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DI3 */
public final class DI3 extends AnonymousClass1JN {
    public final AtomicBoolean A00 = new AtomicBoolean();
    public final C27701Iw A01;
    public final AnonymousClass1JT A02;
    public final AnonymousClass1JS A03;

    public final C27711Ix A01(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.A01.A01) {
            return DQm.INSTANCE;
        }
        return this.A03.A02(runnable, j, timeUnit, this.A01);
    }

    public final void dispose() {
        if (this.A00.compareAndSet(false, true)) {
            this.A01.dispose();
            AnonymousClass1JT r5 = this.A02;
            AnonymousClass1JS r4 = this.A03;
            r4.A00 = System.nanoTime() + r5.A00;
            r5.A02.offer(r4);
        }
    }

    public DI3(AnonymousClass1JT r3) {
        AnonymousClass1JS r1;
        this.A02 = r3;
        this.A01 = new C27701Iw();
        if (!r3.A01.A01) {
            while (true) {
                if (r3.A02.isEmpty()) {
                    r1 = new AnonymousClass1JS(r3.A05);
                    r3.A01.A2X(r1);
                    break;
                }
                r1 = (AnonymousClass1JS) r3.A02.poll();
                if (r1 != null) {
                    break;
                }
            }
        } else {
            r1 = AnonymousClass1JR.A06;
        }
        this.A03 = r1;
    }
}
