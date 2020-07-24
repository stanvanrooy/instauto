package p000X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.B0B */
public final class B0B extends C24842AuX {
    public final Context A00;
    public final AnonymousClass0C1 A01;

    public final boolean onStopJob(int i) {
        return false;
    }

    public final boolean onStartJob(int i, Bundle bundle, C2095190p r6) {
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_sim_api_update", (AnonymousClass0RN) null);
        new BRH(this.A00).A02(A002);
        AnonymousClass0WN.A01(this.A01).BcG(A002);
        return false;
    }

    public B0B(Context context, AnonymousClass0C1 r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
