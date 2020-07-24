package p000X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.facebook.C0003R;
import com.instagram.pendingmedia.service.uploadretrypolicy.UploadRetryJobService;
import com.instagram.pendingmedia.service.uploadretrypolicy.UploadRetryService;

/* renamed from: X.1uX  reason: invalid class name and case insensitive filesystem */
public final class C43511uX {
    public static void A00(Context context, AnonymousClass0C1 r4) {
        if (Build.VERSION.SDK_INT >= 21) {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            UploadRetryService.A02(context, r4, false);
            jobScheduler.cancel(C0003R.C0005id.upload_retry_service_scheduled_at);
            jobScheduler.cancel(C0003R.C0005id.upload_retry_service_scheduled_in);
            return;
        }
        UploadRetryService.A02(context, r4, false);
        AnonymousClass1BH.A04(new Intent(context, UploadRetryService.class).setAction("ScheduleAlarm").putExtra("IgSessionManager.SESSION_TOKEN_KEY", r4.getToken()), context);
    }

    public static void A02(Context context, AnonymousClass0C1 r7, long j, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            UploadRetryService.A02(context, r7, true);
            ComponentName componentName = new ComponentName(context, UploadRetryJobService.class);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("ACTION", "ACTION_CONNECTED_ALARM");
            persistableBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r7.getToken());
            ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(C0003R.C0005id.upload_retry_service_scheduled_at, componentName).setRequiredNetworkType(1).setMinimumLatency(j - System.currentTimeMillis()).setExtras(persistableBundle).build());
            return;
        }
        UploadRetryService.A02(context, r7, true);
        AnonymousClass1BH.A04(new Intent(context, UploadRetryService.class).setAction("ScheduleAlarm").putExtra("AlarmTime", j).putExtra("AlarmExact", z).putExtra("IgSessionManager.SESSION_TOKEN_KEY", r7.getToken()), context);
    }

    public static void A01(Context context, AnonymousClass0C1 r9) {
        if (Build.VERSION.SDK_INT >= 21) {
            UploadRetryService.A02(context, r9, true);
            ComponentName componentName = new ComponentName(context, UploadRetryJobService.class);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("ACTION", "ACTION_CONNECTED_ALARM");
            persistableBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r9.getToken());
            ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(C0003R.C0005id.upload_retry_service_scheduled_in, componentName).setRequiredNetworkType(1).setMinimumLatency(180000).setExtras(persistableBundle).build());
            return;
        }
        UploadRetryService.A02(context, r9, true);
        AnonymousClass1BH.A04(new Intent(context, UploadRetryService.class).setAction("ScheduleAlarm").putExtra("AlarmDelay", 180000).putExtra("IgSessionManager.SESSION_TOKEN_KEY", r9.getToken()), context);
    }
}
