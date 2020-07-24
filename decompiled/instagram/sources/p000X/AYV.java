package p000X;

/* renamed from: X.AYV */
public final class AYV implements Runnable {
    public final /* synthetic */ AYG A00;
    public final /* synthetic */ Exception A01;

    public AYV(AYG ayg, Exception exc) {
        this.A00 = ayg;
        this.A01 = exc;
    }

    public final void run() {
        AYX ayx = this.A00.A02;
        if (ayx != null) {
            ayx.BNL(this.A01);
        }
    }
}
