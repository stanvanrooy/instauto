package p000X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* renamed from: X.1mc  reason: invalid class name and case insensitive filesystem */
public abstract class C39261mc extends ClickableSpan {
    public boolean A00;
    public int A01;

    public void updateDrawState(TextPaint textPaint) {
        int i = this.A01;
        if (i == 0) {
            textPaint.setColor(textPaint.linkColor);
        } else if (i != -1) {
            textPaint.setColor(i);
        }
        if (this.A00) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
    }

    public C39261mc() {
    }

    public C39261mc(int i, int i2) {
        this.A01 = i2;
        this.A00 = (i & 1) != 1 ? false : true;
    }

    public C39261mc(boolean z, int i) {
        this.A00 = z;
        this.A01 = i;
    }
}
