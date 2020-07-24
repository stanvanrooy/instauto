package p000X;

import android.os.Process;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BWH */
public final class BWH extends Thread {
    public final /* synthetic */ BWG A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BWH(BWG bwg) {
        super("NativeMetricsLogWriter");
        this.A00 = bwg;
    }

    public final void run() {
        Process.setThreadPriority(19);
        BWG.A00(this.A00);
        BWG bwg = this.A00;
        AnonymousClass0ZA.A09(bwg.A03, bwg.A05, TimeUnit.HOURS.toMillis(4), -1617015478);
    }
}
