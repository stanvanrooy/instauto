package com.instagram.creation.capture.quickcapture.sundial.widget.progressbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass7HS;
import p000X.C019000b;
import p000X.C06420Oz;
import p000X.C198898fG;
import p000X.C199058fW;
import p000X.C199228fn;
import p000X.C25913Bc3;
import p000X.C88033rl;

public class ClipsCaptureProgressBar extends View {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ValueAnimator A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C88033rl A0A;
    public final Paint A0B;
    public final AnonymousClass7HS A0C;

    private float A00(int i) {
        int i2 = this.A01;
        return ((float) getWidth()) * C06420Oz.A00(((float) i) / ((float) i2), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
    }

    private void A01(Canvas canvas, float f, float f2, int i) {
        this.A0B.setColor(i);
        canvas.drawRect(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f + f2, (float) this.A00, this.A0B);
    }

    public static void A02(ClipsCaptureProgressBar clipsCaptureProgressBar) {
        clipsCaptureProgressBar.A0C.setBounds(0, 0, (int) clipsCaptureProgressBar.A00(clipsCaptureProgressBar.A0A.A00), clipsCaptureProgressBar.A00);
    }

    public static void A03(ClipsCaptureProgressBar clipsCaptureProgressBar, int i) {
        int i2 = clipsCaptureProgressBar.A03;
        if (i2 != i) {
            clipsCaptureProgressBar.A03 = i;
            if (i2 == 1 || i == 1) {
                ValueAnimator valueAnimator = clipsCaptureProgressBar.A04;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    clipsCaptureProgressBar.A04 = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
                ofFloat.addUpdateListener(new C198898fG(clipsCaptureProgressBar));
                ofFloat.addListener(new C199058fW(clipsCaptureProgressBar));
                ofFloat.start();
                clipsCaptureProgressBar.A04 = ofFloat;
            }
            clipsCaptureProgressBar.invalidate();
        }
    }

    public final void A04() {
        if (!this.A0A.A08()) {
            C88033rl r2 = this.A0A;
            AnonymousClass0a4.A0A(!r2.A08());
            List list = r2.A01;
            list.remove(list.size() - 1);
            C88033rl.A01(r2);
            A02(this);
            invalidate();
        }
    }

    public final void A05(int i) {
        this.A0A.A07(new C199228fn(i));
        boolean z = false;
        if (this.A0A.A00 <= this.A01) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "segment would exceeds maximum duration");
        A02(this);
        invalidate();
    }

    public final void A06(int i, int i2) {
        C199228fn r1 = (C199228fn) this.A0A.A04(i);
        r1.A00 = i2;
        this.A0A.A06(i, r1);
        boolean z = false;
        if (this.A0A.A00 <= this.A01) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "segment exceeds maximum duration");
        A02(this);
        invalidate();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A07, C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
    }

    public void setMaxCaptureDurationInMs(int i) {
        if (this.A0A.A00 <= i) {
            this.A01 = i;
            A02(this);
            invalidate();
            return;
        }
        throw new IllegalStateException("current segments amount for more than maxCaptureDurationInMs");
    }

    public void setTargetDuration(int i) {
        this.A02 = i;
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r5 != (r6 - 1)) goto L_0x0031;
     */
    public final void onDraw(Canvas canvas) {
        boolean z;
        A01(canvas, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) getWidth(), this.A05);
        int i = this.A02;
        if (i > 0) {
            A01(canvas, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A00(i), this.A08);
        }
        this.A0C.draw(canvas);
        int A022 = this.A0A.A02();
        int i2 = 0;
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        while (i2 < A022) {
            if (this.A03 == 1) {
                z = true;
            }
            z = false;
            float A002 = A00(this.A0A.A03(i2));
            if (!z) {
                float f2 = (float) this.A09;
                A01(canvas, (f + A002) - f2, f2, this.A08);
            }
            f += A002;
            i2++;
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(749698412);
        this.A0C.A00(i, i2);
        AnonymousClass0Z0.A0D(1107539849, A062);
    }

    public ClipsCaptureProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public ClipsCaptureProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipsCaptureProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0A = new C88033rl();
        this.A0B = new Paint(1);
        this.A03 = 0;
        this.A01 = 15000;
        Resources resources = getResources();
        this.A07 = resources.getDimensionPixelSize(C0003R.dimen.clips_progress_bar_height_when_expanded);
        this.A06 = resources.getDimensionPixelSize(C0003R.dimen.clips_progress_bar_height_when_collapsed);
        this.A09 = resources.getDimensionPixelSize(C0003R.dimen.clips_progress_bar_segment_head_thickness);
        this.A05 = C019000b.A00(context, C0003R.color.clips_progress_bar_background_color);
        this.A08 = C019000b.A00(context, C0003R.color.clips_progress_bar_highlight_color);
        this.A00 = this.A06;
        this.A0C = new AnonymousClass7HS(context);
    }
}
