package com.instagram.p009ui.widget.rangeseekbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.base.IgTextView;
import p000X.AnonymousClass0Z0;
import p000X.C019000b;
import p000X.C06420Oz;
import p000X.C23138A9d;
import p000X.C27513CGd;
import p000X.C27518CGi;
import p000X.C52312Oh;
import p000X.C60512k1;
import p000X.CE5;

/* renamed from: com.instagram.ui.widget.rangeseekbar.RangeSeekBar */
public class RangeSeekBar extends LinearLayout implements C52312Oh {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05 = 0;
    public int A06;
    public C27518CGi A07;
    public C23138A9d A08;
    public float A09;
    public float A0A;
    public float A0B;
    public int A0C;
    public Paint A0D;
    public Paint A0E;
    public Paint A0F;
    public Paint A0G;
    public C60512k1 A0H;
    public boolean A0I = false;

    public final boolean B0i(C60512k1 r2, float f, float f2) {
        this.A0I = true;
        return false;
    }

    public final boolean BNi(C60512k1 r2, float f, float f2) {
        return false;
    }

    public final void BTR(C60512k1 r2) {
        this.A0I = false;
        invalidate();
    }

    private void A00(Context context) {
        this.A04 = Float.NaN;
        this.A03 = Float.NaN;
        this.A0H = new C60512k1(context, this);
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.A0D = paint;
        paint.setColor(C019000b.A00(context, C0003R.color.igds_primary_button));
        this.A0D.setAntiAlias(true);
        this.A0D.setStrokeWidth(resources.getDimension(C0003R.dimen.ig_range_seek_bar_stroke_width));
        Paint paint2 = new Paint();
        this.A0E = paint2;
        paint2.setColor(C019000b.A00(context, C0003R.color.igds_tertiary_text));
        this.A0E.setAntiAlias(true);
        this.A0E.setStrokeWidth(resources.getDimension(C0003R.dimen.ig_range_seek_bar_stroke_width));
        Paint paint3 = new Paint();
        this.A0G = paint3;
        paint3.setColor(C019000b.A00(context, C0003R.color.igds_primary_button));
        this.A0G.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.A0F = paint4;
        paint4.setColor(C019000b.A00(context, C0003R.color.igds_tertiary_icon));
        this.A0F.setAntiAlias(true);
        this.A0F.setAlpha(127);
        this.A0C = (int) resources.getDimension(C0003R.dimen.ig_range_seek_bar_thumb_radius);
        this.A06 = (int) resources.getDimension(C0003R.dimen.ig_range_seek_bar_thumb_background_radius);
    }

    public static void A01(RangeSeekBar rangeSeekBar) {
        C27518CGi cGi = rangeSeekBar.A07;
        if (cGi != null) {
            float f = rangeSeekBar.A04;
            float f2 = rangeSeekBar.A00;
            if (f > f2) {
                f = f2;
            }
            float f3 = rangeSeekBar.A03;
            if (f3 > f2) {
                f3 = f2;
            }
            cGi.BGy(f, f3);
        }
    }

    private void setCurrentPosition(float f) {
        if (this.A08 != null) {
            float f2 = this.A02;
            float f3 = this.A01;
            float A012 = C06420Oz.A01(f, (float) this.A06, (float) getRightBound(), f2, f3);
            if (this.A08 == C23138A9d.START) {
                this.A04 = C06420Oz.A00(A012, f2, this.A03);
            } else {
                this.A03 = C06420Oz.A00(A012, this.A04, f3);
            }
            invalidate();
            A01(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007b, code lost:
        r3 = (int) getContext().getResources().getDimension(com.facebook.C0003R.dimen.ig_range_seek_bar_thumb_buffer);
     */
    public final void A02(C27513CGd cGd) {
        float endThumbXWithBuffer;
        float startThumbX;
        float width;
        int dimension;
        int i;
        CE5 ce5 = cGd.A00;
        IgTextView igTextView = ce5.A08;
        IgTextView igTextView2 = ce5.A07;
        int i2 = (int) ((float) ce5.A01);
        int i3 = (int) ((float) ce5.A00);
        RangeSeekBar rangeSeekBar = ce5.A09;
        float f = (float) i2;
        float f2 = this.A00;
        if (f >= f2) {
            i2 = (int) f2;
        }
        igTextView.setText(String.valueOf(i2));
        float f3 = (float) i3;
        float f4 = this.A00;
        if (f3 >= f4) {
            i3 = (int) f4;
        }
        igTextView2.setText(String.valueOf(i3));
        if (f3 >= this.A00) {
            float f5 = this.A01;
            endThumbXWithBuffer = C06420Oz.A01(f5, this.A02, f5, (float) this.A06, (float) getRightBound());
        } else {
            endThumbXWithBuffer = rangeSeekBar.getEndThumbXWithBuffer();
        }
        Resources resources = getResources();
        int dimension2 = ((int) endThumbXWithBuffer) - ((int) resources.getDimension(C0003R.dimen.ig_range_seek_bar_text_offset));
        float f6 = this.A00;
        if (f >= f6) {
            startThumbX = C06420Oz.A01(f6, this.A02, this.A01, (float) this.A06, (float) getRightBound());
        } else {
            startThumbX = rangeSeekBar.getStartThumbX();
        }
        getResources();
        int dimension3 = ((int) startThumbX) - ((int) resources.getDimension(C0003R.dimen.ig_range_seek_bar_text_offset));
        if (rangeSeekBar.getWidth() != 0 && dimension3 >= (i = dimension2 - dimension)) {
            if (rangeSeekBar.A08 == C23138A9d.START) {
                dimension3 = i;
            } else {
                dimension2 = dimension3 + dimension;
            }
        }
        if (dimension2 < rangeSeekBar.getWidth() - igTextView2.getWidth()) {
            width = (float) dimension2;
        } else {
            width = (float) (rangeSeekBar.getWidth() - igTextView2.getWidth());
        }
        igTextView2.setX(width);
        float f7 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (dimension3 > 0) {
            f7 = (float) dimension3;
        }
        igTextView.setX(f7);
    }

    public float getEndThumbX() {
        return C06420Oz.A01(this.A03, this.A02, this.A01, (float) this.A06, (float) getRightBound());
    }

    public float getEndThumbXWithBuffer() {
        return C06420Oz.A01(this.A03 + ((float) this.A05), this.A02, this.A01, (float) this.A06, (float) getRightBound());
    }

    public float getStartThumbX() {
        return C06420Oz.A01(this.A04, this.A02, this.A01, (float) this.A06, (float) getRightBound());
    }

    private int getCenterY() {
        return getMeasuredHeight() >> 1;
    }

    private int getLeftBound() {
        return this.A06;
    }

    private int getRightBound() {
        return getWidth() - this.A06;
    }

    private void setCurrentThumb(float f) {
        C23138A9d a9d;
        C23138A9d a9d2;
        float abs = Math.abs(getEndThumbXWithBuffer() - f);
        float abs2 = Math.abs(getStartThumbX() - f);
        if (abs == abs2) {
            if (getStartThumbX() < f) {
                a9d2 = C23138A9d.END;
            } else if (f < getStartThumbX()) {
                a9d2 = C23138A9d.START;
            } else {
                return;
            }
            this.A08 = a9d2;
            return;
        }
        if (abs < abs2) {
            a9d = C23138A9d.END;
        } else {
            a9d = C23138A9d.START;
        }
        this.A08 = a9d;
    }

    public final void B1B(C60512k1 r2, float f, float f2, float f3, float f4, float f5) {
        this.A0B = getStartThumbX();
        this.A0A = getEndThumbX();
    }

    public final boolean B1J(C60512k1 r3, float f, float f2, float f3, float f4, boolean z) {
        getParent().requestDisallowInterceptTouchEvent(true);
        setCurrentThumb(this.A09);
        return true;
    }

    public final void dispatchDraw(Canvas canvas) {
        float startThumbX;
        float endThumbXWithBuffer;
        float measuredHeight = (float) (getMeasuredHeight() >> 1);
        float f = this.A04;
        float f2 = this.A00;
        if (f > f2) {
            startThumbX = C06420Oz.A01(f2, this.A02, this.A01, (float) this.A06, (float) getRightBound());
        } else {
            startThumbX = getStartThumbX();
        }
        if (this.A03 > this.A00) {
            float f3 = this.A01;
            endThumbXWithBuffer = C06420Oz.A01(f3, this.A02, f3, (float) this.A06, (float) getRightBound());
        } else {
            endThumbXWithBuffer = getEndThumbXWithBuffer();
        }
        Canvas canvas2 = canvas;
        if (this.A0I) {
            float f4 = endThumbXWithBuffer;
            if (this.A08 == C23138A9d.START) {
                f4 = startThumbX;
            }
            canvas.drawCircle(f4, measuredHeight, (float) this.A06, this.A0F);
        } else {
            this.A08 = null;
        }
        canvas2.drawLine((float) this.A06, measuredHeight, (float) getRightBound(), measuredHeight, this.A0E);
        canvas.drawLine(startThumbX, measuredHeight, endThumbXWithBuffer, measuredHeight, this.A0D);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A0C, this.A0G);
        canvas.drawCircle(endThumbXWithBuffer, measuredHeight, (float) this.A0C, this.A0G);
    }

    public C23138A9d getCurrentThumb() {
        return this.A08;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C60512k1 r5;
        float f;
        float x = motionEvent.getX();
        this.A09 = x;
        setCurrentThumb(x);
        if (this.A0B <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            this.A0B = getStartThumbX();
        }
        if (this.A0A <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            this.A0A = getEndThumbX();
        }
        C23138A9d a9d = this.A08;
        if (a9d == C23138A9d.START) {
            r5 = this.A0H;
            f = this.A0B;
        } else {
            if (a9d == C23138A9d.END) {
                r5 = this.A0H;
                f = this.A0A;
            }
            return this.A0H.B7a(motionEvent);
        }
        float y = getY();
        r5.A08.A05((double) f, true);
        r5.A09.A05((double) y, true);
        C60512k1.A00(r5);
        return this.A0H.B7a(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(764571131);
        boolean BS5 = this.A0H.BS5(motionEvent);
        AnonymousClass0Z0.A0C(-2030258390, A052);
        return BS5;
    }

    public void setBufferSize(int i) {
        this.A05 = i;
    }

    public void setRangeSeekBarChangeListener(C27518CGi cGi) {
        this.A07 = cGi;
    }

    public final void B13(C60512k1 r1, float f, float f2, float f3, boolean z) {
        setCurrentPosition(f);
    }

    public RangeSeekBar(Context context) {
        super(context);
        A00(context);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }
}
