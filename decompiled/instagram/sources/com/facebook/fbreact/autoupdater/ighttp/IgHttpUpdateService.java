package com.facebook.fbreact.autoupdater.ighttp;

import android.app.IntentService;
import android.content.Intent;
import p000X.AnonymousClass0J1;
import p000X.C61392li;

public class IgHttpUpdateService extends IntentService {
    public IgHttpUpdateService() {
        super("IgHttpUpdateService");
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            C61392li.A00(AnonymousClass0J1.A06(intent.getExtras()), this);
        }
    }
}
