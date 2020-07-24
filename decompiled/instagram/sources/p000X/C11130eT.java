package p000X;

import android.os.Looper;

/* renamed from: X.0eT  reason: invalid class name and case insensitive filesystem */
public final class C11130eT implements C11140eU {
    public static C11130eT A01 = new C11130eT(Looper.getMainLooper());
    public C11150eV A00;

    public final synchronized void A02(Class cls, C11200ea r3) {
        this.A00.A01(cls, r3);
    }

    public final synchronized void A03(Class cls, C11200ea r3) {
        this.A00.A02(cls, r3);
    }

    public static C11130eT A00() {
        return A01;
    }

    /* renamed from: A01 */
    public final void BXT(C11180eY r2) {
        this.A00.A03(r2);
    }

    public C11130eT(Looper looper) {
        this.A00 = new C11150eV(looper);
    }

    public static void setTestingInstance(C11130eT r0) {
        A01 = r0;
    }

    public final /* bridge */ /* synthetic */ C11140eU A3N(Class cls, C11200ea r2) {
        A02(cls, r2);
        return this;
    }

    public final /* bridge */ /* synthetic */ C11140eU Bb3(Class cls, C11200ea r2) {
        A03(cls, r2);
        return this;
    }
}
