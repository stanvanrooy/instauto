package com.instagram.analytics.uploadscheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RU;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.C06510Pi;
import p000X.C12600h4;
import p000X.C12620h6;
import p000X.C22890zA;

public class AnalyticsUploadAlarmReceiver extends BroadcastReceiver {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    public final void onReceive(Context context, Intent intent) {
        C22890zA r2;
        C12600h4 A00;
        C12620h6 r0;
        AnonymousClass0RU A01;
        int A012 = AnonymousClass0Z0.A01(-1934231635);
        String action = intent.getAction();
        C22890zA[] values = C22890zA.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r2 = null;
                break;
            }
            r2 = values[i];
            if (r2.A03.equals(action)) {
                break;
            }
            i++;
        }
        if (r2 == C22890zA.UploadRetry) {
            A00 = C12600h4.A00();
            r0 = C12620h6.ANALYTICS_UPLOAD_RETRY;
        } else {
            if (r2 == C22890zA.BatchUpload) {
                A00 = C12600h4.A00();
                r0 = C12620h6.ANALYTICS_UPLOAD_BATCH;
            }
            if (r2 != null) {
                r2.A02 = false;
            }
            A01 = AnonymousClass0WN.A01(AnonymousClass0J1.A01(this));
            if (A01 instanceof C06510Pi) {
                ((C06510Pi) A01).BYt();
            }
            AnonymousClass0Z0.A0E(intent, -1417015211, A012);
        }
        A00.A05(r0);
        if (r2 != null) {
        }
        A01 = AnonymousClass0WN.A01(AnonymousClass0J1.A01(this));
        if (A01 instanceof C06510Pi) {
        }
        AnonymousClass0Z0.A0E(intent, -1417015211, A012);
    }
}
