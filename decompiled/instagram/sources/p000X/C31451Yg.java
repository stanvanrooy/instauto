package p000X;

import android.view.View;

/* renamed from: X.1Yg  reason: invalid class name and case insensitive filesystem */
public final class C31451Yg {
    public C31461Yh A00 = new C31461Yh();
    public final C31431Ye A01;

    public final View A00(int i, int i2, int i3, int i4) {
        int ARc = this.A01.ARc();
        int ARb = this.A01.ARb();
        int i5 = -1;
        if (i2 > i) {
            i5 = 1;
        }
        View view = null;
        while (i != i2) {
            View AI1 = this.A01.AI1(i);
            int AI8 = this.A01.AI8(AI1);
            int AI6 = this.A01.AI6(AI1);
            C31461Yh r2 = this.A00;
            r2.A04 = ARc;
            r2.A03 = ARb;
            r2.A02 = AI8;
            r2.A01 = AI6;
            r2.A00 = 0;
            r2.A00 = i3 | 0;
            if (r2.A00()) {
                return AI1;
            }
            if (i4 != 0) {
                r2.A00 = 0;
                r2.A00 = i4 | 0;
                if (r2.A00()) {
                    view = AI1;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean A01(View view) {
        C31461Yh r4 = this.A00;
        int ARc = this.A01.ARc();
        int ARb = this.A01.ARb();
        int AI8 = this.A01.AI8(view);
        int AI6 = this.A01.AI6(view);
        r4.A04 = ARc;
        r4.A03 = ARb;
        r4.A02 = AI8;
        r4.A01 = AI6;
        C31461Yh r1 = this.A00;
        r1.A00 = 0;
        r1.A00 = 24579;
        return r1.A00();
    }

    public C31451Yg(C31431Ye r2) {
        this.A01 = r2;
    }
}
