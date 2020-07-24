package com.facebook.voltron.scheduler;

import com.facebook.common.jobscheduler.compat.JobServiceCompat;
import p000X.C2094890k;
import p000X.C24842AuX;

public class AppModuleDownloadJobService extends JobServiceCompat {
    public C2094890k A00;

    public final synchronized C24842AuX getRunJobLogic() {
        if (this.A00 == null) {
            this.A00 = new C2094890k(this);
        }
        return this.A00;
    }
}
