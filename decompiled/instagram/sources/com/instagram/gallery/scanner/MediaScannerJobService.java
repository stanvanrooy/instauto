package com.instagram.gallery.scanner;

import android.app.job.JobParameters;
import android.app.job.JobService;
import p000X.BUJ;

public class MediaScannerJobService extends JobService {
    public final BUJ A00 = new BUJ();

    public final boolean onStartJob(JobParameters jobParameters) {
        this.A00.A00();
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        this.A00.A01();
        return false;
    }
}
