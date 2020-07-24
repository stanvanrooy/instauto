package com.instagram.launcherbadges;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.StoredPreferences;
import p000X.AnonymousClass0Z0;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C12670hC;
import p000X.C16180oA;
import p000X.C22000xg;
import p000X.C237211o;
import p000X.C57822ep;

public class LauncherBadgesReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        C237211o r0;
        int A01 = AnonymousClass0Z0.A01(2147240836);
        String action = intent.getAction();
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        if (A012.AgN()) {
            r0 = C237211o.A00(C05210Iq.A02(A012));
        } else {
            synchronized (C237211o.class) {
                if (C237211o.A05 == null) {
                    C237211o.A05 = new C237211o(StoredPreferences.A00, (AnonymousClass0C1) null);
                }
                r0 = C237211o.A05;
            }
        }
        if (!"com.smartisanos.launcher.ready".equals(action)) {
            if ("com.smartisanos.launcher.clear_message".equals(action)) {
                AnonymousClass0C1 r2 = r0.A02;
                if (r2 != null) {
                    C16180oA.A01(r2, 0);
                    C22000xg r3 = C22000xg.A00;
                    boolean z = false;
                    if (r3 != null) {
                        z = true;
                    }
                    if (z) {
                        r3.A04(r0.A02, new C57822ep(0, 0, "LauncherBadgesManager.forceClearBadgeCount", (List) null, (List) null));
                    }
                }
            }
            AnonymousClass0Z0.A0E(intent, -1640893276, A01);
        }
        C12670hC.A04(r0.A03);
        AnonymousClass0Z0.A0E(intent, -1640893276, A01);
    }
}
