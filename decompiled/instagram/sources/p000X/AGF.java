package p000X;

import android.os.SystemClock;
import com.facebook.react.modules.core.JSTimers;

/* renamed from: X.AGF */
public final class AGF implements Runnable {
    public final long A00;
    public volatile boolean A01 = false;
    public final /* synthetic */ AGC A02;

    public AGF(AGC agc, long j) {
        this.A02 = agc;
        this.A00 = j;
    }

    public final void run() {
        boolean z;
        if (!this.A01) {
            long uptimeMillis = SystemClock.uptimeMillis() - (this.A00 / 1000000);
            long currentTimeMillis = System.currentTimeMillis() - uptimeMillis;
            if (16.666666f - ((float) uptimeMillis) >= 1.0f) {
                synchronized (this.A02.A0B) {
                    z = this.A02.A03;
                }
                if (z) {
                    double d = (double) currentTimeMillis;
                    A44 reactApplicationContextIfActiveOrWarn = this.A02.A0A.A00.getReactApplicationContextIfActiveOrWarn();
                    if (reactApplicationContextIfActiveOrWarn != null) {
                        ((JSTimers) reactApplicationContextIfActiveOrWarn.A01(JSTimers.class)).callIdleCallbacks(d);
                    }
                }
                this.A02.A00 = null;
            }
        }
    }
}
