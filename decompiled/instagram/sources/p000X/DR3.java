package p000X;

/* renamed from: X.DR3 */
public final class DR3 implements C27841Jk, C27711Ix {
    public long A00;
    public C27711Ix A01;
    public final C27841Jk A02;

    public final void B2m(Throwable th) {
        this.A02.B2m(th);
    }

    public final void BD2(Object obj) {
        long j = this.A00;
        if (j != 0) {
            this.A00 = j - 1;
        } else {
            this.A02.BD2(obj);
        }
    }

    public final void BPT(C27711Ix r2) {
        if (AnonymousClass1KP.A02(this.A01, r2)) {
            this.A01 = r2;
            this.A02.BPT(this);
        }
    }

    public final void dispose() {
        this.A01.dispose();
    }

    public final void onComplete() {
        this.A02.onComplete();
    }

    public DR3(C27841Jk r1, long j) {
        this.A02 = r1;
        this.A00 = j;
    }
}
