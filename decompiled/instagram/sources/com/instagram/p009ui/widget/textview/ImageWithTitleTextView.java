package com.instagram.p009ui.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.text.TitleTextView;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.C019000b;
import p000X.C26771Ff;

/* renamed from: com.instagram.ui.widget.textview.ImageWithTitleTextView */
public class ImageWithTitleTextView extends TitleTextView {
    public int A00 = 0;
    public Drawable A01;
    public float A02 = 1.0f;
    public float A03 = 1.0f;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public boolean A09;
    public boolean A0A = true;

    private void setupDrawable(int i) {
        if (i == 0) {
            this.A01 = null;
            this.A07 = 0;
            this.A08 = 0;
            this.A0A = false;
            return;
        }
        Drawable A032 = C019000b.A03(getContext(), i);
        this.A01 = A032;
        A032.setColorFilter(C26771Ff.A00(this.A06));
        this.A08 = this.A01.getIntrinsicWidth();
        int intrinsicHeight = this.A01.getIntrinsicHeight();
        this.A07 = intrinsicHeight;
        this.A01.setBounds(0, 0, this.A08, intrinsicHeight);
        this.A0A = true;
    }

    private void A00(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2W, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.A06 = obtainStyledAttributes.getColor(1, -1);
        if (resourceId != 0) {
            setupDrawable(resourceId);
        }
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.A09 = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
    }

    private void A01(Canvas canvas) {
        if (this.A01 != null) {
            canvas.save();
            canvas.translate(((float) getScrollX()) + this.A04, ((float) getScrollY()) + this.A05);
            canvas.scale(this.A02, this.A03, ((float) this.A08) / 2.0f, ((float) this.A07) / 2.0f);
            this.A01.draw(canvas);
            canvas.restore();
        }
    }

    public Drawable getDrawable() {
        return this.A01;
    }

    public float getImageScaleX() {
        return this.A02;
    }

    public float getImageScaleY() {
        return this.A03;
    }

    public int getInnerSpacing() {
        return this.A00;
    }

    public final void onDraw(Canvas canvas) {
        if (this.A0A) {
            float f = ((float) (this.A08 + this.A00)) / 2.0f;
            if (this.A09) {
                canvas.save();
                canvas.translate(-f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            } else {
                A01(canvas);
                canvas.save();
                canvas.translate(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
        }
        super.onDraw(canvas);
        if (this.A0A) {
            canvas.restore();
            if (this.A09) {
                canvas.translate(getLayout().getLineWidth(0) + ((float) this.A00), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                A01(canvas);
            }
        }
    }

    public void setImageScaleX(float f) {
        if (Float.compare(this.A02, f) != 0) {
            this.A02 = f;
            invalidate();
        }
    }

    public void setImageScaleY(float f) {
        if (Float.compare(this.A03, f) != 0) {
            this.A03 = f;
            invalidate();
        }
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0Z0.A06(-2128207003);
        if (this.A0A) {
            i = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - this.A08) - this.A00, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        if (this.A0A) {
            int max = Math.max(this.A07, getMeasuredHeight());
            int measuredWidth = this.A08 + this.A00 + getMeasuredWidth();
            setMeasuredDimension(measuredWidth, max);
            this.A04 = (((float) measuredWidth) - (((float) (this.A08 + this.A00)) + getLayout().getLineWidth(0))) / 2.0f;
            this.A05 = ((float) (max - this.A07)) / 2.0f;
        }
        AnonymousClass0Z0.A0D(605537102, A062);
    }

    public void setImageResource(int i) {
        setupDrawable(i);
        requestLayout();
    }

    public void setInnerSpacing(int i) {
        this.A00 = i;
    }

    public ImageWithTitleTextView(Context context) {
        super(context);
    }

    public ImageWithTitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet, 0);
    }

    public ImageWithTitleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet, i);
    }
}
