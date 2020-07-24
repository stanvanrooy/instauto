package p000X;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.B7J */
public final class B7J {
    public AnonymousClass0JY A00;
    public Set A01;
    public ScheduledExecutorService A02;
    public AnonymousClass0IT A03;
    public AnonymousClass0IT A04;
    public AnonymousClass0IT A05;

    public final void A00(int i, Object obj) {
        if (this.A00 == null) {
            this.A00 = (AnonymousClass0JY) this.A04.get();
        }
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.MEMORY_MANAGER_LIB, "metrics_enabled", false)).booleanValue()) {
            if (this.A02 == null) {
                this.A02 = (ScheduledExecutorService) this.A05.get();
            }
            this.A02.schedule(new B7K(this, i, obj), 0, TimeUnit.SECONDS);
        }
    }

    public B7J(B7L b7l) {
        AnonymousClass0IT r0 = b7l.A01;
        AnonymousClass0FY.A00(r0);
        this.A04 = r0;
        AnonymousClass0IT r02 = b7l.A00;
        AnonymousClass0FY.A00(r02);
        this.A03 = r02;
        AnonymousClass0IT r03 = b7l.A02;
        AnonymousClass0FY.A00(r03);
        this.A05 = r03;
    }
}
