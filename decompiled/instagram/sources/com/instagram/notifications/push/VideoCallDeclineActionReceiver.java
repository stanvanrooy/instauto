package com.instagram.notifications.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C16590oq;
import p000X.C16670oy;

public class VideoCallDeclineActionReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(-1421327487);
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        if (A012.AgN()) {
            AnonymousClass0C1 A02 = C05210Iq.A02(A012);
            String stringExtra = intent.getStringExtra("vc_id");
            if (A02.A06.getId().equals(intent.getStringExtra("recipient_id"))) {
                C16590oq.A00.A06(A02, context, stringExtra);
            }
        }
        C16670oy.A01().A06(context, A012, intent);
        AnonymousClass0Z0.A0E(intent, 139524684, A01);
    }
}
