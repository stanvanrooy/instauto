package com.instagram.creation.photo.edit.surfacecropfilter;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.math.Matrix3;
import com.instagram.common.math.Matrix4;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0NL;
import p000X.AnonymousClass0NN;
import p000X.AnonymousClass0NO;
import p000X.AnonymousClass83A;
import p000X.AnonymousClass83D;
import p000X.AnonymousClass83E;
import p000X.AnonymousClass83F;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U4;
import p000X.AnonymousClass8UE;
import p000X.C183337sH;
import p000X.C1883882n;
import p000X.C1884582v;
import p000X.C1892986r;
import p000X.C89133th;
import p000X.C89433uD;

public class SurfaceCropFilter extends BaseSimpleFilter {
    public static final double A0M;
    public static final double A0N;
    public static final AnonymousClass83F[] A0O;
    public static final AnonymousClass0NO[] A0P;
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(310);
    public float A00;
    public float A01;
    public int A02;
    public Matrix4 A03;
    public Matrix4 A04;
    public Matrix4 A05;
    public C1883882n A06;
    public AnonymousClass83D A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public float A0C;
    public int A0D;
    public int A0E;
    public AnonymousClass8UE A0F;
    public AnonymousClass8U4 A0G;
    public boolean A0H;
    public boolean A0I;
    public final C1883882n A0J;
    public final PointF A0K;
    public final C1884582v A0L;

    private synchronized void A03() {
        A09(this);
        if (this.A06.A06 > this.A0C) {
            A0U(this.A0L);
            A0R(this.A0L, false);
        }
        invalidate();
    }

    private synchronized void A04() {
        AnonymousClass83D r2 = this.A07;
        r2.A03 = false;
        r2.A00 = false;
        r2.A01 = true;
        r2.A02 = true;
        r2.A04 = false;
        A06();
    }

    private synchronized void A05() {
        AnonymousClass83D r1 = this.A07;
        r1.A03 = false;
        r1.A00 = false;
        r1.A01 = true;
        r1.A02 = true;
        r1.A04 = true;
        A06();
    }

    private synchronized void A06() {
        Matrix4 matrix4;
        if (this.A07.A03) {
            this.A05.A01();
            float[] fArr = new float[16];
            Matrix.frustumM(fArr, 0, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 4.0f);
            this.A05.A09(fArr);
            Matrix4 matrix42 = new Matrix4();
            matrix42.A05(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -2.0f);
            this.A05.A06(matrix42);
            Matrix4 matrix43 = new Matrix4();
            matrix43.A03(-this.A06.A05);
            this.A05.A06(matrix43);
            float f = this.A06.A04;
            Matrix4 matrix44 = new Matrix4();
            Matrix.rotateM(matrix44.A01, 0, f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A05.A06(matrix44);
            float f2 = this.A06.A03;
            Matrix4 matrix45 = new Matrix4();
            matrix45.A02(f2);
            this.A05.A06(matrix45);
            float f3 = (float) (this.A06.A07 + this.A02);
            Matrix4 matrix46 = new Matrix4();
            matrix46.A03(f3);
            this.A05.A06(matrix46);
            float f4 = this.A00;
            if (f4 < 1.0f) {
                matrix4 = new Matrix4();
                matrix4.A04(f4, 1.0f);
            } else {
                matrix4 = new Matrix4();
                matrix4.A04(1.0f, 1.0f / f4);
            }
            this.A05.A06(matrix4);
            float f5 = Float.MAX_VALUE;
            for (int i = 0; i < 4; i++) {
                AnonymousClass83F A002 = this.A05.A00(A0O[i]);
                float f6 = A002.A01;
                float f7 = A002.A00;
                f5 = Math.min(f5, Math.min(1.0f / Math.abs(f6 / f7), 1.0f / Math.abs(A002.A02 / f7)));
            }
            Matrix4 matrix47 = new Matrix4();
            matrix47.A04(f5, f5);
            matrix47.A06(this.A05);
            this.A05 = matrix47;
        }
        if (this.A07.A00) {
            Matrix4 matrix48 = this.A05;
            C1883882n r0 = this.A06;
            float A003 = A00(matrix48, r0.A01, r0.A02);
            C1883882n r2 = this.A06;
            r2.A06 *= A003 / r2.A00;
            r2.A00 = A003;
        }
        if (this.A07.A01) {
            Matrix4 matrix49 = this.A05;
            C1883882n r02 = this.A06;
            PointF A022 = A02(matrix49, r02.A01, r02.A02);
            this.A03.A01();
            float f8 = this.A01;
            if (f8 < 1.0f) {
                Matrix4 matrix410 = this.A03;
                float f9 = this.A06.A06;
                matrix410.A04(f9 / f8, f9);
            } else {
                Matrix4 matrix411 = this.A03;
                float f10 = this.A06.A06;
                matrix411.A04(f10, f10 * f8);
            }
            Matrix4 matrix412 = new Matrix4();
            matrix412.A05(-A022.x, -A022.y, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A03.A06(matrix412);
        }
        if (this.A07.A02) {
            this.A04.A07(this.A03);
            this.A04.A06(this.A05);
            float f11 = 1.0f;
            if (this.A09) {
                f11 = -1.0f;
            }
            Matrix4 matrix413 = new Matrix4();
            matrix413.A04(f11, -1.0f);
            this.A04.A06(matrix413);
        }
        if (this.A07.A04) {
            invalidate();
        }
        AnonymousClass83D r1 = this.A07;
        r1.A03 = false;
        r1.A00 = false;
        r1.A01 = false;
        r1.A02 = false;
        r1.A04 = false;
    }

    private synchronized void A07() {
        AnonymousClass83D r1 = this.A07;
        r1.A03 = true;
        r1.A00 = true;
        r1.A01 = false;
        r1.A02 = false;
        r1.A04 = false;
        A06();
    }

    private synchronized void A08(float f, float f2) {
        C1883882n r1 = this.A06;
        r1.A01 = f;
        r1.A02 = f2;
        r1.A00 = A00(this.A05, f, f2);
    }

    public static synchronized void A09(SurfaceCropFilter surfaceCropFilter) {
        synchronized (surfaceCropFilter) {
            AnonymousClass83D r1 = surfaceCropFilter.A07;
            r1.A03 = true;
            r1.A00 = true;
            r1.A01 = true;
            r1.A02 = true;
            r1.A04 = true;
            surfaceCropFilter.A06();
        }
    }

    public static AnonymousClass0NO[] A0A(Matrix4 matrix4) {
        AnonymousClass0NO[] r6 = new AnonymousClass0NO[4];
        for (int i = 0; i < 4; i++) {
            AnonymousClass83F A002 = matrix4.A00(A0O[i]);
            float f = A002.A01;
            float f2 = A002.A00;
            r6[i] = new AnonymousClass0NO((double) (f / f2), (double) (A002.A02 / f2));
        }
        AnonymousClass0NN.A00(r6);
        return r6;
    }

    public final synchronized void A0E(AnonymousClass8U1 r3, C89433uD r4, C89133th r5, AnonymousClass85B r6) {
        r3.A03("image", r5.getTextureId());
        this.A0F.A02(true);
        this.A0G.A02(this.A04.A00);
    }

    public final synchronized void A0I(float f) {
        C1883882n r1 = this.A06;
        if (r1.A03 != f) {
            r1.A03 = f;
            A03();
        }
    }

    public final synchronized void A0J(float f) {
        C1883882n r1 = this.A06;
        if (r1.A04 != f) {
            r1.A04 = f;
            A03();
        }
    }

    public final synchronized void A0K(float f) {
        C1883882n r1 = this.A06;
        if (r1.A05 != f) {
            r1.A05 = f;
            A03();
        }
    }

    public final synchronized void A0L(float f, float f2) {
        Matrix4 matrix4 = this.A05;
        C1883882n r0 = this.A06;
        PointF A022 = A02(matrix4, r0.A01, r0.A02);
        float f3 = A022.x;
        float f4 = this.A06.A06;
        float f5 = f3 + (((-f) * 2.0f) / f4);
        A022.x = f5;
        float f6 = A022.y + ((f2 * 2.0f) / f4);
        A022.y = f6;
        PointF A012 = A01(f5, f6);
        A08(A012.x, A012.y);
        A05();
    }

    public final synchronized void A0M(float f, float f2, float f3) {
        Matrix4 matrix4 = this.A05;
        C1883882n r0 = this.A06;
        PointF A022 = A02(matrix4, r0.A01, r0.A02);
        float f4 = (f - 0.5f) * 2.0f;
        float f5 = (-(f2 - 0.5f)) * 2.0f;
        float f6 = A022.x;
        C1883882n r3 = this.A06;
        float f7 = r3.A06;
        float f8 = f6 + (f4 / f7);
        float f9 = f7 * f3;
        r3.A06 = f9;
        float f10 = f8 - (f4 / f9);
        A022.x = f10;
        float f11 = (A022.y + (f5 / f7)) - (f5 / f9);
        A022.y = f11;
        PointF A012 = A01(f10, f11);
        A08(A012.x, A012.y);
        A05();
    }

    public final synchronized void A0N(int i, int i2, Rect rect, int i3) {
        A0O(i, i2, rect, i3, false);
    }

    public final synchronized void A0O(int i, int i2, Rect rect, int i3, boolean z) {
        this.A0H = z;
        this.A0A = false;
        float f = (float) i;
        float f2 = (float) i2;
        this.A00 = f / f2;
        A07();
        AnonymousClass83A r2 = new AnonymousClass83A(f, f2, rect);
        this.A06.A06 = 1.0f;
        PointF A012 = A01(r2.A00, -r2.A01);
        A08(A012.x, A012.y);
        A04();
        this.A06.A06 = r2.A02;
        A05();
        int i4 = i2;
        if (i > i2) {
            i4 = i;
        }
        float f3 = ((float) i4) / 320.0f;
        this.A0C = f3;
        this.A0C = Math.max(this.A06.A06 * 3.8f, f3);
        if (i3 != 0) {
            if (!this.A09) {
                i3 = -i3;
            }
            this.A02 = i3;
        }
        if (this.A02 % 180 == 0) {
            this.A0E = i;
            this.A0D = i2;
            this.A01 = ((float) rect.width()) / ((float) rect.height());
        } else {
            this.A0E = i2;
            this.A0D = i;
            this.A01 = ((float) rect.height()) / ((float) rect.width());
        }
        if (this.A0I) {
            this.A0I = false;
            this.A06.A00(this.A0J);
        }
        synchronized (this) {
            AnonymousClass83D r1 = this.A07;
            r1.A03 = true;
            r1.A00 = false;
            r1.A01 = true;
            r1.A02 = true;
            r1.A04 = true;
            A06();
        }
    }

    public final synchronized void A0P(C1884582v r3) {
        C1883882n r1 = this.A06;
        r3.A02 = r1.A06;
        r3.A00 = r1.A01;
        r3.A01 = r1.A02;
    }

    public final synchronized void A0Q(C1884582v r2) {
        A0R(r2, true);
    }

    public final synchronized void A0R(C1884582v r3, boolean z) {
        this.A06.A06 = r3.A02;
        A08(r3.A00, r3.A01);
        AnonymousClass83D r1 = this.A07;
        r1.A03 = false;
        r1.A00 = false;
        r1.A01 = true;
        r1.A02 = true;
        r1.A04 = z;
        A06();
    }

    public final synchronized void A0S(C1883882n r2) {
        r2.A00(this.A06);
    }

    public final synchronized void A0T(C1883882n r3) {
        C1883882n r1 = this.A06;
        r1.A03 = r3.A03;
        r1.A04 = r3.A04;
        r1.A05 = r3.A05;
        r1.A07 = r3.A07;
        A07();
        C1883882n r12 = this.A06;
        r12.A06 = r3.A06;
        r12.A00 = r3.A00;
        r12.A01 = r3.A01;
        r12.A02 = r3.A02;
        A05();
    }

    static {
        AnonymousClass0NO[] r7 = new AnonymousClass0NO[4];
        A0P = r7;
        AnonymousClass83F[] r6 = new AnonymousClass83F[4];
        A0O = r6;
        r7[0] = new AnonymousClass0NO(-1.0d, 1.0d);
        r7[1] = new AnonymousClass0NO(-1.0d, -1.0d);
        r7[2] = new AnonymousClass0NO(1.0d, -1.0d);
        r7[3] = new AnonymousClass0NO(1.0d, 1.0d);
        double d = r7[2].A00 - r7[1].A00;
        A0M = d;
        A0N = d * 1.001d;
        for (int i = 0; i < 4; i++) {
            AnonymousClass0NO r2 = r7[i];
            r6[i] = new AnonymousClass83F((float) r2.A00, (float) r2.A01);
        }
    }

    private float A00(Matrix4 matrix4, float f, float f2) {
        float f3;
        Matrix4 matrix42 = matrix4;
        PointF A022 = A02(matrix42, f, f2);
        float f4 = this.A01;
        if (f4 > 1.0f) {
            A022.x /= f4;
        } else if (f4 < 1.0f) {
            A022.y *= f4;
        }
        PointF[] pointFArr = new PointF[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            AnonymousClass83F r0 = A0O[i2];
            PointF A023 = A02(matrix42, r0.A01, r0.A02);
            float f5 = this.A01;
            if (f5 > 1.0f) {
                A023.x /= f5;
            } else if (f5 < 1.0f) {
                A023.y *= f5;
            }
            pointFArr[i2] = A023;
        }
        float f6 = Float.MAX_VALUE;
        while (i < 4) {
            PointF pointF = pointFArr[i];
            float f7 = pointF.x;
            float f8 = pointF.y;
            i++;
            PointF pointF2 = pointFArr[i % 4];
            float f9 = pointF2.x;
            float f10 = pointF2.y;
            float f11 = A022.x;
            float f12 = A022.y;
            if (Math.abs(f7 - f9) < 1.0E-7f) {
                f3 = Math.abs(f11 - f7);
            } else {
                float f13 = (f10 - f8) / (f9 - f7);
                f3 = Float.MAX_VALUE;
                if (Math.abs(f13 - 1.0f) > 1.0E-7f) {
                    f3 = Math.min(Float.MAX_VALUE, Math.abs((((f8 - (f13 * f7)) - (f12 - f11)) / (1.0f - f13)) - f11));
                }
                float f14 = 1.0f + f13;
                if (Math.abs(f14) > 1.0E-7f) {
                    f3 = Math.min(f3, Math.abs(((((f13 * f7) - f8) + (f12 + f11)) / f14) - f11));
                }
            }
            f6 = Math.min(f6, f3);
        }
        return 1.0f / f6;
    }

    private PointF A01(float f, float f2) {
        Matrix3 matrix3 = new Matrix3();
        float[] fArr = this.A05.A01;
        float[] fArr2 = matrix3.A01;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[3];
        fArr2[3] = fArr[4];
        fArr2[4] = fArr[5];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[12];
        fArr2[7] = fArr[13];
        float f3 = fArr[15];
        fArr2[8] = f3;
        AnonymousClass83E r3 = new AnonymousClass83E(f, f2);
        float f4 = fArr2[0];
        float f5 = fArr2[4];
        float f6 = fArr2[7];
        float f7 = fArr2[5];
        float f8 = (f5 * f3) - (f6 * f7);
        float f9 = fArr2[3];
        float f10 = fArr2[2];
        float f11 = fArr2[1];
        float f12 = (f4 * f8) + (f9 * ((f6 * f10) - (f11 * f3))) + (fArr2[6] * ((f11 * f7) - (f5 * f10)));
        float[] fArr3 = {f8, (fArr2[7] * fArr2[2]) - (fArr2[1] * fArr2[8]), (fArr2[1] * fArr2[5]) - (fArr2[4] * fArr2[2]), (fArr2[6] * fArr2[5]) - (fArr2[3] * fArr2[8]), (fArr2[0] * fArr2[8]) - (fArr2[6] * fArr2[2]), (fArr2[3] * fArr2[2]) - (fArr2[0] * fArr2[5]), (fArr2[3] * fArr2[7]) - (fArr2[6] * fArr2[4]), (fArr2[6] * fArr2[1]) - (fArr2[0] * fArr2[7]), (fArr2[0] * fArr2[4]) - (fArr2[3] * fArr2[1])};
        for (int i = 0; i < 9; i++) {
            fArr2[i] = fArr3[i] / f12;
        }
        float f13 = fArr2[0];
        float f14 = r3.A00;
        float f15 = fArr2[3];
        float f16 = r3.A01;
        float f17 = (f13 * f14) + (f15 * f16);
        float f18 = fArr2[6];
        float f19 = r3.A02;
        float f20 = f17 + (f18 * f19);
        float f21 = (fArr2[1] * f14) + (fArr2[4] * f16) + (fArr2[7] * f19);
        float f22 = (fArr2[2] * f14) + (fArr2[5] * f16) + (fArr2[8] * f19);
        return new PointF(f20 / f22, f21 / f22);
    }

    public static PointF A02(Matrix4 matrix4, float f, float f2) {
        AnonymousClass83F A002 = matrix4.A00(new AnonymousClass83F(f, f2));
        float f3 = A002.A01;
        float f4 = A002.A00;
        return new PointF(f3 / f4, A002.A02 / f4);
    }

    public final AnonymousClass8U1 A0C(C89433uD r3) {
        int A002 = ShaderBridge.A00("Identity");
        if (A002 == 0) {
            return null;
        }
        AnonymousClass8U1 r1 = new AnonymousClass8U1(A002);
        this.A0F = (AnonymousClass8UE) r1.A00("u_enableVertexTransform");
        this.A0G = (AnonymousClass8U4) r1.A00("u_vertexTransform");
        return r1;
    }

    public final void A0F(AnonymousClass85B r3) {
        if (this.A0B) {
            GLES20.glBindFramebuffer(36160, r3.AMH());
            C1892986r.A04("SurfaceCropFilter.clearFrameBuffer:glBindFramebuffer");
            GLES20.glClearColor(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            GLES20.glClear(DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        }
    }

    public final Point A0H() {
        int i;
        int i2;
        int i3 = this.A0E;
        int i4 = this.A0D;
        if (i3 > i4) {
            float f = (float) i3;
            float f2 = this.A06.A06;
            i2 = (int) ((f / f2) + 0.5f);
            i = (int) ((f / (f2 * this.A01)) + 0.5f);
        } else {
            float f3 = (float) i4;
            float f4 = this.A06.A06;
            i = (int) ((f3 / f4) + 0.5f);
            i2 = (int) (((this.A01 * f3) / f4) + 0.5f);
        }
        if (this.A08 || C183337sH.A02(((float) i2) / ((float) i), this.A02, this.A0H)) {
            return new Point(i2, i);
        }
        throw new IllegalStateException(AnonymousClass000.A0E("Aspect ratio error: ", StringFormatUtil.formatStrLocaleSafe("size:%d x %d  input:%d x %d  scale:%f cropAspectRatio:%f", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(this.A06.A06), Float.valueOf(this.A01))));
    }

    public final synchronized boolean A0U(C1884582v r34) {
        boolean z;
        boolean z2;
        float f;
        boolean z3;
        AnonymousClass0NO r8;
        int length;
        float f2;
        synchronized (this) {
            AnonymousClass0NO[] A0A2 = A0A(this.A04);
            AnonymousClass0NO[] r14 = A0P;
            int length2 = r14.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    z = true;
                    break;
                } else if (!AnonymousClass0NN.A02(A0A2, r14[i])) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            float f3 = this.A06.A06;
            if (z) {
                float f4 = this.A0C;
                f = f4;
                if (f3 <= f4) {
                    z2 = false;
                }
            } else {
                int i2 = 0;
                double d = -1.7976931348623157E308d;
                double d2 = Double.MAX_VALUE;
                double d3 = Double.MAX_VALUE;
                double d4 = -1.7976931348623157E308d;
                for (AnonymousClass0NO r15 : A0A2) {
                    double d5 = r15.A00;
                    d3 = Math.min(d3, d5);
                    d4 = Math.max(d4, d5);
                    double d6 = r15.A01;
                    d2 = Math.min(d2, d6);
                    d = Math.max(d, d6);
                }
                double min = Math.min(d4 - d3, d - d2);
                double d7 = 0.0d;
                AnonymousClass0NO[] A042 = AnonymousClass0NN.A04(A0A2, min);
                if (A042.length > 0) {
                    d7 = min;
                }
                while (min - d7 > 0.01d) {
                    double d8 = (min + d7) / 2.0d;
                    AnonymousClass0NO[] A043 = AnonymousClass0NN.A04(A0A2, d8);
                    if (A043.length > 0) {
                        d7 = d8;
                        A042 = A043;
                    } else {
                        min = d8;
                    }
                }
                AnonymousClass0NO r5 = new AnonymousClass0NO();
                while (true) {
                    length = A042.length;
                    if (i2 >= length) {
                        break;
                    }
                    double d9 = r5.A00;
                    AnonymousClass0NO r6 = A042[i2];
                    r5.A00 = d9 + r6.A00;
                    r5.A01 += r6.A01;
                    i2++;
                }
                double d10 = (double) length;
                double d11 = r5.A00 / d10;
                r5.A00 = d11;
                double d12 = r5.A01 / d10;
                double d13 = d7 / 2.0d;
                AnonymousClass0NL r24 = new AnonymousClass0NL(d11 - d13, d12 - d13, d11 + d13, d12 + d13);
                double max = Math.max(r24.A02 - r24.A01, r24.A00 - r24.A03);
                double d14 = A0N;
                if (max < d14) {
                    f2 = this.A06.A06 * ((float) (d14 / max));
                } else {
                    f2 = this.A06.A06;
                }
                f = Math.min(f2, this.A0C);
            }
            this.A06.A06 = f;
            A04();
            AnonymousClass0NO[] A0A3 = A0A(this.A04);
            int length3 = r14.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    z3 = true;
                    break;
                } else if (!AnonymousClass0NN.A02(A0A3, r14[i3])) {
                    z3 = false;
                    break;
                } else {
                    i3++;
                }
            }
            this.A0K.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            if (!z3) {
                PointF pointF = this.A0K;
                AnonymousClass0NO[] A044 = AnonymousClass0NN.A04(A0A3, A0M);
                int length4 = A044.length;
                int i4 = length4;
                if (length4 != 0) {
                    AnonymousClass0NO r9 = new AnonymousClass0NO(0.0d, 0.0d);
                    int i5 = 0;
                    if (length4 == 1) {
                        r9 = A044[0].clone();
                    } else if (!AnonymousClass0NN.A02(A044, r9)) {
                        AnonymousClass0NO r2 = new AnonymousClass0NO(0.0d, 0.0d);
                        double d15 = Double.MAX_VALUE;
                        while (i5 < i4) {
                            AnonymousClass0NO r17 = A044[i5];
                            i5++;
                            AnonymousClass0NO r16 = A044[i5 % i4];
                            AnonymousClass0NO r1 = r17;
                            AnonymousClass0NO A012 = AnonymousClass0NO.A01(r9, r1);
                            AnonymousClass0NO A013 = AnonymousClass0NO.A01(r16, r1);
                            double d16 = (A013.A00 * A012.A00) + (A013.A01 * A012.A01);
                            AnonymousClass0NO r0 = r16;
                            AnonymousClass0NO r12 = r17;
                            AnonymousClass0NO A014 = AnonymousClass0NO.A01(r0, r12);
                            AnonymousClass0NO A015 = AnonymousClass0NO.A01(r0, r12);
                            double d17 = d16 / ((A015.A00 * A014.A00) + (A015.A01 * A014.A01));
                            if (d17 < 0.0d) {
                                r8 = r17.clone();
                            } else if (d17 > 1.0d) {
                                r8 = r16.clone();
                            } else {
                                double d18 = r17.A00;
                                double d19 = d18 + ((r16.A00 - d18) * d17);
                                double d20 = r17.A01;
                                r8 = new AnonymousClass0NO(d19, d20 + ((r16.A01 - d20) * d17));
                            }
                            double d21 = r8.A00 - r9.A00;
                            double d22 = r8.A01 - r9.A01;
                            double d23 = (d21 * d21) + (d22 * d22);
                            if (d23 < d15) {
                                r2 = r8;
                                d15 = d23;
                            }
                        }
                        r9 = r2;
                    }
                    pointF.x = (float) r9.A00;
                    pointF.y = (float) r9.A01;
                } else {
                    pointF.x = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    pointF.y = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                }
            }
            Matrix4 matrix4 = this.A05;
            C1883882n r02 = this.A06;
            PointF A022 = A02(matrix4, r02.A01, r02.A02);
            float f5 = A022.x;
            PointF pointF2 = this.A0K;
            float f6 = pointF2.x;
            float f7 = this.A06.A06;
            PointF A016 = A01(f5 + (f6 / f7), A022.y + (pointF2.y / f7));
            this.A06.A06 = f3;
            A04();
            C1884582v r13 = r34;
            r13.A02 = f;
            r13.A00 = A016.x;
            r13.A01 = A016.y;
            z2 = true;
        }
        return z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A06.A06);
        parcel.writeFloat(this.A06.A00);
        parcel.writeFloat(this.A06.A01);
        parcel.writeFloat(this.A06.A02);
        parcel.writeFloat(this.A06.A03);
        parcel.writeFloat(this.A06.A04);
        parcel.writeFloat(this.A06.A05);
        parcel.writeInt(this.A06.A07);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
    }

    public SurfaceCropFilter(AnonymousClass0C1 r3) {
        super(r3);
        this.A0A = true;
        this.A06 = new C1883882n();
        this.A0J = new C1883882n();
        this.A05 = new Matrix4();
        this.A03 = new Matrix4();
        this.A04 = new Matrix4();
        this.A07 = new AnonymousClass83D(this);
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 1.0f;
        this.A0K = new PointF();
        this.A0L = new C1884582v();
    }

    public SurfaceCropFilter(Parcel parcel) {
        super(parcel);
        this.A0A = true;
        this.A06 = new C1883882n();
        this.A0J = new C1883882n();
        this.A05 = new Matrix4();
        this.A03 = new Matrix4();
        this.A04 = new Matrix4();
        this.A07 = new AnonymousClass83D(this);
        this.A00 = 1.0f;
        boolean z = false;
        this.A0H = false;
        this.A01 = 1.0f;
        this.A0K = new PointF();
        this.A0L = new C1884582v();
        this.A0J.A06 = parcel.readFloat();
        this.A0J.A00 = parcel.readFloat();
        this.A0J.A01 = parcel.readFloat();
        this.A0J.A02 = parcel.readFloat();
        this.A0J.A03 = parcel.readFloat();
        this.A0J.A04 = parcel.readFloat();
        this.A0J.A05 = parcel.readFloat();
        this.A0J.A07 = parcel.readInt();
        this.A09 = parcel.readByte() == 1;
        this.A0B = parcel.readByte() == 1 ? true : z;
        this.A0I = true;
        this.A06.A00(this.A0J);
    }
}
