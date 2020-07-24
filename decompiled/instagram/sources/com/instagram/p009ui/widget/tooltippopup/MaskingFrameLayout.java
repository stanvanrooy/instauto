package com.instagram.p009ui.widget.tooltippopup;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.C019000b;

/* renamed from: com.instagram.ui.widget.tooltippopup.MaskingFrameLayout */
public class MaskingFrameLayout extends FrameLayout {
    public float A00;
    public Bitmap A01;
    public final Paint A02 = new Paint(1);
    public final Rect A03 = new Rect();
    public final Rect A04 = new Rect();

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.A01 != null) {
            getGlobalVisibleRect(this.A04);
            Rect rect = this.A04;
            float f = this.A00;
            rect.set(Math.round(((float) rect.left) / f), Math.round(((float) rect.top) / f), Math.round(((float) rect.right) / f), Math.round(((float) rect.bottom) / f));
            this.A03.set(0, 0, getWidth(), getHeight());
            canvas.drawBitmap(this.A01, this.A04, this.A03, this.A02);
            this.A02.setAlpha(51);
            canvas2.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) getWidth(), (float) getHeight(), this.A02);
            this.A02.setAlpha(255);
        }
    }

    private void A00() {
        this.A02.setColor(C019000b.A00(getContext(), C0003R.color.grey_5));
        this.A02.setDither(true);
        this.A02.setFilterBitmap(true);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
    }

    public MaskingFrameLayout(Context context) {
        super(context);
        A00();
    }

    public MaskingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public MaskingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
