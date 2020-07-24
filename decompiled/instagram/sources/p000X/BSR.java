package p000X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.BSR */
public final class BSR {
    public BSS A00;
    public BSQ A01;
    public ScheduledFuture A02;
    public final BSU A03;
    public final BSP A04;
    public final ScheduledExecutorService A05;

    public BSR(ScheduledExecutorService scheduledExecutorService, BSP bsp, BSU bsu) {
        this.A05 = scheduledExecutorService;
        this.A04 = bsp;
        this.A03 = bsu;
    }
}
