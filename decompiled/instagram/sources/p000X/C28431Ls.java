package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ls  reason: invalid class name and case insensitive filesystem */
public final class C28431Ls implements C28401Lo {
    public Map A00 = new HashMap();
    public final AnonymousClass00B A01;

    public final void BJ5(C15880ng r1, Throwable th, int i) {
    }

    public final void BJB() {
    }

    public final void BJS(C15880ng r1, C28661Mp r2, boolean z) {
    }

    public final void BP6() {
    }

    public final void BJ7(C15880ng r2) {
        C12670hC.A05(new C151346dZ(this, r2));
    }

    public final void BJX(C15880ng r2, C28661Mp r3) {
        C12670hC.A05(new C37051j2(this, r2));
    }

    public C28431Ls(AnonymousClass00B r2) {
        this.A01 = r2;
    }

    public final void BJK(C15880ng r6) {
        int i = 19070978;
        if (r6.A00()) {
            i = 19070977;
        }
        this.A00.put(r6, Integer.valueOf(i));
        this.A01.markerStart(i, r6.A02);
        this.A01.markerPoint(i, r6.A02, "FEED_REQUEST_STARTED");
        this.A01.markerAnnotate(i, r6.A02, "reason", C16120o4.A00(r6.A04));
    }
}
