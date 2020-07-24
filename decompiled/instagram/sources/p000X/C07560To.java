package p000X;

import android.content.Context;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0To  reason: invalid class name and case insensitive filesystem */
public final class C07560To {
    public final AtomicLong A00 = new AtomicLong();
    public final AtomicLong A01 = new AtomicLong();
    public final AtomicLong A02 = new AtomicLong();
    public final AtomicLong A03 = new AtomicLong();
    public final AtomicLong A04 = new AtomicLong();
    public final Context A05;
    public final RealtimeSinceBootClock A06;
    public volatile String A07;

    public final C07550Tn A00(boolean z) {
        C07550Tn r3 = new C07550Tn(this.A07, this.A03.get() - this.A04.get(), this.A01.get() - this.A00.get(), this.A01.get() - this.A02.get());
        if (z) {
            this.A00.set(0);
            this.A01.set(0);
        }
        return r3;
    }

    public C07560To(Context context, RealtimeSinceBootClock realtimeSinceBootClock) {
        this.A05 = context;
        this.A06 = realtimeSinceBootClock;
    }
}
