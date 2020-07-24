package p000X;

/* renamed from: X.A07 */
public final class A07 {
    public static final int[] A04 = {1, 2, 4, 8, 16, 32, 64, 128, 256};
    public int A00 = 0;
    public boolean A01;
    public final float[] A02;
    public final float A03;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r0 == 3) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        if ((r3 & r2[8]) != 0) goto L_0x002c;
     */
    public final float A00(int i) {
        float f;
        if (i == 4 || i == 5) {
            f = Float.NaN;
        } else {
            f = this.A03;
        }
        int i2 = this.A00;
        if (i2 != 0) {
            int[] iArr = A04;
            if ((iArr[i] & i2) == 0) {
                if (this.A01) {
                    if (i != 1) {
                        int i3 = i;
                        i = 6;
                    }
                    i = 7;
                    if ((iArr[i] & i2) == 0) {
                        i = 8;
                    }
                }
            }
            return this.A02[i];
        }
        return f;
    }

    public final void A01(int i, float f) {
        float[] fArr = this.A02;
        boolean z = false;
        if (!C206858uF.A00(fArr[i], f)) {
            fArr[i] = f;
            if (C230349zs.A00(f)) {
                this.A00 = (A04[i] ^ -1) & this.A00;
            } else {
                this.A00 = A04[i] | this.A00;
            }
            int i2 = this.A00;
            int[] iArr = A04;
            if (!((iArr[8] & i2) == 0 && (iArr[7] & i2) == 0 && (i2 & iArr[6]) == 0)) {
                z = true;
            }
            this.A01 = z;
        }
    }

    public A07(float f) {
        this.A03 = f;
        this.A02 = new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }
}
