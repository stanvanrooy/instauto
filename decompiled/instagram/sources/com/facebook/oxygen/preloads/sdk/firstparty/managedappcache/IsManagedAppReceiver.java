package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Z0;

public class IsManagedAppReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0Z0.A01(-149583057);
        if (intent == null) {
            i = 2081470689;
        } else {
            String action = intent.getAction();
            if (!action.equals("com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IS_MANAGED_APP_CHANGED")) {
                i = -877942130;
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    new Intent(context, IsManagedAppCacheJobService.class).setAction(action);
                    IsManagedAppCacheJobService.A00(intent, context);
                } else {
                    Intent intent2 = new Intent(context, IsManagedAppCacheService.class);
                    intent2.setAction(action);
                    if (context.startService(intent2) == null) {
                        Log.e("IsManagedAppReceiver", AnonymousClass000.A0E("sendIntent(): could not start service for intent action=", action));
                    }
                }
                i = -1954695994;
            }
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
