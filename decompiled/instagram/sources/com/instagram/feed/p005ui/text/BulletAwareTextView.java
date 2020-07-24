package com.instagram.feed.p005ui.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;

/* renamed from: com.instagram.feed.ui.text.BulletAwareTextView */
public class BulletAwareTextView extends TextView {
    public int A00;
    public boolean A01 = false;
    public final float A02 = TypedValue.applyDimension(1, 0.5f, getContext().getResources().getDisplayMetrics());

    private void A01(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0V);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            setLineSpacing((float) this.A00, 1.0f);
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        if (!this.A01 && Build.VERSION.SDK_INT >= 21) {
            this.A01 = true;
            i4 += this.A00;
        }
        super.setPadding(i, i2, i3, i4);
    }

    private void A00() {
        if (getText() instanceof Spannable) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) ((Spannable) getText()).getSpans(0, 1, ImageSpan.class);
            if (imageSpanArr.length != 0) {
                Drawable drawable = imageSpanArr[0].getDrawable();
                Rect bounds = drawable.getBounds();
                drawable.setBounds(bounds.left, 0, bounds.right, drawable.getIntrinsicHeight() + getOffset());
            }
        }
    }

    private int getOffset() {
        float f;
        if (getLineCount() == 1 && Build.VERSION.SDK_INT >= 21) {
            return 0;
        }
        float f2 = (float) this.A00;
        if (getLineCount() > 1) {
            f = this.A02;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return (int) (f2 - f);
    }

    public final void onMeasure(int i, int i2) {
        int A06 = AnonymousClass0Z0.A06(24093417);
        super.onMeasure(i, i2);
        A00();
        AnonymousClass0Z0.A0D(-1612750587, A06);
    }

    public void setSpacingAdd(int i) {
        int paddingBottom = getPaddingBottom();
        if (this.A01) {
            paddingBottom -= this.A00;
            this.A01 = false;
        }
        this.A00 = i;
        setLineSpacing((float) i, 1.0f);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), paddingBottom);
        A00();
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (getLineCount() != 0) {
            A00();
        }
    }

    public BulletAwareTextView(Context context) {
        super(context);
        A01((AttributeSet) null);
    }

    public BulletAwareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(attributeSet);
    }

    public BulletAwareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(attributeSet);
    }
}
