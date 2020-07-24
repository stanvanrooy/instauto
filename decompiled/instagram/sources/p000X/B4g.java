package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.B4g */
public final class B4g extends BroadcastReceiver {
    public B4e A00;

    public B4g(B4e b4e) {
        this.A00 = b4e;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0Z0.A01(-371979625);
        B4e b4e = this.A00;
        if (b4e == null) {
            i = -1738311345;
        } else if (!b4e.A01()) {
            i = -261596341;
        } else {
            FirebaseInstanceId.A03();
            FirebaseInstanceId.A05(this.A00, 0);
            this.A00.A00().unregisterReceiver(this);
            this.A00 = null;
            i = 70718532;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
