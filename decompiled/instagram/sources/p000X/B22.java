package p000X;

import android.view.View;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.B22 */
public final class B22 {
    public final /* synthetic */ B2U A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ AtomicBoolean A02;

    public B22(B2U b2u, List list, AtomicBoolean atomicBoolean) {
        this.A00 = b2u;
        this.A01 = list;
        this.A02 = atomicBoolean;
    }

    public final void A00() {
        boolean z;
        B1O b1o = null;
        for (B1O b1o2 : this.A01) {
            B21 AWk = b1o2.AWk();
            View A002 = AWk.A00();
            if (A002 != null) {
                boolean z2 = this.A02.get();
                if (!AWk.A01 || AWk.A00() == null || ((z2 && !AWk.A02()) || (!z2 && AWk.A03()))) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z || b1o != null) {
                    B2U b2u = this.A00;
                    AnonymousClass0Z9.A03(b2u.A00, new B2N(b2u, A002), 785112655);
                } else {
                    B2U b2u2 = this.A00;
                    AnonymousClass0Z9.A03(b2u2.A00, new B2M(b2u2, A002), -814331487);
                    b1o = b1o2;
                }
            }
        }
    }
}
