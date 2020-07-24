package p000X;

/* renamed from: X.DE3 */
public final class DE3 {
    public static float A00(float f, DEX dex, float f2, float f3) {
        if (dex == null) {
            return f;
        }
        float[] fArr = dex.A00;
        int length = fArr.length;
        int A03 = C29847DDi.A03(fArr, length, f2);
        if (A03 >= 0) {
            return dex.A00[A03];
        }
        int i = -(A03 + 1);
        if (i == 0) {
            return dex.A00[0];
        }
        if (i == length) {
            return dex.A00[length - 1];
        }
        float[] fArr2 = dex.A00;
        int i2 = i - 1;
        float f4 = fArr2[i2];
        return ((fArr2[i] - f4) * C29847DDi.A00(dex.A01[i2], fArr[i2], fArr[i], f2, f3)) + f4;
    }
}
