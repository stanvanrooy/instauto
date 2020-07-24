package com.facebook.common.dextricks;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.PersistableBundle;
import com.facebook.common.dextricks.DexOptimization;

public class DexOptimizationJobService extends JobService {
    public static final int JOB_ID = -87105850;
    public static final String KEY_SCHEDULED_AT = "scheduledAt";
    public static final String TAG = "DexOptimizationJobService";

    public class Client {
        public static void cancel(Context context) {
            Mlog.safeFmt("DexOptimizationJobService: canceling dexoptjobsvc", new Object[0]);
            try {
                ((JobScheduler) context.getSystemService("jobscheduler")).cancel(DexOptimizationJobService.JOB_ID);
            } catch (SecurityException e) {
                Mlog.m35w("Failure to cancel DexOptimizationJobService", e);
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    Mlog.m35w("Failure to cancel DexOptimizationJobService", e2);
                    return;
                }
                throw e2;
            }
        }

        public static void schedule(Context context, DexStore dexStore, boolean z, boolean z2, long j) {
            Mlog.safeFmt("DexOptimizationJobService: scheduling dexoptjobsvc requiresCharging:" + z + " requiresDeviceIdle:" + z2 + " idleOptimizationPeriod:" + (j / 60000) + "min", new Object[0]);
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong(DexOptimizationJobService.KEY_SCHEDULED_AT, System.currentTimeMillis());
            try {
                jobScheduler.schedule(new JobInfo.Builder(DexOptimizationJobService.JOB_ID, new ComponentName(context, DexOptimizationJobService.class)).setPeriodic(j).setExtras(persistableBundle).setRequiresCharging(z).setRequiresDeviceIdle(z2).build());
            } catch (SecurityException e) {
                Mlog.m35w("Failure to schedule DexOptimizationJobService", e);
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    Mlog.m35w("Failure to schedule DexOptimizationJobService", e2);
                    return;
                }
                throw e2;
            }
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Mlog.safeFmt("DexOptimizationJobService: onStartJob", new Object[0]);
        DexOptimization.Client.startBackgroundOptimization(this, DexLibLoader.getMainDexStore());
        jobFinished(jobParameters, false);
        return false;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        Mlog.safeFmt("DexOptimizationJobService: onStopJob", new Object[0]);
        return false;
    }
}
