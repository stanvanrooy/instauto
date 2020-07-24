package com.instagram.p009ui.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgRadioButton;
import p000X.C019000b;
import p000X.C26771Ff;

/* renamed from: com.instagram.ui.menu.CheckRadioButton */
public class CheckRadioButton extends IgRadioButton {
    public Drawable A00;

    private void A00() {
        Context context = getContext();
        Drawable A03 = C019000b.A03(context, C0003R.C0004drawable.circle_check);
        this.A00 = A03;
        Drawable mutate = A03.mutate();
        getContext();
        mutate.setColorFilter(C26771Ff.A00(C019000b.A00(context, C0003R.color.blue_5)));
        getContext();
        setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(C0003R.dimen.row_text_button_padding));
    }

    public void setChecked(boolean z) {
        Drawable drawable;
        super.setChecked(z);
        Context context = getContext();
        int i = C0003R.color.igds_primary_text;
        if (z) {
            i = C0003R.color.blue_5;
        }
        setTextColor(C019000b.A00(context, i));
        Drawable[] compoundDrawables = getCompoundDrawables();
        Drawable drawable2 = compoundDrawables[0];
        Drawable drawable3 = compoundDrawables[1];
        if (z) {
            drawable = this.A00;
        } else {
            drawable = null;
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable, compoundDrawables[3]);
    }

    public CheckRadioButton(Context context) {
        super(context);
        A00();
    }

    public CheckRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public CheckRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
