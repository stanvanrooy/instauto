package com.instagram.pendingmedia.service.uploadretrypolicy;

import android.app.job.JobParameters;
import android.app.job.JobService;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.C17870qw;

public class UploadRetryJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        AnonymousClass0C1 A08;
        if (!jobParameters.getExtras().getString("ACTION").equals("ACTION_CONNECTED_ALARM") || (A08 = AnonymousClass0J1.A08(jobParameters.getExtras())) == null) {
            return false;
        }
        C17870qw.A09(C17870qw.A01(this, A08, "job service alarm"), "job service alarm", true);
        return false;
    }
}
