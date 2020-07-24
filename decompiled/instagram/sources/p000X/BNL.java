package p000X;

import android.os.SystemClock;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: X.BNL */
public final class BNL implements C25584BQq {
    public final /* synthetic */ BNM A00;

    public BNL(BNM bnm) {
        this.A00 = bnm;
    }

    public final C25521BOf ADg() {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        HashMap hashMap = new HashMap();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            hashMap.put(nextElement.getDisplayName(), new BMC(nextElement.getInetAddresses()));
        }
        return new C25500BNk(SystemClock.elapsedRealtime(), this.A00.A01(), hashMap, Constants.A0N);
    }
}
