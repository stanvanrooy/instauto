package p000X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.18f  reason: invalid class name and case insensitive filesystem */
public final class C252918f {
    public final C253018g A00 = new C253018g();
    public final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();

    public final C35441gN A00() {
        C35441gN r1 = (C35441gN) this.A01.poll();
        if (r1 == null) {
            return new C35441gN(this, this.A00.A01);
        }
        return r1;
    }
}
