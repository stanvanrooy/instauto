package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.instagram.p009ui.widget.emitter.PulseEmitter;

/* renamed from: X.1r7  reason: invalid class name and case insensitive filesystem */
public final class C41901r7 extends AnimatorListenerAdapter {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ PulseEmitter A01;

    public C41901r7(PulseEmitter pulseEmitter, ValueAnimator valueAnimator) {
        this.A01 = pulseEmitter;
        this.A00 = valueAnimator;
    }

    public final void onAnimationEnd(Animator animator) {
        PulseEmitter pulseEmitter = this.A01;
        if (pulseEmitter.A00) {
            pulseEmitter.A04.remove(this.A00);
            this.A01.A03.add(this.A00);
        }
    }
}
