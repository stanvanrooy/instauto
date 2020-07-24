package com.instagram.notifications.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.C12600h4;
import p000X.C12620h6;
import p000X.C16670oy;

public class ClearNotificationReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(-8440095);
        C12600h4.A00().A05(C12620h6.NOTIFICATION_CLEARED);
        C16670oy.A01().A06(context, AnonymousClass0J1.A01(this), intent);
        AnonymousClass0Z0.A0E(intent, -1844261422, A01);
    }
}
