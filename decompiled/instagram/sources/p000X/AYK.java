package p000X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.AYK */
public final class AYK implements Runnable {
    public final /* synthetic */ C23700AYl A00;

    public AYK(C23700AYl aYl) {
        this.A00 = aYl;
    }

    public final void run() {
        C23700AYl aYl = this.A00;
        DLog.m40d(DLogTag.RTC, "onPeerConnected", new Object[0]);
        AYG ayg = aYl.A00;
        if (ayg.A05 == Constants.ONE) {
            ayg.A05 = Constants.A0C;
            if (!ayg.A0B) {
                AnonymousClass0ZA.A0E(ayg.A0D, new AYZ(ayg), 724384392);
                AYG ayg2 = aYl.A00;
                ayg2.A0B = true;
                if (ayg2.A09 && !ayg2.A0A) {
                    AYG.A01(ayg2);
                }
            }
            AYG ayg3 = aYl.A00;
            AnonymousClass0ZA.A0E(ayg3.A0D, new C23690AYb(ayg3), -814596859);
        }
    }
}
