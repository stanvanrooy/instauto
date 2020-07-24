package com.instagram.p009ui.widget.drawing;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EB;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass2LX;
import p000X.AnonymousClass89D;
import p000X.C019000b;
import p000X.C25913Bc3;
import p000X.C27181Gu;
import p000X.C82283iA;
import p000X.C84403lb;
import p000X.C84413lc;
import p000X.C86583pH;
import p000X.C87283qT;

/* renamed from: com.instagram.ui.widget.drawing.EffectSlider */
public class EffectSlider extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public long A07;
    public long A08;
    public AnonymousClass1EG A09;
    public C82283iA A0A;
    public C87283qT A0B;
    public boolean A0C;
    public boolean A0D;
    public float A0E;
    public float A0F;
    public float A0G;
    public AnonymousClass1EG A0H;
    public final float A0I;
    public final float A0J;
    public final float A0K;
    public final float A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final Path A0P;
    public final ArrayList A0Q;
    public final ArrayList A0R;
    public final ArrayList A0S;
    public final float A0T;
    public final float A0U;
    public final int A0V;
    public final GestureDetector A0W;
    public final AnonymousClass2LX A0X;
    public final AnonymousClass2LX A0Y;

    public static void A00(EffectSlider effectSlider) {
        float A002 = (float) effectSlider.A0H.A00();
        float f = effectSlider.A0E;
        float f2 = f + ((effectSlider.A0G - f) * A002);
        float f3 = f + ((effectSlider.A05 - f) * A002);
        ((PointF) effectSlider.A0Q.get(0)).set(effectSlider.A06 - (effectSlider.A0K / 2.0f), f3);
        ((PointF) effectSlider.A0Q.get(1)).set(effectSlider.A06 - (effectSlider.A0K / 2.0f), f2);
        ((PointF) effectSlider.A0Q.get(2)).set(effectSlider.A06 + (effectSlider.A0K / 2.0f), f2);
        ((PointF) effectSlider.A0Q.get(3)).set(effectSlider.A06 + (effectSlider.A0K / 2.0f), f3);
        ((PointF) effectSlider.A0S.get(0)).set(effectSlider.A06, f3);
        ((PointF) effectSlider.A0S.get(1)).set(effectSlider.A06 - (effectSlider.A0L / 2.0f), f2);
        ((PointF) effectSlider.A0S.get(2)).set(effectSlider.A06 + (effectSlider.A0L / 2.0f), f2);
        ((PointF) effectSlider.A0S.get(3)).set(effectSlider.A06, f3);
        float f4 = effectSlider.A0E - effectSlider.A04;
        effectSlider.A03 = f4 + ((BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER - f4) * A002);
    }

    public static void A01(EffectSlider effectSlider, float f) {
        int size = effectSlider.A0Q.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) effectSlider.A0Q.get(i);
            PointF pointF2 = (PointF) effectSlider.A0S.get(i);
            float f2 = pointF.x;
            float f3 = pointF.y;
            ((PointF) effectSlider.A0R.get(i)).set(f2 + ((pointF2.x - f2) * f), f3 + ((pointF2.y - f3) * f));
        }
    }

    public static void A02(EffectSlider effectSlider, float f) {
        float f2 = effectSlider.A05;
        float f3 = effectSlider.A0G;
        float min = Math.min(f2, Math.max(f3, f));
        float f4 = (min - f2) / (f3 - f2);
        C82283iA r0 = effectSlider.A0A;
        if (r0 != null) {
            r0.BUb(f4);
        }
        effectSlider.A04 = min;
    }

    public final void onDraw(Canvas canvas) {
        double d;
        C87283qT r7 = this.A0B;
        if (r7 == C87283qT.PARTIAL) {
            if (this.A0C) {
                float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min((((float) (System.currentTimeMillis() - this.A08)) - ((float) this.A07)) / 300.0f, 1.0f));
                AnonymousClass1EG r1 = this.A09;
                if (r7 == C87283qT.FULL) {
                    d = (double) max;
                } else {
                    d = (double) (1.0f - max);
                }
                r1.A05(d, true);
                if (max <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || max >= 1.0f) {
                    this.A0C = false;
                } else {
                    invalidate();
                }
                this.A00 = (float) C27181Gu.A01((double) max, 0.0d, 1.0d, (double) this.A01, (double) this.A02);
            }
            setTranslationX(this.A00);
        } else {
            setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        if (this.A0B != C87283qT.HIDDEN || !this.A0H.A09()) {
            this.A0P.rewind();
            PointF pointF = (PointF) this.A0R.get(0);
            this.A0P.moveTo(pointF.x, pointF.y);
            int size = this.A0R.size();
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) this.A0R.get(i);
                this.A0P.lineTo(pointF2.x, pointF2.y);
            }
            this.A0P.close();
            this.A0P.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A0P, this.A0M);
            canvas.drawPath(this.A0P, this.A0O);
        }
        float f = this.A04;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            canvas.drawCircle(this.A06, f + this.A03, this.A0J, this.A0M);
            canvas.drawCircle(this.A06, this.A04 + this.A03, this.A0J, this.A0N);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.A0V, C25913Bc3.MAX_SIGNED_POWER_OF_TWO), i2);
    }

    public void setProgress(float f) {
        float f2 = this.A05;
        A02(this, f2 + ((this.A0G - f2) * f));
        invalidate();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A06 = ((float) getWidth()) / 2.0f;
        this.A0E = (((float) getHeight()) - this.A06) - ((float) getPaddingBottom());
        this.A0G = this.A0J + ((float) getPaddingTop());
        this.A05 = ((((float) (getHeight() - getWidth())) - this.A0J) - this.A0U) - ((float) getPaddingBottom());
        A00(this);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(733003340);
        getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.A0B = C87283qT.PARTIAL;
            this.A0C = false;
            long j = (long) 0;
            this.A07 = j;
            this.A02 = this.A0I;
            this.A01 = this.A00;
            this.A08 = System.currentTimeMillis();
            postDelayed(new AnonymousClass89D(this), j);
            this.A09.A03(0.0d);
            this.A0D = false;
        } else if (action == 0) {
            this.A0F = motionEvent.getY();
            this.A0B = C87283qT.FULL;
            this.A0C = true;
            this.A07 = 0;
            this.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A01 = this.A00;
            this.A08 = System.currentTimeMillis();
            invalidate();
        } else if (action == 2 && this.A0D) {
            float y = motionEvent.getY();
            float f = this.A0F - y;
            this.A0F = y;
            A02(this, this.A04 - f);
            invalidate();
        }
        boolean onTouchEvent = this.A0W.onTouchEvent(motionEvent);
        AnonymousClass0Z0.A0C(1688480494, A052);
        return onTouchEvent;
    }

    public void setOnValueChangedListener(C82283iA r1) {
        this.A0A = r1;
    }

    public EffectSlider(Context context) {
        this(context, (AttributeSet) null);
    }

    public EffectSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0156  */
    public EffectSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.A0P = new Path();
        this.A0R = new ArrayList();
        this.A0Q = new ArrayList();
        this.A0S = new ArrayList();
        this.A0B = C87283qT.HIDDEN;
        this.A0C = false;
        this.A0X = new C84403lb(this);
        this.A0Y = new C84413lc(this);
        try {
            Context context2 = getContext();
            typedArray = context2.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3X);
            try {
                this.A0T = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(typedArray.getFloat(8, -1.0f), 1.0f));
                this.A0K = typedArray.getDimension(14, 10.0f);
                this.A0L = typedArray.getDimension(15, 60.0f);
                this.A0J = typedArray.getDimension(11, 60.0f) / 2.0f;
                int color = typedArray.getColor(13, -1);
                int color2 = typedArray.getColor(10, -1);
                this.A0U = typedArray.getDimension(12, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                float dimension = typedArray.getDimension(9, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                typedArray.recycle();
                int i2 = (int) (((float) getResources().getDisplayMetrics().widthPixels) * this.A0T);
                this.A0V = i2;
                this.A0I = (float) ((-(i2 >> 1)) + getPaddingLeft());
                Paint paint = new Paint(1);
                this.A0O = paint;
                Paint.Style style = Paint.Style.FILL;
                paint.setStyle(style);
                this.A0O.setColor(color);
                Paint paint2 = new Paint(1);
                this.A0M = paint2;
                paint2.setStyle(style);
                Paint paint3 = this.A0M;
                getContext();
                paint3.setColor(C019000b.A00(context2, C0003R.color.black_25_transparent));
                this.A0M.setMaskFilter(new BlurMaskFilter(dimension, BlurMaskFilter.Blur.OUTER));
                Paint paint4 = new Paint(1);
                this.A0N = paint4;
                paint4.setStyle(Paint.Style.FILL);
                this.A0N.setColor(color2);
                setLayerType(1, (Paint) null);
                AnonymousClass1EB A002 = AnonymousClass0P2.A00();
                AnonymousClass1EG A003 = A002.A00();
                A003.A06 = true;
                A003.A07(this.A0X);
                this.A0H = A003;
                AnonymousClass1EG A004 = A002.A00();
                A004.A06 = true;
                A004.A07(this.A0Y);
                this.A09 = A004;
                this.A0W = new GestureDetector(context, new C86583pH(this), new Handler(Looper.getMainLooper()));
                for (int i3 = 0; i3 < 4; i3++) {
                    this.A0Q.add(new PointF());
                    this.A0S.add(new PointF());
                    this.A0R.add(new PointF());
                }
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
            if (typedArray != null) {
            }
            throw th;
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        setVisibility(C87283qT.FULL);
    }

    private void setVisibility(C87283qT r4) {
        if (this.A0B != r4) {
            this.A0B = r4;
            if (r4 == C87283qT.FULL) {
                this.A0H.A03(1.0d);
            } else if (r4 == C87283qT.HIDDEN) {
                this.A0H.A03(0.0d);
            }
            invalidate();
        }
    }
}
