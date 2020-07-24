package p000X;

import java.util.List;

/* renamed from: X.AQQ */
public final class AQQ extends AWZ {
    public final /* synthetic */ AWZ A00;
    public final /* synthetic */ AQ5 A01;

    public AQQ(AQ5 aq5, AWZ awz) {
        this.A01 = aq5;
        this.A00 = awz;
    }

    public final void A03(Exception exc) {
        this.A00.A03(exc);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        List list = (List) obj;
        AWR awr = this.A01.A08.A07;
        AnonymousClass0ZA.A05(awr, awr.obtainMessage(3, list));
        this.A00.A04(list);
    }
}
