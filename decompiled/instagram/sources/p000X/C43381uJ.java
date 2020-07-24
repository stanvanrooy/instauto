package p000X;

import com.instagram.common.math.Matrix4;

/* renamed from: X.1uJ  reason: invalid class name and case insensitive filesystem */
public final class C43381uJ {
    public static C43391uK parseFromJson(C13080hr r8) {
        C43391uK r7 = new C43391uK();
        if (r8.A0g() != C13120hv.START_OBJECT) {
            r8.A0f();
            return null;
        }
        while (r8.A0p() != C13120hv.END_OBJECT) {
            String A0i = r8.A0i();
            r8.A0p();
            if ("targetFilterPosition".equals(A0i)) {
                r7.A09 = r8.A0I();
            } else if ("translationX".equals(A0i)) {
                r7.A05 = (float) r8.A0H();
            } else if ("translationY".equals(A0i)) {
                r7.A06 = (float) r8.A0H();
            } else if ("translationZ".equals(A0i)) {
                r7.A07 = (float) r8.A0H();
            } else if ("scaleX".equals(A0i)) {
                r7.A03 = (float) r8.A0H();
            } else if ("scaleY".equals(A0i)) {
                r7.A04 = (float) r8.A0H();
            } else if ("rotateZ".equals(A0i)) {
                r7.A02 = (float) r8.A0H();
            } else if ("canvas_aspect_ratio".equals(A0i)) {
                r7.A00 = (float) r8.A0H();
            } else if ("media_aspect_ratio".equals(A0i)) {
                r7.A01 = (float) r8.A0H();
            } else if ("orientation".equals(A0i)) {
                r7.A08 = r8.A0I();
            } else if ("is_mirrored".equals(A0i)) {
                r7.A0D = r8.A0O();
            } else if ("is_filter_opt_enabled".equals(A0i)) {
                r7.A0C = r8.A0O();
            }
            r8.A0f();
        }
        C43391uK r6 = new C43391uK(r7.A09, r7.A0C);
        float[] fArr = new float[16];
        System.arraycopy(r6.A0B.A01, 0, fArr, 0, 16);
        r7.A0B = new Matrix4(fArr);
        float[] fArr2 = new float[16];
        System.arraycopy(r6.A0A.A01, 0, fArr2, 0, 16);
        r7.A0A = new Matrix4(fArr2);
        C43391uK.A02(r7);
        C43391uK.A03(r7);
        return r7;
    }

    public static void A00(C13460iZ r2, C43391uK r3) {
        r2.A0T();
        r2.A0F("targetFilterPosition", r3.A09);
        r2.A0E("translationX", r3.A05);
        r2.A0E("translationY", r3.A06);
        r2.A0E("translationZ", r3.A07);
        r2.A0E("scaleX", r3.A03);
        r2.A0E("scaleY", r3.A04);
        r2.A0E("rotateZ", r3.A02);
        r2.A0E("canvas_aspect_ratio", r3.A00);
        r2.A0E("media_aspect_ratio", r3.A01);
        r2.A0F("orientation", r3.A08);
        r2.A0I("is_mirrored", r3.A0D);
        r2.A0I("is_filter_opt_enabled", r3.A0C);
        r2.A0Q();
    }
}
