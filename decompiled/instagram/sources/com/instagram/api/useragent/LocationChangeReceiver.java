package com.instagram.api.useragent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000X.AnonymousClass0Z0;
import p000X.C14220jx;
import p000X.C14300kE;

public class LocationChangeReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(-529250968);
        C14300kE.A00 = null;
        synchronized (C14220jx.class) {
            C14220jx.A01 = null;
        }
        AnonymousClass0Z0.A0E(intent, 2008594354, A01);
    }
}
