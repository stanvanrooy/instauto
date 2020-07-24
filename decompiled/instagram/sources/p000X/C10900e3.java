package p000X;

import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* renamed from: X.0e3  reason: invalid class name and case insensitive filesystem */
public final class C10900e3 implements AnonymousClass0TS {
    public double A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final RealtimeSinceBootClock A04;

    public final synchronized boolean A8L() {
        boolean z;
        RealtimeSinceBootClock realtimeSinceBootClock = this.A04;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A01 = elapsedRealtime;
        double d = this.A00;
        double d2 = (double) (elapsedRealtime - this.A01);
        double d3 = (double) this.A02;
        double d4 = (double) this.A03;
        Double.isNaN(d3);
        Double.isNaN(d4);
        Double.isNaN(d2);
        this.A00 = d + ((d2 * (d3 / d4)) / 1000.0d);
        if (this.A00 > ((double) this.A02)) {
            this.A00 = (double) this.A02;
        }
        if (this.A00 < 1.0d) {
            z = false;
        } else {
            this.A00 -= 1.0d;
            z = true;
        }
        return z;
    }

    public C10900e3(RealtimeSinceBootClock realtimeSinceBootClock, int i, long j) {
        this.A04 = realtimeSinceBootClock;
        this.A02 = i;
        this.A03 = j;
        this.A00 = (double) i;
    }
}
