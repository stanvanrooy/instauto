package com.instagram.debug.memorydump;

import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;
import p000X.C24842AuX;

public class MemoryDumpTaskService extends GcmTaskServiceCompat {
    public C24842AuX getRunJobLogic() {
        return new MemoryDumpUploadJob(getApplicationContext());
    }
}
