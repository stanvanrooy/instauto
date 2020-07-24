package p000X;

/* renamed from: X.BD0 */
public abstract class BD0 extends BD1 {
    public final AnonymousClass10W A00;

    public Object A02(AnonymousClass2HP r3, C233910f r4) {
        Object A91 = ((BD2) this).A00.A91(r3, r4);
        return A91 != AnonymousClass2I1.COROUTINE_SUSPENDED ? C50622Ha.A00 : A91;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d A[RETURN] */
    public final Object A91(AnonymousClass2HP r5, C233910f r6) {
        Object A91;
        if (this.A00 == -3) {
            AnonymousClass2GC AIs = r6.AIs();
            AnonymousClass2GC plus = AIs.plus(this.A01);
            if (C13150hy.A05(plus, AIs)) {
                A91 = A02(r5, r6);
                if (A91 == AnonymousClass2I1.COROUTINE_SUSPENDED) {
                    return A91;
                }
                return C50622Ha.A00;
            }
            AnonymousClass2GR r0 = AnonymousClass2GN.A00;
            if (C13150hy.A05((AnonymousClass2GN) plus.get(r0), (AnonymousClass2GN) AIs.get(r0))) {
                AnonymousClass2GC AIs2 = r6.AIs();
                if (!(r5 instanceof BD3) && !(r5 instanceof BD4)) {
                    r5 = new C25308BCz(r5, AIs2);
                }
                Object A002 = C25300BCr.A00(plus, AnonymousClass2HV.A00(plus), new AnonymousClass2HG(this, (C233910f) null), r5, r6);
                AnonymousClass2I1 r1 = AnonymousClass2I1.COROUTINE_SUSPENDED;
                if (A002 != r1) {
                    A002 = C50622Ha.A00;
                }
                if (A002 == r1) {
                    return A002;
                }
                return C50622Ha.A00;
            }
        }
        A91 = super.A91(r5, r6);
        if (A91 == AnonymousClass2I1.COROUTINE_SUSPENDED) {
        }
        return C50622Ha.A00;
    }

    public final String toString() {
        return this.A00 + " -> " + super.toString();
    }

    public BD0(AnonymousClass10W r1, AnonymousClass2GC r2, int i) {
        super(r2, i);
        this.A00 = r1;
    }
}
