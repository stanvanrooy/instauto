package p000X;

import android.animation.ValueAnimator;
import java.util.Set;

/* renamed from: X.1n6  reason: invalid class name and case insensitive filesystem */
public final class C39551n6 implements C32571bU {
    public final /* synthetic */ AnonymousClass1NJ A00;
    public final /* synthetic */ C36841ih A01;
    public final /* synthetic */ Set A02;

    public final void B3g(float f) {
    }

    public C39551n6(Set set, AnonymousClass1NJ r2, C36841ih r3) {
        this.A02 = set;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void B3e() {
        this.A01.A0F = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r1 = r0.A02;
     */
    public final void B3f() {
        C39571n8 r1;
        ValueAnimator valueAnimator;
        if (!this.A02.contains(this.A00.getId()) || this.A00.A3L) {
            C39561n7 r0 = this.A01.A0F;
            if (r0 != null && (valueAnimator = r1.A01) != null) {
                valueAnimator.removeAllListeners();
                r1.A01.removeAllUpdateListeners();
                r1.A01.cancel();
                r1.A03 = Constants.ZERO;
                return;
            }
            return;
        }
        this.A01.A14 = true;
    }
}
