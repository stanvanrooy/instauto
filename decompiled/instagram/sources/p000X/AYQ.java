package p000X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.AYQ */
public final class AYQ implements Runnable {
    public final /* synthetic */ C23700AYl A00;
    public final /* synthetic */ String A01;

    public AYQ(C23700AYl aYl, String str) {
        this.A00 = aYl;
        this.A01 = str;
    }

    public final void run() {
        C23700AYl aYl = this.A00;
        C23699AYk aYk = new C23699AYk(this.A01);
        DLog.m41e(DLogTag.RTC, "onFatalError: %s", aYk);
        AYG ayg = aYl.A00;
        ayg.A04 = aYk;
        ayg.A05 = Constants.A0Y;
        ayg.A08();
    }
}
