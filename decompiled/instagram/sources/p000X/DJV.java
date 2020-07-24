package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.DJV */
public final class DJV extends BroadcastReceiver {
    public final /* synthetic */ DJU A00;

    public DJV(DJU dju) {
        this.A00 = dju;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r4.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r4.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") == false) goto L_0x0023;
     */
    public final void onReceive(Context context, Intent intent) {
        char c;
        int A01 = AnonymousClass0Z0.A01(-837881253);
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1435586571) {
            c = 1;
        } else if (hashCode == 545516589) {
            c = 0;
        }
        c = 65535;
        if (c == 0) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            C29972DJj dJj = this.A00.A02;
            if (dJj != null) {
                dJj.Ay7(intExtra);
            }
        } else if (c == 1) {
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
            if (intExtra2 == 12) {
                this.A00.A06.setBluetoothScoOn(true);
            }
            C29972DJj dJj2 = this.A00.A02;
            if (dJj2 != null) {
                dJj2.Ase(intExtra2);
            }
        }
        AnonymousClass0Z0.A0E(intent, -680750249, A01);
    }
}
