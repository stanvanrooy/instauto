package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* renamed from: X.07v  reason: invalid class name and case insensitive filesystem */
public final class C036507v extends BroadcastReceiver {
    public final /* synthetic */ C019900n A00;

    public C036507v(C019900n r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0Z0.A01(2089830399);
        NetworkInfo activeNetworkInfo = this.A00.A03.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            C019900n r1 = this.A00;
            if (type != r1.A00) {
                r1.A04();
                this.A00.A00 = type;
                i = -2117935304;
                AnonymousClass0Z0.A0E(intent, i, A01);
            }
        }
        i = 781017938;
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
