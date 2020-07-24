package com.instagram.publisher;

import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass14Q;
import p000X.C106004hm;

public class HeartbeatJobService extends JobService {
    public static final long A00 = TimeUnit.MINUTES.toMillis(15);

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        AnonymousClass0C1 A08 = AnonymousClass0J1.A08(jobParameters.getExtras());
        if (A08 == null) {
            return false;
        }
        AnonymousClass14Q.A02(A08).A0N(new C106004hm(this, jobParameters));
        return true;
    }
}
