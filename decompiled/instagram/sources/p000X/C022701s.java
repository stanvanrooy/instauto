package p000X;

import android.os.SystemClock;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.01s  reason: invalid class name and case insensitive filesystem */
public final class C022701s implements Runnable {
    public final /* synthetic */ MultiSignalANRDetector A00;

    public C022701s(MultiSignalANRDetector multiSignalANRDetector) {
        this.A00 = multiSignalANRDetector;
    }

    public final void run() {
        AnonymousClass0DB.A0E(this.A00.A09, "On confirmation expired");
        MultiSignalANRDetector multiSignalANRDetector = this.A00;
        if (multiSignalANRDetector.A0K) {
            multiSignalANRDetector.A04(AnonymousClass027.AM_EXPIRED, false, false);
            MultiSignalANRDetector multiSignalANRDetector2 = this.A00;
            multiSignalANRDetector2.A0K = false;
            if (multiSignalANRDetector2.A0E) {
                multiSignalANRDetector2.A0N.A06.AjA(SystemClock.uptimeMillis());
            }
            MultiSignalANRDetector multiSignalANRDetector3 = this.A00;
            boolean z = false;
            if (multiSignalANRDetector3.A08 == AnonymousClass0SX.NO_ANR_DETECTED) {
                z = true;
            }
            if (z) {
                MultiSignalANRDetector.A02(multiSignalANRDetector3);
            }
        }
    }
}
