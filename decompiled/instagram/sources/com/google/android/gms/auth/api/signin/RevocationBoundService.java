package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zzw;

public final class RevocationBoundService extends Service {
    public final IBinder onBind(Intent intent) {
        String str;
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            if (Log.isLoggable("RevocationService", 2) && String.valueOf(intent.getAction()).length() == 0) {
                new String("RevocationBoundService handling ");
            }
            return new zzw(this);
        }
        String valueOf = String.valueOf(intent.getAction());
        if (valueOf.length() != 0) {
            str = "Unknown action sent to RevocationBoundService: ".concat(valueOf);
        } else {
            str = new String("Unknown action sent to RevocationBoundService: ");
        }
        Log.w("RevocationService", str);
        return null;
    }
}
