package p000X;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0g6  reason: invalid class name and case insensitive filesystem */
public final class C12050g6 implements C12040g5 {
    public final AnonymousClass0OT A00;
    public final C12020g3 A01;
    public final Queue A02 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A03 = new AtomicBoolean();
    public final boolean A04;

    public final void BeH() {
        if (!this.A02.isEmpty() && !this.A03.get()) {
            if (this.A04) {
                this.A00.ADc(new C42211rv(this));
                return;
            }
            do {
                AnonymousClass0O9 r1 = (AnonymousClass0O9) this.A02.poll();
                if (r1 != null) {
                    this.A00.ADc(r1);
                } else {
                    return;
                }
            } while (!this.A01.Agl());
        }
    }

    public final void Bqh(AnonymousClass0O9 r2) {
        this.A02.add(r2);
    }

    public C12050g6(C12020g3 r2, AnonymousClass0OT r3, boolean z) {
        this.A01 = r2;
        this.A00 = r3;
        this.A04 = z;
    }
}
