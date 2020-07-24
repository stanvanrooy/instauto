package com.instagram.periodicreporter;

import com.facebook.common.jobscheduler.compat.JobServiceCompat;
import p000X.AnonymousClass0J1;
import p000X.B0B;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C2094990m;
import p000X.C24842AuX;

public class SimInfoPeriodicRunnerJobService extends JobServiceCompat {
    public final C24842AuX getRunJobLogic() {
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        if (!A01.AgN()) {
            return new C2094990m(this);
        }
        return new B0B(this, C05210Iq.A02(A01));
    }
}
