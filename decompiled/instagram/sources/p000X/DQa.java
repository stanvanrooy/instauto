package p000X;

/* renamed from: X.DQa */
public final class DQa implements C27711Ix, C30126DRi {
    public DRQ A00;
    public final C27841Jk A01;

    public final void B2m(Throwable th) {
        this.A01.B2m(th);
    }

    public final void BD2(Object obj) {
        this.A01.BD2(obj);
    }

    public final void BPU(DRQ drq) {
        if (DQV.A01(this.A00, drq)) {
            this.A00 = drq;
            this.A01.BPT(this);
            drq.BdE(Long.MAX_VALUE);
        }
    }

    public final void dispose() {
        this.A00.cancel();
        this.A00 = DQV.A01;
    }

    public final void onComplete() {
        this.A01.onComplete();
    }

    public DQa(C27841Jk r1) {
        this.A01 = r1;
    }
}
