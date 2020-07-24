package com.instagram.watchandmore.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import p000X.C149346aB;

public class WatchAndMoreMessenger extends Service {
    public final Messenger A00 = new Messenger(new C149346aB());

    public final IBinder onBind(Intent intent) {
        return this.A00.getBinder();
    }
}
