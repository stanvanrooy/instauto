package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Na  reason: invalid class name and case insensitive filesystem */
public final class C05930Na extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass0KT A00;

    public C05930Na(AnonymousClass0KT r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0Z0.A01(-110574428);
        if (isInitialStickyBroadcast()) {
            i = 3688640;
        } else {
            AnonymousClass0KT.A00(this.A00, context);
            i = 447866239;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
