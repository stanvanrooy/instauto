package com.instagram.push.fbns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.rti.push.service.FbnsService;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0TR;
import p000X.AnonymousClass0UP;
import p000X.AnonymousClass0UR;
import p000X.AnonymousClass0VA;
import p000X.AnonymousClass0Z0;
import p000X.C05210Iq;
import p000X.C05680Ln;
import p000X.C06590Pq;
import p000X.C08340Wq;
import p000X.C12600h4;
import p000X.C12620h6;
import p000X.C14100jl;
import p000X.C41951rF;
import p000X.C42161rm;

public class FbnsInitBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        String A00;
        int A01 = AnonymousClass0Z0.A01(1034830735);
        C12600h4.A00().A05(C12620h6.FBNS);
        if (intent == null) {
            i = 1289756810;
        } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.USER_PRESENT".equals(intent.getAction()) || "com.facebook.rti.intent.ACTION_FBNS_STARTED".equals(intent.getAction()) || "com.facebook.rti.intent.ACTION_FBNS_STOPPED".equals(intent.getAction())) {
            Context context2 = context;
            if ("com.facebook.rti.intent.ACTION_FBNS_STARTED".equals(intent.getAction()) || "com.facebook.rti.intent.ACTION_FBNS_STOPPED".equals(intent.getAction())) {
                AnonymousClass0UR r0 = new AnonymousClass0UR(context);
                if (!AnonymousClass0TR.A01(r0.A00, AnonymousClass0UR.A00(intent))) {
                    i = -1844159087;
                }
            }
            if (((Boolean) C05680Ln.A0j.A00()).booleanValue() && (A00 = AnonymousClass0UP.A00(context)) != null) {
                C08340Wq.A01(context2, FbnsService.A01(A00), "FbnsSuspendSwitch", A00, "com.facebook.rti.intent.ACTION_FBNS_KILL_SWITCH_DISABLE_SERVICE", (AnonymousClass0VA) null);
            }
            if (C42161rm.A00(context)) {
                String str = null;
                boolean z = false;
                C06590Pq A012 = AnonymousClass0J1.A01(this);
                if (A012.AgN()) {
                    AnonymousClass0C1 A02 = C05210Iq.A02(A012);
                    str = A02.A04();
                    z = C14100jl.A02(A02);
                }
                C41951rF.A00().AdL(str, z);
            }
            i = 170465598;
        } else {
            i = 150658261;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
