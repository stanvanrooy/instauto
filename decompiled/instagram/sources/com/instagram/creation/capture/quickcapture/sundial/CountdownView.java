package com.instagram.creation.capture.quickcapture.sundial;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.C019000b;
import p000X.C06420Oz;
import p000X.C169317Lj;
import p000X.C257219z;

public class CountdownView extends View {
    public float A00;
    public int A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final Rect A05;
    public final RectF A06;
    public final TextPaint A07;
    public final String[] A08;
    public final AnonymousClass1EG A09;

    public void setProgress(float f) {
        this.A00 = f;
        int A012 = (int) C06420Oz.A01(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, 2.999f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        if (this.A01 != A012) {
            this.A01 = A012;
            AnonymousClass1EG r3 = this.A09;
            r3.A05(0.0d, true);
            r3.A03(1.0d);
            C257219z.A01.A00();
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = (float) getWidth();
        float height = (float) getHeight();
        float f = this.A02 / 2.0f;
        float A012 = C06420Oz.A01(this.A00, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 360.0f);
        canvas.save();
        RectF rectF = this.A06;
        float f2 = this.A03;
        float f3 = f + f2;
        rectF.set(f3, f3, (width - f) - f2, (height - f) - f2);
        canvas.drawArc(this.A06, A012 - 90.0f, 360.0f - A012, false, this.A04);
        canvas.restore();
        float width2 = (float) getWidth();
        float height2 = (float) getHeight();
        String str = this.A08[this.A01];
        this.A07.getTextBounds(str, 0, str.length(), this.A05);
        canvas.drawText(str, width2 / 2.0f, (height2 / 2.0f) + (((float) this.A05.height()) / 2.0f), this.A07);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A07.setTextSize(((float) getWidth()) * 0.375f);
    }

    public CountdownView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CountdownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = new Rect();
        this.A06 = new RectF();
        String[] strArr = new String[3];
        int i2 = 0;
        while (i2 < 3) {
            int i3 = i2 + 1;
            strArr[i2] = String.valueOf(i3);
            i2 = i3;
        }
        this.A08 = strArr;
        this.A01 = 0;
        Resources resources = context.getResources();
        this.A02 = (float) resources.getDimensionPixelSize(C0003R.dimen.clips_countdown_view_ring_thickness);
        this.A03 = (float) resources.getDimensionPixelSize(C0003R.dimen.clips_countdown_view_shadow_radius);
        Paint paint = new Paint(1);
        this.A04 = paint;
        paint.setColor(-1);
        this.A04.setStyle(Paint.Style.STROKE);
        this.A04.setStrokeWidth(this.A02);
        this.A04.setStrokeCap(Paint.Cap.ROUND);
        TextPaint textPaint = new TextPaint(1);
        this.A07 = textPaint;
        textPaint.setColor(-1);
        this.A07.setTextAlign(Paint.Align.CENTER);
        this.A07.setFakeBoldText(true);
        int A002 = C019000b.A00(context, C0003R.color.black_15_transparent);
        this.A04.setShadowLayer(this.A03, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A002);
        this.A07.setShadowLayer(this.A03, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A002);
        AnonymousClass1EG A003 = AnonymousClass0P2.A00().A00();
        A003.A06(AnonymousClass1EA.A01(20.0d, 8.0d));
        this.A09 = A003;
        A003.A07(new C169317Lj(this));
    }
}
