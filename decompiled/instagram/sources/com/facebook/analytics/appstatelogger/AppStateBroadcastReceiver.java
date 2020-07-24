package com.facebook.analytics.appstatelogger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000X.AnonymousClass00Y;
import p000X.AnonymousClass03H;
import p000X.AnonymousClass042;
import p000X.AnonymousClass09Q;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0XY;
import p000X.AnonymousClass0Z0;
import p000X.C026403i;

public class AppStateBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0Z0.A01(-1656640902);
        if (!AnonymousClass0XY.A01().A00(context, this, intent)) {
            i = 853075440;
        } else {
            String action = intent.getAction();
            if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                Class<AppStateIntentService> cls = AppStateIntentService.class;
                Intent intent2 = new Intent(context, cls);
                intent2.setAction(AppStateIntentService.A00);
                intent2.putExtra(AppStateIntentService.A01, System.currentTimeMillis() / 1000);
                try {
                    AnonymousClass00Y.enqueueWork(context, (Class) cls, -471957687, intent2);
                } catch (IllegalStateException | SecurityException e) {
                    AnonymousClass03H A00 = AnonymousClass09Q.A00();
                    if (A00 != null) {
                        A00.A00("Could not start framework start intent service", e);
                    }
                }
            } else if (action.equals("android.intent.action.ACTION_SHUTDOWN")) {
                synchronized (AnonymousClass09Q.A0X) {
                    try {
                        if (AnonymousClass09Q.A0W == null) {
                            AnonymousClass0DB.A0E("AppStateLoggerCore", "No application has been registered with AppStateLogger");
                        } else {
                            C026403i r1 = AnonymousClass09Q.A0W.A09;
                            synchronized (r1) {
                                try {
                                    r1.A0E = true;
                                    C026403i.A02(r1);
                                } catch (Throwable th) {
                                    while (true) {
                                        th = th;
                                        break;
                                    }
                                }
                            }
                            C026403i.A01(r1);
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                        }
                    }
                }
                AnonymousClass042.A00(context).A00.edit().putLong("deviceShutdown", System.currentTimeMillis() / 1000).apply();
            }
            i = 483118374;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
        return;
        throw th;
    }
}
