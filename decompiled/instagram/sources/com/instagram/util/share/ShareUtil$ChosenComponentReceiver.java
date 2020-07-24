package com.instagram.util.share;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.C144176Ep;

public class ShareUtil$ChosenComponentReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(1572473312);
        String stringExtra = intent.getStringExtra("log_event_name");
        if (stringExtra != null) {
            AnonymousClass0P4 A00 = AnonymousClass0P4.A00(stringExtra, new C144176Ep(this, intent.getStringExtra("log_event_module_name")));
            Serializable serializableExtra = intent.getSerializableExtra("log_event_extras");
            if (serializableExtra instanceof HashMap) {
                A00.A0K((HashMap) serializableExtra);
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            if (parcelableExtra instanceof ComponentName) {
                ComponentName componentName = (ComponentName) parcelableExtra;
                A00.A0G("selection_package", componentName.getPackageName());
                A00.A0G("selection_class", componentName.getClassName());
                A00.A0G("selection_short_class", componentName.getShortClassName());
            }
            AnonymousClass0WN.A01(AnonymousClass0J1.A06(intent.getExtras())).BcG(A00);
        }
        AnonymousClass0Z0.A0E(intent, 2061294867, A01);
    }
}
