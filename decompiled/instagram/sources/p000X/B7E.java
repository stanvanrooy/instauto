package p000X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.B7E */
public final class B7E implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ B7F A00;

    public B7E(B7F b7f) {
        this.A00 = b7f;
    }

    public final boolean onPreDraw() {
        this.A00.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        View view = this.A00.A00;
        view.setTranslationY((float) view.getHeight());
        this.A00.A00.animate().translationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).setDuration(250).start();
        return false;
    }
}
