package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.math.Matrix4;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1uK  reason: invalid class name and case insensitive filesystem */
public final class C43391uK {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public Matrix4 A0A;
    public Matrix4 A0B;
    public boolean A0C;
    public boolean A0D;
    public final Matrix4 A0E;
    public final Matrix4 A0F;

    public static Matrix4 A00(List list) {
        if (list == null) {
            return null;
        }
        Matrix4 matrix4 = new Matrix4();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            matrix4.A06(((C43391uK) it.next()).A0E);
        }
        return matrix4;
    }

    public static Matrix4 A01(List list) {
        if (list == null) {
            return null;
        }
        Matrix4 matrix4 = new Matrix4();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            matrix4.A06(((C43391uK) it.next()).A0F);
        }
        return matrix4;
    }

    public static void A02(C43391uK r6) {
        if (r6.A0C) {
            r6.A0E.A01();
            r6.A0E.A05(0.5f, 0.5f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float f = 1.0f;
            if (r6.A0D) {
                f = -1.0f;
            }
            if (r6.A08 % 180 == 0) {
                r6.A0E.A04(f * 1.0f, r6.A01 * 1.0f);
            } else {
                r6.A0E.A04(r6.A01, f * 1.0f);
            }
            r6.A0E.A03(r6.A02);
            r6.A0E.A04(1.0f / r6.A03, 1.0f / (r6.A01 * r6.A04));
            r6.A0E.A05(-0.5f - (r6.A05 * r6.A03), -0.5f - (r6.A06 * (-r6.A04)), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            return;
        }
        r6.A0E.A01();
        r6.A0E.A05(0.5f, 0.5f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        r6.A0E.A04(1.0f, -r6.A01);
        r6.A0E.A03(r6.A02);
        r6.A0E.A04(1.0f / r6.A03, 1.0f / (r6.A01 * r6.A04));
        r6.A0E.A05(-0.5f - (r6.A05 * r6.A03), (r6.A06 * r6.A04) - 8.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public static void A03(C43391uK r4) {
        r4.A0F.A01();
        r4.A0F.A05(r4.A05, r4.A06, r4.A07);
        r4.A0F.A04(1.0f / r4.A00, 1.0f);
        r4.A0F.A03(r4.A02);
        r4.A0F.A04(r4.A03 * r4.A00, r4.A04);
    }

    public final void A04(float f) {
        this.A02 = f;
        A03(this);
        A02(this);
    }

    public final void A05(float f) {
        this.A05 = f;
        A03(this);
        A02(this);
    }

    public final void A06(float f) {
        this.A06 = f;
        A03(this);
        A02(this);
    }

    public final void A07(float f, float f2) {
        this.A03 = f;
        this.A04 = f2;
        A03(this);
        A02(this);
    }

    public final String toString() {
        return String.format("\n\ntranslationX=%f \ntranslationY=%f \ntranslationZ=%f \nscaleX=%f \nscaleY=%f\nrotateZ=%f \nmediaAspectRatio=%f \norientation=%d \nisMirrored=%b", new Object[]{Float.valueOf(this.A05), Float.valueOf(this.A06), Float.valueOf(this.A07), Float.valueOf(this.A03), Float.valueOf(this.A04), Float.valueOf(this.A02), Float.valueOf(this.A01), Integer.valueOf(this.A08), Boolean.valueOf(this.A0D)});
    }

    public C43391uK() {
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A08 = 1;
        this.A0D = false;
        this.A0C = false;
        this.A0F = new Matrix4();
        this.A0E = new Matrix4();
        this.A0B = new Matrix4();
        this.A0A = new Matrix4();
    }

    public C43391uK(int i, AnonymousClass0C1 r3) {
        this(i, C89113td.A00(r3));
    }

    public C43391uK(int i, boolean z) {
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A08 = 1;
        this.A0D = false;
        this.A0C = false;
        this.A0F = new Matrix4();
        this.A0E = new Matrix4();
        this.A0B = new Matrix4();
        this.A0A = new Matrix4();
        this.A09 = i;
        this.A0C = z;
        A02(this);
        A03(this);
        float[] fArr = new float[16];
        System.arraycopy(this.A0F.A01, 0, fArr, 0, 16);
        this.A0B = new Matrix4(fArr);
        float[] fArr2 = new float[16];
        System.arraycopy(this.A0E.A01, 0, fArr2, 0, 16);
        this.A0A = new Matrix4(fArr2);
    }
}
