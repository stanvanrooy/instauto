package com.instagram.creation.capture.quickcapture.sundial.widget.lyricsrecordingview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0N0;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.C019000b;
import p000X.C175917fH;

public class LyricsCaptureView extends View {
    public int A00;
    public int A01;
    public C175917fH A02;
    public boolean A03;
    public final TextPaint A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseArray A08;
    public final Interpolator A09;

    private StaticLayout A00(int i) {
        AnonymousClass0a4.A06(this.A02);
        StaticLayout staticLayout = (StaticLayout) this.A08.get(i);
        if (staticLayout != null) {
            return staticLayout;
        }
        StaticLayout staticLayout2 = new StaticLayout(this.A02.A00(i), this.A04, getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false);
        this.A08.put(i, staticLayout2);
        return staticLayout2;
    }

    private void A01() {
        C175917fH r0;
        int i = this.A01;
        if (i == -1 || (r0 = this.A02) == null) {
            this.A00 = -1;
            this.A03 = false;
            return;
        }
        int AFU = r0.AFU(i);
        this.A00 = AFU;
        boolean z = true;
        if (AFU + 1 < this.A02.ARw()) {
            if (this.A02.AWd(this.A00 + 1) > this.A01 + 500) {
                z = false;
            }
            this.A03 = z;
            return;
        }
        this.A03 = false;
    }

    private void A02(int i) {
        this.A04.setShadowLayer((float) this.A07, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Color.argb(i, Color.red(this.A06), Color.green(this.A06), Color.blue(this.A06)));
    }

    private float getLineHeight() {
        return this.A04.getFontMetrics().bottom - this.A04.getFontMetrics().top;
    }

    private float getTransitionProgress() {
        C175917fH r2 = this.A02;
        AnonymousClass0a4.A06(r2);
        if (this.A00 + 1 >= r2.ARw()) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        int AWd = this.A02.AWd(this.A00 + 1);
        int max = Math.max(AWd - 500, this.A02.AWd(this.A00));
        return this.A09.getInterpolation(Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((float) (this.A01 - max)) / ((float) (AWd - max))));
    }

    public final void onDraw(Canvas canvas) {
        if (this.A01 != -1 && this.A02 != null) {
            StaticLayout A002 = A00(this.A00);
            float lineHeight = getLineHeight();
            float transitionProgress = getTransitionProgress();
            float height = (((float) A002.getHeight()) + lineHeight) * transitionProgress;
            float f = (1.0f - transitionProgress) * 1.0f;
            if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                canvas.save();
                canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((float) (this.A05 + A002.getLineBaseline(0))) - height);
                int i = (int) (f * 255.0f);
                this.A04.setAlpha(i);
                A02(i);
                A002.draw(canvas);
                canvas.restore();
            }
            float height2 = ((float) (this.A05 + A002.getHeight())) - height;
            if (this.A00 + 1 < this.A02.ARw()) {
                StaticLayout A003 = A00(this.A00 + 1);
                float f2 = (transitionProgress * 0.5f) + 0.5f;
                if (f2 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    canvas.save();
                    canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, height2 + lineHeight + ((float) A003.getLineBaseline(0)));
                    int i2 = (int) (f2 * 255.0f);
                    this.A04.setAlpha(i2);
                    A02(i2);
                    A003.draw(canvas);
                    canvas.restore();
                }
                height2 = height2 + lineHeight + ((float) A003.getHeight());
            }
            if (this.A03 && this.A00 + 2 < this.A02.ARw()) {
                StaticLayout A004 = A00(this.A00 + 2);
                float f3 = transitionProgress * 0.5f;
                if (f3 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    canvas.save();
                    canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, height2 + lineHeight + ((float) A004.getLineBaseline(0)));
                    int i3 = (int) (f3 * 255.0f);
                    this.A04.setAlpha(i3);
                    A02(i3);
                    A004.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public void setLyrics(C175917fH r2) {
        this.A02 = r2;
        this.A08.clear();
        A01();
        invalidate();
    }

    public void setTrackTimeMs(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            A01();
            invalidate();
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.A05;
        float lineHeight = getLineHeight();
        setMeasuredDimension(size, (int) (((float) i3) + (9.0f * lineHeight) + (lineHeight * 5.0f)));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(-1215191218);
        super.onSizeChanged(i, i2, i3, i4);
        this.A08.clear();
        AnonymousClass0Z0.A0D(98534801, A062);
    }

    public LyricsCaptureView(Context context) {
        this(context, (AttributeSet) null);
    }

    public LyricsCaptureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LyricsCaptureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A08 = new SparseArray();
        this.A09 = new AccelerateDecelerateInterpolator();
        this.A01 = -1;
        this.A00 = -1;
        Resources resources = context.getResources();
        this.A05 = resources.getDimensionPixelSize(C0003R.dimen.lyrics_capture_view_distance_from_top);
        TextPaint textPaint = new TextPaint(1);
        this.A04 = textPaint;
        textPaint.setColor(C019000b.A00(context, C0003R.color.lyrics_capture_view_text_color));
        this.A04.setTextAlign(Paint.Align.LEFT);
        this.A04.setTypeface(AnonymousClass0N0.A00());
        this.A04.setTextSize((float) resources.getDimensionPixelSize(C0003R.dimen.lyrics_capture_view_font_size));
        this.A07 = context.getResources().getDimensionPixelSize(C0003R.dimen.lyrics_capture_view_shadow_radius);
        this.A06 = C019000b.A00(context, C0003R.color.lyrics_capture_view_shadow_color);
        A02(255);
    }
}
