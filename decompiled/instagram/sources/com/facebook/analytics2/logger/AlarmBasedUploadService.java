package com.facebook.analytics2.logger;

import android.app.AlarmManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass0Z0;
import p000X.C033906u;
import p000X.C034006v;

public class AlarmBasedUploadService extends Service {
    public static AlarmManager A01;
    public static final long A02 = TimeUnit.HOURS.toMillis(6);
    public static final long A03 = TimeUnit.MINUTES.toMillis(5);
    public C034006v A00;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        int A04 = AnonymousClass0Z0.A04(-1346410516);
        this.A00 = C034006v.A00(this);
        AnonymousClass0Z0.A0B(192141211, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0Z0.A04(1376750835);
        if (intent != null && intent.getAction().startsWith("com.facebook.analytics2.logger.UPLOAD_NOW")) {
            intent.setAction("com.facebook.analytics2.logger.UPLOAD_NOW");
        }
        C034006v r1 = this.A00;
        AnonymousClass0FY.A00(r1);
        int A032 = r1.A03(intent, new C033906u(this, i2));
        AnonymousClass0Z0.A0B(-103674956, A04);
        return A032;
    }
}
