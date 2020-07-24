package com.facebook.p002ui.emoji;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: com.facebook.ui.emoji.FacebookTypefaceEmojiSpan */
public class FacebookTypefaceEmojiSpan extends TypefaceSpan {
    public final int A00;
    public final Typeface A01;

    public FacebookTypefaceEmojiSpan(Typeface typeface, int i) {
        super("FacebookEmoji");
        this.A01 = typeface;
        this.A00 = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(this.A01);
        textPaint.setAlpha(255);
        int i = this.A00;
        if (i > 0) {
            textPaint.setTextSize((float) i);
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        textPaint.setTypeface(this.A01);
        textPaint.setAlpha(255);
        int i = this.A00;
        if (i > 0) {
            textPaint.setTextSize((float) i);
        }
    }
}
