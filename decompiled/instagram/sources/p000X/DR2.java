package p000X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DR2 */
public final class DR2 extends AtomicReference implements C27841Jk, C27711Ix {
    public final C27841Jk A00;
    public final AtomicReference A01 = new AtomicReference();

    public final void B2m(Throwable th) {
        this.A00.B2m(th);
    }

    public final void BD2(Object obj) {
        this.A00.BD2(obj);
    }

    public final void BPT(C27711Ix r2) {
        AnonymousClass1KP.A03(this.A01, r2);
    }

    public final void dispose() {
        AnonymousClass1KP.A00(this.A01);
        AnonymousClass1KP.A00(this);
    }

    public final void onComplete() {
        this.A00.onComplete();
    }

    public DR2(C27841Jk r2) {
        this.A00 = r2;
    }
}
