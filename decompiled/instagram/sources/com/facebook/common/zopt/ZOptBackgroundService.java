package com.facebook.common.zopt;

import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.concurrent.atomic.AtomicBoolean;
import p000X.AnonymousClass510;

public class ZOptBackgroundService extends JobService {
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    public final boolean onStartJob(JobParameters jobParameters) {
        this.A00.set(false);
        jobParameters.getExtras().getInt("xmx", 256);
        new AnonymousClass510(this, this, jobParameters).start();
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        this.A00.set(true);
        return false;
    }
}
