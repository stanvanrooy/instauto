package p000X;

import android.os.SystemClock;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.01t  reason: invalid class name and case insensitive filesystem */
public final class C022801t implements Runnable {
    public final /* synthetic */ AnonymousClass08W A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C022801t(AnonymousClass08W r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A00.A00;
        AnonymousClass0DB.A0K(multiSignalANRDetector.A09, "On error detected waiting for confirmation %b", Boolean.valueOf(multiSignalANRDetector.A0K));
        MultiSignalANRDetector multiSignalANRDetector2 = this.A00.A00;
        multiSignalANRDetector2.A0C = this.A01;
        multiSignalANRDetector2.A0D = this.A02;
        multiSignalANRDetector2.A05 = SystemClock.uptimeMillis();
        multiSignalANRDetector2.A04(AnonymousClass027.AM_CONFIRMED, false, false);
        MultiSignalANRDetector multiSignalANRDetector3 = this.A00.A00;
        if (multiSignalANRDetector3.A0K) {
            AnonymousClass0ZA.A08(multiSignalANRDetector3.A0M, multiSignalANRDetector3.A0R);
            this.A00.A00.A0K = false;
        }
        MultiSignalANRDetector.A03(this.A00.A00, AnonymousClass027.AM_CONFIRMED);
    }
}
