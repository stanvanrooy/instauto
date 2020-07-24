package p000X;

/* renamed from: X.CB5 */
public final class CB5 implements Runnable {
    public final /* synthetic */ CB6 A00;
    public final /* synthetic */ C27377CAw A01;

    public CB5(CB6 cb6, C27377CAw cAw) {
        this.A00 = cb6;
        this.A01 = cAw;
    }

    public final void run() {
        C27377CAw cAw = this.A01;
        if (cAw == null) {
            this.A00.A00.B8H();
        } else {
            this.A00.A00.B7y(cAw);
        }
        CB6 cb6 = this.A00;
        C27379CAy.A01(cb6.A02, cb6.A01);
    }
}
