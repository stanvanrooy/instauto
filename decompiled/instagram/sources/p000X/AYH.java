package p000X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.AYH */
public final class AYH extends AWZ {
    public final /* synthetic */ AYG A00;

    public AYH(AYG ayg) {
        this.A00 = ayg;
    }

    public final void A03(Exception exc) {
        DLog.m41e(DLogTag.RTC, "initSession Error: %s", exc);
        AYG ayg = this.A00;
        ayg.A04 = exc;
        ayg.A05 = Constants.A0Y;
        ayg.A08();
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        AZK azk = (AZK) obj;
        AYG ayg = this.A00;
        AnonymousClass0a4.A06(azk);
        ayg.A03 = azk;
        azk.A00 = new C23700AYl(ayg);
        AYG.A01(ayg);
    }
}
