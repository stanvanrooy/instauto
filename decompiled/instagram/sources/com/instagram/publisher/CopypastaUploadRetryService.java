package com.instagram.publisher;

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
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0XS;
import p000X.AnonymousClass0XU;
import p000X.AnonymousClass0XY;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZP;
import p000X.AnonymousClass14Q;
import p000X.AnonymousClass1BH;
import p000X.C106294iF;
import p000X.C12600h4;
import p000X.C12620h6;

public class CopypastaUploadRetryService extends Service {
    public static PowerManager.WakeLock A01;
    public static Boolean A02;
    public static boolean A03;
    public static final long A04 = TimeUnit.MINUTES.toMillis(15);
    public AlarmManager A00;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public class RetryAlarmBroadcastReceiver extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
            int i;
            AnonymousClass0C1 A01;
            int A012 = AnonymousClass0Z0.A01(-1447442490);
            if (!AnonymousClass0XY.A01().A00(context, this, intent)) {
                i = -1835608944;
            } else {
                if ("AutoRetryAlarm".equals(intent.getAction()) && (A01 = CopypastaUploadRetryService.A01(intent)) != null) {
                    C12600h4.A00().A05(C12620h6.COPYPASTA_UPLOAD_RETRY);
                    PowerManager.WakeLock wakeLock = CopypastaUploadRetryService.A01;
                    if (wakeLock != null) {
                        AnonymousClass0ZP.A01(wakeLock);
                    }
                    AnonymousClass1BH.A04(new Intent(context, CopypastaUploadRetryService.class).putExtra("IgSessionManager.SESSION_TOKEN_KEY", A01.getToken()).setAction("AutoRetryAlarm"), context);
                }
                i = -1154628726;
            }
            AnonymousClass0Z0.A0E(intent, i, A012);
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

    private void A02(int i, long j, PendingIntent pendingIntent, long j2, boolean z) {
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

    public static void A03(Context context, AnonymousClass0C1 r4, boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            Boolean bool = A02;
            if (bool == null || bool.booleanValue() != z) {
                A02 = Boolean.valueOf(z);
                AnonymousClass1BH.A04(new Intent(context, CopypastaUploadRetryService.class).setAction("UpdateServiceState").putExtra("EnableReceiver", z).putExtra("IgSessionManager.SESSION_TOKEN_KEY", r4.getToken()), context);
            }
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        AnonymousClass14Q A022;
        C106294iF r1;
        int A042 = AnonymousClass0Z0.A04(-499628637);
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
                            getPackageManager().setComponentEnabledSetting(new ComponentName(this, CopypastaConnectivityChangeReceiver.class), 2, 1);
                        }
                    }
                } else {
                    if ("Connected".equals(intent2.getAction())) {
                        A03 = true;
                        AnonymousClass0C1 A012 = A01(intent2);
                        if (A012 != null) {
                            A022 = AnonymousClass14Q.A02(A012);
                            r1 = new C106294iF(this, A012);
                        }
                    } else if ("ScheduleAlarm".equals(intent2.getAction())) {
                        AnonymousClass0C1 A013 = A01(intent2);
                        if (A013 != null) {
                            Intent action = new Intent(this, RetryAlarmBroadcastReceiver.class).putExtra("IgSessionManager.SESSION_TOKEN_KEY", A013.getToken()).setAction("AutoRetryAlarm");
                            AnonymousClass0XS A002 = AnonymousClass0XU.A00();
                            A002.A04(action, getClassLoader());
                            PendingIntent A023 = A002.A02(this, 0, 268435456);
                            boolean booleanExtra = intent2.getBooleanExtra("AlarmExact", false);
                            if (intent2.hasExtra("AlarmDelay")) {
                                long longExtra = intent2.getLongExtra("AlarmDelay", 120000);
                                A02(2, SystemClock.elapsedRealtime() + longExtra, A023, longExtra, booleanExtra);
                            } else if (intent2.hasExtra("AlarmTime")) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long longExtra2 = intent2.getLongExtra("AlarmTime", 120000 + currentTimeMillis);
                                A02(0, longExtra2, A023, longExtra2 - currentTimeMillis, booleanExtra);
                                if (AnonymousClass0DB.A0S()) {
                                    new SimpleDateFormat("HH:mm:ss.SSS", Locale.US).format(new Date(longExtra2));
                                }
                            }
                        }
                    } else if ("AutoRetryAlarm".equals(intent2.getAction())) {
                        AnonymousClass0C1 A014 = A01(intent2);
                        if (A014 != null) {
                            A022 = AnonymousClass14Q.A02(A014);
                            r1 = new C106294iF(this, A014);
                        }
                    } else if ("ScheduleHeartbeat".equals(intent2.getAction())) {
                        Intent action2 = new Intent(this, RetryAlarmBroadcastReceiver.class).setAction("AutoRetryAlarm");
                        AnonymousClass0XS A003 = AnonymousClass0XU.A00();
                        A003.A04(action2, getClassLoader());
                        PendingIntent A024 = A003.A02(this, 1, 536870912);
                        boolean booleanExtra2 = intent2.getBooleanExtra("ScheduleHeartbeatEnabled", false);
                        if (booleanExtra2 && A024 == null) {
                            AnonymousClass0XS A004 = AnonymousClass0XU.A00();
                            A004.A04(action2, getClassLoader());
                            PendingIntent A025 = A004.A02(this, 1, 134217728);
                            if (this.A00 == null) {
                                this.A00 = (AlarmManager) getSystemService("alarm");
                            }
                            this.A00.setInexactRepeating(2, A04, 900000, A025);
                        } else if (!booleanExtra2 && A024 != null) {
                            if (this.A00 == null) {
                                this.A00 = (AlarmManager) getSystemService("alarm");
                            }
                            this.A00.cancel(A024);
                        }
                    }
                    A022.A0N(r1);
                }
            } catch (Throwable th) {
                AnonymousClass0ZP.A02(A00());
                AnonymousClass0Z0.A0B(-744110965, A042);
                throw th;
            }
        }
        AnonymousClass0ZP.A02(A00());
        AnonymousClass0Z0.A0B(-2023641329, A042);
        return 2;
    }

    public static AnonymousClass0C1 A01(Intent intent) {
        if (intent.getExtras() != null) {
            return AnonymousClass0J1.A07(intent.getExtras());
        }
        return null;
    }
}
