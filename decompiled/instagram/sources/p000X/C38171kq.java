package p000X;

import java.util.List;

/* renamed from: X.1kq  reason: invalid class name and case insensitive filesystem */
public final class C38171kq implements AnonymousClass1FO {
    public static C38171kq A01;
    public AnonymousClass1FO A00 = new C38191ks();

    public final synchronized C37411jc AMx(List list) {
        return this.A00.AMx(list);
    }

    public final synchronized void B74(AnonymousClass1C4 r2, C256019m r3, boolean z) {
        this.A00.B74(r2, r3, z);
    }

    public static synchronized C38171kq A00() {
        C38171kq r0;
        synchronized (C38171kq.class) {
            if (A01 == null) {
                A01 = new C38171kq();
            }
            r0 = A01;
        }
        return r0;
    }
}
