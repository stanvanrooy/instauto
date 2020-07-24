package p000X;

import android.app.ActivityManager;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.BRG */
public final class BRG {
    public final ActivityManager A00 = ((ActivityManager) this.A01.getSystemService("activity"));
    public final Context A01;
    public final TelephonyManager A02;
    public final BRJ A03 = new BRJ(this.A01);

    public static String A00(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED : "READY" : "NETWORK_LOCKED" : "PUK_REQUIRED" : "PIN_REQUIRED" : "ABSENT";
    }

    public BRG(Context context) {
        this.A01 = context;
        this.A02 = (TelephonyManager) context.getSystemService("phone");
    }
}
