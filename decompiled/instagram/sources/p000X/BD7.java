package p000X;

/* renamed from: X.BD7 */
public final class BD7 implements AnonymousClass2GH {
    public static final BD8 A02 = new BD8();
    public final Throwable A00;
    public final AnonymousClass2GQ A01 = A02;

    public final Object fold(Object obj, C46381ze r3) {
        C13150hy.A02(r3, "operation");
        return r3.Adt(obj, this);
    }

    public BD7(Throwable th) {
        this.A00 = th;
    }

    public final AnonymousClass2GH get(AnonymousClass2GQ r2) {
        return C50552Gt.A00(this, r2);
    }

    public final AnonymousClass2GQ getKey() {
        return this.A01;
    }

    public final AnonymousClass2GC minusKey(AnonymousClass2GQ r2) {
        return C50552Gt.A01(this, r2);
    }

    public final AnonymousClass2GC plus(AnonymousClass2GC r2) {
        return C50552Gt.A02(this, r2);
    }
}
