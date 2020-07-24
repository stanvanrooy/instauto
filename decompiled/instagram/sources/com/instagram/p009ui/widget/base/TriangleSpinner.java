package com.instagram.p009ui.widget.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.Spinner;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass1EM;
import p000X.C06220Of;
import p000X.C06400Ox;
import p000X.C76503Wd;

/* renamed from: com.instagram.ui.widget.base.TriangleSpinner */
public class TriangleSpinner extends Spinner {
    public int A00;
    public int A01;
    public Path A02;
    public C76503Wd A03;
    public boolean A04;
    public boolean A05;
    public final Paint A06 = new Paint(1);

    public void setAlignToEdge(boolean z) {
        this.A04 = z;
        invalidate();
    }

    public void setTriangleAlpha(int i) {
        this.A06.setAlpha(i);
        invalidate();
    }

    public void setTriangleColor(int i) {
        this.A06.setColor(i);
        invalidate();
    }

    public void setTriangleSize(int i) {
        this.A01 = i;
        setTriangleStyle(this.A03);
        C06220Of.A0O(this, this.A00 + this.A01);
    }

    public void setTriangleStyle(C76503Wd r4) {
        this.A03 = r4;
        Path path = new Path();
        this.A02 = path;
        if (r4 == C76503Wd.CORNER) {
            path.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A01);
            Path path2 = this.A02;
            float f = (float) this.A01;
            path2.lineTo(f, f);
            this.A02.lineTo((float) this.A01, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A02.lineTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A01);
        } else {
            path.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A02.lineTo((float) this.A01, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            Path path3 = this.A02;
            float f2 = (float) (this.A01 >> 1);
            path3.lineTo(f2, f2);
            this.A02.lineTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        this.A02.close();
        invalidate();
    }

    private void A00(AttributeSet attributeSet, int i) {
        Context context = getContext();
        this.A05 = C06400Ox.A02(context);
        getContext();
        int A032 = (int) C06220Of.A03(context, 12);
        C76503Wd r2 = C76503Wd.CORNER;
        int i2 = -16777216;
        if (attributeSet != null) {
            getContext();
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3v, i, 0);
            try {
                i2 = obtainStyledAttributes.getColor(0, -16777216);
                A032 = obtainStyledAttributes.getDimensionPixelSize(2, A032);
                if (obtainStyledAttributes.getInt(3, 0) != r2.A00) {
                    r2 = C76503Wd.DOWNWARD;
                }
                this.A00 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.A06.setStyle(Paint.Style.FILL);
        this.A06.setColor(i2);
        setTriangleSize(A032);
        setTriangleStyle(r2);
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int scrollY;
        super.onDraw(canvas);
        if (getChildCount() != 0) {
            canvas.save();
            if (this.A04) {
                i = (getScrollX() + canvas.getWidth()) - this.A01;
                if (this.A03 == C76503Wd.CORNER) {
                    scrollY = (int) (((double) (getScrollY() + canvas.getHeight())) - Math.ceil((double) (((float) this.A01) * 1.5f)));
                }
                scrollY = (getScrollY() + (canvas.getHeight() >> 1)) - (this.A01 >> 2);
            } else {
                if (this.A05) {
                    i = (getChildAt(0).getLeft() - this.A00) - this.A01;
                } else {
                    i = getScrollX() + getChildAt(0).getRight() + this.A00;
                }
                if (this.A03 == C76503Wd.CORNER) {
                    scrollY = getScrollY() + (canvas.getHeight() >> 1) + (this.A01 >> 1);
                }
                scrollY = (getScrollY() + (canvas.getHeight() >> 1)) - (this.A01 >> 2);
            }
            canvas.translate((float) i, (float) scrollY);
            canvas.drawPath(this.A02, this.A06);
            canvas.restore();
        }
    }

    public TriangleSpinner(Context context) {
        super(context);
        A00((AttributeSet) null, 0);
    }

    public TriangleSpinner(Context context, int i) {
        super(context, i);
        A00((AttributeSet) null, 0);
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0003R.attr.triangleSpinnerStyle);
        A00(attributeSet, C0003R.attr.triangleSpinnerStyle);
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i);
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(attributeSet, i);
    }
}
