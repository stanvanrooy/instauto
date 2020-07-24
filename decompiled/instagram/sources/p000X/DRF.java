package p000X;

/* renamed from: X.DRF */
public final class DRF implements Runnable {
    public final DRD A00;
    public final /* synthetic */ AnonymousClass1J2 A01;

    public DRF(AnonymousClass1J2 r1, DRD drd) {
        this.A01 = r1;
        this.A00 = drd;
    }

    public final void run() {
        DRD drd = this.A00;
        AnonymousClass1KP.A01(drd.A00, this.A01.A01(drd));
    }
}
