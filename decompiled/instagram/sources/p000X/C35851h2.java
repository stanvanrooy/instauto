package p000X;

import com.instagram.model.reels.Reel;

/* renamed from: X.1h2  reason: invalid class name and case insensitive filesystem */
public final class C35851h2 {
    public final float A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r8.A04.A0b() == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r8.A05(r7) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r4 != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        if (r2 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (p000X.C35861h3.A01(r7, r8) == false) goto L_0x001e;
     */
    public C35851h2(AnonymousClass0C1 r7, C31581Yw r8) {
        boolean z;
        float f;
        Reel reel = r8.A04;
        boolean A0W = reel.A0W();
        boolean A0X = reel.A0X();
        boolean A022 = r8.A02();
        boolean z2 = C35861h3.A02(r7, r8) ? true : z2;
        z2 = false;
        boolean z3 = false;
        if (A0W || (A0X && !A022)) {
            z = true;
        } else {
            z = false;
        }
        this.A05 = z;
        boolean z4 = !A0X ? true : z4;
        z4 = false;
        this.A06 = z4;
        boolean z5 = A0X ? true : z5;
        z5 = false;
        this.A01 = z5;
        boolean z6 = !A0W ? false : z6;
        z6 = true;
        this.A03 = z6;
        this.A02 = this.A06;
        if (A0W || (A0X && !r8.A05(r7))) {
            z3 = true;
        }
        this.A04 = z3;
        if (z2) {
            f = 0.67f;
        } else {
            if (A0X) {
                f = 0.625f;
            }
            f = 1.0f;
        }
        this.A00 = f;
    }
}
