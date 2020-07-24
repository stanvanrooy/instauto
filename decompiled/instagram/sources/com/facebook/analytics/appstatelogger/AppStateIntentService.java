package com.facebook.analytics.appstatelogger;

import android.content.Intent;
import p000X.AnonymousClass000;
import p000X.AnonymousClass042;
import p000X.AnonymousClass0EY;
import p000X.AnonymousClass0XY;

public class AppStateIntentService extends AnonymousClass0EY {
    public static final String A00;
    public static final String A01;

    static {
        Class<AppStateBroadcastReceiver> cls = AppStateBroadcastReceiver.class;
        A00 = AnonymousClass000.A0E(cls.getCanonicalName(), ".LOG_TO_SHARED_PREFS");
        A01 = AnonymousClass000.A0E(cls.getPackage().getName(), ".FRAMEWORK_TIME");
    }

    public final void onHandleWork(Intent intent) {
        if (intent != null && AnonymousClass0XY.A01().A00(this, this, intent) && A00.equals(intent.getAction())) {
            AnonymousClass042.A00(getApplicationContext()).A00.edit().putLong("frameworkStartTime", intent.getLongExtra(A01, System.currentTimeMillis() / 1000)).apply();
        }
    }
}
