package p000X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.AYJ */
public final class AYJ implements Runnable {
    public final /* synthetic */ C23700AYl A00;
    public final /* synthetic */ Exception A01;

    public AYJ(C23700AYl aYl, Exception exc) {
        this.A00 = aYl;
        this.A01 = exc;
    }

    public final void run() {
        C23700AYl aYl = this.A00;
        Exception exc = this.A01;
        aYl.A00.A08 = false;
        if (exc != null) {
            DLog.m41e(DLogTag.RTC, "onSignalingStopped (%s)", exc);
        } else {
            DLog.m40d(DLogTag.RTC, "onSignalingStopped (success)", new Object[0]);
        }
        AYG ayg = aYl.A00;
        AnonymousClass0ZA.A0E(ayg.A0D, new AYV(ayg, exc), 582036043);
        AYG ayg2 = aYl.A00;
        if (ayg2.A09 && !ayg2.A0A) {
            AYG.A01(ayg2);
        }
    }
}
