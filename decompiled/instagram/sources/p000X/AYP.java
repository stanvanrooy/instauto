package p000X;

/* renamed from: X.AYP */
public final class AYP implements Runnable {
    public final /* synthetic */ AWZ A00;
    public final /* synthetic */ AYL A01;

    public AYP(AYL ayl, AWZ awz) {
        this.A01 = ayl;
        this.A00 = awz;
    }

    public final void run() {
        AYL ayl = this.A01;
        C23673AXk aXk = ayl.A00;
        if (!aXk.A00) {
            aXk.A00(ayl.A01, ayl.A02, this.A00);
        }
    }
}
