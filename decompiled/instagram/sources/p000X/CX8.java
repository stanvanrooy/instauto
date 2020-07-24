package p000X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.CX8 */
public final class CX8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C27933CWv A00;

    public CX8(C27933CWv cWv) {
        this.A00 = cWv;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View A002;
        float f;
        int i;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C27933CWv cWv = this.A00;
        float f2 = (((float) (-cWv.A0B)) * floatValue) / 2.0f;
        cWv.A01.setTranslationY((((float) (-cWv.A0A)) * floatValue) + f2);
        C27933CWv cWv2 = this.A00;
        cWv2.A02.setTranslationY((((float) (-cWv2.A0A)) * floatValue) + f2);
        this.A00.A04.setTranslationY(f2);
        this.A00.A02.setAlpha(floatValue);
        C27933CWv cWv3 = this.A00;
        if (cWv3.A0F) {
            A002 = cWv3.A03;
            f = floatValue * ((float) cWv3.A0B);
            i = cWv3.A09;
        } else {
            A002 = C27933CWv.A00(cWv3);
            C27933CWv cWv4 = this.A00;
            f = floatValue * ((float) cWv4.A0B);
            i = cWv4.A09;
        }
        ViewGroup.LayoutParams layoutParams = A002.getLayoutParams();
        layoutParams.height = (int) (f + ((float) i));
        C27933CWv.A00(cWv3).setLayoutParams(layoutParams);
    }
}
