package com.instagram.p009ui.widget.drawing;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import p000X.Constants;
import p000X.AnonymousClass0OW;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass2LX;
import p000X.AnonymousClass89C;
import p000X.AnonymousClass8AL;
import p000X.C019000b;
import p000X.C25913Bc3;
import p000X.C26771Ff;
import p000X.C27181Gu;
import p000X.C81583h2;
import p000X.C84423le;
import p000X.C84433lf;
import p000X.C84443lg;
import p000X.C85473nR;
import p000X.C85483nS;
import p000X.C85493nT;
import p000X.C87323qY;
import p000X.C92803zk;

/* renamed from: com.instagram.ui.widget.drawing.StrokeWidthTool */
public class StrokeWidthTool extends View {
    public static final int[] A0t = new int[2];
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public long A0E;
    public long A0F;
    public Drawable A0G;
    public Drawable A0H;
    public C87323qY A0I;
    public C81583h2 A0J;
    public Integer A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public float A0Q;
    public float A0R;
    public boolean A0S;
    public final float A0T;
    public final float A0U;
    public final float A0V;
    public final float A0W;
    public final float A0X;
    public final Paint A0Y;
    public final Paint A0Z;
    public final Paint A0a;
    public final Paint A0b;
    public final Paint A0c;
    public final Paint A0d;
    public final Path A0e;
    public final AnonymousClass2LX A0f;
    public final AnonymousClass2LX A0g;
    public final C92803zk A0h;
    public final C92803zk A0i;
    public final C92803zk A0j;
    public final ArrayList A0k;
    public final ArrayList A0l;
    public final ArrayList A0m;
    public final float A0n;
    public final float A0o;
    public final float A0p;
    public final float A0q;
    public final int A0r;
    public final GestureDetector A0s;

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0S = true;
        float width = (float) ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float f = (width - this.A0n) / width;
        this.A00 = f;
        this.A01 = f;
        this.A0D = ((float) getWidth()) / 2.0f;
        this.A02 = (((float) getHeight()) - this.A0D) - ((float) getPaddingBottom());
        this.A0C = this.A0V + ((float) getPaddingTop());
        this.A0B = ((((float) (getHeight() - getWidth())) - this.A0V) - this.A0q) - ((float) getPaddingBottom());
        A04(this);
        if (this.A0O) {
            A05(this, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        A02(this);
        Drawable drawable = this.A0G;
        if (drawable != null) {
            A01(drawable, getButtonRadius() * this.A00);
            this.A0G.setAlpha(255);
        }
        Drawable drawable2 = this.A0H;
        if (drawable2 != null) {
            A01(drawable2, getButtonRadius());
            this.A0H.setAlpha(0);
        }
    }

    public void setColour(int i) {
        ColorFilter A002 = C26771Ff.A00(AnonymousClass0OW.A06(i, -1));
        Drawable drawable = this.A0G;
        if (drawable != null) {
            drawable.setColorFilter(A002);
        }
        Drawable drawable2 = this.A0H;
        if (drawable2 != null) {
            drawable2.setColorFilter(A002);
        }
        this.A0Z.setColor(i);
        invalidate();
    }

    public void setCurrentRatio(float f) {
        this.A07 = (float) C27181Gu.A01((double) f, 0.0d, 1.0d, (double) this.A05, (double) this.A04);
        A02(this);
    }

    private void A00(int i) {
        this.A0K = Constants.ZERO;
        this.A0L = false;
        long j = (long) i;
        this.A0E = j;
        this.A08 = this.A0o;
        this.A06 = this.A03;
        this.A0F = System.currentTimeMillis();
        postDelayed(new AnonymousClass89C(this), j);
    }

    private void A01(Drawable drawable, float f) {
        float f2 = f * 2.0f;
        float min = Math.min(((float) Math.sqrt((double) ((f2 * f2) / 2.0f))) - this.A0Q, ((float) drawable.getIntrinsicWidth()) / 2.0f);
        float f3 = this.A0D;
        float f4 = this.A02;
        drawable.setBounds((int) (f3 - min), (int) (f4 - min), (int) (f3 + min), (int) (f4 + min));
    }

    public static void A02(StrokeWidthTool strokeWidthTool) {
        if (strokeWidthTool.A0S) {
            float f = strokeWidthTool.A0B;
            float f2 = f - strokeWidthTool.A0C;
            float f3 = strokeWidthTool.A04;
            float f4 = strokeWidthTool.A05;
            strokeWidthTool.A0A = f - ((f2 / (f3 - f4)) * (strokeWidthTool.A07 - f4));
            strokeWidthTool.invalidate();
        }
    }

    public static void A03(StrokeWidthTool strokeWidthTool) {
        if (strokeWidthTool.A0J != null) {
            strokeWidthTool.getLocationInWindow(A0t);
            C81583h2 r3 = strokeWidthTool.A0J;
            int[] iArr = A0t;
            r3.BRQ(((float) iArr[0]) + strokeWidthTool.A0D, ((float) iArr[1]) + strokeWidthTool.A0A);
        }
    }

    public static void A04(StrokeWidthTool strokeWidthTool) {
        float A002 = (float) ((AnonymousClass1EG) strokeWidthTool.A0h.get()).A00();
        float f = strokeWidthTool.A02;
        float f2 = f + ((strokeWidthTool.A0C - f) * A002);
        float f3 = f + ((strokeWidthTool.A0B - f) * A002);
        ((PointF) strokeWidthTool.A0k.get(0)).set(strokeWidthTool.A0D - (strokeWidthTool.A0W / 2.0f), f3);
        ((PointF) strokeWidthTool.A0k.get(1)).set(strokeWidthTool.A0D - (strokeWidthTool.A0W / 2.0f), f2);
        ((PointF) strokeWidthTool.A0k.get(2)).set(strokeWidthTool.A0D + (strokeWidthTool.A0W / 2.0f), f2);
        ((PointF) strokeWidthTool.A0k.get(3)).set(strokeWidthTool.A0D + (strokeWidthTool.A0W / 2.0f), f3);
        ((PointF) strokeWidthTool.A0m.get(0)).set(strokeWidthTool.A0D, f3);
        ((PointF) strokeWidthTool.A0m.get(1)).set(strokeWidthTool.A0D - (strokeWidthTool.A0X / 2.0f), f2);
        ((PointF) strokeWidthTool.A0m.get(2)).set(strokeWidthTool.A0D + (strokeWidthTool.A0X / 2.0f), f2);
        ((PointF) strokeWidthTool.A0m.get(3)).set(strokeWidthTool.A0D, f3);
        float f4 = strokeWidthTool.A02 - strokeWidthTool.A0A;
        strokeWidthTool.A09 = f4 + ((BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER - f4) * A002);
    }

    public static void A05(StrokeWidthTool strokeWidthTool, float f) {
        int size = strokeWidthTool.A0k.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) strokeWidthTool.A0k.get(i);
            PointF pointF2 = (PointF) strokeWidthTool.A0m.get(i);
            float f2 = pointF.x;
            float f3 = pointF.y;
            ((PointF) strokeWidthTool.A0l.get(i)).set(f2 + ((pointF2.x - f2) * f), f3 + ((pointF2.y - f3) * f));
        }
    }

    public static void A06(StrokeWidthTool strokeWidthTool, float f) {
        float f2 = strokeWidthTool.A0B;
        float f3 = strokeWidthTool.A0C;
        float min = Math.min(f2, Math.max(f3, f));
        strokeWidthTool.A0A = min;
        float f4 = strokeWidthTool.A07;
        float f5 = f2 - f3;
        float f6 = strokeWidthTool.A04;
        float f7 = strokeWidthTool.A05;
        float f8 = f7 + (((f6 - f7) / f5) * (f2 - min));
        strokeWidthTool.A07 = f8;
        if (f8 != f4) {
            C81583h2 r0 = strokeWidthTool.A0J;
            if (r0 != null) {
                r0.BUc(f4, f8);
            }
            A03(strokeWidthTool);
            strokeWidthTool.invalidate();
        }
    }

    public static void setMode(StrokeWidthTool strokeWidthTool, C87323qY r4) {
        if (strokeWidthTool.A0I != r4) {
            strokeWidthTool.A0I = r4;
            if (r4 == C87323qY.COLLAPSED) {
                ((AnonymousClass1EG) strokeWidthTool.A0h.get()).A03(0.0d);
            } else {
                ((AnonymousClass1EG) strokeWidthTool.A0h.get()).A03(1.0d);
            }
            strokeWidthTool.invalidate();
        }
    }

    public final void A07() {
        this.A0K = Constants.ONE;
        this.A0L = false;
        ((AnonymousClass1EG) this.A0j.get()).A05(1.0d, true);
        this.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        invalidate();
        A00(1000);
    }

    public float getCurrentRatio() {
        return (float) C27181Gu.A01((double) this.A07, (double) this.A05, (double) this.A04, 0.0d, 1.0d);
    }

    public float getStrokeWidthPx() {
        return this.A07 * this.A0U;
    }

    public final void onDraw(Canvas canvas) {
        double d;
        if (!this.A0O) {
            if (this.A0L) {
                float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min((((float) (System.currentTimeMillis() - this.A0F)) - ((float) this.A0E)) / 300.0f, 1.0f));
                AnonymousClass1EG r3 = (AnonymousClass1EG) this.A0j.get();
                if (this.A0K == Constants.ONE) {
                    d = (double) max;
                } else {
                    d = (double) (1.0f - max);
                }
                r3.A05(d, true);
                if (max <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || max >= 1.0f) {
                    this.A0L = false;
                } else {
                    invalidate();
                }
                this.A03 = (float) C27181Gu.A01((double) max, 0.0d, 1.0d, (double) this.A06, (double) this.A08);
            }
            setTranslationX(this.A03);
        } else {
            setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        if (this.A0I == C87323qY.EXPANDED || !((AnonymousClass1EG) this.A0h.get()).A09()) {
            this.A0e.rewind();
            PointF pointF = (PointF) this.A0l.get(0);
            this.A0e.moveTo(pointF.x, pointF.y);
            int size = this.A0l.size();
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) this.A0l.get(i);
                this.A0e.lineTo(pointF2.x, pointF2.y);
            }
            this.A0e.close();
            this.A0e.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A0e, this.A0b);
            canvas.drawPath(this.A0e, this.A0d);
            canvas.drawCircle(this.A0D, this.A0A + this.A09, this.A0V, this.A0b);
            canvas.drawCircle(this.A0D, this.A0A + this.A09, this.A0V, this.A0c);
        }
        if (this.A0O) {
            float buttonRadius = getButtonRadius() * this.A01;
            canvas.drawCircle(this.A0D, this.A02, buttonRadius, this.A0b);
            if (Color.alpha(this.A0Z.getColor()) < 255) {
                canvas.drawCircle(this.A0D, this.A02, buttonRadius - (this.A0T / 2.0f), this.A0Y);
            }
            canvas.drawCircle(this.A0D, this.A02, buttonRadius - (this.A0T / 2.0f), this.A0Z);
            canvas.drawCircle(this.A0D, this.A02, buttonRadius - (this.A0T / 2.0f), this.A0a);
            float A002 = (float) ((AnonymousClass1EG) this.A0h.get()).A00();
            if (this.A0G != null) {
                canvas.save();
                canvas.rotate(-45.0f * A002, this.A0D, this.A02);
                this.A0G.setAlpha((int) ((1.0f - A002) * 255.0f));
                this.A0G.draw(canvas);
                canvas.restore();
            }
            Drawable drawable = this.A0H;
            if (drawable != null) {
                drawable.setAlpha((int) (255.0f * A002));
                canvas.save();
                canvas.rotate((1.0f - A002) * 45.0f, this.A0D, this.A02);
                this.A0H.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.A0r, C25913Bc3.MAX_SIGNED_POWER_OF_TWO), i2);
    }

    public void setCollapsedIcon(Drawable drawable) {
        this.A0G = drawable;
        invalidate();
    }

    public void setStrokeWidthButtonShowing(boolean z) {
        C87323qY r0;
        this.A0O = z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i = 8388627;
            if (z) {
                i = 8388691;
            }
            layoutParams2.gravity = i;
            setLayoutParams(layoutParams2);
        }
        if (this.A0O) {
            r0 = C87323qY.COLLAPSED;
        } else {
            r0 = C87323qY.EXPANDED;
        }
        setMode(this, r0);
    }

    public void setStrokeWidthDp(float f) {
        this.A07 = f;
        A02(this);
    }

    private float getButtonRadius() {
        return (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) / 2.0f) + (this.A0T / 2.0f);
    }

    public final boolean A08(float f, float f2) {
        float buttonRadius = getButtonRadius();
        if (f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && f <= ((float) getWidth())) {
            float f3 = this.A02;
            if (f2 < f3 - buttonRadius || f2 > f3 + buttonRadius) {
                return false;
            }
            return true;
        }
        return false;
    }

    public float getStrokeWidthDp() {
        return this.A07;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(-1257615662);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            if (!this.A0O) {
                A00(0);
            }
            ((AnonymousClass1EG) this.A0j.get()).A03(0.0d);
            this.A0N = false;
            this.A0P = false;
            if (this.A0O && this.A0M) {
                setMode(this, C87323qY.COLLAPSED);
                this.A0M = false;
            }
            C81583h2 r0 = this.A0J;
            if (r0 != null) {
                r0.BRP();
            }
        } else if (action == 0) {
            this.A0R = motionEvent.getY();
            if (!this.A0O) {
                this.A0K = Constants.ONE;
                this.A0L = true;
                this.A0E = 0;
                this.A08 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                this.A06 = this.A03;
                this.A0F = System.currentTimeMillis();
                invalidate();
            }
        } else if (action == 2 && (this.A0P || this.A0M)) {
            float y = motionEvent.getY();
            float f = this.A0R - y;
            this.A0R = y;
            A06(this, this.A0A - f);
            invalidate();
        }
        boolean onTouchEvent = this.A0s.onTouchEvent(motionEvent);
        AnonymousClass0Z0.A0C(1305702311, A052);
        return onTouchEvent;
    }

    public void setOnValueChangedListener(C81583h2 r1) {
        this.A0J = r1;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (!this.A0O) {
            return;
        }
        if (i == 4 || i == 8) {
            setMode(this, C87323qY.COLLAPSED);
        }
    }

    public StrokeWidthTool(Context context) {
        this(context, (AttributeSet) null);
    }

    public StrokeWidthTool(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x01da  */
    public StrokeWidthTool(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.A0e = new Path();
        this.A0l = new ArrayList();
        this.A0k = new ArrayList();
        this.A0m = new ArrayList();
        this.A0I = C87323qY.COLLAPSED;
        this.A0K = Constants.ZERO;
        this.A0S = false;
        this.A0O = true;
        this.A0L = false;
        this.A0f = new C84423le(this);
        this.A0g = new C84433lf(this);
        try {
            Context context2 = getContext();
            typedArray = context2.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3X);
            try {
                this.A0p = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(typedArray.getFloat(8, -1.0f), 1.0f));
                this.A07 = typedArray.getDimension(5, 5.0f);
                this.A05 = typedArray.getDimension(7, 2.0f);
                this.A04 = typedArray.getDimension(6, 100.0f);
                this.A0W = typedArray.getDimension(14, 10.0f);
                this.A0X = typedArray.getDimension(15, 60.0f);
                this.A0V = typedArray.getDimension(11, 60.0f) / 2.0f;
                this.A0T = typedArray.getDimension(1, 3.0f);
                int color = typedArray.getColor(13, -1);
                int color2 = typedArray.getColor(10, -1);
                this.A0q = typedArray.getDimension(12, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                setCollapsedIcon(typedArray.getDrawable(2));
                this.A0H = typedArray.getDrawable(3);
                this.A0Q = typedArray.getDimension(4, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                float dimension = typedArray.getDimension(9, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A0n = typedArray.getDimension(0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                typedArray.recycle();
                Resources resources = getResources();
                this.A0U = resources.getDisplayMetrics().density;
                getResources();
                int i2 = (int) (((float) resources.getDisplayMetrics().widthPixels) * this.A0p);
                this.A0r = i2;
                this.A0o = (float) ((-(i2 >> 1)) + getPaddingLeft());
                Paint paint = new Paint(1);
                this.A0a = paint;
                paint.setColor(-1);
                this.A0a.setStyle(Paint.Style.STROKE);
                this.A0a.setStrokeWidth(this.A0T);
                Paint paint2 = new Paint(1);
                this.A0Z = paint2;
                Paint.Style style = Paint.Style.FILL;
                paint2.setStyle(style);
                Paint paint3 = new Paint(1);
                this.A0Y = paint3;
                paint3.setStyle(style);
                this.A0Y.setColor(-1);
                Paint paint4 = new Paint(1);
                this.A0d = paint4;
                paint4.setStyle(style);
                this.A0d.setColor(color);
                Paint paint5 = new Paint(1);
                this.A0b = paint5;
                paint5.setStyle(style);
                Paint paint6 = this.A0b;
                getContext();
                paint6.setColor(C019000b.A00(context2, C0003R.color.black_25_transparent));
                this.A0b.setMaskFilter(new BlurMaskFilter(dimension, BlurMaskFilter.Blur.OUTER));
                Paint paint7 = new Paint(1);
                this.A0c = paint7;
                paint7.setStyle(Paint.Style.FILL);
                this.A0c.setColor(color2);
                setLayerType(1, (Paint) null);
                this.A0s = new GestureDetector(context, new C84443lg(this), new Handler(Looper.getMainLooper()));
                for (int i3 = 0; i3 < 4; i3++) {
                    this.A0k.add(new PointF());
                    this.A0m.add(new PointF());
                    this.A0l.add(new PointF());
                }
                this.A0i = AnonymousClass8AL.A00(new C85473nR(this));
                this.A0h = AnonymousClass8AL.A00(new C85483nS(this));
                this.A0j = AnonymousClass8AL.A00(new C85493nT(this));
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }
}
