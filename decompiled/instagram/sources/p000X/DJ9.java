package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.DJ9 */
public final class DJ9 extends BroadcastReceiver {
    public final /* synthetic */ DJ7 A00;

    public DJ9(DJ7 dj7) {
        this.A00 = dj7;
    }

    public final void onReceive(Context context, Intent intent) {
        C25134B2l b2l;
        int A01 = AnonymousClass0Z0.A01(-926784361);
        if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
            boolean z = false;
            if (intent.getIntExtra("state", 0) > 0) {
                z = true;
            }
            DJ8 dj8 = this.A00.A01;
            dj8.A04 = z;
            if (z) {
                dj8.A05 = dj8.A06;
                b2l = C25134B2l.EARPIECE;
            } else {
                boolean z2 = false;
                if (dj8.A09.A02.AeQ()) {
                    z2 = true;
                }
                if (z2) {
                    b2l = C25134B2l.BLUETOOTH;
                } else if (dj8.A05 || dj8.A03) {
                    b2l = C25134B2l.SPEAKERPHONE;
                } else {
                    b2l = C25134B2l.EARPIECE;
                }
            }
            dj8.A02(b2l);
            C25134B2l A002 = dj8.A0A.A00();
            if (A002 == C25134B2l.EARPIECE && dj8.A04) {
                A002 = C25134B2l.HEADSET;
            }
            dj8.A02.Bg4(A002);
        }
        AnonymousClass0Z0.A0E(intent, 740802521, A01);
    }
}
