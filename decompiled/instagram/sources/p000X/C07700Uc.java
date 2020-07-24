package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Uc  reason: invalid class name and case insensitive filesystem */
public final class C07700Uc extends BroadcastReceiver {
    public final /* synthetic */ C07710Ud A00;

    public C07700Uc(C07710Ud r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0Z0.A01(1202724665);
        if (!C07390Sx.A00(intent.getAction(), this.A00.A09)) {
            i = 1895660206;
        } else {
            intent.getAction();
            this.A00.A0D.run();
            i = 1290445616;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
