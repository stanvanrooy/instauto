package p000X;

/* renamed from: X.AYT */
public final class AYT implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AYG A01;
    public final /* synthetic */ AZM A02;

    public AYT(AYG ayg, AZM azm, int i) {
        this.A01 = ayg;
        this.A02 = azm;
        this.A00 = i;
    }

    public final void run() {
        AYX ayx = this.A01.A02;
        if (ayx != null) {
            ayx.BB8(this.A02, this.A00);
        }
    }
}
