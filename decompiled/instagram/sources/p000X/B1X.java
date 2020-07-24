package p000X;

import java.util.HashMap;

/* renamed from: X.B1X */
public final class B1X extends HashMap<B1q, Object> {
    public final /* synthetic */ C25109B1d A00;
    public final /* synthetic */ B1U A01;

    public B1X(B1U b1u, C25109B1d b1d) {
        int i;
        this.A01 = b1u;
        this.A00 = b1d;
        B1q b1q = B1q.ERROR_CODE;
        boolean z = false;
        if (b1d == null) {
            i = 0;
        } else {
            i = b1d.A00;
        }
        put(b1q, Integer.valueOf(i));
        B1q b1q2 = B1q.CALLBACK_RESULT;
        C25109B1d b1d2 = this.A00;
        put(b1q2, Boolean.valueOf((b1d2 == null || b1d2 == C25109B1d.SUCCESS) ? true : z));
    }
}
