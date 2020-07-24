package p000X;

/* renamed from: X.DI9 */
public final class DI9 implements Runnable {
    public final /* synthetic */ DI8 A00;

    public DI9(DI8 di8) {
        this.A00 = di8;
    }

    public final void run() {
        DI8 di8 = this.A00;
        if (di8.A01 == 0) {
            di8.A05 = true;
            di8.A07.A08(C1662977d.ON_PAUSE);
        }
        DI8 di82 = this.A00;
        if (di82.A02 == 0 && di82.A05) {
            di82.A07.A08(C1662977d.ON_STOP);
            di82.A06 = true;
        }
    }
}
