package p000X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.1Xc  reason: invalid class name and case insensitive filesystem */
public final class C31241Xc implements C31251Xd {
    public Paint A00;
    public final AlphaAnimation A01 = new AlphaAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
    public final AlphaAnimation A02 = new AlphaAnimation(-0.2f, 0.2f);
    public final RefreshableNestedScrollingParent A03;
    public final Drawable A04;
    public final LayerDrawable A05;
    public final Transformation A06 = new Transformation();

    public final void Bbh(RefreshableNestedScrollingParent refreshableNestedScrollingParent, View view, Canvas canvas, int i, float f, boolean z) {
        float f2 = f;
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            this.A01.cancel();
            this.A02.cancel();
            return;
        }
        Canvas canvas2 = canvas;
        canvas2.save();
        try {
            canvas2.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (view.getTop() + view.getPaddingTop()));
            float width = (float) canvas2.getWidth();
            int i2 = i;
            float f3 = (float) i2;
            float f4 = f * f3;
            canvas2.clipRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, width, 1.0f + f4);
            Paint paint = this.A00;
            if (paint != null) {
                canvas2.drawLine(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f4, width, f4, paint);
            }
            int i3 = (int) ((width - f3) / 2.0f);
            if (!this.A03.A01) {
                this.A05.setBounds(i3, 0, i3 + i, i2);
                this.A05.setLevel((int) (Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2) * 10000.0f));
                this.A05.draw(canvas2);
            } else {
                if (this.A02.getTransformation(refreshableNestedScrollingParent.getDrawingTime(), this.A06)) {
                    float abs = 1.2f - Math.abs(this.A06.getAlpha());
                    canvas2.scale(abs, abs, width / 2.0f, (float) (i / 2));
                }
                if (this.A01.getTransformation(refreshableNestedScrollingParent.getDrawingTime(), this.A06)) {
                    float alpha = this.A06.getAlpha();
                    this.A04.setBounds(i3, 0, i3 + i, i2);
                    this.A04.setLevel((int) (alpha * 10000.0f));
                    this.A04.draw(canvas2);
                    AnonymousClass1E1.A0I(refreshableNestedScrollingParent);
                }
            }
        } finally {
            canvas2.restore();
        }
    }

    public final void Azl(RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        this.A01.cancel();
        this.A02.cancel();
    }

    public final void BiF(boolean z) {
        if (z) {
            this.A02.reset();
            this.A02.setStartTime(-1);
            this.A02.start();
            this.A01.reset();
            this.A01.setStartTime(-1);
            this.A01.start();
            this.A03.invalidate();
            return;
        }
        this.A01.cancel();
        this.A02.cancel();
    }

    public C31241Xc(RefreshableNestedScrollingParent refreshableNestedScrollingParent, boolean z) {
        Context context = refreshableNestedScrollingParent.getContext();
        this.A03 = refreshableNestedScrollingParent;
        if (z) {
            Paint paint = new Paint();
            this.A00 = paint;
            paint.setColor(AnonymousClass1BA.A01(context, C0003R.attr.dividerColor));
            this.A00.setStrokeWidth(1.0f);
        }
        this.A05 = (LayerDrawable) C019000b.A03(context, C0003R.C0004drawable.refreshable_progress_drawable);
        this.A04 = C019000b.A03(context, C0003R.C0004drawable.refreshable_spinner_drawable);
        this.A02.setDuration(300);
        this.A01.setDuration(700);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.setRepeatCount(-1);
    }
}
