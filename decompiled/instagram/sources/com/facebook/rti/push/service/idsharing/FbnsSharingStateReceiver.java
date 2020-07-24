package com.facebook.rti.push.service.idsharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0TR;
import p000X.AnonymousClass0UR;
import p000X.AnonymousClass0Z0;

public class FbnsSharingStateReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0Z0.A01(331409989);
        if (intent == null) {
            i = 814868148;
        } else {
            String action = intent.getAction();
            AnonymousClass0UR r0 = new AnonymousClass0UR(context);
            if (!AnonymousClass0TR.A01(r0.A00, AnonymousClass0UR.A00(intent))) {
                AnonymousClass0DB.A0D("FbnsSharingStateReceiver", "Rejecting device credentials sharing request due to failed auth");
                i = 1650811313;
            } else {
                if ("com.facebook.rti.fbns.intent.SHARE_IDS".equals(action)) {
                    Bundle resultExtras = getResultExtras(true);
                    resultExtras.putString("/settings/mqtt/id/mqtt_device_id", "");
                    resultExtras.putString("/settings/mqtt/id/mqtt_device_secret", "");
                    resultExtras.putLong("/settings/mqtt/id/timestamp", Long.MAX_VALUE);
                    setResult(-1, (String) null, resultExtras);
                }
                i = -1840099475;
            }
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
