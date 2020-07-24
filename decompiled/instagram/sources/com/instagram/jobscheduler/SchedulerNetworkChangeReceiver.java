package com.instagram.jobscheduler;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Set;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0NT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BH;
import p000X.B55;
import p000X.B56;
import p000X.C05210Iq;
import p000X.C06590Pq;

public class SchedulerNetworkChangeReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        Set<String> A00;
        int A01 = AnonymousClass0Z0.A01(2051876086);
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        if (!A012.AgN()) {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, SchedulerNetworkChangeReceiver.class), 2, 1);
            i = 62981278;
        } else {
            if (AnonymousClass0NT.A08(context)) {
                AnonymousClass0C1 A02 = C05210Iq.A02(A012);
                B55 b55 = (B55) A02.AVA(B55.class, new B56(A02));
                synchronized (b55) {
                    A00 = b55.A00();
                    b55.A00.edit().remove("services_waiting_for_connectivity_change").apply();
                }
                for (String componentName : A00) {
                    ComponentName componentName2 = new ComponentName(context, componentName);
                    Intent intent2 = new Intent();
                    intent2.setComponent(componentName2);
                    AnonymousClass1BH.A04(intent2, context);
                }
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, SchedulerNetworkChangeReceiver.class), 2, 1);
            }
            i = 799911547;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
