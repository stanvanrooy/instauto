package p000X;

/* renamed from: X.1n5  reason: invalid class name and case insensitive filesystem */
public final class C39541n5 {
    public long A00 = 0;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = 0;
    public long A04 = 0;

    public static void A00(C39541n5 r5, long j) {
        long j2 = r5.A01;
        if (j2 >= 0) {
            long j3 = j - j2;
            r5.A04 += j3;
            r5.A03 = Math.max(r5.A03, j3);
            r5.A01 = -1;
        }
    }

    public final void A02(C32761bo r9) {
        long j = r9.A00;
        long j2 = this.A02;
        if (j2 > 0) {
            this.A00 = j - j2;
            this.A02 = -1;
        }
        A00(this, j);
    }

    public final void A01(AnonymousClass1TY r8, C32761bo r9) {
        float A022 = r9.A02(r8);
        long j = this.A01;
        if (j < 0 && A022 >= 0.5f) {
            this.A01 = r9.A00;
        } else if (j >= 0 && A022 < 0.5f) {
            A00(this, r9.A00);
        }
        if (this.A02 < 0 && A022 >= 0.5f) {
            this.A02 = r9.A00;
        }
    }
}
