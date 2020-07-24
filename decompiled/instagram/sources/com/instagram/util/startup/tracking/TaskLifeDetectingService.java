package com.instagram.util.startup.tracking;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p000X.AnonymousClass0Z0;
import p000X.C12600h4;

public class TaskLifeDetectingService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onDestroy() {
        int A04 = AnonymousClass0Z0.A04(927670871);
        super.onDestroy();
        AnonymousClass0Z0.A0B(834886698, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        AnonymousClass0Z0.A0B(-791815545, AnonymousClass0Z0.A04(374556871));
        return 2;
    }

    public final void onTaskRemoved(Intent intent) {
        C12600h4 A00 = C12600h4.A00();
        if (A00.A00 != null) {
            C12600h4.A03(A00, "killed_by_task_removal");
            A00.A04(C12600h4.A0A);
        }
        stopSelf();
    }
}
