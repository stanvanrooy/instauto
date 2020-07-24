package p000X;

import android.content.Context;
import android.content.Intent;
import com.facebook.cameracore.mediapipeline.asyncscripting.AsyncScriptingClient;
import com.facebook.cameracore.mediapipeline.asyncscripting.AsyncScriptingService;

/* renamed from: X.AXO */
public final class AXO implements Runnable {
    public final /* synthetic */ AsyncScriptingClient A00;

    public AXO(AsyncScriptingClient asyncScriptingClient) {
        this.A00 = asyncScriptingClient;
    }

    public final void run() {
        synchronized (this.A00.mConnections) {
            boolean z = false;
            if (!this.A00.mConnections.isEmpty()) {
                z = true;
            }
            AsyncScriptingClient asyncScriptingClient = this.A00;
            if (z != asyncScriptingClient.mRunning) {
                if (z) {
                    Context context = asyncScriptingClient.mContext;
                    AnonymousClass0ZI.A02(context, new Intent(context, AsyncScriptingService.class), this.A00.mServiceConnection, 1, 465794388);
                } else {
                    AnonymousClass0ZI.A01(asyncScriptingClient.mContext, asyncScriptingClient.mServiceConnection, -2053558895);
                }
                this.A00.mRunning = z;
            }
        }
    }
}
