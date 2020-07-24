package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.common.networkreachability.AndroidReachabilityListener;

/* renamed from: X.BV4 */
public final class BV4 {
    public static BV4 A05;
    public int A00;
    public Context A01;
    public ConnectivityManager A02;
    public final AndroidReachabilityListener A03;
    public final BroadcastReceiver A04 = new BV5(this);

    public final int A00() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = this.A02;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    public final void A01() {
        this.A01.registerReceiver(this.A04, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        int i = this.A00;
        int A002 = A00();
        this.A00 = A002;
        if (A002 != i) {
            this.A03.networkStateChanged(A002, i);
        }
    }

    public final void A02() {
        this.A01.unregisterReceiver(this.A04);
    }

    public BV4(Context context) {
        this.A01 = context;
        this.A02 = (ConnectivityManager) context.getSystemService("connectivity");
        this.A00 = A00();
        this.A03 = new AndroidReachabilityListener(this);
    }
}
