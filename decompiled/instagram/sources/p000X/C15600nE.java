package p000X;

import java.util.Collections;

/* renamed from: X.0nE  reason: invalid class name and case insensitive filesystem */
public final class C15600nE implements AnonymousClass0MF {
    public final /* synthetic */ C15580nC A00;

    public C15600nE(C15580nC r1) {
        this.A00 = r1;
    }

    public final void BWP() {
        C150296br r0 = this.A00.A01;
        if (r0 != null) {
            C150296br r3 = new C150296br();
            for (C150896cp r02 : Collections.unmodifiableList(r0.A01)) {
                r3.A01.add(new C150896cp(r02));
            }
            C15580nC r1 = this.A00;
            r3.A00 = r1.A01.A00;
            r1.A04.ADc(new C150246bm(this, r3));
        }
    }
}
