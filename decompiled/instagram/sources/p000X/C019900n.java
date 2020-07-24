package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Process;

/* renamed from: X.00n  reason: invalid class name and case insensitive filesystem */
public final class C019900n extends C036407u {
    public static final int A05 = Process.myUid();
    public int A00;
    public BroadcastReceiver A01 = new C036507v(this);
    public boolean A02 = true;
    public final ConnectivityManager A03;
    public final long[] A04 = new long[8];

    public final boolean A02() {
        return false;
    }

    public final synchronized boolean A03(long[] jArr) {
        if (!this.A02) {
            return false;
        }
        A04();
        System.arraycopy(this.A04, 0, jArr, 0, jArr.length);
        return true;
    }

    public final synchronized void A04() {
        int i = A05;
        long uidTxBytes = TrafficStats.getUidTxBytes(i);
        long uidRxBytes = TrafficStats.getUidRxBytes(i);
        if (uidRxBytes == -1 || uidTxBytes == -1) {
            this.A02 = false;
        } else {
            char c = 2;
            if (this.A00 == 1) {
                c = 0;
            }
            long[] jArr = this.A04;
            long j = jArr[3] + jArr[1];
            long j2 = jArr[2] + jArr[0];
            char c2 = c | 1;
            jArr[c2] = jArr[c2] + (uidTxBytes - j);
            char c3 = c | 0;
            jArr[c3] = jArr[c3] + (uidRxBytes - j2);
        }
    }

    public C019900n(Context context) {
        int type;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.A03 = connectivityManager;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        this.A00 = type;
        context.registerReceiver(this.A01, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        A04();
    }
}
