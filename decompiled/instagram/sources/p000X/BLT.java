package p000X;

import android.os.RemoteException;
import com.facebook.video.heroplayer.ipc.DynamicPlayerSettings;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;

/* renamed from: X.BLT */
public final class BLT implements Runnable {
    public final /* synthetic */ C39731nP A00;
    public final /* synthetic */ DynamicPlayerSettings A01;

    public BLT(C39731nP r1, DynamicPlayerSettings dynamicPlayerSettings) {
        this.A00 = r1;
        this.A01 = dynamicPlayerSettings;
    }

    public final void run() {
        try {
            C39731nP r0 = this.A00;
            DynamicPlayerSettings dynamicPlayerSettings = this.A01;
            HeroPlayerServiceApi heroPlayerServiceApi = r0.A0K;
            if (heroPlayerServiceApi != null) {
                heroPlayerServiceApi.BhC(dynamicPlayerSettings);
            }
        } catch (RemoteException unused) {
        }
    }
}
