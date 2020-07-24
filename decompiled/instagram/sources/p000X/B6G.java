package p000X;

import android.os.Bundle;

/* renamed from: X.B6G */
public final class B6G extends C24842AuX {
    public final boolean onStartJob(int i, Bundle bundle, C2095190p r6) {
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        if (!A01.AgN()) {
            return false;
        }
        AnonymousClass0C1 A02 = C05210Iq.A02(A01);
        C150326bu.A01(StoredPreferences.A00, A02);
        C150326bu.A00(A02).A04(new B6J(this, A02, r6));
        return true;
    }

    public final boolean onStopJob(int i) {
        AnonymousClass0QD.A00().Bp5("BackgroundWifiPrefetcherJobLogic", "onStopJob");
        return false;
    }
}
