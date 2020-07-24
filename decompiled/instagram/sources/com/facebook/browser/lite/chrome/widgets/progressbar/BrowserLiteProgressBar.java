package com.facebook.browser.lite.chrome.widgets.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.facebook.C0003R;
import p000X.C019000b;

public class BrowserLiteProgressBar extends ProgressBar {
    public int A00;
    public Paint A01;
    public Rect A02;

    public final synchronized void onDraw(Canvas canvas) {
        Paint paint;
        Rect rect = this.A02;
        if (!(rect == null || (paint = this.A01) == null)) {
            canvas.drawRect(rect, paint);
        }
        super.onDraw(canvas);
    }

    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 == null) {
            this.A02 = new Rect();
        }
        this.A02.set(0, 0, getMeasuredWidth(), this.A00);
    }

    public synchronized void setProgress(int i) {
        int i2;
        if (i == 100) {
            i2 = 0;
        } else {
            i2 = Math.max(i, 5);
        }
        super.setProgress(i2);
    }

    private void A00() {
        Paint paint = new Paint();
        this.A01 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A01.setColor(C019000b.A00(getContext(), C0003R.color.browser_progress_bar_color));
        this.A00 = getResources().getDimensionPixelSize(C0003R.dimen.browser_progress_overlay_height);
    }

    public BrowserLiteProgressBar(Context context) {
        super(context);
        A00();
    }

    public BrowserLiteProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public BrowserLiteProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
