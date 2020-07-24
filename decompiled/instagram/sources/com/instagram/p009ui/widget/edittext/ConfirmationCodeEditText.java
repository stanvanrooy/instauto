package com.instagram.p009ui.widget.edittext;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.facebook.C0003R;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.C019000b;

/* renamed from: com.instagram.ui.widget.edittext.ConfirmationCodeEditText */
public class ConfirmationCodeEditText extends EditText {
    public float A00;
    public int A01;
    public int A02;
    public boolean A03;
    public float A04;
    public int A05;
    public int A06;
    public Paint A07;
    public Paint A08;
    public Paint A09;

    public static void A02(ConfirmationCodeEditText confirmationCodeEditText) {
        confirmationCodeEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(confirmationCodeEditText.A02)});
        confirmationCodeEditText.setBackground((Drawable) null);
        confirmationCodeEditText.setCursorVisible(false);
        confirmationCodeEditText.setInputType(2);
    }

    public static int[] A04(int i, int i2) {
        int[] iArr = new int[2];
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int i3 = (int) (Resources.getSystem().getDisplayMetrics().density * 252.0f);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(i3, size);
            } else {
                size = i3;
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int i4 = (int) (Resources.getSystem().getDisplayMetrics().density * 40.0f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(i4, size2);
            } else {
                size2 = i4;
            }
        }
        iArr[0] = size;
        iArr[1] = size2;
        return iArr;
    }

    private void A00() {
        if (this.A03) {
            this.A04 = ((float) this.A06) / (((float) this.A02) + 0.5f);
        } else {
            this.A04 = (float) (this.A06 / this.A02);
        }
    }

    private void A01(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0v);
            this.A00 = obtainStyledAttributes.getDimension(1, getResources().getDimension(C0003R.dimen.confirmation_code_font_size));
            this.A02 = obtainStyledAttributes.getInt(0, 6);
            this.A03 = obtainStyledAttributes.getBoolean(2, false);
            this.A01 = 0;
        }
        A02(this);
        A03(this);
    }

    public static void A03(ConfirmationCodeEditText confirmationCodeEditText) {
        Paint paint = new Paint();
        confirmationCodeEditText.A09 = paint;
        paint.setTextSize(confirmationCodeEditText.A00);
        confirmationCodeEditText.A09.setAntiAlias(true);
        confirmationCodeEditText.A09.setTextAlign(Paint.Align.CENTER);
        Paint paint2 = confirmationCodeEditText.A09;
        Context context = confirmationCodeEditText.getContext();
        paint2.setColor(C019000b.A00(context, C0003R.color.igds_primary_text));
        Paint paint3 = new Paint();
        confirmationCodeEditText.A08 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        confirmationCodeEditText.A08.setStrokeWidth(8.0f);
        Paint paint4 = confirmationCodeEditText.A08;
        confirmationCodeEditText.getContext();
        paint4.setColor(C019000b.A00(context, C0003R.color.igds_primary_text));
        Paint paint5 = new Paint();
        confirmationCodeEditText.A07 = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        confirmationCodeEditText.A07.setStrokeWidth(8.0f);
        Paint paint6 = confirmationCodeEditText.A07;
        confirmationCodeEditText.getContext();
        paint6.setColor(C019000b.A00(context, C0003R.color.igds_tertiary_text));
    }

    public final void A05(int i, boolean z) {
        this.A02 = i;
        this.A03 = z;
        A00();
        A02(this);
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        float f = this.A04 / 2.0f;
        int i = this.A05;
        float f2 = (float) (i - 8);
        float descent = ((float) (i >> 1)) - ((this.A09.descent() + this.A09.ascent()) / 2.0f);
        Editable text = getText();
        int i2 = 0;
        Canvas canvas2 = canvas;
        if (this.A01 != 1) {
            int i3 = 0;
            while (true) {
                int i4 = this.A02;
                if (i3 < i4) {
                    if (this.A03 && i3 == (i4 >> 1)) {
                        f += this.A04 / 2.0f;
                    }
                    if (i3 < text.length()) {
                        canvas2.drawText(Character.toString(text.charAt(i3)), f, f2, this.A09);
                    } else {
                        float f3 = this.A04 / 4.0f;
                        canvas2.drawLine(f - f3, f2, f + f3, f2, this.A08);
                    }
                    f += this.A04;
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                int i5 = this.A02;
                if (i2 < i5) {
                    if (this.A03 && i2 == (i5 >> 1)) {
                        f += this.A04 / 2.0f;
                    }
                    if (i2 < text.length()) {
                        canvas2.drawText(Character.toString(text.charAt(i2)), f, descent, this.A09);
                    }
                    float f4 = this.A04 / 2.5f;
                    canvas2.drawRoundRect(new RectF(f - f4, (f2 - ((float) this.A05)) + 16.0f, f4 + f, f2), 12.0f, 12.0f, this.A07);
                    f += this.A04;
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public int getMaximumSize() {
        return this.A02;
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0Z0.A06(1159419816);
        int[] A042 = A04(i, i2);
        setMeasuredDimension(A042[0], A042[1]);
        AnonymousClass0Z0.A0D(-1191683879, A062);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(874948578);
        super.onSizeChanged(i, i2, i3, i4);
        this.A06 = i;
        this.A05 = i2;
        A00();
        AnonymousClass0Z0.A0D(-285740953, A062);
    }

    public void setFrameStyle(int i) {
        this.A01 = i;
    }

    public ConfirmationCodeEditText(Context context) {
        super(context);
        A01((AttributeSet) null);
    }

    public ConfirmationCodeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(attributeSet);
    }

    public ConfirmationCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(attributeSet);
    }
}
