package p000X;

import java.util.Iterator;

/* renamed from: X.1jf  reason: invalid class name and case insensitive filesystem */
public final class C37441jf {
    public C37411jc A00;
    public final Iterator A01;
    public final /* synthetic */ C16410oY A02;

    public C37441jf(C16410oY r1, Iterator it) {
        this.A02 = r1;
        this.A01 = it;
    }

    public final void A00() {
        C37411jc r2 = this.A00;
        this.A01.remove();
        C05700Lp.A00().ADc(new AnonymousClass250(this, r2));
        C16420oZ r1 = this.A02.A00;
        if (r1 != null) {
            r1.A00(r2.A02);
        }
    }

    public final void A01(C14250k8 r5) {
        C37411jc r3 = this.A00;
        r3.A03.A00 = r5.startRequest(r3.A01, r3.A02, r3.A04);
        this.A01.remove();
        C16420oZ r1 = this.A02.A00;
        if (r1 != null) {
            r1.A00(r3.A02);
        }
    }
}
