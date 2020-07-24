package p000X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.B7F */
public final class B7F extends FrameLayout {
    public final View A00;
    public final View A01;

    public final void A01() {
        setFocusableInTouchMode(true);
        requestFocus();
        this.A01.animate().alpha(1.0f).setDuration(250).start();
        this.A00.getViewTreeObserver().addOnPreDrawListener(new B7E(this));
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return super.onKeyUp(i, keyEvent);
        }
        A00();
        return true;
    }

    public final void A00() {
        this.A01.animate().alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setDuration(250).start();
        this.A00.animate().translationY((float) this.A00.getHeight()).setInterpolator(new AccelerateInterpolator()).setDuration(250).setListener(new B7G(this)).start();
    }

    public B7F(Context context, View view, int i, boolean z) {
        super(context);
        View view2 = new View(context);
        this.A01 = view2;
        view2.setBackground(new ColorDrawable(i));
        this.A01.setOnClickListener(new B7H(this));
        this.A01.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        addView(this.A01);
        this.A00 = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.gravity = 80;
        addView(view, layoutParams);
    }
}
