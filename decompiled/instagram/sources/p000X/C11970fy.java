package p000X;

import android.os.SystemClock;

/* renamed from: X.0fy  reason: invalid class name and case insensitive filesystem */
public final class C11970fy implements AnonymousClass0Q6 {
    public final /* synthetic */ C11960fx A00;

    public C11970fy(C11960fx r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0Z0.A03(-1419744922);
        C11960fx r3 = this.A00;
        C11980fz r2 = r3.A01;
        r2.A04 = true;
        r2.A02 = -1;
        C11960fx.A00(r3);
        AnonymousClass0Z0.A0A(-1300922442, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0Z0.A03(582367679);
        C11960fx r3 = this.A00;
        C11980fz r2 = r3.A01;
        r2.A04 = false;
        r2.A02 = SystemClock.uptimeMillis();
        C11960fx.A00(r3);
        AnonymousClass0Z0.A0A(-1441552418, A03);
    }
}
