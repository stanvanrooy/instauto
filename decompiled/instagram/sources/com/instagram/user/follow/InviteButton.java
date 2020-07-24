package com.instagram.user.follow;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.instagram.p009ui.widget.textview.UpdatableButton;
import p000X.AnonymousClass1EM;

public class InviteButton extends UpdatableButton {
    public static final Typeface A00 = Typeface.create("sans-serif-medium", 0);
    public static final Typeface A01 = Typeface.create("sans-serif", 0);

    public void setEnabled(boolean z) {
        Typeface typeface;
        super.setEnabled(z);
        if (z) {
            typeface = A00;
        } else {
            typeface = A01;
        }
        setTypeface(typeface);
    }

    public InviteButton(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public InviteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InviteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1p, i, 0).recycle();
        setIsBlueButton(true);
    }
}
