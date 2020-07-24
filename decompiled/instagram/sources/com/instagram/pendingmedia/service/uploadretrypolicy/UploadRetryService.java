package com.instagram.pendingmedia.service.uploadretrypolicy;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0XS;
import p000X.AnonymousClass0XU;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZP;
import p000X.AnonymousClass1BH;
import p000X.C17870qw;

public class UploadRetryService extends Service {
    public static PowerManager.WakeLock A01;
    public static Boolean A02;
    public static boolean A03;
    public AlarmManager A00;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public class RetryAlarmBroadcastReceiver extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
            int A01 = AnonymousClass0Z0.A01(-255171960);
            if ("AutoRetryAlarm".equals(intent.getAction())) {
                PowerManager.WakeLock wakeLock = UploadRetryService.A01;
                if (wakeLock != null) {
                    AnonymousClass0ZP.A01(wakeLock);
                }
                AnonymousClass1BH.A04(new Intent(context, UploadRetryService.class).setAction("AutoRetryAlarm").putExtra("IgSessionManager.SESSION_TOKEN_KEY", intent.getStringExtra("IgSessionManager.SESSION_TOKEN_KEY")), context);
            }
            AnonymousClass0Z0.A0E(intent, 1638649561, A01);
        }
    }

    private PowerManager.WakeLock A00() {
        if (A01 == null) {
            PowerManager powerManager = (PowerManager) getSystemService("power");
            synchronized (this) {
                if (A01 == null) {
                    PowerManager.WakeLock A002 = AnonymousClass0ZP.A00(powerManager, 1, "UploadServiceWakeLock");
                    A01 = A002;
                    AnonymousClass0ZP.A03(A002);
                }
            }
        }
        return A01;
    }

    private void A01(int i, long j, PendingIntent pendingIntent, long j2, boolean z) {
        long j3;
        long j4 = 180000;
        if (j2 >= 0) {
            j3 = (20 * j2) / 100;
        } else {
            j3 = 180000;
        }
        if (z) {
            j4 = 3000;
        }
        long min = Math.min(j3, j4);
        if (this.A00 == null) {
            this.A00 = (AlarmManager) getSystemService("alarm");
        }
        this.A00.setWindow(i, j, min, pendingIntent);
    }

    public static void A02(Context context, AnonymousClass0C1 r4, boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            Boolean bool = A02;
            if (bool == null || bool.booleanValue() != z) {
                A02 = Boolean.valueOf(z);
                AnonymousClass1BH.A04(new Intent(context, UploadRetryService.class).setAction("UpdateServiceState").putExtra("EnableReceiver", z).putExtra("IgSessionManager.SESSION_TOKEN_KEY", r4.getToken()), context);
            }
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        int A04 = AnonymousClass0Z0.A04(-36964256);
        Intent intent2 = intent;
        if (intent != null) {
            try {
                if ("UpdateServiceState".equals(intent2.getAction())) {
                    AnonymousClass0ZP.A01(A00());
                    Boolean bool = A02;
                    if (bool == null || A03 != bool.booleanValue()) {
                        if (bool == null) {
                            A02 = Boolean.valueOf(intent2.getBooleanExtra("EnableReceiver", true));
                        }
                        boolean booleanValue = A02.booleanValue();
                        A03 = booleanValue;
                        if (!booleanValue) {
                            getPackageManager().setComponentEnabledSetting(new ComponentName(this, ConnectivityChangeReceiver.class), 2, 1);
                        }
                    }
                } else if ("Connected".equals(intent2.getAction())) {
                    A03 = true;
                    boolean booleanExtra = intent2.getBooleanExtra("ConnectedToWifi", false);
                    C17870qw A012 = C17870qw.A01(this, AnonymousClass0J1.A06(intent2.getExtras()), "connectivity wakeup");
                    if (C17870qw.A0A(A012)) {
                        if (booleanExtra) {
                            str = "connected to wifi";
                        } else {
                            str = "connected to data";
                        }
                        C17870qw.A09(A012, str, true);
                    }
                } else if ("ScheduleAlarm".equals(intent2.getAction())) {
                    Intent putExtra = new Intent(this, RetryAlarmBroadcastReceiver.class).setAction("AutoRetryAlarm").putExtra("IgSessionManager.SESSION_TOKEN_KEY", intent2.getStringExtra("IgSessionManager.SESSION_TOKEN_KEY"));
                    AnonymousClass0XS A002 = AnonymousClass0XU.A00();
                    A002.A04(putExtra, getClassLoader());
                    PendingIntent A022 = A002.A02(this, 0, 268435456);
                    boolean booleanExtra2 = intent2.getBooleanExtra("AlarmExact", false);
                    if (intent2.hasExtra("AlarmDelay")) {
                        long longExtra = intent2.getLongExtra("AlarmDelay", 120000);
                        A01(2, SystemClock.elapsedRealtime() + longExtra, A022, longExtra, booleanExtra2);
                    } else if (intent2.hasExtra("AlarmTime")) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long longExtra2 = intent2.getLongExtra("AlarmTime", 120000 + currentTimeMillis);
                        A01(0, longExtra2, A022, longExtra2 - currentTimeMillis, booleanExtra2);
                        if (AnonymousClass0DB.A0S()) {
                            new SimpleDateFormat("HH:mm:ss.SSS", Locale.US).format(new Date(longExtra2));
                        }
                    }
                } else if ("AutoRetryAlarm".equals(intent2.getAction())) {
                    C17870qw.A09(C17870qw.A01(this, AnonymousClass0J1.A06(intent2.getExtras()), "alarm wakeup"), "retry alarm", false);
                }
            } catch (Throwable th) {
                AnonymousClass0ZP.A02(A00());
                AnonymousClass0Z0.A0B(1233054657, A04);
                throw th;
            }
        }
        AnonymousClass0ZP.A02(A00());
        AnonymousClass0Z0.A0B(-993828779, A04);
        return 2;
    }
}
