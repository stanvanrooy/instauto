package com.instagram.p009ui.widget.textview;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.C0003R;

/* renamed from: com.instagram.ui.widget.textview.UpdatableButton */
public class UpdatableButton extends ImageWithTitleTextView {
    public static final int[] A02 = {C0003R.attr.state_blue};
    public static final int[] A03 = {C0003R.attr.state_disabled_blue, C0003R.attr.state_blue};
    public static final int[] A04 = {C0003R.attr.state_grey};
    public boolean A00 = false;
    public boolean A01 = false;

    public final int[] onCreateDrawableState(int i) {
        int[] iArr;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (this.A01) {
            iArr = A03;
        } else if (this.A00) {
            iArr = A02;
        } else {
            iArr = A04;
        }
        mergeDrawableStates(onCreateDrawableState, iArr);
        return onCreateDrawableState;
    }

    public void setIsBlueButton(boolean z) {
        this.A00 = z;
    }

    public void setIsDisabled(boolean z) {
        this.A01 = z;
    }

    public UpdatableButton(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public UpdatableButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public UpdatableButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
