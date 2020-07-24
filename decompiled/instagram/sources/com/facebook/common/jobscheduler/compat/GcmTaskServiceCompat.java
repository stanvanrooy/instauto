package com.facebook.common.jobscheduler.compat;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.common.gcmcompat.Task;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass239;
import p000X.B5B;
import p000X.B5G;
import p000X.B5I;
import p000X.B5J;
import p000X.B5L;
import p000X.B5O;
import p000X.C23954AeE;
import p000X.C24842AuX;

public abstract class GcmTaskServiceCompat extends B5B {
    public static final String ACTION_PREFIX = "com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat";
    public static final String ACTION_TRY_SCHEDULE_PREFIX = "com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-";
    public static final long ALLOWED_JOB_TIME_MILLIS;
    public static final String GOOGLE_PREFIX = "com.google";
    public static final int MAX_FAILURES = 3;
    public static final long RETRY_DELAY_MS;
    public static final String TAG = "GcmTaskServiceCompat";

    public abstract C24842AuX getRunJobLogic();

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        RETRY_DELAY_MS = timeUnit.toMillis(5);
        ALLOWED_JOB_TIME_MILLIS = timeUnit.toMillis(2);
    }

    public static Intent makeAlarmManagerIntent(Context context, String str, Class cls) {
        return new Intent(context, cls).setAction(AnonymousClass000.A0E(ACTION_TRY_SCHEDULE_PREFIX, str)).setPackage(context.getPackageName());
    }

    public static String makeTryScheduleAction(String str) {
        return AnonymousClass000.A0E(ACTION_TRY_SCHEDULE_PREFIX, str);
    }

    public static Intent makeTryScheduleIntent(Context context, Task task, int i) {
        try {
            Intent makeAlarmManagerIntent = makeAlarmManagerIntent(context, task.A01, Class.forName(task.A00));
            B5I b5i = new B5I(task, i);
            Bundle bundle = new Bundle();
            bundle.putString("job_tag", b5i.A02);
            bundle.putParcelable("task", b5i.A01);
            bundle.putInt("num_failures", b5i.A00);
            makeAlarmManagerIntent.putExtras(bundle);
            return makeAlarmManagerIntent;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void cancelAlarmFallback(Context context, String str, Class cls) {
        PendingIntent service = PendingIntent.getService(context, 0, makeAlarmManagerIntent(context, str, cls), 536870912);
        if (service != null) {
            ((AlarmManager) context.getSystemService("alarm")).cancel(service);
        }
    }

    public static void cancelJob(Context context, String str, Class cls) {
        try {
            C23954AeE A01 = C23954AeE.A01(context);
            ComponentName componentName = new ComponentName(A01.A00, cls);
            Task.A01(str);
            C23954AeE.A02(A01, componentName.getClassName());
            Intent A00 = C23954AeE.A00(A01, "CANCEL_TASK");
            if (A00 != null) {
                A00.putExtra(B5B.INTENT_PARAM_TAG, str);
                A00.putExtra("component", componentName);
                A01.A00.sendBroadcast(A00);
            }
        } catch (IllegalArgumentException e) {
            B5L.A00(context, new ComponentName(context, cls), e);
        }
        cancelAlarmFallback(context, str, cls);
    }

    public static int getJobIdFromTag(String str) {
        return Integer.parseInt(str);
    }

    public static String makeTag(int i) {
        return String.valueOf(i);
    }

    public static void setAlarmFallback(Context context, Task task, int i) {
        Intent makeTryScheduleIntent = makeTryScheduleIntent(context, task, i);
        ((AlarmManager) context.getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + RETRY_DELAY_MS, PendingIntent.getService(context, 0, makeTryScheduleIntent, 134217728));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (r0.equals(r3) == false) goto L_0x002d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0076 */
    public final int onRunTask(B5G b5g) {
        int i;
        boolean z;
        boolean z2;
        long uptimeMillis = SystemClock.uptimeMillis();
        String str = b5g.A01;
        AnonymousClass239 A00 = AnonymousClass239.A00(this, 1);
        if (str.matches("[0-9]+")) {
            i = Integer.parseInt(str);
        } else {
            i = 0;
        }
        Class<?> cls = getClass();
        Class cls2 = (Class) A00.A02.get(i);
        if (cls2 != null) {
            z = true;
        }
        z = false;
        if (!z) {
            AnonymousClass0DB.A0J(TAG, "Invalid GCM task id, cancelling: %s", str);
            cancelJob(this, str, cls);
            return 0;
        }
        B5J b5j = new B5J();
        Bundle bundle = b5g.A00;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        if (getRunJobLogic().onStartJob(i, bundle, b5j)) {
            try {
                long uptimeMillis2 = ALLOWED_JOB_TIME_MILLIS - (SystemClock.uptimeMillis() - uptimeMillis);
                while (true) {
                    uptimeMillis2 = (SystemClock.uptimeMillis() + uptimeMillis2) - SystemClock.uptimeMillis();
                }
                if (b5j.A00.await(uptimeMillis2, TimeUnit.MILLISECONDS)) {
                    z2 = b5j.A01;
                } else {
                    throw new TimeoutException();
                }
            } catch (TimeoutException unused) {
                z2 = getRunJobLogic().onStopJob(i);
            }
        } else {
            z2 = false;
        }
        if (z2) {
            return 1;
        }
        return 0;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int A04 = AnonymousClass0Z0.A04(2000333845);
        if (intent != null) {
            try {
                String action = intent.getAction();
                if (action == null) {
                    i3 = 852979966;
                } else if (action.startsWith(ACTION_TRY_SCHEDULE_PREFIX)) {
                    B5I b5i = new B5I(intent.getExtras());
                    scheduleJobWithPossibleJobFallback(this, b5i.A01, b5i.A00);
                    i3 = 1283764449;
                } else if (action.startsWith(GOOGLE_PREFIX)) {
                    int onStartCommand = super.onStartCommand(intent, i, i2);
                    AnonymousClass0Z0.A0B(609333806, A04);
                    return onStartCommand;
                } else {
                    getRunJobLogic();
                    i3 = -1133190647;
                }
                AnonymousClass0Z0.A0B(i3, A04);
                return 2;
            } catch (B5O e) {
                AnonymousClass0DB.A0G(TAG, "Unexpected service start parameters", e);
                AnonymousClass0Z0.A0B(-647072025, A04);
                return 2;
            }
        } else {
            B5O b5o = new B5O("Received a null intent, did you ever return START_STICKY?");
            AnonymousClass0Z0.A0B(-1344329694, A04);
            throw b5o;
        }
    }

    public static void scheduleJobWithPossibleJobFallback(Context context, Task task) {
        scheduleJobWithPossibleJobFallback(context, task, 0);
    }

    public static void scheduleJobWithPossibleJobFallback(Context context, Task task, int i) {
        int isGooglePlayServicesAvailable = GoogleApiAvailability.A00.isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable == 0) {
            try {
                C23954AeE A01 = C23954AeE.A01(context);
                C23954AeE.A02(A01, task.A00);
                Intent A00 = C23954AeE.A00(A01, "SCHEDULE_TASK");
                if (A00 != null) {
                    Bundle bundle = new Bundle();
                    task.A02(bundle);
                    A00.putExtras(bundle);
                    A01.A00.sendBroadcast(A00);
                }
            } catch (IllegalArgumentException e) {
                B5L.A00(context, new ComponentName(context, task.A00), e);
            }
        } else if (i >= 3) {
            AnonymousClass0DB.A0L(TAG, "Job %s was not scheduled because Google Play Services became consistentlyunavailable after initial check: %s", task.A01, ConnectionResult.A00(isGooglePlayServicesAvailable));
        } else {
            setAlarmFallback(context, task, i + 1);
        }
    }
}
