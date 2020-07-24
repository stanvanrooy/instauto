package com.instagram.pendingmedia.service.uploadretrypolicy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.C0003R;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass2O4;

public class PendingMediaNotificationService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0Z0.A04(1204708137);
        String action = intent.getAction();
        if ("Show_Notification".equals(action)) {
            String string = getString(C0003R.string.posting_notification);
            AnonymousClass2O4 r2 = new AnonymousClass2O4(this, "ig_posting_status");
            r2.A09(string);
            r2.A09.icon = AnonymousClass1BA.A00(this);
            r2.A0K = true;
            r2.A03(-1);
            r2.A07 = -1;
            startForeground(20023, r2.A02());
        } else if ("Hide_Notification".equals(action)) {
            stopSelf();
        }
        AnonymousClass0Z0.A0B(-2126516456, A04);
        return 2;
    }
}
