package p000X;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AWE */
public final class AWE {
    public int A00 = 1;
    public int A01 = 1;
    public AWI A02;
    public volatile Surface A03;
    public volatile boolean A04;
    public volatile Handler A05;
    public volatile C78783cJ A06 = null;

    public AWE(Surface surface) {
        this.A03 = surface;
    }

    public final void A00() {
        if (!this.A04) {
            this.A04 = true;
            Handler handler = this.A05;
            if (handler != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                if (AnonymousClass0ZA.A0F(handler, new AWG(this, countDownLatch), -765094883)) {
                    try {
                        countDownLatch.await(2, TimeUnit.SECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public final void A01(Looper looper) {
        if (looper == null) {
            this.A05 = null;
        } else if (this.A05 == null || this.A05.getLooper() != looper) {
            this.A05 = new Handler(looper);
        }
    }
}
