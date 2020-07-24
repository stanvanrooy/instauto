package p000X;

import android.os.Process;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BWF */
public final class BWF extends Thread {
    public final /* synthetic */ BWG A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BWF(BWG bwg) {
        super("NativeMetricsLogWriter");
        this.A00 = bwg;
    }

    public final void run() {
        Process.setThreadPriority(19);
        BWG bwg = this.A00;
        if (AnonymousClass0FU.A07(bwg.A00, AnonymousClass000.A0E("nativemetrics_", bwg.A02))) {
            BWG bwg2 = this.A00;
            bwg2.A01 = new BWE(bwg2.A00, bwg2.A02);
            BWG.A00(this.A00);
            BWG bwg3 = this.A00;
            AnonymousClass0ZA.A09(bwg3.A03, bwg3.A05, TimeUnit.MINUTES.toMillis(2), -535128089);
        }
    }
}
