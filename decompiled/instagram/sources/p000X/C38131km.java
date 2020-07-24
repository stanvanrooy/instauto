package p000X;

import java.util.List;

/* renamed from: X.1km  reason: invalid class name and case insensitive filesystem */
public final class C38131km implements AnonymousClass1FQ {
    public static C38131km A01;
    public AnonymousClass1FQ A00 = new C38151ko();

    public final synchronized C37411jc AMx(List list) {
        return this.A00.AMx(list);
    }

    public final synchronized void B74(AnonymousClass1C4 r2, C256019m r3, boolean z) {
        this.A00.B74(r2, r3, z);
    }

    public static synchronized C38131km A00() {
        C38131km r0;
        synchronized (C38131km.class) {
            if (A01 == null) {
                A01 = new C38131km();
            }
            r0 = A01;
        }
        return r0;
    }
}
