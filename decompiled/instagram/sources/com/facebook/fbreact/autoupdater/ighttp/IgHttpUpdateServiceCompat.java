package com.facebook.fbreact.autoupdater.ighttp;

import com.facebook.common.jobscheduler.compat.JobServiceCompat;
import p000X.B6F;
import p000X.C24842AuX;

public class IgHttpUpdateServiceCompat extends JobServiceCompat {
    public C24842AuX A00;

    public final C24842AuX getRunJobLogic() {
        if (this.A00 == null) {
            this.A00 = new B6F(this);
        }
        return this.A00;
    }
}
