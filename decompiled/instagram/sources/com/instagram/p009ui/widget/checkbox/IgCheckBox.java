package com.instagram.p009ui.widget.checkbox;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.facebook.C0003R;
import p000X.C019000b;
import p000X.C182237qL;

/* renamed from: com.instagram.ui.widget.checkbox.IgCheckBox */
public class IgCheckBox extends CheckBox {
    public int A00;
    public int A01;

    private void A00() {
        this.A00 = C0003R.color.blue_5;
        this.A01 = C0003R.color.grey_2;
        C182237qL r5 = new C182237qL(this);
        Context context = getContext();
        r5.addState(new int[]{16842912}, C019000b.A03(context, C0003R.C0004drawable.checkbox_checked));
        getContext();
        r5.addState(new int[]{-16842912}, C019000b.A03(context, C0003R.C0004drawable.checkbox_unchecked));
        setButtonDrawable(r5);
    }

    public IgCheckBox(Context context) {
        super(context);
        A00();
    }

    public IgCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public IgCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
