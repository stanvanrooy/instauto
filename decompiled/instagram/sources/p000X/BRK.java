package p000X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.Locale;

/* renamed from: X.BRK */
public final class BRK {
    public final ConnectivityManager A00 = ((ConnectivityManager) this.A04.getSystemService("connectivity"));
    public final TelephonyManager A01 = ((TelephonyManager) this.A04.getSystemService("phone"));
    public final BRJ A02;
    public final Locale A03 = Locale.getDefault();
    public final Context A04;

    public BRK(Context context) {
        this.A04 = context;
        this.A02 = new BRJ(context);
    }
}
