package p000X;

/* renamed from: X.BD1 */
public abstract class BD1 implements BD6 {
    public final int A00;
    public final AnonymousClass2GC A01;

    public Object A00(C51622Ll r3, C233910f r4) {
        Object A02 = ((BD0) this).A02(new BD3(r3), r4);
        return A02 != AnonymousClass2I1.COROUTINE_SUSPENDED ? C50622Ha.A00 : A02;
    }

    public BD1 A01(AnonymousClass2GC r3, int i) {
        return new BD2(((BD2) this).A00, r3, i);
    }

    public Object A91(AnonymousClass2HP r3, C233910f r4) {
        Object A002 = C52602Pl.A00(new AnonymousClass2HI(this, r3, (C233910f) null), r4);
        return A002 != AnonymousClass2I1.COROUTINE_SUSPENDED ? C50622Ha.A00 : A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r0 != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        if (r1 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        throw new java.lang.AssertionError();
     */
    public final BD6 AEn(AnonymousClass2GC r6, int i) {
        AnonymousClass2GC plus = r6.plus(this.A01);
        int i2 = this.A00;
        if (i2 != -3) {
            if (i != -3) {
                if (i2 != -2) {
                    if (i != -2) {
                        if (i2 == -1 || i == -1) {
                            i = -1;
                        } else {
                            boolean z = AnonymousClass2GE.A01;
                            boolean z2 = true;
                            if (z) {
                                boolean z3 = false;
                                if (i2 >= 0) {
                                    z3 = true;
                                }
                            }
                            if (z) {
                                if (i < 0) {
                                    z2 = false;
                                }
                            }
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            i = i2;
        }
        if (!C13150hy.A05(plus, this.A01) || i != this.A00) {
            return A01(plus, i);
        }
        return this;
    }

    public String toString() {
        return BCZ.A00(this) + '[' + "context=" + this.A01 + ", capacity=" + this.A00 + ']';
    }

    public BD1(AnonymousClass2GC r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
