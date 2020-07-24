package p000X;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.A5f */
public class A5f extends A5e {
    public float A00 = 1.0f;
    public int A01;
    public int A02 = 1;
    public Path A03;
    public float[] A04;
    public float[] A05;
    public float[] A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    public A5f(C23043A0y a0y) {
        super(r4);
        Path path;
        Path.Direction direction;
        double d;
        C23043A0y a0y2 = a0y;
        float[] A022 = C23080A5o.A02(a0y2, "d");
        if (A022 == null) {
            path = null;
        } else {
            path = new Path();
            path.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            int i = 0;
            while (i < A022.length) {
                int i2 = i + 1;
                int i3 = (int) A022[i];
                if (i3 != 0) {
                    boolean z = true;
                    if (i3 == 1) {
                        path.close();
                        i = i2;
                    } else if (i3 == 2) {
                        int i4 = i2 + 1;
                        float f = A022[i2];
                        float f2 = this.A02;
                        i = i4 + 1;
                        path.lineTo(f * f2, A022[i4] * f2);
                    } else if (i3 == 3) {
                        int i5 = i2 + 1;
                        float f3 = A022[i2];
                        float f4 = this.A02;
                        int i6 = i5 + 1;
                        float f5 = f4 * A022[i5];
                        int i7 = i6 + 1;
                        float f6 = f4 * A022[i6];
                        int i8 = i7 + 1;
                        float f7 = f4 * A022[i7];
                        int i9 = i8 + 1;
                        i = i9 + 1;
                        path.cubicTo(f3 * f4, f5, f6, f7, f4 * A022[i8], A022[i9] * f4);
                    } else if (i3 == 4) {
                        int i10 = i2 + 1;
                        float f8 = A022[i2];
                        float f9 = this.A02;
                        float f10 = f8 * f9;
                        int i11 = i10 + 1;
                        float f11 = A022[i10] * f9;
                        int i12 = i11 + 1;
                        float f12 = A022[i11] * f9;
                        int i13 = i12 + 1;
                        float degrees = (float) Math.toDegrees((double) A022[i12]);
                        int i14 = i13 + 1;
                        float degrees2 = (float) Math.toDegrees((double) A022[i13]);
                        i = i14 + 1;
                        z = A022[i14] == 1.0f ? false : z;
                        float f13 = degrees2 - degrees;
                        if (Math.abs(f13) >= 360.0f) {
                            if (z) {
                                direction = Path.Direction.CCW;
                            } else {
                                direction = Path.Direction.CW;
                            }
                            path.addCircle(f10, f11, f12, direction);
                        } else {
                            float f14 = f13 % 360.0f;
                            f14 = f14 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? f14 + 360.0f : f14;
                            if (z && f14 < 360.0f) {
                                f14 = (360.0f - f14) * -1.0f;
                            }
                            path.arcTo(new RectF(f10 - f12, f11 - f12, f10 + f12, f11 + f12), degrees, f14);
                        }
                    } else {
                        throw new A0k(AnonymousClass000.A05("Unrecognized drawing instruction ", i3));
                    }
                } else {
                    int i15 = i2 + 1;
                    float f15 = A022[i2];
                    float f16 = this.A02;
                    i = i15 + 1;
                    path.moveTo(f15 * f16, A022[i15] * f16);
                }
            }
        }
        this.A03 = path;
        this.A05 = C23080A5o.A02(a0y2, "stroke");
        this.A06 = C23080A5o.A02(a0y2, "strokeDash");
        this.A04 = C23080A5o.A02(a0y2, "fill");
        if (a0y2.hasKey("strokeWidth")) {
            d = a0y2.getDouble("strokeWidth");
        } else {
            d = (double) 1.0f;
        }
        this.A00 = (float) d;
        this.A01 = a0y2.hasKey("strokeCap") ? a0y2.getInt("strokeCap") : 0;
        this.A02 = a0y2.hasKey("strokeJoin") ? a0y2.getInt("strokeJoin") : 1;
    }

    public final boolean A03(Paint paint, float f) {
        float f2;
        float[] fArr;
        float[] fArr2 = this.A04;
        int i = 0;
        if (fArr2 == null || fArr2.length <= 0) {
            return false;
        }
        Paint paint2 = paint;
        paint2.reset();
        paint2.setFlags(1);
        paint2.setStyle(Paint.Style.FILL);
        float[] fArr3 = this.A04;
        int i2 = (int) fArr3[0];
        if (i2 != 0) {
            if (i2 != 1) {
                AnonymousClass0CH.A07("ReactNative", AnonymousClass000.A06("ART: Color type ", i2, " not supported!"));
            } else {
                int length = fArr3.length;
                int i3 = 5;
                if (length < 5) {
                    AnonymousClass0CH.A07("ReactNative", AnonymousClass000.A05("[ARTShapeShadowNode setupFillPaint] expects 5 elements, received ", length));
                    return false;
                }
                float f3 = fArr3[1];
                float f4 = this.A02;
                float f5 = f3 * f4;
                float f6 = fArr3[2] * f4;
                float f7 = fArr3[3] * f4;
                float f8 = fArr3[4] * f4;
                int i4 = (length - 5) / 5;
                int[] iArr = null;
                if (i4 > 0) {
                    iArr = new int[i4];
                    fArr = new float[i4];
                    while (i < i4) {
                        float[] fArr4 = this.A04;
                        fArr[i] = fArr4[(i4 << 2) + i3 + i];
                        int i5 = (i << 2) + i3;
                        iArr[i] = Color.argb((int) (fArr4[i5 + 3] * 255.0f), (int) (fArr4[i5] * 255.0f), (int) (fArr4[i5 + 1] * 255.0f), (int) (fArr4[i5 + 2] * 255.0f));
                        i++;
                        i3 = 5;
                    }
                } else {
                    fArr = null;
                }
                paint2.setShader(new LinearGradient(f5, f6, f7, f8, iArr, fArr, Shader.TileMode.CLAMP));
            }
            return true;
        }
        if (fArr3.length > 4) {
            f2 = fArr3[4] * f * 255.0f;
        } else {
            f2 = f * 255.0f;
        }
        paint2.setARGB((int) f2, (int) (fArr3[1] * 255.0f), (int) (fArr3[2] * 255.0f), (int) (fArr3[3] * 255.0f));
        return true;
    }

    public final boolean A04(Paint paint, float f) {
        float[] fArr;
        Paint.Cap cap;
        Paint.Join join;
        float f2;
        int length;
        if (this.A00 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || (fArr = this.A05) == null || fArr.length == 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        int i = this.A01;
        if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            throw new A0k(AnonymousClass000.A06("strokeCap ", i, " unrecognized"));
        }
        paint.setStrokeCap(cap);
        int i2 = this.A02;
        if (i2 == 0) {
            join = Paint.Join.MITER;
        } else if (i2 == 1) {
            join = Paint.Join.ROUND;
        } else if (i2 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            throw new A0k(AnonymousClass000.A06("strokeJoin ", i2, " unrecognized"));
        }
        paint.setStrokeJoin(join);
        paint.setStrokeWidth(this.A00 * this.A02);
        float[] fArr2 = this.A05;
        if (fArr2.length > 3) {
            f2 = fArr2[3] * f * 255.0f;
        } else {
            f2 = f * 255.0f;
        }
        paint.setARGB((int) f2, (int) (fArr2[0] * 255.0f), (int) (fArr2[1] * 255.0f), (int) (fArr2[2] * 255.0f));
        float[] fArr3 = this.A06;
        if (fArr3 != null && (length = fArr3.length) > 0) {
            float[] fArr4 = new float[length];
            for (int i3 = 0; i3 < length; i3++) {
                fArr4[i3] = fArr3[i3] * this.A02;
            }
            paint.setPathEffect(new DashPathEffect(fArr4, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
        return true;
    }
}
