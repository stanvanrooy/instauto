package com.instagram.arlink.p027ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import p000X.C019000b;

/* renamed from: com.instagram.arlink.ui.CoachMarkOverlay */
public class CoachMarkOverlay extends View {
    public int A00 = C019000b.A00(getContext(), C0003R.color.black_60_transparent);
    public Bitmap A01;
    public final Paint A02 = new Paint();
    public final RectF A03 = new RectF();

    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.A00);
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            RectF rectF = this.A03;
            canvas.drawBitmap(bitmap, rectF.left, rectF.top, this.A02);
        }
        super.onDraw(canvas);
    }

    public void setSpotlightAlpha(int i) {
        this.A02.setAlpha(i);
        invalidate();
    }

    public CoachMarkOverlay(Context context) {
        super(context);
    }

    public CoachMarkOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoachMarkOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
