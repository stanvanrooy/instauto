package p000X;

/* renamed from: X.DQZ */
public final class DQZ implements C27841Jk, DRQ {
    public C27711Ix A00;
    public final DR5 A01;

    public final void BdE(long j) {
    }

    public final void B2m(Throwable th) {
        this.A01.B2m(th);
    }

    public final void BD2(Object obj) {
        this.A01.BD2(obj);
    }

    public final void BPT(C27711Ix r2) {
        this.A00 = r2;
        this.A01.BPU(this);
    }

    public final void cancel() {
        this.A00.dispose();
    }

    public final void onComplete() {
        this.A01.onComplete();
    }

    public DQZ(DR5 dr5) {
        this.A01 = dr5;
    }
}
