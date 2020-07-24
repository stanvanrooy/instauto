package p000X;

/* renamed from: X.AWX */
public final class AWX implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AWU A03;

    public AWX(AWU awu, int i, int i2, int i3) {
        this.A03 = awu;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public final void run() {
        AWU awu = this.A03;
        if (awu != null) {
            awu.B5W(this.A01, this.A02, 0, this.A00);
        }
    }
}
