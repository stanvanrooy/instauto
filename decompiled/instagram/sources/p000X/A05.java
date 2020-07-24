package p000X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.A05 */
public final class A05 extends Drawable {
    public float A00 = Float.NaN;
    public int A01 = 255;
    public int A02 = 0;
    public int A03;
    public Path A04;
    public Path A05;
    public Path A06;
    public PathEffect A07;
    public PointF A08;
    public PointF A09;
    public PointF A0A;
    public PointF A0B;
    public RectF A0C;
    public A07 A0D;
    public A07 A0E;
    public A07 A0F;
    public Integer A0G;
    public boolean A0H = false;
    public float[] A0I;
    public Path A0J;
    public Path A0K;
    public RectF A0L;
    public RectF A0M;
    public RectF A0N;
    public final Context A0O;
    public final Paint A0P = new Paint(1);

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r8 != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (p000X.C230349zs.A00(r3) == false) goto L_0x004c;
     */
    public final RectF A07() {
        float A052 = A05(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 8);
        boolean z = true;
        float A053 = A05(A052, 1);
        float A054 = A05(A052, 3);
        float A055 = A05(A052, 0);
        float A056 = A05(A052, 2);
        A07 a07 = this.A0F;
        if (a07 != null) {
            if (this.A03 != 1) {
                z = false;
            }
            float[] fArr = a07.A02;
            float f = fArr[4];
            float f2 = fArr[5];
            if (I18nUtil.A00().A02(this.A0O)) {
                if (C230349zs.A00(f)) {
                    f = A055;
                }
                if (!C230349zs.A00(f2)) {
                    A056 = f2;
                }
                A055 = f;
                if (z) {
                    A055 = A056;
                }
            } else {
                float f3 = f;
                if (z) {
                    f3 = f2;
                }
                if (!z) {
                    f = f2;
                }
                if (!C230349zs.A00(f3)) {
                    A055 = f3;
                }
            }
            A056 = f;
        }
        return new RectF(A055, A053, A056, A054);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private int A00(int i) {
        float f;
        float f2;
        A07 a07 = this.A0E;
        if (a07 != null) {
            f = a07.A00(i);
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        A07 a072 = this.A0D;
        if (a072 != null) {
            f2 = a072.A00(i);
        } else {
            f2 = 255.0f;
        }
        return ((((int) f2) << 24) & -16777216) | (((int) f) & 16777215);
    }

    private void A01() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        if (this.A0H) {
            this.A0H = false;
            if (this.A05 == null) {
                this.A05 = new Path();
            }
            if (this.A06 == null) {
                this.A06 = new Path();
            }
            if (this.A0K == null) {
                this.A0K = new Path();
            }
            if (this.A04 == null) {
                this.A04 = new Path();
            }
            if (this.A0L == null) {
                this.A0L = new RectF();
            }
            if (this.A0C == null) {
                this.A0C = new RectF();
            }
            if (this.A0M == null) {
                this.A0M = new RectF();
            }
            if (this.A0N == null) {
                this.A0N = new RectF();
            }
            this.A05.reset();
            this.A06.reset();
            this.A0K.reset();
            this.A04.reset();
            this.A0L.set(getBounds());
            this.A0C.set(getBounds());
            this.A0M.set(getBounds());
            this.A0N.set(getBounds());
            RectF A072 = A07();
            RectF rectF = this.A0L;
            rectF.top += A072.top;
            rectF.bottom -= A072.bottom;
            rectF.left += A072.left;
            rectF.right -= A072.right;
            RectF rectF2 = this.A0N;
            rectF2.top += A072.top * 0.5f;
            rectF2.bottom -= A072.bottom * 0.5f;
            rectF2.left += A072.left * 0.5f;
            rectF2.right -= A072.right * 0.5f;
            float f10 = this.A00;
            if (C230349zs.A00(f10)) {
                f10 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            float A062 = A06(f10, Constants.ZERO);
            float A063 = A06(f10, Constants.ONE);
            float A064 = A06(f10, Constants.A0N);
            float A065 = A06(f10, Constants.A0C);
            boolean z = false;
            if (this.A03 == 1) {
                z = true;
            }
            float A066 = A06(Float.NaN, Constants.A0Y);
            float A067 = A06(Float.NaN, Constants.A0j);
            float A068 = A06(Float.NaN, Constants.A0u);
            float A069 = A06(Float.NaN, Constants.A12);
            if (I18nUtil.A00().A02(this.A0O)) {
                if (!C230349zs.A00(A066)) {
                    A062 = A066;
                }
                if (!C230349zs.A00(A067)) {
                    A063 = A067;
                }
                if (!C230349zs.A00(A068)) {
                    A064 = A068;
                }
                if (!C230349zs.A00(A069)) {
                    A065 = A069;
                }
                float f11 = A062;
                if (z) {
                    f11 = A063;
                }
                if (z) {
                    A063 = A062;
                }
                float f12 = A064;
                if (z) {
                    f12 = A065;
                }
                if (z) {
                    A065 = A064;
                }
                A064 = f12;
                A062 = f11;
            } else {
                float f13 = A066;
                if (z) {
                    f13 = A067;
                }
                if (!z) {
                    A066 = A067;
                }
                float f14 = A068;
                if (z) {
                    f14 = A069;
                }
                if (!z) {
                    A068 = A069;
                }
                if (!C230349zs.A00(f13)) {
                    A062 = f13;
                }
                if (!C230349zs.A00(A066)) {
                    A063 = A066;
                }
                if (!C230349zs.A00(f14)) {
                    A064 = f14;
                }
                if (!C230349zs.A00(A068)) {
                    A065 = A068;
                }
            }
            float f15 = A072.left;
            float max = Math.max(A062 - f15, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float f16 = A072.top;
            float max2 = Math.max(A062 - f16, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float f17 = A072.right;
            float max3 = Math.max(A063 - f17, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float max4 = Math.max(A063 - f16, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float max5 = Math.max(A065 - f17, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float f18 = A072.bottom;
            float max6 = Math.max(A065 - f18, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float max7 = Math.max(A064 - f15, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float max8 = Math.max(A064 - f18, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A05.addRoundRect(this.A0L, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, Path.Direction.CW);
            this.A06.addRoundRect(this.A0C, new float[]{A062, A062, A063, A063, A065, A065, A064, A064}, Path.Direction.CW);
            A07 a07 = this.A0F;
            if (a07 != null) {
                f = a07.A00(8) / 2.0f;
            } else {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            float f19 = A062 + f;
            float f20 = A063 + f;
            float f21 = A065 + f;
            float f22 = A064 + f;
            this.A0K.addRoundRect(this.A0M, new float[]{f19, f19, f20, f20, f21, f21, f22, f22}, Path.Direction.CW);
            Path path = this.A04;
            RectF rectF3 = this.A0N;
            float[] fArr = new float[8];
            float f23 = A072.left;
            float f24 = f23 * 0.5f;
            float f25 = A062 - f24;
            if (f23 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f2 = A062 / f23;
            } else {
                f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            fArr[0] = Math.max(f25, f2);
            float f26 = A072.top;
            float f27 = f26 * 0.5f;
            float f28 = A062 - f27;
            if (f26 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f3 = A062 / f26;
            } else {
                f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            fArr[1] = Math.max(f28, f3);
            float f29 = A072.right;
            float f30 = f29 * 0.5f;
            float f31 = A063 - f30;
            if (f29 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f4 = A063 / f29;
            } else {
                f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            fArr[2] = Math.max(f31, f4);
            float f32 = A063 - f27;
            if (f26 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f5 = A063 / f26;
            } else {
                f5 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            fArr[3] = Math.max(f32, f5);
            float f33 = A065 - f30;
            if (f29 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f6 = A065 / f29;
            } else {
                f6 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            fArr[4] = Math.max(f33, f6);
            float f34 = A072.bottom;
            float f35 = f34 * 0.5f;
            float f36 = A065 - f35;
            if (f34 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f7 = A065 / f34;
            } else {
                f7 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            fArr[5] = Math.max(f36, f7);
            float f37 = A064 - f24;
            if (f23 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f8 = A064 / f23;
            } else {
                f8 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            fArr[6] = Math.max(f37, f8);
            float f38 = A064 - f35;
            if (f34 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f9 = A064 / f34;
            } else {
                f9 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            fArr[7] = Math.max(f38, f9);
            path.addRoundRect(rectF3, fArr, Path.Direction.CW);
            if (this.A0A == null) {
                this.A0A = new PointF();
            }
            PointF pointF = this.A0A;
            RectF rectF4 = this.A0L;
            float f39 = rectF4.left;
            pointF.x = f39;
            float f40 = rectF4.top;
            pointF.y = f40;
            double d = (double) f39;
            double d2 = (double) f40;
            double d3 = (double) (f40 + (max2 * 2.0f));
            RectF rectF5 = this.A0C;
            A02(d, d2, (double) (f39 + (max * 2.0f)), d3, (double) rectF5.left, (double) rectF5.top, d, d2, pointF);
            if (this.A08 == null) {
                this.A08 = new PointF();
            }
            PointF pointF2 = this.A08;
            RectF rectF6 = this.A0L;
            float f41 = rectF6.left;
            pointF2.x = f41;
            float f42 = rectF6.bottom;
            pointF2.y = f42;
            double d4 = (double) f41;
            double d5 = (double) f42;
            RectF rectF7 = this.A0C;
            A02(d4, (double) (f42 - (max8 * 2.0f)), (double) (f41 + (max7 * 2.0f)), d5, (double) rectF7.left, (double) rectF7.bottom, d4, d5, pointF2);
            if (this.A0B == null) {
                this.A0B = new PointF();
            }
            PointF pointF3 = this.A0B;
            RectF rectF8 = this.A0L;
            float f43 = rectF8.right;
            pointF3.x = f43;
            float f44 = rectF8.top;
            pointF3.y = f44;
            double d6 = (double) f44;
            double d7 = (double) f43;
            double d8 = (double) (f44 + (max4 * 2.0f));
            RectF rectF9 = this.A0C;
            A02((double) (f43 - (max3 * 2.0f)), d6, d7, d8, (double) rectF9.right, (double) rectF9.top, d7, d6, pointF3);
            if (this.A09 == null) {
                this.A09 = new PointF();
            }
            PointF pointF4 = this.A09;
            RectF rectF10 = this.A0L;
            float f45 = rectF10.right;
            pointF4.x = f45;
            float f46 = rectF10.bottom;
            pointF4.y = f46;
            double d9 = (double) f45;
            double d10 = (double) f46;
            RectF rectF11 = this.A0C;
            A02((double) (f45 - (max5 * 2.0f)), (double) (f46 - (max6 * 2.0f)), d9, d10, (double) rectF11.right, (double) rectF11.bottom, d9, d10, pointF4);
        }
    }

    public static void A02(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = sqrt + d9;
        double d22 = (d13 * sqrt) + d14 + d10;
        if (!Double.isNaN(d21) && !Double.isNaN(d22)) {
            float f = (float) d21;
            PointF pointF2 = pointF;
            pointF2.x = f;
            pointF2.y = (float) d22;
        }
    }

    private void A03(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i != 0) {
            if (this.A0J == null) {
                this.A0J = new Path();
            }
            this.A0P.setColor(i);
            this.A0J.reset();
            this.A0J.moveTo(f, f2);
            this.A0J.lineTo(f3, f4);
            this.A0J.lineTo(f5, f6);
            this.A0J.lineTo(f7, f8);
            this.A0J.lineTo(f, f2);
            canvas.drawPath(this.A0J, this.A0P);
        }
    }

    private boolean A04(int i) {
        float f;
        A07 a07 = this.A0E;
        float f2 = Float.NaN;
        if (a07 != null) {
            f = a07.A00(i);
        } else {
            f = Float.NaN;
        }
        A07 a072 = this.A0D;
        if (a072 != null) {
            f2 = a072.A00(i);
        }
        if (C230349zs.A00(f) || C230349zs.A00(f2)) {
            return false;
        }
        return true;
    }

    public final float A05(float f, int i) {
        A07 a07 = this.A0F;
        if (a07 != null) {
            float f2 = a07.A02[i];
            if (!C230349zs.A00(f2)) {
                return f2;
            }
        }
        return f;
    }

    public final float A06(float f, Integer num) {
        float[] fArr = this.A0I;
        if (fArr != null) {
            float f2 = fArr[num.intValue()];
            if (!C230349zs.A00(f2)) {
                return f2;
            }
        }
        return f;
    }

    public final void A08(float f, int i) {
        if (this.A0I == null) {
            float[] fArr = new float[8];
            this.A0I = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        float[] fArr2 = this.A0I;
        if (!C206858uF.A00(fArr2[i], f)) {
            fArr2[i] = f;
            this.A0H = true;
            invalidateSelf();
        }
    }

    public final void A09(int i, float f) {
        if (this.A0F == null) {
            this.A0F = new A07(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        A07 a07 = this.A0F;
        if (!C206858uF.A00(a07.A02[i], f)) {
            a07.A01(i, f);
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                this.A0H = true;
            }
            invalidateSelf();
        }
    }

    public final void A0A(int i, float f, float f2) {
        if (this.A0E == null) {
            this.A0E = new A07(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        A07 a07 = this.A0E;
        if (!C206858uF.A00(a07.A02[i], f)) {
            a07.A01(i, f);
            invalidateSelf();
        }
        if (this.A0D == null) {
            this.A0D = new A07(255.0f);
        }
        A07 a072 = this.A0D;
        if (!C206858uF.A00(a072.A02[i], f2)) {
            a072.A01(i, f2);
            invalidateSelf();
        }
    }

    public final void A0B(String str) {
        Integer num;
        if (str == null) {
            num = null;
        } else {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.equals("SOLID")) {
                num = Constants.ZERO;
            } else if (upperCase.equals("DASHED")) {
                num = Constants.ONE;
            } else if (upperCase.equals("DOTTED")) {
                num = Constants.A0C;
            } else {
                throw new IllegalArgumentException(upperCase);
            }
        }
        if (this.A0G != num) {
            this.A0G = num;
            this.A0H = true;
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02f8, code lost:
        if (p000X.C230349zs.A00(r8) != false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (p000X.C230349zs.A00(r9) != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    public final void draw(Canvas canvas) {
        DashPathEffect dashPathEffect;
        boolean z;
        float f;
        int i;
        float f2;
        float f3;
        int i2;
        float f4;
        Integer num = this.A0G;
        if (num != null) {
            A07 a07 = this.A0F;
            if (a07 != null) {
                f4 = a07.A02[8];
            }
            f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            dashPathEffect = null;
            switch (num.intValue()) {
                case 1:
                    float f5 = f4 * 3.0f;
                    dashPathEffect = new DashPathEffect(new float[]{f5, f5, f5, f5}, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    break;
                case 2:
                    dashPathEffect = new DashPathEffect(new float[]{f4, f4, f4, f4}, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    break;
            }
        } else {
            dashPathEffect = null;
        }
        this.A07 = dashPathEffect;
        this.A0P.setPathEffect(dashPathEffect);
        float f6 = this.A00;
        if (C230349zs.A00(f6) || f6 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            float[] fArr = this.A0I;
            if (fArr != null) {
                int length = fArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        float f7 = fArr[i3];
                        if (C230349zs.A00(f7) || f7 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            i3++;
                        }
                    }
                }
            }
            z = false;
            Canvas canvas2 = canvas;
            if (z) {
                this.A0P.setStyle(Paint.Style.FILL);
                int A002 = A09.A00(this.A02, this.A01);
                if (Color.alpha(A002) != 0) {
                    this.A0P.setColor(A002);
                    canvas2.drawRect(getBounds(), this.A0P);
                }
                RectF A072 = A07();
                int round = Math.round(A072.left);
                int round2 = Math.round(A072.top);
                int round3 = Math.round(A072.right);
                int round4 = Math.round(A072.bottom);
                if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
                    Rect bounds = getBounds();
                    int A003 = A00(0);
                    int A004 = A00(1);
                    int A005 = A00(2);
                    int A006 = A00(3);
                    boolean z2 = false;
                    if (this.A03 == 1) {
                        z2 = true;
                    }
                    int A007 = A00(4);
                    int A008 = A00(5);
                    if (I18nUtil.A00().A02(this.A0O)) {
                        if (A04(4)) {
                            A003 = A007;
                        }
                        if (A04(5)) {
                            A005 = A008;
                        }
                        i2 = A003;
                        if (z2) {
                            i2 = A005;
                        }
                        if (!z2) {
                            A003 = A005;
                        }
                    } else {
                        int i4 = A007;
                        if (z2) {
                            i4 = A008;
                        }
                        if (!z2) {
                            A007 = A008;
                        }
                        boolean A042 = A04(4);
                        boolean A043 = A04(5);
                        boolean z3 = A042;
                        if (z2) {
                            z3 = A043;
                        }
                        if (!z2) {
                            A042 = A043;
                        }
                        if (z3) {
                            A003 = i4;
                        }
                        i2 = A003;
                        A003 = A005;
                        if (A042) {
                            A003 = A007;
                        }
                    }
                    int i5 = bounds.left;
                    int i6 = bounds.top;
                    int i7 = i2;
                    int i8 = A004;
                    int i9 = A003;
                    int i10 = A006;
                    int i11 = -1;
                    int i12 = -1;
                    if (round > 0) {
                        i12 = i7;
                    }
                    int i13 = -1;
                    if (round2 > 0) {
                        i13 = i8;
                    }
                    int i14 = i12 & i13;
                    int i15 = -1;
                    if (round3 > 0) {
                        i15 = i9;
                    }
                    int i16 = i14 & i15;
                    if (round4 > 0) {
                        i11 = i10;
                    }
                    int i17 = i11 & i16;
                    if (round <= 0) {
                        i7 = 0;
                    }
                    if (round2 <= 0) {
                        i8 = 0;
                    }
                    int i18 = i7 | i8;
                    if (round3 <= 0) {
                        i9 = 0;
                    }
                    int i19 = i18 | i9;
                    if (round4 <= 0) {
                        i10 = 0;
                    }
                    if (i17 != (i19 | i10)) {
                        i17 = 0;
                    }
                    if (i17 == 0) {
                        this.A0P.setAntiAlias(false);
                        int width = bounds.width();
                        int height = bounds.height();
                        if (round > 0) {
                            float f8 = (float) i5;
                            float f9 = (float) (i5 + round);
                            int i20 = i6 + height;
                            Canvas canvas3 = canvas2;
                            A03(canvas3, i2, f8, (float) i6, f9, (float) (i6 + round2), f9, (float) (i20 - round4), f8, (float) i20);
                        }
                        if (round2 > 0) {
                            float f10 = (float) i6;
                            float f11 = (float) (i6 + round2);
                            int i21 = i5 + width;
                            A03(canvas2, A004, (float) i5, f10, (float) (i5 + round), f11, (float) (i21 - round3), f11, (float) i21, f10);
                        }
                        if (round3 > 0) {
                            int i22 = i5 + width;
                            float f12 = (float) i22;
                            int i23 = i6 + height;
                            float f13 = (float) (i22 - round3);
                            A03(canvas2, A003, f12, (float) i6, f12, (float) i23, f13, (float) (i23 - round4), f13, (float) (i6 + round2));
                        }
                        if (round4 > 0) {
                            int i24 = i6 + height;
                            float f14 = (float) i24;
                            int i25 = i5 + width;
                            float f15 = (float) (i24 - round4);
                            A03(canvas2, A006, (float) i5, f14, (float) i25, f14, (float) (i25 - round3), f15, (float) (i5 + round), f15);
                        }
                        this.A0P.setAntiAlias(true);
                        return;
                    } else if (Color.alpha(i17) != 0) {
                        int i26 = bounds.right;
                        int i27 = bounds.bottom;
                        this.A0P.setColor(i17);
                        if (round > 0) {
                            Canvas canvas4 = canvas2;
                            canvas4.drawRect((float) i5, (float) i6, (float) (i5 + round), (float) (i27 - round4), this.A0P);
                        }
                        if (round2 > 0) {
                            float f16 = (float) (i5 + round);
                            canvas2.drawRect(f16, (float) i6, (float) i26, (float) (i6 + round2), this.A0P);
                        }
                        if (round3 > 0) {
                            Canvas canvas5 = canvas2;
                            canvas5.drawRect((float) (i26 - round3), (float) (i6 + round2), (float) i26, (float) i27, this.A0P);
                        }
                        if (round4 > 0) {
                            canvas2.drawRect((float) i5, (float) (i27 - round4), (float) (i26 - round3), (float) i27, this.A0P);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                A01();
                canvas2.save();
                int A009 = A09.A00(this.A02, this.A01);
                if (Color.alpha(A009) != 0) {
                    this.A0P.setColor(A009);
                    this.A0P.setStyle(Paint.Style.FILL);
                    canvas2.drawPath(this.A05, this.A0P);
                }
                RectF A073 = A07();
                boolean z4 = false;
                int A0010 = A00(0);
                int A0011 = A00(1);
                int A0012 = A00(2);
                int A0013 = A00(3);
                float f17 = A073.top;
                if (f17 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || A073.bottom > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || A073.left > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || A073.right > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    A07 a072 = this.A0F;
                    if (a072 != null) {
                        f = a072.A02[8];
                    }
                    f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    int A0014 = A00(8);
                    if (f17 != f || A073.bottom != f || A073.left != f || A073.right != f || A0010 != A0014 || A0011 != A0014 || A0012 != A0014 || A0013 != A0014) {
                        this.A0P.setStyle(Paint.Style.FILL);
                        canvas2.clipPath(this.A06, Region.Op.INTERSECT);
                        canvas2.clipPath(this.A05, Region.Op.DIFFERENCE);
                        if (this.A03 == 1) {
                            z4 = true;
                        }
                        int A0015 = A00(4);
                        int A0016 = A00(5);
                        if (I18nUtil.A00().A02(this.A0O)) {
                            if (A04(4)) {
                                A0010 = A0015;
                            }
                            if (A04(5)) {
                                A0012 = A0016;
                            }
                            i = A0010;
                            if (z4) {
                                i = A0012;
                            }
                            if (!z4) {
                                A0010 = A0012;
                            }
                        } else {
                            int i28 = A0015;
                            if (z4) {
                                i28 = A0016;
                            }
                            if (!z4) {
                                A0015 = A0016;
                            }
                            boolean A044 = A04(4);
                            boolean A045 = A04(5);
                            boolean z5 = A044;
                            if (z4) {
                                z5 = A045;
                            }
                            if (!z4) {
                                A044 = A045;
                            }
                            if (z5) {
                                A0010 = i28;
                            }
                            i = A0010;
                            A0010 = A0012;
                            if (A044) {
                                A0010 = A0015;
                            }
                        }
                        RectF rectF = this.A0C;
                        float f18 = rectF.left;
                        float f19 = rectF.right;
                        float f20 = rectF.top;
                        float f21 = rectF.bottom;
                        if (A073.left > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            PointF pointF = this.A0A;
                            float f22 = pointF.x;
                            float f23 = pointF.y;
                            PointF pointF2 = this.A08;
                            f2 = f20;
                            f3 = f18;
                            A03(canvas2, i, f18, f20, f22, f23, pointF2.x, pointF2.y, f18, f21);
                        } else {
                            f2 = f20;
                            f3 = f18;
                        }
                        if (A073.top > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            PointF pointF3 = this.A0A;
                            float f24 = pointF3.x;
                            float f25 = pointF3.y;
                            PointF pointF4 = this.A0B;
                            A03(canvas2, A0011, f3, f2, f24, f25, pointF4.x, pointF4.y, f19, f20);
                        }
                        if (A073.right > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            PointF pointF5 = this.A0B;
                            float f26 = pointF5.x;
                            float f27 = pointF5.y;
                            PointF pointF6 = this.A09;
                            A03(canvas2, A0010, f19, f20, f26, f27, pointF6.x, pointF6.y, f19, f21);
                        }
                        if (A073.bottom > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            PointF pointF7 = this.A08;
                            float f28 = pointF7.x;
                            float f29 = pointF7.y;
                            PointF pointF8 = this.A09;
                            A03(canvas2, A0013, f18, f21, f28, f29, pointF8.x, pointF8.y, f19, f21);
                        }
                    } else if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        this.A0P.setColor(A09.A00(A0014, this.A01));
                        this.A0P.setStyle(Paint.Style.STROKE);
                        this.A0P.setStrokeWidth(f);
                        canvas2.drawPath(this.A04, this.A0P);
                    }
                }
                canvas2.restore();
                return;
            }
        }
        z = true;
        Canvas canvas22 = canvas;
        if (z) {
        }
    }

    public final int getOpacity() {
        int A002 = A09.A00(this.A02, this.A01) >>> 24;
        if (A002 == 255) {
            return -1;
        }
        if (A002 == 0) {
            return -2;
        }
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
            return;
        }
        float f = this.A00;
        if ((C230349zs.A00(f) || f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) && this.A0I == null) {
            outline.setRect(getBounds());
            return;
        }
        A01();
        outline.setConvexPath(this.A0K);
    }

    public final void setAlpha(int i) {
        if (i != this.A01) {
            this.A01 = i;
            invalidateSelf();
        }
    }

    public A05(Context context) {
        this.A0O = context;
    }

    public final int getAlpha() {
        return this.A01;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A0H = true;
    }
}
