package p000X;

/* renamed from: X.DOV */
public final class DOV implements Runnable {
    public final /* synthetic */ DOU A00;

    public DOV(DOU dou) {
        this.A00 = dou;
    }

    public final void run() {
        try {
            DOW dow = this.A00.A03;
            dow.A00 = dow.A02.A00.A01.now();
            DOU dou = this.A00;
            DOW dow2 = dou.A03;
            AnonymousClass276 r5 = dow2.A02;
            r5.A01(dou.A01, dow2.A00 + r5.A00.A00);
        } catch (Exception e) {
            AnonymousClass0DB.A0O("ZeroCarrierSignalControllerBase", e, "Refresh");
        } catch (Throwable th) {
            DOU.A00(this.A00);
            throw th;
        }
        DOU.A00(this.A00);
    }
}
