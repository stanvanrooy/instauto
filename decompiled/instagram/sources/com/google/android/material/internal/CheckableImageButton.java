package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.facebook.C0003R;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass2AX;
import p000X.AnonymousClass98Z;

public class CheckableImageButton extends AnonymousClass2AX implements Checkable {
    public static final int[] A01 = {16842912};
    public boolean A00;

    public final int[] onCreateDrawableState(int i) {
        if (this.A00) {
            return mergeDrawableStates(super.onCreateDrawableState(i + A01.length), A01);
        }
        return super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public final void toggle() {
        setChecked(!this.A00);
    }

    public final boolean isChecked() {
        return this.A00;
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0003R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass1E1.A0b(this, new AnonymousClass98Z(this));
    }
}
