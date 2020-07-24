package com.instagram.contacts.ccu.intf;

import android.app.job.JobParameters;
import android.app.job.JobService;
import p000X.BUE;
import p000X.BUL;

public class CCUJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        BUE instance = BUE.getInstance(getApplicationContext());
        if (instance != null) {
            return instance.onStart(this, new BUL(this, jobParameters));
        }
        return false;
    }
}
