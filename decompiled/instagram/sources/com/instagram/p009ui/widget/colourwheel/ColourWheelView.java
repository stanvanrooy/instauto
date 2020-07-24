package com.instagram.p009ui.widget.colourwheel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.drawing.FloatingIndicator;
import java.util.HashSet;
import java.util.Set;
import p000X.Constants;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EM;
import p000X.C019000b;
import p000X.C06400Ox;
import p000X.C06420Oz;
import p000X.C80563fN;
import p000X.C81363gg;
import p000X.C86433p1;
import p000X.C87693rC;

/* renamed from: com.instagram.ui.widget.colourwheel.ColourWheelView */
public class ColourWheelView extends FrameLayout {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public AnonymousClass1EG A08;
    public boolean A09;
    public float A0A;
    public Drawable A0B;
    public C87693rC A0C;
    public boolean A0D;
    public final float A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final C86433p1 A0H;
    public final FloatingIndicator A0I;
    public final Set A0J;
    public final float A0K;
    public final float A0L;
    public final float A0M;
    public final float A0N;
    public final boolean A0O;

    private void A00() {
        this.A05 = ((int) this.A07.getX()) + (this.A07.getWidth() >> 1);
        this.A06 = (int) ((this.A07.getY() + ((float) (this.A07.getHeight() >> 1))) - getCursorOffset());
    }

    private void A01() {
        int i = this.A05;
        int i2 = this.A06;
        float f = this.A01;
        float f2 = ((float) i) - f;
        float f3 = this.A02;
        float f4 = ((float) i2) - f3;
        float f5 = this.A0E;
        boolean z = false;
        if ((f2 * f2) + (f4 * f4) < f5 * f5) {
            z = true;
        }
        if (!z) {
            double atan2 = Math.atan2((double) f4, (double) f2);
            double d = (double) f5;
            this.A05 = (int) (((double) f) + (d * Math.cos(atan2)));
            this.A06 = (int) (((double) f3) + (d * Math.sin(atan2)));
        }
        this.A0I.A01((float) this.A05, ((float) this.A06) + getCursorOffset(), (float) this.A05, (float) (this.A06 - (this.A0I.getHeight() >> 1)), this.A0M, getColourAtCursor(), 1, 0, false);
    }

    private void A02() {
        float f;
        float f2 = this.A00;
        float f3 = this.A0A;
        int i = (int) (f3 + ((this.A0E - f3) * f2));
        float x = this.A07.getX() + ((float) (this.A07.getWidth() >> 1));
        float y = this.A07.getY() + ((float) (this.A07.getHeight() >> 1));
        if (this.A0O) {
            f = x - this.A0K;
        } else {
            f = this.A0K + x;
        }
        this.A01 = f;
        float f4 = this.A0L + y;
        this.A02 = f4;
        float f5 = this.A00;
        int i2 = (int) (x + ((f - x) * f5));
        int i3 = (int) (y + ((f4 - y) * f5));
        C86433p1 r3 = this.A0H;
        r3.A06.set(i2 - i, i3 - i, i2 + i, i3 + i);
        r3.setBounds(r3.A06);
        this.A0B.setBounds(this.A0H.getBounds());
    }

    public static void A03(ColourWheelView colourWheelView, Integer num) {
        for (C80563fN r1 : colourWheelView.A0J) {
            switch (num.intValue()) {
                case 0:
                    r1.Ax8(colourWheelView.A04);
                    break;
                case 1:
                    r1.AxD();
                    break;
                case 2:
                    r1.AxC();
                    break;
                case 3:
                    r1.AxB();
                    break;
                case 4:
                    r1.Ax7(colourWheelView.getColourAtCursor());
                    break;
            }
        }
    }

    private int getColourAtCursor() {
        int i = this.A05 - ((int) this.A01);
        int i2 = this.A06 - ((int) this.A02);
        double sqrt = Math.sqrt((double) ((i * i) + (i2 * i2)));
        float[] fArr = {BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f};
        fArr[0] = ((float) ((Math.atan2((double) i2, (double) (-i)) / 3.141592653589793d) * 180.0d)) + 180.0f;
        fArr[1] = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, (float) (sqrt / ((double) this.A0E))));
        return Color.HSVToColor(fArr);
    }

    private float getCursorOffset() {
        return this.A0N - ((float) (this.A0I.getHeight() >> 1));
    }

    private void setMode(C87693rC r4) {
        if (r4 != this.A0C) {
            this.A0C = r4;
            switch (r4.ordinal()) {
                case 0:
                    A01();
                    this.A08.A03(1.0d);
                    break;
                case 1:
                    this.A0I.A00();
                    this.A08.A03(0.0d);
                    break;
            }
            invalidate();
        }
    }

    public final void onDraw(Canvas canvas) {
        if (this.A09) {
            A02();
            this.A0H.setAlpha(C06420Oz.A03((int) (this.A00 * 255.0f), 0, 255));
            C86433p1 r1 = this.A0H;
            canvas.drawCircle((float) r1.A00, (float) r1.A01, ((float) r1.A02) + this.A03 + 2.0f, this.A0F);
            C86433p1 r12 = this.A0H;
            canvas.drawCircle((float) r12.A00, (float) r12.A01, ((float) r12.A02) + this.A03, this.A0G);
            this.A0B.draw(canvas);
            this.A0H.draw(canvas);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A0D) {
            return false;
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.A0D = false;
            setMode(C87693rC.GRADIENT_BUTTON);
        } else if (this.A0D) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setColourWheelStrokeWidth(float f) {
        this.A03 = f;
        this.A0F.setMaskFilter(new BlurMaskFilter(f + 2.0f, BlurMaskFilter.Blur.OUTER));
    }

    public final void A04() {
        A02();
        A00();
        setMode(C87693rC.COLOUR_WHEEL);
        this.A0D = true;
        this.A07.setVisibility(4);
        this.A09 = true;
        A03(this, Constants.ONE);
    }

    public final void onFinishInflate() {
        int A062 = AnonymousClass0Z0.A06(549040525);
        super.onFinishInflate();
        boolean z = false;
        if (getChildCount() == 2) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        this.A07 = getChildAt(1);
        A00();
        AnonymousClass0Z0.A0D(-253341821, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = AnonymousClass0Z0.A05(400456560);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.A0D = false;
            switch (this.A0C.ordinal()) {
                case 0:
                    if (!(!this.A08.A09())) {
                        this.A04 = getColourAtCursor();
                        A03(this, Constants.ZERO);
                    }
                    setMode(C87693rC.GRADIENT_BUTTON);
                    i = -512509594;
                    break;
                case 1:
                    AnonymousClass0Z0.A0C(487866055, A052);
                    return false;
            }
        } else if ((action == 2 || action == 0) && this.A0C == C87693rC.COLOUR_WHEEL) {
            this.A05 = (int) motionEvent.getX();
            this.A06 = (int) (motionEvent.getY() - getCursorOffset());
            A01();
            if (!(!this.A08.A09())) {
                A03(this, Constants.A0Y);
            }
        }
        i = -1720092406;
        AnonymousClass0Z0.A0C(i, A052);
        return true;
    }

    public void setBaseDrawable(Drawable drawable) {
        this.A0B = drawable.getConstantState().newDrawable();
    }

    public void setButtonRadius(float f) {
        this.A0A = f;
    }

    public ColourWheelView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColourWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColourWheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0G = new Paint(1);
        this.A0F = new Paint(1);
        this.A0O = C06400Ox.A02(context);
        setWillNotDraw(false);
        setClipChildren(false);
        FloatingIndicator floatingIndicator = new FloatingIndicator(context, (AttributeSet) null);
        this.A0I = floatingIndicator;
        floatingIndicator.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.A0I);
        TypedArray typedArray = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0s);
            this.A0E = (float) (typedArray.getDimensionPixelSize(2, 140) / 2);
            this.A0N = typedArray.getDimension(1, 80.0f);
            this.A0K = typedArray.getDimension(3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A0L = typedArray.getDimension(4, 92.0f);
            this.A03 = typedArray.getDimension(5, 2.0f);
            this.A0M = typedArray.getDimension(0, 40.0f);
            typedArray.recycle();
            this.A0H = new C86433p1((int) this.A03);
            this.A0G.setColor(-1);
            this.A0J = new HashSet();
            this.A04 = getColourAtCursor();
            this.A0A = 32.0f;
            this.A0F.setColor(C019000b.A00(context, C0003R.color.black_15_transparent));
            this.A0F.setMaskFilter(new BlurMaskFilter(this.A03 + 2.0f, BlurMaskFilter.Blur.OUTER));
            C81363gg r3 = new C81363gg(this);
            AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
            A002.A03(0.0d);
            A002.A02();
            A002.A07(r3);
            this.A08 = A002;
            setMode(C87693rC.GRADIENT_BUTTON);
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }
}
