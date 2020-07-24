package com.instagram.util.offline;

import com.facebook.common.jobscheduler.compat.JobServiceCompat;
import p000X.B6G;
import p000X.C24842AuX;

public class BackgroundWifiPrefetcherJobServiceCompat extends JobServiceCompat {
    public C24842AuX A00;

    public final C24842AuX getRunJobLogic() {
        if (this.A00 == null) {
            this.A00 = new B6G();
        }
        return this.A00;
    }
}
