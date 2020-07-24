package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.AY1 */
public final class AY1 extends BroadcastReceiver {
    public final /* synthetic */ AY0 A00;

    public AY1(AY0 ay0) {
        this.A00 = ay0;
    }

    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(-1267377402);
        boolean z = false;
        int intExtra = intent.getIntExtra("state", 0);
        intent.getIntExtra("microphone", 0);
        intent.getStringExtra("name");
        intent.getAction();
        isInitialStickyBroadcast();
        AY0 ay0 = this.A00;
        if (intExtra == 1) {
            z = true;
        }
        ay0.A06 = z;
        AY0.A02(ay0);
        AnonymousClass0Z0.A0E(intent, 1419641067, A01);
    }
}
