package p000X;

import android.content.Context;
import java.util.concurrent.Executors;

/* renamed from: X.AZN */
public final class AZN {
    public AZK A00 = null;

    public final synchronized void A00(Context context, String str, AZi aZi, AWZ awz) {
        synchronized (this) {
            C12670hC.A02();
            AZK azk = this.A00;
            Context context2 = context;
            String str2 = str;
            AWZ awz2 = awz;
            AZi aZi2 = aZi;
            if (azk == null) {
                this.A00 = new AZK(Executors.newSingleThreadExecutor(), str2, aZi2, context2, new AZR(this, awz2));
            } else {
                AnonymousClass0QD.A01("WebRtcConnectionFactory", C06360Ot.formatString("WebRtcConnection was not released in time: %s", azk.A0L));
                AZK azk2 = this.A00;
                AZK.A05(azk2, new AZ2(azk2), new AZS(azk2, new AZO(this, context2, str2, aZi2, awz2, azk2)));
            }
        }
    }
}
