package p000X;

import android.os.Handler;

/* renamed from: X.1uo  reason: invalid class name and case insensitive filesystem */
public final class C43641uo {
    public Handler A00;
    public C56202c6 A01;
    public AnonymousClass1RF A02;
    public Runnable A03;
    public boolean A04;

    public final void A00(boolean z) {
        C56202c6 r0;
        Runnable runnable;
        this.A04 = z;
        if (!z && (r0 = this.A01) != null) {
            if (r0.A07()) {
                Handler handler = this.A00;
                if (!(handler == null || (runnable = this.A03) == null)) {
                    AnonymousClass0ZA.A08(handler, runnable);
                }
                this.A01.A06(false);
            }
            this.A01 = null;
        }
    }
}
