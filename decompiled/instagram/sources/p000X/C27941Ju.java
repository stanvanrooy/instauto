package p000X;

/* renamed from: X.1Ju  reason: invalid class name and case insensitive filesystem */
public final class C27941Ju implements C27841Jk {
    public final /* synthetic */ C27791Jf A00;
    public final /* synthetic */ C27931Jt A01;

    public C27941Ju(C27791Jf r1, C27931Jt r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void B2m(Throwable th) {
        throw new RuntimeException("Uncaught error for " + this.A01, th);
    }

    public final void BD2(Object obj) {
        this.A01.A00.accept(obj);
    }

    public final void BPT(C27711Ix r4) {
        this.A01.A02.A01.A2X(new AnonymousClass1KR(r4).A00);
    }

    public final void onComplete() {
        this.A01.A01.run();
    }
}
