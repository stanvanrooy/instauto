package p000X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.AYR */
public final class AYR implements Runnable {
    public final /* synthetic */ C23700AYl A00;
    public final /* synthetic */ AZM A01;

    public AYR(C23700AYl aYl, AZM azm) {
        this.A00 = aYl;
        this.A01 = azm;
    }

    public final void run() {
        C23700AYl aYl = this.A00;
        AZM azm = this.A01;
        DLog.m40d(DLogTag.RTC, "onMediaStreamAdded: %s", azm);
        AYG ayg = aYl.A00;
        ayg.A0A(azm, ayg.A00);
    }
}
