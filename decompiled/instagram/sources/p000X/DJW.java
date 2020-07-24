package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.DJW */
public final class DJW extends BroadcastReceiver {
    public final /* synthetic */ DJT A00;

    public DJW(DJT djt) {
        this.A00 = djt;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0Z0.A01(1484206429);
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            if (intExtra == intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0)) {
                i = -1090795657;
                AnonymousClass0Z0.A0E(intent, i, A01);
            }
            C29972DJj dJj = this.A00.A02;
            if (dJj != null) {
                dJj.Ay7(intExtra);
            }
        }
        i = 1481848769;
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
