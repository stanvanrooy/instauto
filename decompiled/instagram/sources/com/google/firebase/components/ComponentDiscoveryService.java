package com.google.firebase.components;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ComponentDiscoveryService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }
}
