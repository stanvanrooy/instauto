package p000X;

/* renamed from: X.1Xm  reason: invalid class name and case insensitive filesystem */
public final class C31301Xm {
    public final AnonymousClass008 A00 = new AnonymousClass008();
    public final AnonymousClass00N A01 = new AnonymousClass00N();

    public static C37351jW A00(C31301Xm r4, AnonymousClass1ZK r5, int i) {
        C37351jW r1;
        int A04 = r4.A01.A04(r5);
        if (A04 >= 0) {
            AnonymousClass00N r42 = r4.A01;
            C35541gX r3 = (C35541gX) r42.A08(A04);
            if (r3 != null) {
                int i2 = r3.A00;
                if ((i2 & i) != 0) {
                    int i3 = i2 & (i ^ -1);
                    r3.A00 = i3;
                    if (i == 4) {
                        r1 = r3.A02;
                    } else if (i == 8) {
                        r1 = r3.A01;
                    } else {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    if ((i3 & 12) == 0) {
                        r42.A07(A04);
                        r3.A00 = 0;
                        r3.A02 = null;
                        r3.A01 = null;
                        C35541gX.A03.BaL(r3);
                    }
                    return r1;
                }
            }
        }
        return null;
    }

    public final void A01(AnonymousClass1ZK r3) {
        C35541gX r1 = (C35541gX) this.A01.get(r3);
        if (r1 != null) {
            r1.A00 &= -2;
        }
    }

    public final void A02(AnonymousClass1ZK r6) {
        AnonymousClass008 r4 = this.A00;
        int A012 = r4.A01() - 1;
        while (true) {
            if (A012 < 0) {
                break;
            } else if (r6 == r4.A03(A012)) {
                Object[] objArr = r4.A03;
                Object obj = objArr[A012];
                Object obj2 = AnonymousClass008.A04;
                if (obj != obj2) {
                    objArr[A012] = obj2;
                    r4.A01 = true;
                }
            } else {
                A012--;
            }
        }
        C35541gX r1 = (C35541gX) this.A01.remove(r6);
        if (r1 != null) {
            r1.A00 = 0;
            r1.A02 = null;
            r1.A01 = null;
            C35541gX.A03.BaL(r1);
        }
    }

    public final void A03(AnonymousClass1ZK r3, C37351jW r4) {
        C35541gX r1 = (C35541gX) this.A01.get(r3);
        if (r1 == null) {
            r1 = C35541gX.A00();
            this.A01.put(r3, r1);
        }
        r1.A02 = r4;
        r1.A00 |= 4;
    }

    public final void A04(AnonymousClass1ZK r3, C37351jW r4) {
        C35541gX r1 = (C35541gX) this.A01.get(r3);
        if (r1 == null) {
            r1 = C35541gX.A00();
            this.A01.put(r3, r1);
        }
        r1.A01 = r4;
        r1.A00 |= 8;
    }
}
