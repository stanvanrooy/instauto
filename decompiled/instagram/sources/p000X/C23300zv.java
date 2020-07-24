package p000X;

import android.os.Looper;

/* renamed from: X.0zv  reason: invalid class name and case insensitive filesystem */
public final class C23300zv implements C11140eU, C06570Po, C06580Pp {
    public C11150eV A00;

    public final void onSessionIsEnding() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static synchronized C23300zv A00(C06590Pq r3) {
        C23300zv r1;
        Class<C23300zv> cls = C23300zv.class;
        synchronized (cls) {
            r1 = (C23300zv) r3.AV9(cls);
            if (r1 == null) {
                r1 = new C23300zv(Looper.getMainLooper());
                r3.BYi(cls, r1);
            }
        }
        return r1;
    }

    /* renamed from: A01 */
    public final void BXT(AnonymousClass12J r2) {
        this.A00.A03(r2);
    }

    public final void A02(Class cls, C11200ea r3) {
        this.A00.A01(cls, r3);
    }

    public final void A03(Class cls, C11200ea r3) {
        this.A00.A02(cls, r3);
    }

    public C23300zv(Looper looper) {
        this.A00 = new C11150eV(looper);
    }

    public final boolean A04(AnonymousClass12J r4) {
        int A03 = AnonymousClass0Z0.A03(537261483);
        boolean A002 = C11150eV.A00(this.A00, r4);
        AnonymousClass0Z0.A0A(-1985616095, A03);
        return A002;
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
