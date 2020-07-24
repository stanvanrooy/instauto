package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.DDC */
public final class DDC {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        r4 = com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        r3 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        if (r17 >= com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        r11 = com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        if (r17 <= 1.0f) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009b, code lost:
        r11 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (r4 >= r3) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r2 = ((((r15 * r1) + r6) * r1) + r16) * r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b1, code lost:
        if (java.lang.Math.abs(r2 - r17) < r12) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        if (r17 <= r2) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b7, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        r1 = ((r3 - r4) * 0.5f) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        r11 = r1;
     */
    public static float A00(DDD ddd, int i, float f, float f2) {
        float[] fArr;
        DDG[] ddgArr = ddd.A01;
        if (ddgArr == null || (fArr = ddd.A00) == null) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        int i2 = i - 1;
        DDG ddg = ddgArr[i2];
        float f3 = fArr[i2];
        float f4 = fArr[i] - f3;
        float f5 = (f - f3) / f4;
        byte b = ddg.A00;
        if (b == 0) {
            C29831DCs dCs = ddg.A01;
            C29831DCs dCs2 = ddg.A02;
            if (!(dCs == null || dCs2 == null)) {
                float f6 = dCs.A00;
                float f7 = dCs.A01;
                float f8 = f6 * 3.0f;
                float f9 = ((dCs2.A00 - f6) * 3.0f) - f8;
                float f10 = (1.0f - f8) - f9;
                float f11 = f7 * 3.0f;
                float f12 = ((dCs2.A01 - f7) * 3.0f) - f11;
                float f13 = (1.0f - f11) - f12;
                float min = Math.min(0.005f, 1.0f / ((f4 * f2) * 200.0f));
                float f14 = f5;
                int i3 = 0;
                float f15 = f14;
                while (true) {
                    if (i3 >= 8) {
                        break;
                    }
                    float f16 = (((((f10 * f15) + f9) * f15) + f8) * f15) - f5;
                    if (Math.abs(f16) < min) {
                        break;
                    }
                    float f17 = (((f10 * 3.0f * f15) + (2.0f * f9)) * f15) + f8;
                    if (((double) Math.abs(f17)) < 1.0E-6d) {
                        break;
                    }
                    f15 -= f16 / f17;
                    i3++;
                }
                return ((((f13 * f15) + f12) * f15) + f11) * f15;
            }
        } else if (b != 1) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            return f5;
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }
}
