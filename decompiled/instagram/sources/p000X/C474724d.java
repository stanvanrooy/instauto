package p000X;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.24d  reason: invalid class name and case insensitive filesystem */
public final class C474724d implements AnonymousClass07V {
    public final AnonymousClass02D A00;

    public final void Bbu(C034507a r4, AnonymousClass07X r5) {
        this.A00.Bbu(r4, r5);
        boolean z = false;
        if (AnonymousClass09Q.A0W != null) {
            z = true;
        }
        if (z) {
            this.A00.A00("navigation_module", AnonymousClass09Q.A03());
        }
    }

    public C474724d(ScheduledExecutorService scheduledExecutorService, long j) {
        this.A00 = new AnonymousClass02D(AnonymousClass00B.A01, scheduledExecutorService, j);
    }
}
