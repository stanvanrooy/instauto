package com.facebook.analytics2.logger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000X.AnonymousClass0XY;
import p000X.AnonymousClass0Z0;
import p000X.C031205n;

public class HighPriUploadRetryReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0Z0.A01(-2076586290);
        if (!AnonymousClass0XY.A01().A00(context, this, intent)) {
            i = -229168020;
        } else if (!"com.facebook.analytics2.logger.UPLOAD_NOW".equals(intent.getAction())) {
            i = -924418485;
        } else {
            new C031205n(this, intent, context, goAsync()).start();
            i = 1350813536;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
