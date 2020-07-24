package p000X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.AYD */
public final class AYD extends AWZ {
    public final /* synthetic */ AYG A00;

    public AYD(AYG ayg) {
        this.A00 = ayg;
    }

    public final void A03(Exception exc) {
        AYG ayg = this.A00;
        DLogTag dLogTag = DLogTag.RTC;
        DLog.m41e(dLogTag, "onJoinResultFail", new Object[0]);
        C12670hC.A02();
        DLog.m40d(dLogTag, "renegotiate - failed", new Object[0]);
        ayg.A04 = exc;
        ayg.A05 = Constants.A0Y;
        ayg.A08();
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        AVF avf = (AVF) obj;
        AYG ayg = this.A00;
        DLogTag dLogTag = DLogTag.RTC;
        DLog.m40d(dLogTag, "onJoinResultSuccess", new Object[0]);
        C12670hC.A02();
        DLog.m40d(dLogTag, "renegotiate - done", new Object[0]);
        if (ayg.A03 != null) {
            DLog.m40d(dLogTag, "setAnswerSDP", new Object[0]);
            AZK azk = ayg.A03;
            AZK.A05(azk, new AZg(azk, avf.A00, avf.A01), (AWN) null);
        }
    }
}
