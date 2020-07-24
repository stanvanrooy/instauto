package p000X;

import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0Kf  reason: invalid class name and case insensitive filesystem */
public final class C05380Kf implements AnonymousClass0OT {
    public boolean A00;
    public final C06180Ob A01;
    public final String A02;
    public final AtomicLong A03 = new AtomicLong();
    public final int A04;
    public final AnonymousClass0OT A05;
    public final Queue A06;

    public static void A00(int i, long j, String str, String str2) {
        if (i != -1 && j > ((long) i)) {
            AnonymousClass0QD.A02(str, str2 + "; elapsedTimeMs: " + j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        return;
     */
    public static void A01(C05380Kf r5) {
        synchronized (r5) {
            if (!r5.A00) {
                C05430Km r1 = (C05430Km) r5.A06.poll();
                if (r1 != null) {
                    r5.A00 = true;
                    r5.A05.ADc(r1);
                }
            } else if (r5.A03.get() != 0) {
                A00(r5.A04, SystemClock.elapsedRealtime() - r5.A03.get(), "waiting in queue time exceeded limit", r5.A02);
            }
        }
    }

    public final void ADb(AnonymousClass0OC r2) {
        throw new UnsupportedOperationException();
    }

    public final void ADc(AnonymousClass0O9 r3) {
        this.A06.add(new C05430Km(this, r3));
        A01(this);
    }

    public C05380Kf(AnonymousClass0O0 r2) {
        this.A01 = r2.A02;
        this.A02 = r2.A01;
        this.A05 = r2.A03;
        this.A04 = r2.A00;
        this.A06 = new ConcurrentLinkedQueue();
        this.A00 = false;
    }
}
