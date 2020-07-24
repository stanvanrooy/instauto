package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import p000X.AnonymousClass98x;
import p000X.C2111198q;
import p000X.C2111598v;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final C2111598v A00 = new C2111598v(0);
    public final C2111598v A01 = new C2111598v(75);

    public final AnimatorSet A0P(View view, View view2, boolean z, boolean z2) {
        C2111598v r4;
        Property property;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        if (z) {
            r4 = this.A01;
        } else {
            r4 = this.A00;
        }
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (z) {
            if (!z2) {
                view2.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            property = View.ALPHA;
            fArr = new float[1];
            f = 1.0f;
        } else {
            property = View.ALPHA;
            fArr = new float[1];
        }
        fArr[0] = f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, fArr);
        r4.A01(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C2111198q.A00(animatorSet, arrayList);
        animatorSet.addListener(new AnonymousClass98x(this, z, view2));
        return animatorSet;
    }

    public final boolean A0F(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
