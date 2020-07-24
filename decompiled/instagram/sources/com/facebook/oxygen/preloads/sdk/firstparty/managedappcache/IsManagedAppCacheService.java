package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import android.app.IntentService;
import android.content.Intent;
import p000X.C111144qS;

public class IsManagedAppCacheService extends IntentService {
    public IsManagedAppCacheService() {
        super("IsManagedAppCacheService");
    }

    public final void onHandleIntent(Intent intent) {
        C111144qS.A00(intent, this);
    }
}
