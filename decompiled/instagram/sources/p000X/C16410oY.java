package p000X;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0oY  reason: invalid class name and case insensitive filesystem */
public final class C16410oY {
    public final C16420oZ A00;
    public final AnonymousClass0OT A01;
    public final Object A02;
    public final LinkedList A03 = new LinkedList();

    public final C26211Cc A00(AnonymousClass1C4 r10, C256019m r11, AnonymousClass1CB r12, Object obj, C37391ja r14) {
        AtomicInteger atomicInteger;
        C37401jb r7 = new C37401jb();
        C37411jc r3 = new C37411jc(r10, r11, r12, r7, obj);
        if (r11.A00() == Constants.ONE) {
            this.A03.addLast(r3);
        } else {
            this.A03.addFirst(r3);
        }
        C16420oZ r2 = this.A00;
        if (r2 != null) {
            C15920nk r1 = r11.A05;
            if (r1 == C15920nk.Image) {
                atomicInteger = r2.A00.A0J;
            } else if (r1 == C15920nk.Video) {
                atomicInteger = r2.A00.A0M;
            } else {
                atomicInteger = r2.A00.A0K;
            }
            atomicInteger.incrementAndGet();
        }
        r7.A00 = new C37421jd(this, r3, r14, r10);
        return r7;
    }

    public C16410oY(Object obj, C16420oZ r4) {
        this.A02 = obj;
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "PendingRequestQueue";
        this.A01 = A002.A01();
        this.A00 = r4;
    }
}
