package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Uk  reason: invalid class name and case insensitive filesystem */
public final class C07780Uk extends BroadcastReceiver {
    public final /* synthetic */ C07890Uv A00;

    public C07780Uk(C07890Uv r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0Z0.A01(486491527);
        if (intent == null) {
            i = 1585398037;
        } else {
            intent.getAction();
            C07890Uv.A01(this.A00, intent);
            i = -1292855840;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
