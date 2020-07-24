package p000X;

import android.os.Handler;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.video.heroplayer.ipc.VideoSource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.11m  reason: invalid class name and case insensitive filesystem */
public final class C237011m {
    public final Handler A00 = new Handler(C15740nS.A00());
    public final QuickPerformanceLogger A01;
    public final C236711j A02;
    public final Integer A03;
    public final Map A04 = new HashMap();
    public volatile boolean A05;

    public static boolean A01(C237011m r1) {
        if (r1.A05 || !r1.A02.A01) {
            return false;
        }
        return true;
    }

    public final void A02(VideoSource videoSource, String str, C169067Kb r10, long j) {
        A03(new C169097Kf(this, videoSource, str, r10, j));
    }

    public C237011m(Integer num, QuickPerformanceLogger quickPerformanceLogger, C236711j r5) {
        this.A03 = num;
        this.A01 = quickPerformanceLogger;
        this.A02 = r5;
    }

    public static void A00(C237011m r9, int i, short s, long j) {
        C12670hC.A01();
        if (A01(r9)) {
            int i2 = i;
            if (i != -1) {
                Map map = r9.A04;
                Integer valueOf = Integer.valueOf(i);
                if (map.containsKey(valueOf)) {
                    r9.A01.markerEnd(AnonymousClass7Kh.A00(r9.A03), i2, s, j, TimeUnit.NANOSECONDS);
                    r9.A04.remove(valueOf);
                }
            }
        }
    }

    public final void A03(Runnable runnable) {
        if (A01(this)) {
            AnonymousClass0ZA.A0E(this.A00, runnable, -1141726623);
        }
    }
}
