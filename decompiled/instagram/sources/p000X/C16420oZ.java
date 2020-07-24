package p000X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0oZ  reason: invalid class name and case insensitive filesystem */
public final class C16420oZ {
    public final /* synthetic */ C16360oT A00;

    public C16420oZ(C16360oT r1) {
        this.A00 = r1;
    }

    public final void A00(C256019m r3) {
        AtomicInteger atomicInteger;
        C15920nk r1 = r3.A05;
        if (r1 == C15920nk.Image) {
            atomicInteger = this.A00.A0J;
        } else if (r1 == C15920nk.Video) {
            atomicInteger = this.A00.A0M;
        } else {
            atomicInteger = this.A00.A0K;
        }
        atomicInteger.decrementAndGet();
    }
}
