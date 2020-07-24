package com.instagram.debug.memorydump;

import com.facebook.common.jobscheduler.compat.JobServiceCompat;
import p000X.C24842AuX;

public class MemoryDumpUploadJobService extends JobServiceCompat {
    public C24842AuX getRunJobLogic() {
        return new MemoryDumpUploadJob(getApplicationContext());
    }
}
