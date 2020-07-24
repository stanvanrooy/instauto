package p000X;

import android.animation.Animator;
import java.lang.ref.WeakReference;

/* renamed from: X.21y  reason: invalid class name and case insensitive filesystem */
public final class C470221y extends C39601nB {
    public final /* synthetic */ C29761Rd A00;
    public final /* synthetic */ AnonymousClass27S A01;

    public C470221y(AnonymousClass27S r1, C29761Rd r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onAnimationEnd(Animator animator) {
        Integer num;
        for (WeakReference weakReference : this.A01.A07) {
            C38791lr r1 = (C38791lr) weakReference.get();
            if (r1 != null) {
                r1.BNl(this.A00);
            }
        }
        AnonymousClass27S r2 = this.A01;
        if (this.A00 == C29761Rd.SLIDE_IN) {
            num = Constants.ONE;
        } else {
            num = Constants.A0C;
        }
        r2.A06 = num;
    }

    public final void onAnimationStart(Animator animator) {
        AnonymousClass27S r1 = this.A01;
        r1.A06 = Constants.ONE;
        for (WeakReference weakReference : r1.A07) {
            C38791lr r12 = (C38791lr) weakReference.get();
            if (r12 != null) {
                r12.BNn(this.A00);
            }
        }
    }
}
