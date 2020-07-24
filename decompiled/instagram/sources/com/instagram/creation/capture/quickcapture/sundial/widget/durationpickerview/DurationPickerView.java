package com.instagram.creation.capture.quickcapture.sundial.widget.durationpickerview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass7J4;
import p000X.AnonymousClass7J5;
import p000X.AnonymousClass7J7;
import p000X.AnonymousClass7J8;
import p000X.AnonymousClass8BU;
import p000X.C019000b;
import p000X.C06420Oz;
import p000X.C81053gA;
import p000X.C86423p0;
import p000X.C87603r2;
import p000X.C87613r3;

public class DurationPickerView extends View implements AnonymousClass8BU {
    public float A00;
    public int A01;
    public long A02;
    public AnonymousClass7J8 A03;
    public boolean A04;
    public float[] A05;
    public float A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final C87603r2 A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Paint A0I;
    public final Rect A0J;
    public final AnonymousClass7J4 A0K;
    public final C87613r3 A0L;
    public final C81053gA A0M;

    private void A00() {
        int leftInnerEdge = this.A0D.getLeftInnerEdge();
        this.A0J.set(leftInnerEdge, this.A0D.getTopInnerEdge(), Math.round(((float) (this.A0D.getRightInnerEdge() - leftInnerEdge)) * this.A06) + leftInnerEdge, this.A0D.getBottomInnerEdge());
        invalidate();
    }

    public final void A8m() {
        if (this.A04) {
            this.A04 = false;
            this.A02 = System.currentTimeMillis();
            invalidate();
        }
    }

    public final void AdA(int i, int i2, int i3, int i4, List list) {
        this.A01 = i;
        C87603r2 r2 = this.A0D;
        float f = (float) (i - 0);
        r2.setMinimumRange(((float) i4) / f);
        r2.A05(((float) (i2 - 0)) / f, ((float) ((i2 + i3) - 0)) / f);
        invalidate();
        this.A05 = new float[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.A05[i5] = ((float) (((Integer) list.get(i5)).intValue() - 0)) / f;
        }
        this.A0D.setSnapValues(this.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0063, code lost:
        if (r0 < 1.0f) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00df, code lost:
        if (r0 > com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x0065;
     */
    public final void onDraw(Canvas canvas) {
        C87613r3 r2 = this.A0L;
        C87613r3 r22 = this.A0L;
        canvas.drawRect((float) this.A0L.A03(), (float) (r2.getBounds().top + r2.A05), (float) this.A0D.getLeftInnerEdge(), (float) (r22.getBounds().bottom - r22.A05), this.A0I);
        this.A0L.draw(canvas);
        boolean z = this.A04;
        if ((z && this.A00 < 1.0f) || (!z && this.A00 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)) {
            long currentTimeMillis = System.currentTimeMillis();
            float f = ((float) (currentTimeMillis - this.A02)) / 150.0f;
            this.A02 = currentTimeMillis;
            if (z) {
                float min = Math.min(1.0f, this.A00 + f);
                this.A00 = min;
            } else {
                float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A00 - f);
                this.A00 = max;
            }
            invalidate();
            this.A0A.setAlpha(Math.round(this.A00 * 255.0f));
        }
        canvas.drawRect(this.A0J, this.A0A);
        this.A0K.draw(canvas);
        float top = ((float) this.A0D.getTop()) + (((float) this.A0D.getHeight()) / 2.0f);
        float left = (float) (this.A0D.getLeft() + this.A07);
        float right = ((float) ((this.A0D.getRight() - this.A07) - this.A09)) - left;
        float leftTrimmerValue = this.A0D.getLeftTrimmerValue();
        int i = 0;
        while (true) {
            float[] fArr = this.A05;
            if (i < fArr.length) {
                float f2 = fArr[i];
                if (f2 > leftTrimmerValue) {
                    float f3 = (f2 * right) + left;
                    canvas.drawCircle(f3, top, (float) this.A08, this.A0B);
                    canvas.drawCircle(f3, top, (float) this.A08, this.A0C);
                }
                i++;
            } else {
                this.A0D.draw(canvas);
                return;
            }
        }
    }

    public void setProgress(float f) {
        if (!this.A04) {
            this.A04 = true;
            this.A02 = System.currentTimeMillis();
            invalidate();
        }
        float A002 = C06420Oz.A00(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        if (A002 != this.A06) {
            this.A06 = A002;
            A00();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(1456064567);
        int i5 = i2;
        int i6 = i;
        super.onSizeChanged(i6, i5, i3, i4);
        this.A0L.setBounds(0, 0, i6, i5);
        float f = (float) i5;
        float f2 = f / 2.0f;
        this.A0K.setBounds(0, Math.round(f2 - (((float) this.A0F) / 2.0f)), this.A0L.A04(), Math.round(f2 + (((float) this.A0F) / 2.0f)));
        this.A0D.layout(0, 0, i6, i5);
        A00();
        LinearGradient linearGradient = new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, (float) i6, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A0G, this.A0H, Shader.TileMode.CLAMP);
        this.A0D.setShader(linearGradient);
        this.A0A.setShader(linearGradient);
        this.A0B.setShader(linearGradient);
        AnonymousClass0Z0.A0D(1689719783, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r1 > ((float) r6.A0D.getRight())) goto L_0x0042;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int A052 = AnonymousClass0Z0.A05(-974043255);
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (this.A0D.onTouchEvent(motionEvent)) {
            i = -44253811;
        } else {
            float x = motionEvent.getX();
            if (action == 0) {
                if (((float) this.A0D.getLeftInnerEdge()) <= x) {
                    z = true;
                }
                z = false;
                if (z) {
                    C87603r2 r2 = this.A0D;
                    C87603r2.A04(r2, r2.A05.A02(motionEvent.getX()));
                    r2.A09 = true;
                    r2.A07 = true;
                    r2.A01 = motionEvent.getX();
                    r2.A04 = motionEvent.getEventTime();
                    C81053gA r0 = r2.A06;
                    if (r0 != null) {
                        r0.BSB();
                    }
                    i = -1120700945;
                }
            }
            AnonymousClass0Z0.A0C(-857072612, A052);
            return false;
        }
        AnonymousClass0Z0.A0C(i, A052);
        return true;
    }

    public void setDelegate(AnonymousClass7J8 r1) {
        this.A03 = r1;
    }

    public DurationPickerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public DurationPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DurationPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0M = new AnonymousClass7J7(this);
        this.A01 = 100;
        this.A05 = new float[0];
        Resources resources = context.getResources();
        this.A0E = resources.getDimensionPixelSize(C0003R.dimen.duration_picker_corner_radius);
        this.A09 = resources.getDimensionPixelSize(C0003R.dimen.duration_picker_trim_handle_width);
        this.A0F = resources.getDimensionPixelSize(C0003R.dimen.duration_picker_sound_wave_bar_max_height);
        this.A07 = resources.getDimensionPixelSize(C0003R.dimen.duration_picker_stroke_width);
        this.A08 = resources.getDimensionPixelOffset(C0003R.dimen.duration_picker_suggested_transition_time_dot_radius);
        this.A0G = C019000b.A00(context, C0003R.color.duration_picker_gradient_color_0);
        this.A0H = C019000b.A00(context, C0003R.color.duration_picker_gradient_color_1);
        int A012 = AnonymousClass1BA.A01(context, C0003R.attr.durationPickerBackgroundTrimmerColor);
        int i2 = this.A07;
        int i3 = this.A0E;
        int i4 = this.A09;
        C87613r3 r2 = new C87613r3(A012, i3, i2);
        if (i4 > 0) {
            C86423p0 r1 = new C86423p0(i4, A012);
            r1.A00((Drawable) null, i2 >> 1);
            r2.A08(r1);
        }
        r2.A06(0);
        this.A0L = r2;
        Paint paint = new Paint();
        this.A0I = paint;
        paint.setColor(A012);
        this.A0J = new Rect();
        this.A0A = new Paint(1);
        int A013 = AnonymousClass1BA.A01(context, C0003R.attr.durationPickerSoundwaveColor);
        Paint paint2 = new Paint(1);
        this.A0B = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.A0C = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.A0C.setStrokeWidth((float) resources.getDimensionPixelSize(C0003R.dimen.duration_picker_suggested_transition_time_dot_stroke_width));
        this.A0C.setColor(A013);
        this.A0K = new AnonymousClass7J4(resources.getDimensionPixelSize(C0003R.dimen.duration_picker_sound_wave_bar_width), A013, new AnonymousClass7J5(this));
        C87603r2 r7 = new C87603r2(context);
        this.A0D = r7;
        int i5 = this.A07;
        int i6 = this.A0E;
        int i7 = this.A09;
        Drawable A032 = C019000b.A03(context, C0003R.C0004drawable.duration_picker_trim_handle_icon);
        C87613r3 r22 = new C87613r3(-16777216, i6, i5);
        if (i7 > 0) {
            C86423p0 r12 = new C86423p0(i7, -16777216);
            r12.A00(A032, i5 >> 1);
            r22.A08(r12);
        }
        r22.A06(0);
        r7.A05 = r22;
        r7.invalidate();
        this.A0D.setListener(this.A0M);
    }
}
