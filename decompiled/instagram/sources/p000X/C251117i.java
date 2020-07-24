package p000X;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.17i  reason: invalid class name and case insensitive filesystem */
public final class C251117i {
    public long A00 = Long.MIN_VALUE;
    public C04140Cp A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public final int A05;
    public final Handler A06;
    public final Runnable A07 = new C251217j(this);
    public final Set A08;
    public final Set A09 = new HashSet();
    public final Set A0A = new HashSet();
    public final AtomicReference A0B = new AtomicReference();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r6.A0A.isEmpty() != false) goto L_0x0017;
     */
    public static synchronized void A00(C251117i r6) {
        boolean z;
        synchronized (r6) {
            if (r6.A02 && !r6.A09.isEmpty()) {
                z = true;
            }
            z = false;
            r6.A04 = z;
            if (z && !r6.A03) {
                r6.A03 = true;
                long j = r6.A00 + ((long) r6.A05);
                if (j <= r6.A01.now()) {
                    AnonymousClass0ZA.A0E(r6.A06, r6.A07, 817534268);
                } else {
                    r6.A06.postAtTime(AnonymousClass0ZA.A00(r6.A07, -527816927), j);
                }
            }
        }
    }

    public C251117i(C04140Cp r4, Handler handler, Set set, Set set2) {
        this.A01 = r4;
        this.A06 = handler;
        this.A09.addAll(set);
        this.A08 = set2;
        this.A05 = Math.max(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 200);
    }

    public final void A01(C251417l r3) {
        synchronized (this.A0A) {
            this.A0A.add(r3);
        }
        A00(this);
    }
}
