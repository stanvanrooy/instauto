package com.instagram.registrationpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass6KY;
import p000X.C06590Pq;
import p000X.C13910jS;

public class RegistrationPushActionReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(1560946096);
        AnonymousClass6KY A00 = AnonymousClass6KY.A00(context);
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        if ("com.instagram.registrationpush.ACTION_TAPPED".equals(intent.getAction())) {
            C13910jS.PushTapped.A01(A012).A07();
            Intent intent2 = new Intent();
            intent2.setClassName(A00.A02, "com.instagram.mainactivity.MainActivity");
            intent2.setAction("android.intent.action.MAIN");
            intent2.addCategory(AnonymousClass0C5.$const$string(184));
            intent2.addFlags(268435456);
            AnonymousClass1BH.A03(intent2, A00.A02);
        } else if ("com.instagram.registrationpush.ACTION_DELETED".equals(intent.getAction())) {
            C13910jS.PushDismissed.A01(A012).A07();
        }
        AnonymousClass0Z0.A0E(intent, 277673059, A01);
    }
}
