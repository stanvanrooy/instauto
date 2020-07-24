package p000X;

import android.animation.Animator;
import java.lang.ref.WeakReference;

/* renamed from: X.1nA  reason: invalid class name and case insensitive filesystem */
public final class C39591nA extends C39601nB {
    public final /* synthetic */ C39571n8 A00;

    public C39591nA(C39571n8 r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        for (WeakReference weakReference : this.A00.A04) {
            if (!(this.A00.A03 == Constants.ZERO || weakReference == null || weakReference.get() == null)) {
                ((C32571bU) weakReference.get()).B3e();
            }
        }
        this.A00.A03 = Constants.ZERO;
    }

    public final void onAnimationStart(Animator animator) {
        C39571n8 r1 = this.A00;
        r1.A03 = Constants.A0C;
        for (WeakReference weakReference : r1.A04) {
            if (!(this.A00.A03 == Constants.ZERO || weakReference == null || weakReference.get() == null)) {
                ((C32571bU) weakReference.get()).B3f();
            }
        }
    }
}
