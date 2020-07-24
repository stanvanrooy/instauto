package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Uj  reason: invalid class name and case insensitive filesystem */
public final class C07770Uj extends BroadcastReceiver {
    public final /* synthetic */ C07890Uv A00;

    public C07770Uj(C07890Uv r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0Z0.A01(-1377825427);
        if (intent == null) {
            i = 1947763625;
        } else if (!C07390Sx.A00(intent.getAction(), "android.os.action.POWER_SAVE_MODE_CHANGED")) {
            i = 1008913196;
        } else {
            C07890Uv.A01(this.A00, intent);
            i = -642791542;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
