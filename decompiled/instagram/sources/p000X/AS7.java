package p000X;

import android.os.Handler;

/* renamed from: X.AS7 */
public final class AS7 implements Runnable {
    public final /* synthetic */ AS6 A00;

    public AS7(AS6 as6) {
        this.A00 = as6;
    }

    public final void run() {
        long j;
        ARK ark = (ARK) this.A00.A04.get();
        if (ark != null && !this.A00.A00) {
            ark.BtB();
            if (this.A00.A01 > ark.AYh()) {
                this.A00.A03.BOw();
            }
        }
        AS6 as6 = this.A00;
        Handler handler = as6.A02;
        ARK ark2 = (ARK) as6.A04.get();
        if (ark2 == null || ark2.AYh() < as6.A01) {
            j = 1000;
        } else {
            j = 10000;
        }
        AnonymousClass0ZA.A09(handler, this, j, 113225506);
    }
}
