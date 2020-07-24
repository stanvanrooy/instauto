package p000X;

import android.animation.ValueAnimator;
import com.instagram.p009ui.widget.emitter.PulseEmitter;

/* renamed from: X.1r8  reason: invalid class name and case insensitive filesystem */
public final class C41911r8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PulseEmitter A00;

    public C41911r8(PulseEmitter pulseEmitter) {
        this.A00 = pulseEmitter;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidate();
    }
}
