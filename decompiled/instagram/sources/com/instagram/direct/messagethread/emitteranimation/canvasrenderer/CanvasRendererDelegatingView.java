package com.instagram.direct.messagethread.emitteranimation.canvasrenderer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import p000X.C75013Qe;
import p000X.C75143Qr;

public class CanvasRendererDelegatingView extends View {
    public C75143Qr A00;
    public final C75013Qe A01 = new C75013Qe(this);

    public void setCanvasRenderer(C75143Qr r3) {
        C75143Qr r1 = this.A00;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A00 = r3;
        if (r3 != null) {
            r3.A00 = this.A01;
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C75143Qr r0 = this.A00;
        if (r0 != null) {
            r0.A00(canvas);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C75143Qr r3 = this.A00;
        if (r3 != null) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            Rect rect = r3.A01;
            if (0 != rect.left || 0 != rect.top || i5 != rect.right || i6 != rect.bottom) {
                rect.set(0, 0, i5, i6);
                C75013Qe r0 = r3.A00;
                if (r0 != null) {
                    CanvasRendererDelegatingView canvasRendererDelegatingView = r0.A00;
                    if (r3 == canvasRendererDelegatingView.A00) {
                        canvasRendererDelegatingView.invalidate();
                    }
                }
            }
        }
    }

    public CanvasRendererDelegatingView(Context context) {
        super(context);
    }

    public CanvasRendererDelegatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CanvasRendererDelegatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
