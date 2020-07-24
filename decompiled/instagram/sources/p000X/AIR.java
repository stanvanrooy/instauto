package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: X.AIR */
public final class AIR extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final View A01;

    public final void onAnimationEnd(Animator animator) {
        C28837CnX.A02.A03(this.A01, 1.0f);
        if (this.A00) {
            this.A01.setLayerType(0, (Paint) null);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (AnonymousClass1E1.A0i(this.A01) && this.A01.getLayerType() == 0) {
            this.A00 = true;
            this.A01.setLayerType(2, (Paint) null);
        }
    }

    public AIR(View view) {
        this.A01 = view;
    }
}
