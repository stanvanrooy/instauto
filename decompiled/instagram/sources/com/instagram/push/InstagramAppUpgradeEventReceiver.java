package com.instagram.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000X.AnonymousClass0Z0;
import p000X.C12600h4;
import p000X.C12620h6;
import p000X.C41941rE;

public class InstagramAppUpgradeEventReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(-760917670);
        C12600h4.A00().A05(C12620h6.APP_UPGRADED);
        C41941rE.A01();
        AnonymousClass0Z0.A0E(intent, -373187546, A01);
    }
}
