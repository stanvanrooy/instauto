package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.transformation.FabTransformationBehavior;

/* renamed from: X.A80 */
public final class A80 extends AnimatorListenerAdapter {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ A81 A01;
    public final /* synthetic */ FabTransformationBehavior A02;

    public A80(FabTransformationBehavior fabTransformationBehavior, A81 a81, Drawable drawable) {
        this.A02 = fabTransformationBehavior;
        this.A01 = a81;
        this.A00 = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
