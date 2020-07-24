package p000X;

/* renamed from: X.AZT */
public final /* synthetic */ class AZT implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AZK A02;

    public /* synthetic */ AZT(AZK azk, int i, int i2) {
        this.A02 = azk;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        AZK azk = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        AZU azu = azk.A03;
        if (azu != null) {
            azu.A02.setTextureSize(i, i2);
        }
    }
}
