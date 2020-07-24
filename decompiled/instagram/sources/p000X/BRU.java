package p000X;

import android.os.AsyncTask;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.List;

/* renamed from: X.BRU */
public final class BRU implements Runnable {
    public final /* synthetic */ AnonymousClass2ZZ A00;

    public BRU(AnonymousClass2ZZ r1) {
        this.A00 = r1;
    }

    public final void run() {
        SubscriptionManager from;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        if (!AnonymousClass0Q7.A03().A0H() && ((String) AnonymousClass0NT.A02(this.A00.A08).first).equals("mobile") && C16230oG.isLocationEnabled(this.A00.A08) && C16230oG.isLocationPermitted(this.A00.A08) && C35251g3.A07(this.A00.A08, "android.permission.READ_PHONE_STATE")) {
            AnonymousClass2ZZ r1 = this.A00;
            if (r1.A09 != null && (from = SubscriptionManager.from(r1.A08)) != null && (activeSubscriptionInfoList = from.getActiveSubscriptionInfoList()) != null) {
                for (SubscriptionInfo subscriptionId : activeSubscriptionInfoList) {
                    this.A00.A09.A03(subscriptionId.getSubscriptionId()).A05(AsyncTask.SERIAL_EXECUTOR, new BRX());
                }
            }
        }
    }
}
