package p000X;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.B4P */
public final class B4P {
    public static final long A01 = TimeUnit.DAYS.toMillis(1);
    public static volatile B4P A02;
    public B4R A00;

    public static B4P A00() {
        if (A02 == null) {
            synchronized (B4P.class) {
                if (A02 == null) {
                    A02 = new B4P();
                }
            }
        }
        return A02;
    }

    public static void A01(B4P b4p) {
        if (b4p.A00 != null) {
            SharedPreferences.Editor putInt = C05750Lu.A00("RNWhiteListedRouteStore_Prefs").edit().putLong("RNWhiteListedRouteStore_TS", b4p.A00.A01).putInt("RNWhiteListedRouteStore_RC", b4p.A00.A00);
            B4R b4r = b4p.A00;
            if (b4r.A02 == null) {
                b4r.A02 = new HashSet();
            }
            putInt.putStringSet("RNWhiteListedRouteStore_RL", Collections.unmodifiableSet(b4r.A02)).apply();
        }
    }
}
