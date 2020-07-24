package p000X;

/* renamed from: X.1Jz  reason: invalid class name and case insensitive filesystem */
public final class C27991Jz extends C27821Ji {
    public final int A00;
    public final C64602rk A01;
    public final C27831Jj[] A02;

    public final void A03(C27841Jk r9) {
        C27831Jj[] r7 = this.A02;
        if (r7 == null) {
            throw null;
        }
        int length = r7.length;
        if (length == 0) {
            DQm.A00(r9);
            return;
        }
        C30113DQv dQv = new C30113DQv(r9, this.A01, length);
        int i = this.A00;
        C30117DQz[] dQzArr = dQv.A03;
        int length2 = dQzArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            dQzArr[i2] = new C30117DQz(dQv, i);
        }
        dQv.lazySet(0);
        dQv.A02.BPT(dQv);
        for (int i3 = 0; i3 < length2 && !dQv.A04; i3++) {
            r7[i3].Bqn(dQzArr[i3]);
        }
    }

    public C27991Jz(C27831Jj[] r1, C64602rk r2, int i) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = i;
    }
}
