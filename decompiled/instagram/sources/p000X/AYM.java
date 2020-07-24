package p000X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.AYM */
public final class AYM implements Runnable {
    public final /* synthetic */ C23700AYl A00;

    public AYM(C23700AYl aYl) {
        this.A00 = aYl;
    }

    public final void run() {
        C23700AYl aYl = this.A00;
        DLog.m40d(DLogTag.RTC, "onPeerFailed", new Object[0]);
        AYG ayg = aYl.A00;
        if (ayg.A05 == Constants.ONE) {
            AYG.A01(ayg);
        }
    }
}
