package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.BV5 */
public final class BV5 extends BroadcastReceiver {
    public final /* synthetic */ BV4 A00;

    public BV5(BV4 bv4) {
        this.A00 = bv4;
    }

    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(-2065127473);
        if (intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE")) {
            BV4 bv4 = this.A00;
            int i = bv4.A00;
            int A002 = bv4.A00();
            bv4.A00 = A002;
            if (A002 != i) {
                bv4.A03.networkStateChanged(A002, i);
            }
        }
        AnonymousClass0Z0.A0E(intent, 1556775426, A01);
    }
}
