package com.instagram.p009ui.widget.gradientspinner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass1EM;
import p000X.C25913Bc3;
import p000X.C31731Zs;
import p000X.C31741Zt;
import p000X.C31751Zu;
import p000X.C31761Zv;
import p000X.C31781Zx;
import p000X.C31791Zy;
import p000X.C35981hF;
import p000X.C36001hH;
import p000X.C37361jX;

/* renamed from: com.instagram.ui.widget.gradientspinner.GradientSpinner */
public class GradientSpinner extends View {
    public static final C31741Zt A0T = new C31731Zs();
    public static final C31741Zt A0U = new C31751Zu();
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public long A04;
    public long A05;
    public LinearGradient A06;
    public C31761Zv A07;
    public C31781Zx[] A08;
    public float A09;
    public int A0A;
    public C31741Zt A0B;
    public Integer A0C;
    public float[] A0D;
    public float[] A0E;
    public float[] A0F;
    public float[] A0G;
    public float[] A0H;
    public float[] A0I;
    public int[] A0J;
    public int[] A0K;
    public final Matrix A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final RectF A0O;
    public final Paint A0P;
    public final Paint A0Q;
    public final Picture A0R;
    public final AccelerateDecelerateInterpolator A0S;

    private LinearGradient A01(int i, int i2, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3) {
        int[] iArr2 = iArr;
        float[] fArr4 = fArr;
        if (fArr == null || fArr2 == null || fArr3 == null) {
            return C31791Zy.A01(i, i2, iArr);
        }
        int measuredWidth = getMeasuredWidth();
        float f = (float) measuredWidth;
        float measuredHeight = (float) getMeasuredHeight();
        return new LinearGradient(fArr2[0] * f, fArr2[1] * measuredHeight, f * fArr3[0], measuredHeight * fArr3[1], iArr2, fArr4, Shader.TileMode.CLAMP);
    }

    public final void A04() {
        setState(0);
    }

    public final void A05() {
        setState(2);
    }

    public final void A06() {
        setState(1);
    }

    public final void A07() {
        A03(1, 1.0f / ((float) this.A07.A0B));
        this.A04 = SystemClock.elapsedRealtime();
        setAnimMode(1);
    }

    public final void A08() {
        A03(-1, 1.0f / ((float) this.A07.A0B));
        this.A04 = SystemClock.elapsedRealtime();
        setAnimMode(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        if (r2 != 2) goto L_0x0006;
     */
    public void setSpinnerType(int i) {
        if (i == 1) {
            this.A07 = C31761Zv.A0C;
            this.A0B = A0T;
            this.A07 = C31761Zv.A0D;
            this.A0B = A0U;
        }
        this.A08 = new C31781Zx[this.A07.A0B];
        invalidate();
    }

    public static BitmapShader A00(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(i);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(createBitmap, tileMode, tileMode);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
        if (r3.A01 != 1.0f) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ca A[SYNTHETIC] */
    private void A02(float f, Canvas canvas, float f2, float f3) {
        Paint currentPaint;
        Paint paint;
        float f4;
        float f5;
        float interpolation;
        float f6;
        C31741Zt r8;
        float f7;
        int i;
        boolean z;
        RectF rectF;
        int i2;
        C31781Zx r3;
        boolean z2;
        this.A06.getLocalMatrix(this.A0L);
        float elapsedRealtime = (float) (SystemClock.elapsedRealtime() - this.A04);
        float f8 = ((elapsedRealtime / f2) * 360.0f) % 360.0f;
        this.A01 = f8;
        this.A0L.setRotate(f8, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        this.A06.setLocalMatrix(this.A0L);
        this.A02 = ((elapsedRealtime / f3) * 360.0f) % 360.0f;
        getCurrentPaint().setAlpha(getCurrentPaintAlpha());
        this.A0N.setAlpha(getNextPaintAlpha());
        boolean z3 = false;
        for (int i3 = 0; i3 < this.A07.A0B; i3++) {
            int i4 = this.A0A;
            Canvas canvas2 = canvas;
            if (i4 == 1) {
                C31781Zx r4 = this.A08[i3];
                currentPaint = getCurrentPaint();
                paint = this.A0N;
                f4 = this.A02;
                RectF rectF2 = this.A0O;
                f5 = this.A00;
                float f9 = r4.A02;
                if (f9 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    r4.A02 = f9 + f;
                }
                float f10 = r4.A02;
                if (f10 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    r4.A01 += f10;
                    r4.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                } else if (f10 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    r4.A01 += f;
                }
                float f11 = r4.A01;
                if (f11 > 1.0f) {
                    int i5 = r4.A03;
                    if (i5 > 0) {
                        r4.A03 = i5 - 1;
                    }
                    if (r4.A03 != 0) {
                        r4.A01 = f11 % 1.0f;
                    } else {
                        r4.A01 = 1.0f;
                    }
                }
                float f12 = r4.A01;
                if (f12 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    f6 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                } else if (f12 < 0.5f) {
                    f6 = 1.0f - r4.A05.getInterpolation(1.0f - (f12 * 2.0f));
                } else {
                    f6 = r4.A05.getInterpolation(1.0f - ((f12 * 2.0f) - 1.0f));
                }
                r8 = r4.A06;
                f7 = r4.A00;
                int i6 = r4.A07;
                i = r4.A04;
                z = true;
                rectF = rectF2;
                i2 = i6;
            } else {
                if (i4 == 3) {
                    C31781Zx r5 = this.A08[i3];
                    currentPaint = getCurrentPaint();
                    paint = this.A0N;
                    f4 = this.A02;
                    RectF rectF3 = this.A0O;
                    f5 = this.A00;
                    float f13 = r5.A02;
                    if (f13 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        r5.A02 = f13 + f;
                    }
                    float f14 = r5.A02;
                    if (f14 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        r5.A01 += f14;
                        r5.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    } else if (f14 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        r5.A01 += f;
                    }
                    float f15 = r5.A01;
                    if (f15 > 1.0f) {
                        int i7 = r5.A03;
                        if (i7 > 0) {
                            r5.A03 = i7 - 1;
                        }
                        if (r5.A03 != 0) {
                            r5.A01 = f15 % 1.0f;
                        } else {
                            r5.A01 = 1.0f;
                        }
                    }
                    if (r5.A02 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        float f16 = r5.A01;
                        if (f16 < 0.5f) {
                            interpolation = f16 * 2.0f;
                        } else {
                            interpolation = r5.A05.getInterpolation(1.0f - ((f16 * 2.0f) - 1.0f));
                        }
                        f6 = 1.0f - interpolation;
                        r8 = r5.A06;
                        f7 = r5.A00;
                        int i8 = r5.A07;
                        i = r5.A04;
                        z = false;
                        rectF = rectF3;
                        i2 = i8;
                    }
                }
                r3 = this.A08[i3];
                if (r3.A03 == 0) {
                    z2 = true;
                }
                z2 = false;
                if (z2) {
                    z3 = true;
                }
            }
            r8.ACi(canvas2, currentPaint, paint, f5, f7, f4, f6, i2, i, z, rectF);
            r3 = this.A08[i3];
            if (r3.A03 == 0) {
            }
            z2 = false;
            if (z2) {
            }
        }
        if (!z3) {
            A0A();
        }
        postInvalidateOnAnimation();
    }

    private void A03(int i, float f) {
        int i2 = this.A07.A0B;
        while (true) {
            i2--;
            if (i2 >= 0) {
                float interpolation = this.A07.A05.getInterpolation(((float) i2) * f);
                C31781Zx[] r1 = this.A08;
                float f2 = -interpolation;
                C31761Zv r0 = this.A07;
                r1[i2] = new C31781Zx(i2, f2, i, r0.A0B, r0.A00, r0.A05, this.A0B);
            } else {
                return;
            }
        }
    }

    private Paint getCurrentPaint() {
        Paint paint;
        float f;
        int i = this.A03;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            paint = this.A0Q;
        } else {
            boolean z2 = false;
            if (i == 2) {
                z2 = true;
            }
            if (z2) {
                paint = this.A0P;
            } else {
                paint = this.A0M;
            }
        }
        if (this.A0A != 0 || !z) {
            f = this.A00;
        } else {
            f = this.A09;
        }
        paint.setStrokeWidth(f);
        return paint;
    }

    private int getCurrentPaintAlpha() {
        boolean z = false;
        if (this.A05 != -1) {
            z = true;
        }
        if (!z) {
            return 255;
        }
        return Math.round((1.0f - getGradientTransitionProgress()) * 255.0f);
    }

    private int getGradientColorRes() {
        Integer num = this.A0C;
        if (num == null) {
            return C0003R.style.GradientPatternStyle;
        }
        return num.intValue();
    }

    private float getGradientTransitionProgress() {
        long j = this.A05;
        boolean z = false;
        if (j != -1) {
            z = true;
        }
        if (!z) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return this.A0S.getInterpolation(Math.max(Math.min(((float) (SystemClock.elapsedRealtime() - j)) / ((float) this.A07.A01), 1.0f), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
    }

    private int getNextPaintAlpha() {
        boolean z = false;
        if (this.A05 != -1) {
            z = true;
        }
        if (!z) {
            return 0;
        }
        return Math.round(getGradientTransitionProgress() * 255.0f);
    }

    private void setAnimMode(int i) {
        if (this.A0A != i) {
            this.A0A = i;
            invalidate();
        }
    }

    private void setState(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            invalidate();
        }
    }

    public final void A09() {
        A03(-1, 0.5f / ((float) this.A07.A0B));
        this.A04 = SystemClock.elapsedRealtime();
        setAnimMode(3);
    }

    public final void A0A() {
        int i = this.A0A;
        if (i != 0 && i != 2) {
            this.A04 = SystemClock.elapsedRealtime();
            setAnimMode(2);
        }
    }

    public final boolean A0C() {
        if (this.A0A != 1) {
            return false;
        }
        return true;
    }

    public C37361jX getProgressState() {
        return new C37361jX(this.A08, this.A04, this.A0A, this.A03);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z;
        Canvas beginRecording = this.A0R.beginRecording(getWidth(), getHeight());
        int i = this.A0A;
        if (i == 1) {
            C31761Zv r4 = this.A07;
            f = 16.667f / ((float) r4.A02);
            f2 = r4.A07;
            f3 = r4.A0A;
        } else {
            if (i == 2) {
                float f4 = 16.667f / ((float) this.A07.A04);
                this.A06.getLocalMatrix(this.A0L);
                float elapsedRealtime = (float) (SystemClock.elapsedRealtime() - this.A04);
                float f5 = elapsedRealtime / this.A07.A08;
                float f6 = this.A01 % 360.0f;
                float f7 = f6 + ((360.0f - f6) * f5);
                this.A0L.setRotate(f7, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
                this.A06.setLocalMatrix(this.A0L);
                this.A02 = ((elapsedRealtime / this.A07.A0A) * 360.0f) % 360.0f;
                getCurrentPaint().setAlpha(getCurrentPaintAlpha());
                this.A0N.setAlpha(getNextPaintAlpha());
                boolean z2 = false;
                for (int i2 = 0; i2 < this.A07.A0B; i2++) {
                    C31781Zx r1 = this.A08[i2];
                    Paint currentPaint = getCurrentPaint();
                    Paint paint = this.A0N;
                    float f8 = this.A02;
                    RectF rectF = this.A0O;
                    float f9 = this.A00;
                    float f10 = r1.A01;
                    if (f10 < 0.5f) {
                        r1.A01 = 1.0f - f10;
                    }
                    float f11 = r1.A01 + f4;
                    r1.A01 = f11;
                    if (f11 > 1.0f) {
                        r1.A01 = 1.0f;
                    }
                    float interpolation = r1.A05.getInterpolation(1.0f - ((r1.A01 * 2.0f) - 1.0f));
                    C31741Zt r42 = r1.A06;
                    Canvas canvas2 = beginRecording;
                    Paint paint2 = paint;
                    C31741Zt r17 = r42;
                    r17.ACi(canvas2, currentPaint, paint2, f9, r1.A00, f8, interpolation, r1.A07, r1.A04, true, rectF);
                    if (this.A08[i2].A01 != 1.0f) {
                        z2 = true;
                    }
                }
                if (!z2 && f7 >= 360.0f) {
                    setAnimMode(0);
                    this.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    this.A0L.setRotate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
                    this.A06.setLocalMatrix(this.A0L);
                }
                postInvalidateOnAnimation();
            } else if (i == 0) {
                Paint currentPaint2 = getCurrentPaint();
                currentPaint2.setAlpha(getCurrentPaintAlpha());
                beginRecording.drawArc(this.A0O, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 360.0f, false, currentPaint2);
                this.A0N.setAlpha(getNextPaintAlpha());
                if (this.A0N.getAlpha() > 0) {
                    beginRecording.drawArc(this.A0O, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 360.0f, false, this.A0N);
                }
            } else if (i == 3) {
                C31761Zv r43 = this.A07;
                f = 16.667f / ((float) r43.A03);
                f2 = r43.A09;
                f3 = r43.A06;
            }
            z = false;
            if (this.A05 != -1) {
                z = true;
            }
            if (z) {
                if (getGradientTransitionProgress() < 1.0f) {
                    postInvalidateOnAnimation();
                } else {
                    this.A05 = -1;
                    this.A0M.setShader(A01(getMeasuredWidth(), getMeasuredHeight(), this.A0K, this.A0H, this.A0I, this.A0G));
                }
            }
            canvas.drawPicture(this.A0R);
        }
        A02(f, beginRecording, f2, f3);
        z = false;
        if (this.A05 != -1) {
        }
        if (z) {
        }
        canvas.drawPicture(this.A0R);
    }

    public void setActiveStrokeWidth(float f) {
        this.A00 = f;
        invalidate();
    }

    public void setErrorColour(int i) {
        this.A0P.setShader(A00(i));
        boolean z = false;
        if (this.A03 == 2) {
            z = true;
        }
        if (z) {
            invalidate();
        }
    }

    public void setInactiveColour(int i) {
        this.A0Q.setShader(A00(i));
        boolean z = true;
        if (this.A03 != 1) {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    public void setInactiveStrokeWidth(float f) {
        this.A09 = f;
        invalidate();
    }

    public void setProgressState(C37361jX r5) {
        this.A08 = r5.A03;
        this.A04 = SystemClock.elapsedRealtime() - r5.A02;
        this.A0A = r5.A00;
        this.A03 = r5.A01;
        invalidate();
    }

    public final void A0B(C35981hF r8) {
        this.A0K = r8.A04();
        this.A0H = r8.A03();
        C36001hH A012 = r8.A01();
        this.A0I = new float[]{A012.A00, A012.A01};
        C36001hH A002 = r8.A00();
        this.A0G = new float[]{A002.A00, A002.A01};
        this.A0N.setShader(A01(getMeasuredWidth(), getMeasuredHeight(), this.A0K, this.A0H, this.A0I, this.A0G));
        this.A05 = SystemClock.elapsedRealtime();
        invalidate();
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size < size2) {
            size2 = size;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        LinearGradient A012 = A01(measuredWidth, measuredHeight, this.A0J, this.A0E, this.A0F, this.A0D);
        this.A06 = A012;
        this.A0M.setShader(A012);
        float max = Math.max(this.A00, this.A09) / 2.0f;
        this.A0O.set(((float) getPaddingLeft()) + max, ((float) getPaddingTop()) + max, ((float) (measuredWidth - getPaddingRight())) - max, ((float) (measuredHeight - getPaddingBottom())) - max);
    }

    public GradientSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public GradientSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0003R.attr.gradientSpinnerStyle);
    }

    /* JADX INFO: finally extract failed */
    public GradientSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0L = new Matrix();
        this.A0K = new int[5];
        this.A0S = new AccelerateDecelerateInterpolator();
        C31761Zv r1 = C31761Zv.A0C;
        this.A07 = r1;
        this.A0B = A0T;
        this.A08 = new C31781Zx[r1.A0B];
        this.A0A = 0;
        this.A03 = 0;
        this.A05 = -1;
        this.A0R = new Picture();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A23, i, 2131886425);
        try {
            this.A00 = obtainStyledAttributes.getDimension(0, 4.0f);
            this.A09 = obtainStyledAttributes.getDimension(4, 4.0f);
            this.A0C = Integer.valueOf(obtainStyledAttributes.getResourceId(2, C0003R.style.GradientPatternStyle));
            int color = obtainStyledAttributes.getColor(3, -16777216);
            int color2 = obtainStyledAttributes.getColor(1, -65536);
            obtainStyledAttributes.recycle();
            int[] iArr = new int[5];
            this.A0J = iArr;
            C31791Zy.A03(getContext(), attributeSet, getGradientColorRes(), iArr);
            Paint paint = new Paint(1);
            this.A0M = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.A0M.setStrokeWidth(this.A00);
            this.A0M.setStrokeCap(Paint.Cap.ROUND);
            this.A0Q = new Paint(this.A0M);
            setInactiveColour(color);
            this.A0Q.setStrokeWidth(this.A09);
            Paint paint2 = new Paint(this.A0Q);
            this.A0P = paint2;
            paint2.setShader(A00(color2));
            this.A0N = new Paint(this.A0M);
            this.A0O = new RectF();
            if (Build.VERSION.SDK_INT < 23) {
                setLayerType(1, (Paint) null);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setGradientColors(int i) {
        Integer num = this.A0C;
        if (num == null || num.intValue() != i) {
            this.A0C = Integer.valueOf(i);
            int[] iArr = new int[5];
            this.A0J = iArr;
            C31791Zy.A03(getContext(), (AttributeSet) null, getGradientColorRes(), iArr);
            this.A0E = null;
            this.A0F = null;
            this.A0D = null;
            LinearGradient A012 = A01(getMeasuredWidth(), getMeasuredHeight(), this.A0J, this.A0E, this.A0F, this.A0D);
            this.A06 = A012;
            this.A0M.setShader(A012);
            invalidate();
        }
    }

    public void setGradientColors(C35981hF r8) {
        this.A0J = r8.A04();
        this.A0E = r8.A03();
        C36001hH A012 = r8.A01();
        this.A0F = new float[]{A012.A00, A012.A01};
        C36001hH A002 = r8.A00();
        this.A0D = new float[]{A002.A00, A002.A01};
        this.A0C = null;
        LinearGradient A013 = A01(getMeasuredWidth(), getMeasuredHeight(), this.A0J, this.A0E, this.A0F, this.A0D);
        this.A06 = A013;
        this.A0M.setShader(A013);
        invalidate();
    }
}
