package p000X;

/* renamed from: X.DOW */
public final class DOW {
    public long A00 = Long.MIN_VALUE;
    public DOU A01 = null;
    public final /* synthetic */ AnonymousClass276 A02;

    public DOW(AnonymousClass276 r3) {
        this.A02 = r3;
    }

    public final void A00() {
        DOU dou = this.A01;
        if (dou != null) {
            synchronized (dou) {
                Object obj = dou.A00;
                if (obj != null) {
                    dou.A03.A02.A01.A04(obj);
                    dou.A00 = null;
                }
            }
            this.A01 = null;
        }
    }
}
