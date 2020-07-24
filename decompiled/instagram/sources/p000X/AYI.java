package p000X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import java.util.Map;

/* renamed from: X.AYI */
public final class AYI implements Runnable {
    public final /* synthetic */ C23700AYl A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public AYI(C23700AYl aYl, String str, Map map) {
        this.A00 = aYl;
        this.A01 = str;
        this.A02 = map;
    }

    public final void run() {
        C23700AYl aYl = this.A00;
        String str = this.A01;
        Map map = this.A02;
        DLog.m40d(DLogTag.RTC, "onOfferCreated", new Object[0]);
        AYG ayg = aYl.A00;
        ayg.A07 = true;
        C23673AXk aXk = ayg.A0G;
        AnonymousClass0a4.A06(str);
        aXk.A00(str, map, new AYL(aXk, new AYD(ayg), str, map));
    }
}
