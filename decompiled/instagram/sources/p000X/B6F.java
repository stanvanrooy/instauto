package p000X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.B6F */
public final class B6F extends C24842AuX {
    public Context A00;

    public final boolean onStopJob(int i) {
        return false;
    }

    public B6F(Context context) {
        this.A00 = context;
    }

    public final boolean onStartJob(int i, Bundle bundle, C2095190p r7) {
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        if (!A01.AgN()) {
            return false;
        }
        C05700Lp.A00().ADc(new B6I(this, A01, r7));
        return true;
    }
}
