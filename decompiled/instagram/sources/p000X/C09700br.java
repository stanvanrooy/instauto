package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.profilo.logger.Logger;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0br  reason: invalid class name and case insensitive filesystem */
public final class C09700br implements AnonymousClass0DN {
    public final /* synthetic */ C09710bs A00;

    public C09700br(C09710bs r1) {
        this.A00 = r1;
    }

    public final void B5V(long j) {
        long j2 = j;
        if (j > 0) {
            if (this.A00.A01.get() && this.A00.A0A != -1) {
                if (AnonymousClass0DM.A04 == null) {
                    AnonymousClass0DM.A04 = new AnonymousClass0DM();
                }
                AnonymousClass0DM r4 = AnonymousClass0DM.A04;
                Runnable runnable = this.A00.A00;
                if (!r4.A03) {
                    if (r4.A00 == null) {
                        r4.A00 = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = r4.A00;
                    AnonymousClass0ZA.A05(handler, Message.obtain(handler, runnable));
                } else {
                    try {
                        r4.A02.invoke(r4.A01, new Object[]{3, runnable, null});
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                    }
                }
                long max = Math.max(1, j2);
                long round = Math.round((((double) max) * 1.0d) / ((double) this.A00.A0A)) - 1;
                C09710bs r3 = this.A00;
                r3.A08 = (int) (((long) r3.A08) + round);
                double d = (double) round;
                if (d >= 4.0d) {
                    this.A00.A07 += d / 4.0d;
                }
                this.A00.A09 += max;
                if (round >= 1) {
                    Logger.writeStandardEntry(C09710bs.A0D, 6, 44, 0, 0, 8126498, 0, round);
                    C09710bs.A04("ScrollPerf.FrameDropped");
                    if (d >= 4.0d) {
                        C09710bs.A04("ScrollPerf.LargeFrameDropped");
                    }
                }
                C09710bs.A04("ScrollPerf.FrameStarted");
            }
        }
    }
}
