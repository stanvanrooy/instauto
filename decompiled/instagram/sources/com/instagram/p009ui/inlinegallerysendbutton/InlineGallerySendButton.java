package com.instagram.p009ui.inlinegallerysendbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EM;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C170357Qa;
import p000X.C26771Ff;
import p000X.C27181Gu;

/* renamed from: com.instagram.ui.inlinegallerysendbutton.InlineGallerySendButton */
public class InlineGallerySendButton extends View implements AnonymousClass1E8 {
    public float A00;
    public AnonymousClass1EG A01;
    public C170357Qa A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public Bitmap A07;
    public Paint A08;
    public Paint A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final int A0F;
    public final int A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final Path A0K;

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    private void setPressedAlpha(boolean z) {
        if (z) {
            this.A0H.setAlpha((int) (((float) Color.alpha(this.A0F)) * 0.6f));
            this.A0I.setAlpha((int) (((float) Color.alpha(this.A0G)) * 0.6f));
        } else {
            this.A0H.setColor(this.A0F);
            this.A0I.setColor(this.A0G);
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
        float f = this.A04 * min;
        float f2 = (min - this.A0E) * this.A03;
        Canvas canvas2 = canvas;
        if (this.A07 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(canvas2.getWidth(), canvas2.getHeight(), Bitmap.Config.ALPHA_8);
            this.A07 = createBitmap;
            new Canvas(createBitmap).drawCircle(((float) canvas2.getWidth()) / 2.0f, ((float) canvas2.getHeight()) / 2.0f, (float) Math.floor((double) f2), this.A09);
        }
        canvas2.drawBitmap(this.A07, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A08);
        if (f != f2) {
            canvas2.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, f, this.A0I);
        }
        canvas2.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, f2, this.A0H);
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        float f3 = this.A0C;
        float f4 = width - (f3 / 2.0f);
        canvas2.rotate(this.A0A, width, height);
        canvas2.save();
        canvas2.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -(height - f4));
        canvas2.rotate(45.0f, width, height);
        this.A0K.moveTo(this.A0B + width, height);
        this.A0K.lineTo(width, height);
        this.A0K.lineTo(width, this.A0B + height);
        this.A0J.setAlpha(this.A05);
        canvas2.drawPath(this.A0K, this.A0J);
        canvas2.restore();
        canvas2.drawLine(width, f4 + this.A0D, width, f4 + f3, this.A0J);
        canvas2.rotate(-this.A0A, width, height);
    }

    public final void BOK(AnonymousClass1EG r12) {
        float A002 = (float) r12.A00();
        this.A04 = A002;
        this.A03 = 1.0f;
        int A012 = (int) C27181Gu.A01((double) A002, 1.0d, (double) this.A00, 0.0d, 255.0d);
        this.A05 = A012;
        this.A05 = (int) C27181Gu.A00((double) A012, 0.0d, 255.0d);
        invalidate();
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-2076428331);
        super.onAttachedToWindow();
        this.A01.A07(this);
        AnonymousClass0Z0.A0D(1414504619, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(1356301481);
        super.onDetachedFromWindow();
        this.A01.A08(this);
        AnonymousClass0Z0.A0D(1723865941, A062);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(1721702696);
        float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
        this.A00 = (min - this.A0E) / min;
        AnonymousClass0Z0.A0D(-1354363551, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r6 != 6) goto L_0x0029;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        C170357Qa r0;
        int A052 = AnonymousClass0Z0.A05(1223254815);
        if (isEnabled()) {
            int actionMasked = motionEvent.getActionMasked();
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (actionMasked != 0) {
                if (!(actionMasked == 1 || actionMasked == 3)) {
                    if (actionMasked != 5) {
                    }
                }
                if (pointerId == this.A06) {
                    setPressedAlpha(false);
                    if (!(actionMasked == 3 || (r0 = this.A02) == null)) {
                        r0.BME();
                    }
                }
                if (actionMasked != 6) {
                    this.A06 = -1;
                }
                i2 = -1623944975;
                AnonymousClass0Z0.A0C(i2, A052);
                return true;
            }
            int i3 = this.A06;
            if (i3 == -1) {
                this.A06 = pointerId;
                setPressedAlpha(true);
                i2 = -811670847;
                AnonymousClass0Z0.A0C(i2, A052);
                return true;
            }
            if (i3 == pointerId) {
                AnonymousClass0DB.A0K("InlineGallerySendButton", "The touch sequence shall not happen. Current pointer id: %s. Incoming: %s", Integer.valueOf(i3), Integer.valueOf(pointerId));
                i = 1214000182;
            } else {
                i = -1683737073;
            }
            AnonymousClass0Z0.A0C(i, A052);
            return false;
        }
        i = 648130266;
        AnonymousClass0Z0.A0C(i, A052);
        return false;
    }

    public final void BOH(AnonymousClass1EG r1) {
        invalidate();
    }

    public void setListener(C170357Qa r1) {
        this.A02 = r1;
    }

    public InlineGallerySendButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public InlineGallerySendButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public InlineGallerySendButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0K = new Path();
        this.A04 = 1.0f;
        this.A03 = 1.0f;
        this.A05 = 255;
        this.A06 = -1;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2Y, 0, 0);
        try {
            this.A0F = obtainStyledAttributes.getColor(5, -7829368);
            this.A0G = obtainStyledAttributes.getColor(7, -1);
            this.A0E = obtainStyledAttributes.getDimension(6, 10.0f);
            int color = obtainStyledAttributes.getColor(1, -16777216);
            this.A0B = obtainStyledAttributes.getDimension(2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A0C = obtainStyledAttributes.getDimension(3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A0D = obtainStyledAttributes.getDimension(4, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A0A = obtainStyledAttributes.getFloat(0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.A0H = paint;
            paint.setColor(this.A0F);
            this.A0H.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint(this.A0H);
            this.A0I = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.A0I.setColor(this.A0G);
            this.A0I.setStrokeWidth(this.A0E);
            Paint paint3 = new Paint(1);
            this.A0J = paint3;
            paint3.setColor(color);
            this.A0J.setStrokeCap(Paint.Cap.ROUND);
            this.A0J.setStrokeJoin(Paint.Join.MITER);
            this.A0J.setStrokeWidth(this.A0D);
            this.A0J.setStyle(Paint.Style.STROKE);
            int A002 = C019000b.A00(context, C0003R.color.black_40_transparent);
            Paint paint4 = new Paint(1);
            this.A09 = paint4;
            paint4.setShadowLayer(C06220Of.A03(context, 4), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A002);
            Paint paint5 = new Paint(1);
            this.A08 = paint5;
            paint5.setColorFilter(C26771Ff.A00(-16777216));
            AnonymousClass1EG A003 = AnonymousClass0P2.A00().A00();
            A003.A06(AnonymousClass1EA.A01(80.0d, 7.0d));
            this.A01 = A003;
            if (Build.VERSION.SDK_INT > 25) {
                setClickable(false);
                setFocusable(true);
                return;
            }
            setClickable(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
