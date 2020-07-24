package p000X;

/* renamed from: X.01k  reason: invalid class name and case insensitive filesystem */
public final class C021901k extends C035307i {
    public final AnonymousClass00N A00 = new AnonymousClass00N();
    public final AnonymousClass00N A01 = new AnonymousClass00N();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C021901k r5 = (C021901k) obj;
            if (!C035707m.A01(this.A01, r5.A01) || !C035707m.A01(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C035307i A01(C035307i r1) {
        A05((C021901k) r1);
        return this;
    }

    public final /* bridge */ /* synthetic */ C035307i A02(C035307i r1, C035307i r2) {
        C021901k r22 = (C021901k) r2;
        A06((C021901k) r1, r22);
        return r22;
    }

    public final /* bridge */ /* synthetic */ C035307i A03(C035307i r7, C035307i r8) {
        boolean z;
        C035307i A04;
        C035307i A042;
        C021901k r72 = (C021901k) r7;
        C021901k r82 = (C021901k) r8;
        if (r82 != null) {
            if (r72 == null) {
                r82.A05(this);
            } else {
                int size = this.A00.size();
                for (int i = 0; i < size; i++) {
                    Class cls = (Class) this.A00.A06(i);
                    if (!A08(cls) || !r72.A08(cls)) {
                        if (A08(cls)) {
                            A04 = r82.A04(cls);
                            A042 = A04(cls);
                        } else if (r72.A08(cls)) {
                            A04 = r82.A04(cls);
                            A042 = r72.A04(cls);
                        } else {
                            z = false;
                            r82.A07(cls, z);
                        }
                        A04.A01(A042);
                    } else {
                        C035307i A043 = r82.A04(cls);
                        if (A043 != null) {
                            A04(cls).A03(r72.A04(cls), A043);
                        }
                    }
                    z = true;
                    r82.A07(cls, z);
                }
            }
            return r82;
        }
        throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
    }

    public final C035307i A04(Class cls) {
        return (C035307i) cls.cast(this.A00.get(cls));
    }

    public final void A05(C021901k r7) {
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            Class cls = (Class) this.A00.A06(i);
            C035307i A04 = r7.A04(cls);
            if (A04 != null) {
                A04(cls).A01(A04);
                A07(cls, r7.A08(cls));
            } else {
                A07(cls, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r8.A08(r4) == false) goto L_0x0026;
     */
    public final void A06(C021901k r8, C021901k r9) {
        boolean z;
        C035307i A04;
        if (r9 == null) {
            throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
        } else if (r8 == null) {
            r9.A05(this);
        } else {
            int size = this.A00.size();
            for (int i = 0; i < size; i++) {
                Class cls = (Class) this.A00.A06(i);
                if (A08(cls)) {
                    z = true;
                }
                z = false;
                if (z && (A04 = r9.A04(cls)) != null) {
                    A04(cls).A02(r8.A04(cls), A04);
                }
                r9.A07(cls, z);
            }
        }
    }

    public final void A07(Class cls, boolean z) {
        Boolean bool;
        AnonymousClass00N r1 = this.A01;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        r1.put(cls, bool);
    }

    public final boolean A08(Class cls) {
        Boolean bool = (Boolean) this.A01.get(cls);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Composite Metrics{\n");
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            sb.append(this.A00.A08(i));
            if (A08((Class) this.A00.A06(i))) {
                str = " [valid]";
            } else {
                str = " [invalid]";
            }
            sb.append(str);
            sb.append(10);
        }
        sb.append("}");
        return sb.toString();
    }
}
