package com.instagram.jobscheduler;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BH;

public class SchedulerAlarmBroadcastReceiverV2 extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(249023612);
        ComponentName componentName = new ComponentName(context, intent.getAction());
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        intent2.putExtras(intent);
        AnonymousClass1BH.A04(intent2, context);
        AnonymousClass0Z0.A0E(intent, -1341412553, A01);
    }
}
