package p000X;

import java.util.Map;

/* renamed from: X.AYL */
public final class AYL extends AWZ {
    public final /* synthetic */ C23673AXk A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ AWZ A03;

    public AYL(C23673AXk aXk, AWZ awz, String str, Map map) {
        this.A00 = aXk;
        this.A03 = awz;
        this.A01 = str;
        this.A02 = map;
    }

    public final void A03(Exception exc) {
        if (exc instanceof C23773Aaz) {
            AnonymousClass0ZA.A09(this.A00.A01, new AYP(this, this), 2000, -1854236054);
        } else {
            AWZ.A00(this.A03, exc);
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        AWZ.A01(this.A03, (AVF) obj);
    }
}
