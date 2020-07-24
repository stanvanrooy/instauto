package com.instagram.feed.widget;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.textview.ImageWithTitleTextView;
import p000X.C019000b;
import p000X.C26771Ff;

public class LinkButton extends ImageWithTitleTextView {
    private int getColor() {
        if (!isEnabled()) {
            return C0003R.color.blue_5;
        }
        if (isSelected() || isPressed()) {
            return C0003R.color.blue_6;
        }
        return C0003R.color.blue_5;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int color = getColor();
        Context context = getContext();
        ColorFilter A00 = C26771Ff.A00(C019000b.A00(context, color));
        getBackground().mutate().setColorFilter(A00);
        getContext();
        setTextColor(C019000b.A00(context, color));
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.mutate().setColorFilter(A00);
        }
    }

    public LinkButton(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public LinkButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinkButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
