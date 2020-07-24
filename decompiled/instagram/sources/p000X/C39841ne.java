package p000X;

import android.net.NetworkInfo;
import android.os.RemoteException;
import com.facebook.video.heroplayer.ipc.DynamicPlayerSettings;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;

/* renamed from: X.1ne  reason: invalid class name and case insensitive filesystem */
public final class C39841ne implements C39851nf {
    public final void BMV(boolean z) {
        C39701nL.A03(new DynamicPlayerSettings(3, true));
        try {
            C39731nP r2 = C39731nP.A0W;
            String str = C40121o7.A00().A05;
            HeroPlayerServiceApi heroPlayerServiceApi = r2.A0K;
            if (heroPlayerServiceApi != null) {
                heroPlayerServiceApi.Bju(str);
            }
        } catch (RemoteException unused) {
        }
        NetworkInfo A00 = AnonymousClass0NT.A00();
        if (A00 != null) {
            C39731nP.A0W.A08(A00.getTypeName());
        }
    }

    public final void BMW() {
    }
}
