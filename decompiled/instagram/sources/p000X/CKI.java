package p000X;

/* renamed from: X.CKI */
public final class CKI implements AnonymousClass1B1 {
    public final C27613CKg A00;

    public CKI(C27613CKg cKg) {
        C13150hy.A02(cKg, "repository");
        this.A00 = cKg;
    }

    public final C25941Az create(Class cls) {
        C13150hy.A02(cls, "modelClass");
        return new CKS(this.A00);
    }
}
