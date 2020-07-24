package p000X;

/* renamed from: X.0Up  reason: invalid class name and case insensitive filesystem */
public final class C07830Up implements Runnable {
    public final /* synthetic */ C10630dc A00;

    public C07830Up(C10630dc r1) {
        this.A00 = r1;
    }

    public final void run() {
        C07990Vf r2 = this.A00.A01.A0l;
        C10630dc r1 = this.A00;
        if (r2 == r1.A00) {
            C07890Uv.A03(r1.A01, C07880Uu.CONNECTION_LOST, C11020eI.A00);
        }
    }
}
