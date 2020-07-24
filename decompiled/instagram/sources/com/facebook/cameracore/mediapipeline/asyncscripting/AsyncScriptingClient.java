package com.facebook.cameracore.mediapipeline.asyncscripting;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import p000X.AXO;
import p000X.AnonymousClass0ZA;
import p000X.C64312rH;
import p000X.C64322rI;

public class AsyncScriptingClient {
    public final Set mConnections = new HashSet();
    public final Context mContext;
    public final C64312rH mDestroyCallback = new C64312rH(this);
    public final Handler mMainThreadHandler;
    public IAsyncScriptingService mRemoteService;
    public boolean mRunning = false;
    public final ServiceConnection mServiceConnection = new C64322rI(this);

    public RemoteHostConnection createConnection() {
        RemoteHostConnection remoteHostConnection;
        synchronized (this.mConnections) {
            remoteHostConnection = new RemoteHostConnection(this.mDestroyCallback);
            this.mConnections.add(remoteHostConnection);
            IAsyncScriptingService iAsyncScriptingService = this.mRemoteService;
            if (iAsyncScriptingService != null) {
                remoteHostConnection.onServiceConnected(iAsyncScriptingService);
            }
            if (!this.mRunning) {
                AnonymousClass0ZA.A0E(this.mMainThreadHandler, new AXO(this), 54250609);
            }
        }
        return remoteHostConnection;
    }

    public AsyncScriptingClient(Context context) {
        this.mContext = context;
        this.mMainThreadHandler = new Handler(context.getMainLooper());
    }
}
