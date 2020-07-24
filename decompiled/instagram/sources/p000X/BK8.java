package p000X;

import android.content.ServiceConnection;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;

/* renamed from: X.BK8 */
public abstract class BK8 {
    public static BK8 A00;
    public static final Object A01 = new Object();

    public void A00(BJP bjp, ServiceConnection serviceConnection, String str) {
        IllegalStateException illegalStateException;
        BJC bjc = (BJC) this;
        AnonymousClass0a2.A03(serviceConnection, "ServiceConnection must not be null");
        synchronized (bjc.A03) {
            BJD bjd = (BJD) bjc.A03.get(bjp);
            if (bjd == null) {
                String valueOf = String.valueOf(bjp);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                illegalStateException = new IllegalStateException(sb.toString());
            } else if (bjd.A05.contains(serviceConnection)) {
                bjd.A05.remove(serviceConnection);
                if (bjd.A05.isEmpty()) {
                    AnonymousClass0ZA.A06(bjc.A01, bjc.A01.obtainMessage(0, bjp), ArLinkScanControllerImpl.ERROR_DELAY_MS);
                }
            } else {
                String valueOf2 = String.valueOf(bjp);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                illegalStateException = new IllegalStateException(sb2.toString());
            }
            throw illegalStateException;
        }
    }

    public boolean A01(BJP bjp, ServiceConnection serviceConnection, String str) {
        boolean z;
        BJC bjc = (BJC) this;
        AnonymousClass0a2.A03(serviceConnection, "ServiceConnection must not be null");
        synchronized (bjc.A03) {
            BJD bjd = (BJD) bjc.A03.get(bjp);
            if (bjd == null) {
                bjd = new BJD(bjc, bjp);
                bjd.A01(serviceConnection);
                bjd.A00();
                bjc.A03.put(bjp, bjd);
            } else {
                AnonymousClass0ZA.A04(bjc.A01, 0, bjp);
                if (!bjd.A05.contains(serviceConnection)) {
                    bjd.A01(serviceConnection);
                    int i = bjd.A00;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(bjd.A01, bjd.A02);
                    } else if (i == 2) {
                        bjd.A00();
                    }
                } else {
                    String valueOf = String.valueOf(bjp);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = bjd.A03;
        }
        return z;
    }
}
