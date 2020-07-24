package p000X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.AS6 */
public final class AS6 {
    public boolean A00;
    public final long A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final AS8 A03;
    public final AnonymousClass0IT A04;
    public final Runnable A05 = new AS7(this);

    public final void A00() {
        AnonymousClass0ZA.A08(this.A02, this.A05);
    }

    public final void A01() {
        long j;
        AnonymousClass0ZA.A08(this.A02, this.A05);
        Handler handler = this.A02;
        Runnable runnable = this.A05;
        ARK ark = (ARK) this.A04.get();
        if (ark == null || ark.AYh() < this.A01) {
            j = 1000;
        } else {
            j = 10000;
        }
        AnonymousClass0ZA.A09(handler, runnable, j, 686466997);
    }

    public AS6(long j, AnonymousClass0IT r5, AS8 as8) {
        this.A01 = j;
        this.A04 = r5;
        this.A03 = as8;
    }
}
