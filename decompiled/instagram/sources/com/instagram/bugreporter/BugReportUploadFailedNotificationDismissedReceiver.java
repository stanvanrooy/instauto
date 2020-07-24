package com.instagram.bugreporter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000X.AnonymousClass0Z0;

public class BugReportUploadFailedNotificationDismissedReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(353852769);
        BugReport.A00((BugReport) intent.getExtras().getParcelable("BugReporterActivity.INTENT_EXTRA_BUGREPORT"));
        AnonymousClass0Z0.A0E(intent, -902667223, A01);
    }
}
