package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.DJX */
public final class DJX extends BroadcastReceiver {
    public final /* synthetic */ DJT A00;

    public DJX(DJT djt) {
        this.A00 = djt;
    }

    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(601431133);
        if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
            DJT djt = this.A00;
            int i = djt.A00;
            djt.A00 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            DJT djt2 = this.A00;
            C29972DJj dJj = djt2.A02;
            if (dJj != null) {
                dJj.BL2(i, djt2.A00);
            }
        }
        AnonymousClass0Z0.A0E(intent, -2040288638, A01);
    }
}
