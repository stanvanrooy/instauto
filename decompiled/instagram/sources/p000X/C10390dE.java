package p000X;

import android.os.SystemClock;

/* renamed from: X.0dE  reason: invalid class name and case insensitive filesystem */
public final class C10390dE {
    public final /* synthetic */ C07990Vf A00;

    public C10390dE(C07990Vf r1) {
        this.A00 = r1;
    }

    public final void A00() {
        C07990Vf r1 = this.A00;
        synchronized (r1) {
            r1.notifyAll();
        }
    }

    public final void A01(C07450Td r4, C08110Vr r5, Throwable th) {
        boolean z = false;
        if (this.A00.A0X == AnonymousClass0VP.DISCONNECTED) {
            z = true;
        }
        if (!z) {
            C07990Vf.A03(this.A00, r4, r5, th);
        }
    }

    public final void A02(String str, String str2) {
        this.A00.A0S = SystemClock.elapsedRealtime();
        this.A00.A09.A02(String.format("O %s%s", new Object[]{str, str2}));
        C07990Vf r2 = this.A00;
        r2.A0Q = r2.A0S;
        C07990Vf r0 = this.A00;
        r0.A0A.A08(str, str2, r0.A0Z, false);
        this.A00.A07.A00();
    }
}
