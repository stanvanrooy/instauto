package p000X;

import android.telephony.SubscriptionManager;

/* renamed from: X.BRV */
public final class BRV implements Runnable {
    public final /* synthetic */ AnonymousClass2ZZ A00;

    public BRV(AnonymousClass2ZZ r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass2ZZ r1 = this.A00;
        r1.A01 = SubscriptionManager.from(r1.A08);
        AnonymousClass2ZZ r12 = this.A00;
        if (r12.A01 != null) {
            r12.A00 = new BRW(this);
            AnonymousClass2ZZ r0 = this.A00;
            r0.A01.addOnSubscriptionsChangedListener(r0.A00);
            this.A00.A0C = true;
        }
    }
}
