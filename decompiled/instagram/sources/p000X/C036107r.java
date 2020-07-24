package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* renamed from: X.07r  reason: invalid class name and case insensitive filesystem */
public final class C036107r extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass01I A00;

    public C036107r(AnonymousClass01I r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(621189799);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.A00) {
            try {
                String action = intent.getAction();
                char c = 65535;
                int hashCode = action.hashCode();
                if (hashCode != -1886648615) {
                    if (hashCode == 1019184907 && action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        c = 0;
                    }
                } else if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c = 1;
                }
                if (c == 0) {
                    AnonymousClass01I r9 = this.A00;
                    if (!r9.A03) {
                        r9.A00 += elapsedRealtime - r9.A02;
                    } else {
                        r9.A01 += elapsedRealtime - r9.A02;
                        r9.A05("CONNECTED", elapsedRealtime);
                    }
                    this.A00.A03 = true;
                } else if (c == 1) {
                    AnonymousClass01I r8 = this.A00;
                    if (r8.A03) {
                        r8.A01 += elapsedRealtime - r8.A02;
                    } else {
                        r8.A00 += elapsedRealtime - r8.A02;
                        r8.A05("DISCONNECTED", elapsedRealtime);
                    }
                    this.A00.A03 = false;
                }
                this.A00.A02 = elapsedRealtime;
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0E(intent, -1037311408, A01);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0E(intent, -1142889552, A01);
    }
}
