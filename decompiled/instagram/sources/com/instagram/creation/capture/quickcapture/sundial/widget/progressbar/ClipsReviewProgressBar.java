package com.instagram.creation.capture.quickcapture.sundial.widget.progressbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass7HS;
import p000X.C019000b;
import p000X.C06420Oz;
import p000X.C199268fr;
import p000X.C25913Bc3;
import p000X.C60702kK;
import p000X.C88033rl;

public class ClipsReviewProgressBar extends View {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C88033rl A06;
    public final AnonymousClass7HS A07;
    public final Paint A08;

    private float A00(int i) {
        int i2 = this.A00;
        return ((float) getWidth()) * C06420Oz.A00(((float) i) / ((float) i2), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
    }

    private void A01(Canvas canvas, float f, float f2, int i) {
        this.A08.setColor(i);
        canvas.drawRect(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f + f2, (float) this.A03, this.A08);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            this.A07.setBounds(0, 0, (int) A00(this.A01), this.A03);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A03, C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
    }

    public void setPlaybackPosition(int i) {
        int min = Math.min(i, this.A06.A00);
        this.A01 = min;
        this.A07.setBounds(0, 0, (int) A00(min), this.A03);
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        A01(canvas, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) getWidth(), this.A02);
        int A022 = this.A06.A02();
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        for (int i = 0; i < A022; i++) {
            float A002 = A00(this.A06.A03(i));
            int i2 = 178;
            if (this.A01 < ((C199268fr) this.A06.A01.get(i)).A00) {
                i2 = 76;
            }
            A01(canvas, f, A002, C60702kK.A03(this.A04, i2));
            f += A002;
        }
        this.A07.draw(canvas);
        int A023 = this.A06.A02();
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        for (int i3 = 0; i3 < A023; i3++) {
            f2 += A00(this.A06.A03(i3));
            float f3 = (float) this.A05;
            A01(canvas, f2 - f3, f3, this.A04);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(1667956959);
        this.A07.A00(i, i2);
        AnonymousClass0Z0.A0D(180472124, A062);
    }

    public ClipsReviewProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public ClipsReviewProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipsReviewProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = new C88033rl();
        this.A08 = new Paint(1);
        this.A00 = 15000;
        Resources resources = getResources();
        this.A03 = resources.getDimensionPixelSize(C0003R.dimen.clips_progress_bar_height_when_collapsed);
        this.A05 = resources.getDimensionPixelSize(C0003R.dimen.clips_progress_bar_segment_head_thickness);
        this.A02 = C019000b.A00(context, C0003R.color.clips_progress_bar_background_color);
        this.A04 = C019000b.A00(context, C0003R.color.clips_progress_bar_highlight_color);
        this.A07 = new AnonymousClass7HS(context);
    }
}
