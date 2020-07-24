package com.instagram.creation.base.p029ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.facebook.C0003R;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import p000X.AnonymousClass0Z0;

/* renamed from: com.instagram.creation.base.ui.TagPeopleDrawable */
public class TagPeopleDrawable extends ColorFilterAlphaImageView {
    public int A00;
    public int A01;
    public final Paint A02 = new Paint(1);

    private void A00() {
        this.A02.setTextAlign(Paint.Align.CENTER);
        Paint paint = this.A02;
        Resources resources = getResources();
        paint.setTextSize((float) resources.getDimensionPixelSize(C0003R.dimen.font_xsmall));
        this.A02.setTypeface(Typeface.DEFAULT_BOLD);
        getResources();
        this.A01 = resources.getDimensionPixelOffset(C0003R.dimen.people_tag_pill_text_padding);
    }

    public void setNumPeopleTagged(int i) {
        this.A00 = i;
        if (i == 0) {
            setImageResource(C0003R.C0004drawable.people_tag_edit_16);
        } else {
            setImageResource(C0003R.C0004drawable.people_tag_edit_empty_16);
        }
        refreshDrawableState();
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        ColorFilter colorFilter;
        int A03 = AnonymousClass0Z0.A03(-721975921);
        super.draw(canvas);
        if (this.A00 > 0) {
            int intrinsicWidth = getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable().getIntrinsicHeight();
            if (!isEnabled() || !A05()) {
                paint = this.A02;
                colorFilter = this.A03;
            } else {
                paint = this.A02;
                colorFilter = this.A02;
            }
            paint.setColorFilter(colorFilter);
            canvas.drawText(String.valueOf(this.A00), ((float) intrinsicWidth) / 2.0f, (float) (intrinsicHeight - this.A01), this.A02);
        }
        AnonymousClass0Z0.A0A(964015442, A03);
    }

    public TagPeopleDrawable(Context context) {
        super(context);
        A00();
    }

    public TagPeopleDrawable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public TagPeopleDrawable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
