package p000X;

/* renamed from: X.1v5  reason: invalid class name and case insensitive filesystem */
public final class C43791v5 {
    public final Object A00;
    public final Throwable A01;

    public static C43791v5 A00(Object obj) {
        AnonymousClass0a4.A06(obj);
        return new C43791v5(obj);
    }

    public static C43791v5 A01(Throwable th) {
        AnonymousClass0a4.A06(th);
        return new C43791v5(th);
    }

    public final boolean A02() {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        if (this.A00 != null) {
            return true;
        }
        return false;
    }

    public C43791v5(Object obj) {
        this.A00 = obj;
        this.A01 = null;
    }

    public C43791v5(Throwable th) {
        this.A00 = null;
        this.A01 = th;
    }
}
