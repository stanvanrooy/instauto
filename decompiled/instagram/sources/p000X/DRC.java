package p000X;

/* renamed from: X.DRC */
public final class DRC implements Runnable {
    public final DRE A00;
    public final Runnable A01;
    public final /* synthetic */ AnonymousClass1KG A02;

    public DRC(AnonymousClass1KG r1, DRE dre, Runnable runnable) {
        this.A02 = r1;
        this.A00 = dre;
        this.A01 = runnable;
    }

    public final void run() {
        AnonymousClass1KP.A01(this.A00, this.A02.A00(this.A01));
    }
}
