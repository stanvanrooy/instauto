package com.instagram.p009ui.widget.spinner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.C0003R;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EM;
import p000X.C26771Ff;

/* renamed from: com.instagram.ui.widget.spinner.RefreshSpinner */
public class RefreshSpinner extends SpinnerImageView {
    private void A00(AttributeSet attributeSet) {
        setImageResource(C0003R.C0004drawable.nav_spinner);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A35);
            setDark(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        }
    }

    public void setDark(boolean z) {
        ColorFilter colorFilter;
        Drawable mutate = getDrawable().mutate();
        if (z) {
            colorFilter = C26771Ff.A00(AnonymousClass1BA.A01(getContext(), C0003R.attr.glyphColorPrimary));
        } else {
            colorFilter = null;
        }
        mutate.setColorFilter(colorFilter);
    }

    public RefreshSpinner(Context context) {
        super(context);
        A00((AttributeSet) null);
    }

    public RefreshSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
    }

    public RefreshSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }
}
