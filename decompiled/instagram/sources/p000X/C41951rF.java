package p000X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.1rF  reason: invalid class name and case insensitive filesystem */
public final class C41951rF {
    public static C41981rI A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(12:5|6|7|8|9|10|(1:12)|13|(1:15)|(2:17|19)(1:18)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c  */
    public static synchronized C41981rI A00() {
        C41981rI r0;
        C42131rj r3;
        synchronized (C41951rF.class) {
            if (A00 == null) {
                Context context = StoredPreferences.A00;
                Class.forName("com.amazon.device.messaging.ADM");
                C41981rI r5 = new B5K(context);
                if (((Boolean) C05680Ln.A0h.A00()).booleanValue()) {
                    C08290Wl r52 = new C08290Wl(context);
                    Bundle bundle = new Bundle();
                    C08400Ww.BLOCKED_COUNTRIES_HOSTNAME.A02(bundle, (String) C05680Ln.A0f.A00());
                    C08400Ww.BLOCKED_COUNTRIES_HN_TIMESTAMP.A02(bundle, 0L);
                    FbnsAIDLRequest fbnsAIDLRequest = new FbnsAIDLRequest(bundle, C08310Wn.SET_PREF_BASED_CONFIG.A00);
                    Bundle bundle2 = new Bundle();
                    C08400Ww.BLOCKED_COUNTRIES_ANALYTICS_ENDPOINT.A02(bundle2, (Object) null);
                    r52.A01(fbnsAIDLRequest, new FbnsAIDLRequest(bundle2, C08310Wn.SET_PREF_BASED_CONFIG.A00));
                }
                boolean z = false;
                if (GoogleApiAvailability.A00.isGooglePlayServicesAvailable(context) == 0) {
                    z = true;
                }
                if (!z) {
                    C254018q.A00();
                    C253818o r2 = C254018q.A02;
                    C92803zk r1 = C254018q.A04;
                    C254018q.A00();
                    r3 = new C42131rj(context, r2, r1, C254018q.A03);
                } else {
                    r3 = null;
                }
                r5 = new C41971rH(context, r3);
                A00 = r5;
            }
            r0 = A00;
        }
        return r0;
    }
}
