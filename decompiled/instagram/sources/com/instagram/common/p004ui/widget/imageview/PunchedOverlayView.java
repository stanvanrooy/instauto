package com.instagram.common.p004ui.widget.imageview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass7M9;

/* renamed from: com.instagram.common.ui.widget.imageview.PunchedOverlayView */
public class PunchedOverlayView extends View {
    public float A00 = 1.0f;
    public int A01 = Color.argb(192, 0, 0, 0);
    public Paint A02;
    public Path A03;

    public final void A00(AnonymousClass7M9 r8) {
        Path path = new Path();
        this.A03 = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.A03.addRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) getWidth(), (float) getHeight(), Path.Direction.CW);
        r8.A00(this.A03);
        Paint paint = new Paint(1);
        this.A02 = paint;
        paint.setColor(this.A01);
        this.A02.setAlpha((int) (this.A00 * ((float) Color.alpha(this.A01))));
        invalidate();
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0Z0.A03(1072568178);
        Path path = this.A03;
        if (path != null) {
            canvas.drawPath(path, this.A02);
            float f = this.A00;
            if (f < 1.0f) {
                float min = Math.min(f + (1.0f / ((float) 0)), 1.0f);
                this.A00 = min;
                this.A02.setAlpha((int) (min * ((float) Color.alpha(this.A01))));
                AnonymousClass1E1.A0I(this);
            }
        }
        AnonymousClass0Z0.A0A(684939298, A032);
    }

    public void setDarkenColor(int i) {
        this.A01 = i;
    }

    public PunchedOverlayView(Context context) {
        super(context);
    }

    public PunchedOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PunchedOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
