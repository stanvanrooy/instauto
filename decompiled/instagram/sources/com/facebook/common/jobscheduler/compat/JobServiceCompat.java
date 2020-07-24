package com.facebook.common.jobscheduler.compat;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass239;
import p000X.AnonymousClass23J;
import p000X.BUM;
import p000X.C24842AuX;

public abstract class JobServiceCompat extends JobService {
    public static final String TAG = "JobServiceCompat";

    public abstract C24842AuX getRunJobLogic();

    public static boolean isJobVersionCodeValid(PersistableBundle persistableBundle) {
        if (persistableBundle == null) {
            AnonymousClass0DB.A0D(TAG, "Job with no version code, cancelling job");
            return false;
        } else if (227299068 != persistableBundle.getInt("__VERSION_CODE", 0)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r1 == false) goto L_0x001d;
     */
    private boolean isValidJobId(int i) {
        boolean z;
        try {
            AnonymousClass239 A00 = AnonymousClass239.A00(this, 0);
            Class<?> cls = getClass();
            Class cls2 = (Class) A00.A02.get(i);
            if (cls2 != null) {
                boolean equals = cls2.equals(cls);
                z = true;
            }
            z = false;
            if (!z) {
                return false;
            }
            return true;
        } catch (RuntimeException unused) {
            AnonymousClass0DB.A0J(TAG, "Runtime error getting service info, cancelling: %d", Integer.valueOf(i));
            return false;
        }
    }

    public void cancelJob(Context context, int i) {
        ((JobScheduler) context.getSystemService("jobscheduler")).cancel(i);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0Z0.A04(-1247149497);
        getRunJobLogic();
        AnonymousClass0Z0.A0B(925118995, A04);
        return 2;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        if (!isJobVersionCodeValid(jobParameters.getExtras())) {
            jobParameters.getJobId();
            return false;
        } else if (!isValidJobId(jobParameters.getJobId())) {
            cancelJob(this, jobParameters.getJobId());
            return false;
        } else {
            boolean onStartJob = getRunJobLogic().onStartJob(jobParameters.getJobId(), new Bundle(jobParameters.getExtras()), new BUM(this, jobParameters, this));
            if (onStartJob) {
                return onStartJob;
            }
            AnonymousClass23J A00 = AnonymousClass23J.A00(this);
            synchronized (A00) {
                A00.A00.put(jobParameters.getJobId(), false);
            }
            return onStartJob;
        }
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean onStopJob = getRunJobLogic().onStopJob(jobParameters.getJobId());
        if (onStopJob) {
            return onStopJob;
        }
        AnonymousClass23J A00 = AnonymousClass23J.A00(this);
        synchronized (A00) {
            A00.A00.put(jobParameters.getJobId(), false);
        }
        return onStopJob;
    }
}
