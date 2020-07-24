package p000X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.AYO */
public final class AYO implements Runnable {
    public final /* synthetic */ C23700AYl A00;

    public AYO(C23700AYl aYl) {
        this.A00 = aYl;
    }

    public final void run() {
        C23700AYl aYl = this.A00;
        DLog.m40d(DLogTag.RTC, "onPeerDisconnected", new Object[0]);
        AYG ayg = aYl.A00;
        if (ayg.A05 == Constants.A0C) {
            AnonymousClass0ZA.A0E(ayg.A0D, new AYY(ayg), 1605287060);
            aYl.A00.A05 = Constants.ONE;
        }
    }
}
