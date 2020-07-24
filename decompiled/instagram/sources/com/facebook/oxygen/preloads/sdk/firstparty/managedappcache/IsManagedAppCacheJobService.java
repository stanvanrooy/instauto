package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.C0003R;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.C1414362v;

public class IsManagedAppCacheJobService extends JobService {
    public static HandlerThread A02;
    public Handler A00;
    public volatile boolean A01;

    public final boolean onStartJob(JobParameters jobParameters) {
        this.A01 = false;
        Handler handler = this.A00;
        AnonymousClass0ZA.A0D(handler, handler.obtainMessage(1, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        this.A01 = true;
        return true;
    }

    public static void A00(Intent intent, Context context) {
        ((JobScheduler) context.getApplicationContext().getSystemService(AnonymousClass0C5.$const$string(100))).enqueue(new JobInfo.Builder(C0003R.C0005id.managed_app_cache_job_id, new ComponentName(context, IsManagedAppCacheJobService.class)).setOverrideDeadline(0).build(), new JobWorkItem(intent));
    }

    public final void onCreate() {
        HandlerThread handlerThread;
        int A04 = AnonymousClass0Z0.A04(1923869393);
        synchronized (IsManagedAppCacheJobService.class) {
            if (A02 == null) {
                HandlerThread handlerThread2 = new HandlerThread("th-IsManagedAppCacheJobSvc");
                A02 = handlerThread2;
                handlerThread2.start();
            }
            handlerThread = A02;
        }
        this.A00 = new Handler(handlerThread.getLooper(), new C1414362v(this));
        AnonymousClass0Z0.A0B(2020117912, A04);
    }
}
