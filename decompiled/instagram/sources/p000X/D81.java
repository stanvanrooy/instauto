package p000X;

/* renamed from: X.D81 */
public final /* synthetic */ class D81 implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ D7B A04;

    public /* synthetic */ D81(D7B d7b, int i, int i2, int i3, float f) {
        this.A04 = d7b;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = f;
    }

    public final void run() {
        D7B d7b = this.A04;
        d7b.A01.BVP(this.A01, this.A02, this.A03, this.A00);
    }
}
