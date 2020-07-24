package com.instagram.p009ui.widget.roundedcornerlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p000X.C06220Of;
import p000X.C31841a5;
import p000X.C34171eC;

/* renamed from: com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout */
public class RoundedCornerFrameLayout extends FrameLayout implements C31841a5 {
    public C34171eC A00;

    private void A00() {
        if (C06220Of.A00) {
            boolean z = false;
            if (this.A00.A01 == 0) {
                z = true;
            }
            if (!z) {
                setLayerType(0, (Paint) null);
                return;
            }
        }
        setLayerType(2, (Paint) null);
    }

    public void setCornerBackgroundColor(int i) {
        boolean z;
        C34171eC r1 = this.A00;
        if (r1.A01 != i) {
            r1.A01 = i;
            r1.A05.setColor(i);
            if (C06220Of.A00) {
                if (r1.A01 == 0) {
                    r1.A05.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                } else {
                    r1.A05.setXfermode((Xfermode) null);
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidate();
            if (C06220Of.A00) {
                A00();
            }
        }
    }

    public void setCornerRadius(int i) {
        if (this.A00.A05(i)) {
            invalidate();
        }
    }

    public void setStrokeColor(int i) {
        boolean z;
        C34171eC r1 = this.A00;
        if (r1.A02 != i) {
            r1.A02 = i;
            r1.A04.setColor(i);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    public void setStrokeWidth(float f) {
        boolean z;
        C34171eC r1 = this.A00;
        if (r1.A00 != f) {
            r1.A00 = f;
            r1.A04.setStrokeWidth(f);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A00.A04(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00.A03(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public RoundedCornerFrameLayout(Context context) {
        super(context);
        this.A00 = C34171eC.A00(getContext(), (AttributeSet) null);
        A00();
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = C34171eC.A00(getContext(), attributeSet);
        A00();
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = C34171eC.A00(getContext(), attributeSet);
        A00();
    }
}
