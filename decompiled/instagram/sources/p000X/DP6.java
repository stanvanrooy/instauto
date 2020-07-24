package p000X;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.DP6 */
public final class DP6 implements C30085DPp {
    public final /* synthetic */ C30055DOk A00;

    public DP6(C30055DOk dOk) {
        this.A00 = dOk;
    }

    public final void Auo(C30073DPd dPd) {
        int i = dPd.A01;
        if (i == 21001 || i == 21003) {
            AnonymousClass0QD.A09("MP: Failed in recording video", dPd);
        } else {
            AnonymousClass0QD.A0A("MP: Failed in recording video", dPd);
        }
        this.A00.A0I = dPd;
        C30055DOk dOk = this.A00;
        dOk.A03 = null;
        CountDownLatch countDownLatch = dOk.A04;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void Aup() {
        C30055DOk dOk = this.A00;
        dOk.A03 = null;
        CountDownLatch countDownLatch = dOk.A04;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void Aur(long j) {
        this.A00.A02.A00(j);
    }

    public final long now() {
        C194458Ud r0 = this.A00.A01;
        if (r0 != null) {
            return r0.now();
        }
        return SystemClock.elapsedRealtime();
    }
}
