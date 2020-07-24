package p000X;

import android.os.RemoteException;
import android.os.SystemClock;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1rC  reason: invalid class name and case insensitive filesystem */
public final class C41921rC implements Runnable {
    public final /* synthetic */ C39771nW A00;

    public C41921rC(C39771nW r1) {
        this.A00 = r1;
    }

    public final void run() {
        boolean z;
        while (!this.A00.A04.isEmpty()) {
            VideoPrefetchRequest videoPrefetchRequest = (VideoPrefetchRequest) this.A00.A04.poll();
            this.A00.A00.B3A(videoPrefetchRequest);
            if (videoPrefetchRequest != null) {
                if (C39771nW.A03(this.A00)) {
                    C39811na r7 = this.A00.A03;
                    String str = videoPrefetchRequest.A09.A0D;
                    synchronized (r7) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        z = true;
                        if (r7.A00.containsKey(str) && elapsedRealtime - ((Long) r7.A00.get(str)).longValue() <= 500) {
                            z = false;
                        }
                        if (z) {
                            r7.A00.put(str, Long.valueOf(elapsedRealtime));
                        }
                        if (r7.A00.size() > 200) {
                            Iterator it = r7.A00.entrySet().iterator();
                            while (it.hasNext()) {
                                if (elapsedRealtime - ((Long) ((Map.Entry) it.next()).getValue()).longValue() > 500) {
                                    it.remove();
                                }
                            }
                        }
                    }
                    if (!z) {
                        continue;
                    }
                }
                C40431oe.A01("PrefetchClient", "prefetch() %s", videoPrefetchRequest.A09);
                HeroPlayerServiceApi heroPlayerServiceApi = this.A00.A02.A00.A0K;
                if (heroPlayerServiceApi == null) {
                    C40431oe.A01("PrefetchClient", "Service is not connected", new Object[0]);
                    return;
                }
                try {
                    heroPlayerServiceApi.BXh(videoPrefetchRequest);
                } catch (RemoteException e) {
                    C40431oe.A04("PrefetchClient", e, "RemoteException when prefetch", new Object[0]);
                    return;
                }
            }
        }
    }
}
