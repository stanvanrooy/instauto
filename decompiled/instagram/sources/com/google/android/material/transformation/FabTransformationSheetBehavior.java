package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000X.A82;
import p000X.AnonymousClass000;
import p000X.AnonymousClass1E1;
import p000X.C2111698w;
import p000X.C23107A7l;
import p000X.C51052Iz;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if ((((p000X.C51052Iz) r2.getLayoutParams()).A0B instanceof com.google.android.material.transformation.FabTransformationScrimBehavior) == false) goto L_0x0033;
     */
    public final boolean A0O(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.A00 = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt.getLayoutParams() instanceof C51052Iz) {
                    z3 = true;
                }
                z3 = false;
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map map = this.A00;
                        if (map != null && map.containsKey(childAt)) {
                            AnonymousClass1E1.A0V(childAt, ((Integer) this.A00.get(childAt)).intValue());
                        }
                    } else {
                        this.A00.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        AnonymousClass1E1.A0V(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.A00 = null;
            }
        }
        return super.A0O(view, view2, z, z2);
    }

    public final C23107A7l A0Q(Context context, boolean z) {
        int i = C0003R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        if (z) {
            i = C0003R.animator.mtrl_fab_transformation_sheet_expand_spec;
        }
        C23107A7l a7l = new C23107A7l();
        C2111698w r3 = null;
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                r3 = C2111698w.A00(((AnimatorSet) loadAnimator).getChildAnimations());
            } else if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                r3 = C2111698w.A00(arrayList);
            }
        } catch (Exception e) {
            Log.w("MotionSpec", AnonymousClass000.A0E("Can't load animation resource ID #0x", Integer.toHexString(i)), e);
        }
        a7l.A00 = r3;
        a7l.A01 = new A82();
        return a7l;
    }

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
