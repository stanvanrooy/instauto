package com.facebook.voltron.scheduler;

import android.app.AlarmManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass0Z0;
import p000X.C2094890k;
import p000X.C24840AuU;

public class AppModuleAlarmBasedDownloader extends Service {
    public static AlarmManager A01;
    public static final long A02 = TimeUnit.DAYS.toMillis(1);
    public static final long A03 = TimeUnit.MINUTES.toMillis(1);
    public C2094890k A00;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        int A04 = AnonymousClass0Z0.A04(125093641);
        this.A00 = new C2094890k(this);
        AnonymousClass0Z0.A0B(446903219, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0Z0.A04(-571326994);
        C2094890k r3 = this.A00;
        AnonymousClass0FY.A00(r3);
        r3.onStartJob(-1, intent.getExtras(), new C24840AuU(this, intent, this, i2));
        AnonymousClass0Z0.A0B(444867663, A04);
        return 3;
    }
}
