package p000X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.11z  reason: invalid class name and case insensitive filesystem */
public final class C238311z implements Runnable {
    public final /* synthetic */ C237211o A00;

    public C238311z(C237211o r1) {
        this.A00 = r1;
    }

    public final void run() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicInteger atomicInteger2 = new AtomicInteger(0);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (this.A00.A02 != null) {
            boolean z = false;
            if (C22000xg.A00 != null) {
                z = true;
            }
            if (z) {
                if (C237211o.A02()) {
                    for (String A09 : this.A00.A02.A05.A04((String) null)) {
                        AnonymousClass0J1.A09(A09, Constants.A03, new C137175tC(this, atomicInteger, atomicInteger2), (C05180Im) null);
                    }
                } else {
                    atomicInteger.set(C22000xg.A00.A01(this.A00.A02));
                    atomicInteger2.set(C22000xg.A00.A00(this.A00.A02));
                }
                AnonymousClass0Z9.A03(this.A00.A04, new C33541d5(this, atomicInteger3, atomicInteger, atomicInteger2), -1551954040);
            }
        }
        atomicInteger.set(0);
        atomicInteger2.set(0);
        AnonymousClass0Z9.A03(this.A00.A04, new C33541d5(this, atomicInteger3, atomicInteger, atomicInteger2), -1551954040);
    }
}
