package com.instagram.p009ui.text.fittingtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.Constants;
import p000X.AnonymousClass1EM;
import p000X.C019000b;

/* renamed from: com.instagram.ui.text.fittingtextview.FittingTextView */
public class FittingTextView extends View {
    public float A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public StaticLayout A07;
    public Integer A08;
    public final TextPaint A09;

    private void A00() {
        String str = this.A04;
        this.A07 = new StaticLayout(str, 0, str.length(), this.A09, (int) this.A09.measureText(this.A04), Layout.Alignment.ALIGN_CENTER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false);
    }

    public void setMaxWidth(int i) {
        this.A01 = i;
        requestLayout();
    }

    public void setText(String str) {
        this.A04 = str;
        A00();
        requestLayout();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (this.A08.intValue()) {
            case 0:
                canvas.save();
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
                this.A07.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Drawable drawable = this.A03;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.A03.getIntrinsicHeight());
                this.A03.draw(canvas);
                return;
            default:
                return;
        }
    }

    public final void onMeasure(int i, int i2) {
        Integer num;
        int intrinsicWidth;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        if (this.A07.getWidth() + paddingLeft > this.A01) {
            num = Constants.ONE;
        } else {
            num = Constants.ZERO;
        }
        this.A08 = num;
        if (num == Constants.ZERO) {
            intrinsicWidth = this.A07.getWidth() + paddingLeft;
        } else {
            intrinsicWidth = this.A03.getIntrinsicWidth();
        }
        setMeasuredDimension(intrinsicWidth, View.MeasureSpec.getSize(i2));
    }

    public FittingTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public FittingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FittingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = 0;
        this.A08 = Constants.ZERO;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1k, 0, 0);
        if (!obtainStyledAttributes.hasValue(2) || !obtainStyledAttributes.hasValue(0) || !obtainStyledAttributes.hasValue(1)) {
            obtainStyledAttributes.recycle();
            throw new RuntimeException("Fitting text, icon, and maximum width required.");
        }
        this.A03 = obtainStyledAttributes.getDrawable(0);
        this.A04 = obtainStyledAttributes.getString(2);
        this.A00 = obtainStyledAttributes.getDimension(6, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A05 = obtainStyledAttributes.getBoolean(3, false);
        this.A02 = obtainStyledAttributes.getColor(4, -1);
        this.A06 = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        float f = this.A00;
        textPaint.setTextSize(f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? (float) getResources().getDimensionPixelSize(C0003R.dimen.font_large) : f);
        textPaint.setColor(this.A02);
        if (this.A06) {
            textPaint.setShadowLayer(7.2f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, C019000b.A00(getContext(), C0003R.color.black_25_transparent));
        }
        if (this.A05) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
        this.A09 = textPaint;
        A00();
    }
}
