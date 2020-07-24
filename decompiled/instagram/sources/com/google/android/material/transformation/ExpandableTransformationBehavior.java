package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p000X.C2111798y;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet A00;

    public abstract AnimatorSet A0P(View view, View view2, boolean z, boolean z2);

    public boolean A0O(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.A00;
        boolean z3 = false;
        if (animatorSet != null) {
            z3 = true;
        }
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet A0P = A0P(view, view2, z, z3);
        this.A00 = A0P;
        A0P.addListener(new C2111798y(this));
        this.A00.start();
        if (!z2) {
            this.A00.end();
        }
        return true;
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
