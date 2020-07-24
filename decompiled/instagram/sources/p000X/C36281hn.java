package p000X;

/* renamed from: X.1hn  reason: invalid class name and case insensitive filesystem */
public final class C36281hn extends C27591Il {
    public final AnonymousClass1PI A00;
    public final AnonymousClass27G A01;
    public final AnonymousClass27H A02;

    public final void A0A() {
        C29771Re r2 = this.A02.A03;
        Integer num = r2.A02;
        r2.A01 = num;
        if (num == Constants.ONE) {
            r2.A00 = -1;
        } else {
            r2.A00 = Integer.MAX_VALUE;
        }
    }

    public C36281hn(AnonymousClass1PI r7, Integer num, int i, C29091Oo r10, boolean z) {
        AnonymousClass27H r0;
        AnonymousClass27F r1 = new AnonymousClass27F(this);
        this.A01 = r1;
        this.A00 = r7;
        int i2 = i;
        C29091Oo r2 = r10;
        Integer num2 = num;
        if (z) {
            r0 = new AnonymousClass27H(r1, r2, Constants.ZERO, num2, i2);
        } else {
            r0 = new AnonymousClass27H(r1, r2, Constants.ONE, num2, i2);
        }
        this.A02 = r0;
    }

    public final void A08(C255119b r8, int i) {
        int A03 = AnonymousClass0Z0.A03(1668252534);
        if (i == 0) {
            AnonymousClass27H r5 = this.A02;
            int ALs = r8.ALs();
            int AOh = (r8.AOh() - r8.ALs()) + 1;
            int count = r8.AFX().getCount();
            if (r5.A04 == Constants.ZERO && r5.A02(ALs, AOh, count)) {
                r5.A01.A68();
            }
        }
        AnonymousClass0Z0.A0A(117154421, A03);
    }

    public final void A09(C255119b r5, int i, int i2, int i3, int i4, int i5) {
        int A03 = AnonymousClass0Z0.A03(-1532276166);
        AnonymousClass27H r2 = this.A02;
        if (r2.A04 == Constants.ONE && r2.A02(i, i2, i3)) {
            r2.A01.A68();
        }
        AnonymousClass0Z0.A0A(-1596826405, A03);
    }
}
