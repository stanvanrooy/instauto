package p000X;

import android.telephony.SubscriptionManager;

/* renamed from: X.BRW */
public final class BRW extends SubscriptionManager.OnSubscriptionsChangedListener {
    public final /* synthetic */ BRV A00;

    public BRW(BRV brv) {
        this.A00 = brv;
    }

    public final void onSubscriptionsChanged() {
        this.A00.A00.A0D = true;
    }
}
