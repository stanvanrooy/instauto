package com.instagram.p009ui.text;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: com.instagram.ui.text.CustomTypefaceSpan */
public class CustomTypefaceSpan extends TypefaceSpan {
    public final Typeface A00;

    public CustomTypefaceSpan(Typeface typeface) {
        super("");
        this.A00 = typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        A01(textPaint, this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        A01(textPaint, this.A00);
    }

    public static void A01(Paint paint, Typeface typeface) {
        int style;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            style = 0;
        } else {
            style = typeface2.getStyle();
        }
        int style2 = style & (typeface.getStyle() ^ -1);
        if ((style2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }
}
