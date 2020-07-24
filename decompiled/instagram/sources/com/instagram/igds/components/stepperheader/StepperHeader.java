package com.instagram.igds.components.stepperheader;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass7RE;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C1419064w;
import p000X.C256519s;
import p000X.C32501bN;
import p000X.C44611wS;

public class StepperHeader extends View implements C44611wS, AnonymousClass1E8, C256519s {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public ValueAnimator A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final AnonymousClass1EG A0G;
    public final int[] A0H;
    public final int[] A0I;
    public final int[][] A0J;

    public final void A04(int i, boolean z) {
        A03(i, 4);
        this.A0A = true;
        this.A0B = z;
        this.A02 = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
    }

    public final void BDW(int i) {
    }

    public final void BDX(int i) {
    }

    public final void BDi(int i, int i2) {
    }

    public final void BLD(float f, float f2, C32501bN r3) {
    }

    public final void BLO(C32501bN r1, C32501bN r2) {
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOH(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final void BQW(int i, int i2) {
    }

    public final void BVp(View view) {
    }

    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        canvas2.drawLine(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A07, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A0F);
        int paddingLeft = getPaddingLeft();
        for (int i = 0; i < this.A03; i++) {
            if (i != 0) {
                canvas2.drawLine((float) paddingLeft, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (this.A01 + paddingLeft), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A0D);
                paddingLeft += this.A01;
            }
            int i2 = this.A04;
            if ((i == i2 && this.A0A && !this.A0B) || (i == i2 + 1 && this.A0A && this.A0B)) {
                float f3 = this.A00;
                int i3 = this.A06;
                f = ((float) paddingLeft) + (f3 * ((float) i3));
                f2 = (float) (i3 + paddingLeft);
            } else if (i > i2) {
                f = (float) paddingLeft;
                f2 = (float) (this.A06 + paddingLeft);
            } else {
                paddingLeft += this.A06;
            }
            canvas2.drawLine(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A0E);
            paddingLeft += this.A06;
        }
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    private void A00() {
        this.A0F.setShader(new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A07, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A0C, (float[]) null, Shader.TileMode.MIRROR));
    }

    public static void A01(int i, int i2, DisplayMetrics displayMetrics, int[] iArr) {
        int i3 = displayMetrics.widthPixels;
        int round = Math.round(C06220Of.A05(displayMetrics, 2));
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(i3, size);
        } else if (mode == 1073741824) {
            i3 = size;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            round = Math.min(round, size2);
        } else if (mode2 == 1073741824) {
            round = size2;
        }
        iArr[0] = i3;
        iArr[1] = round;
    }

    private void setCurrentPage(int i) {
        this.A04 = i;
        invalidate();
    }

    public final void A02() {
        float[] fArr;
        if (this.A0A) {
            if (this.A0B) {
                fArr = new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER};
            } else {
                fArr = new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f};
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.A09 = ofFloat;
            ofFloat.setDuration((long) this.A02);
            this.A09.addUpdateListener(new AnonymousClass7RE(this));
            this.A09.start();
        }
    }

    public final void A03(int i, int i2) {
        this.A04 = i;
        this.A03 = i2;
        this.A06 = (int) Math.ceil((((double) this.A07) - ((double) (this.A01 * (i2 - 1)))) / ((double) i2));
        requestLayout();
    }

    public final void BOK(AnonymousClass1EG r4) {
        if (this.A03 > this.A08) {
            setScrollX((int) Math.round(r4.A00()));
        } else {
            setScrollX(0);
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-1717472452);
        super.onAttachedToWindow();
        this.A0G.A07(this);
        AnonymousClass0Z0.A0D(1543848929, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(1565619947);
        super.onDetachedFromWindow();
        AnonymousClass1EG r0 = this.A0G;
        r0.A02();
        r0.A08(this);
        ValueAnimator valueAnimator = this.A09;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnonymousClass0Z0.A0D(-2035015548, A062);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int[] iArr = new int[2];
        A01(i, i2, getResources().getDisplayMetrics(), iArr);
        setMeasuredDimension(iArr[0], iArr[1]);
    }

    public void setColorScheme(C1419064w r2) {
        int[] iArr;
        switch (r2.ordinal()) {
            case 0:
                iArr = this.A0I;
                break;
            case 1:
                iArr = this.A0H;
                break;
            default:
                A00();
                invalidate();
        }
        this.A0C = iArr;
        A00();
        invalidate();
    }

    public final void BDU(int i, int i2) {
        setCurrentPage(i);
    }

    public final void onPageSelected(int i) {
        setCurrentPage(i);
    }

    public void setAnimationDuration(int i) {
        this.A02 = i;
    }

    public void setIsAnimationBackward(boolean z) {
        this.A0B = z;
    }

    public StepperHeader(Context context) {
        this(context, (AttributeSet) null);
    }

    public StepperHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StepperHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int[] iArr;
        Context context2 = getContext();
        getContext();
        getContext();
        this.A0I = new int[]{C019000b.A00(context2, C0003R.color.warm_left), C019000b.A00(context2, C0003R.color.warm_mid), C019000b.A00(context2, C0003R.color.warm_right)};
        getContext();
        getContext();
        getContext();
        int[] iArr2 = {C019000b.A00(context2, C0003R.color.cold_left), C019000b.A00(context2, C0003R.color.cold_mid), C019000b.A00(context2, C0003R.color.cold_right)};
        this.A0H = iArr2;
        int[][] iArr3 = {this.A0I, iArr2};
        this.A0J = iArr3;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3W, i, 0);
            if (obtainStyledAttributes.getInt(0, 0) == 1) {
                iArr = this.A0H;
            } else {
                iArr = this.A0I;
            }
            this.A0C = iArr;
            this.A08 = obtainStyledAttributes.getInt(1, 5);
            obtainStyledAttributes.recycle();
        } else {
            this.A0C = iArr3[0];
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A07 = displayMetrics.widthPixels;
        this.A01 = Math.round(C06220Of.A05(displayMetrics, 3));
        this.A05 = Math.round(C06220Of.A05(displayMetrics, 2));
        Paint paint = new Paint(1);
        this.A0F = paint;
        paint.setStrokeWidth((float) (this.A05 << 1));
        A00();
        Paint paint2 = new Paint(1);
        this.A0D = paint2;
        paint2.setStrokeWidth((float) (this.A05 << 1));
        Paint paint3 = this.A0D;
        getContext();
        paint3.setColor(AnonymousClass1BA.A01(context2, C0003R.attr.backgroundColorSecondary));
        Paint paint4 = new Paint(1);
        this.A0E = paint4;
        paint4.setStrokeWidth((float) (this.A05 << 1));
        this.A0E.setColor(AnonymousClass1BA.A01(context, C0003R.attr.glyphColorSecondary));
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06(AnonymousClass1EA.A01(30.0d, 7.0d));
        this.A0G = A002;
    }
}
