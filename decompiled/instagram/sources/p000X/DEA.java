package p000X;

/* renamed from: X.DEA */
public final class DEA {
    public static void A00(DE4 de4, int i, float[] fArr, float f, float f2) {
        int i2;
        byte[] bArr = de4.A02;
        int length = bArr.length;
        int min = Math.min(i, length - 1);
        if (min < 0 || min >= length) {
            i2 = -1;
        } else {
            i2 = 0;
            for (int i3 = 0; i3 < min; i3++) {
                byte b = bArr[i3];
                if (b == 0 || b == 1) {
                    i2 += 2;
                } else if (b == 2) {
                    i2 += 4;
                } else if (b == 3) {
                    i2 += 6;
                }
            }
        }
        float[] fArr2 = de4.A03;
        fArr[0] = fArr2[i2] * f;
        fArr[1] = fArr2[i2 + 1] * f2;
    }
}
