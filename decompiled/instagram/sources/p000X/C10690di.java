package p000X;

import android.net.NetworkInfo;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.0di  reason: invalid class name and case insensitive filesystem */
public final class C10690di implements AnonymousClass0US {
    public final AnonymousClass0UC A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0.isConnected() == false) goto L_0x000f;
     */
    public final boolean BmU(Map map) {
        boolean z;
        NetworkInfo A01 = this.A00.A01();
        if (A01 != null) {
            z = true;
        }
        z = false;
        if (!z) {
            NetworkInfo A012 = this.A00.A01();
            if (map != null) {
                if (A012 == null) {
                    map.put("MqttNetworkManagerMonitor", "no_info");
                } else {
                    map.put("MqttNetworkManagerMonitor", String.format((Locale) null, "%s_%s_%s", new Object[]{Integer.valueOf(A012.getType()), Integer.valueOf(A012.getSubtype()), A012.getState()}));
                    return z;
                }
            }
        }
        return z;
    }

    public C10690di(AnonymousClass0UC r1) {
        this.A00 = r1;
    }
}
