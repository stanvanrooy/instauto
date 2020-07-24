package p000X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.01y  reason: invalid class name and case insensitive filesystem */
public final class C023301y implements Runnable {
    public final /* synthetic */ AnonymousClass0DU A00;

    public C023301y(AnonymousClass0DU r1) {
        this.A00 = r1;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A00.A00;
        multiSignalANRDetector.A0F = false;
        if (multiSignalANRDetector.A0G) {
            AnonymousClass0DB.A0E(multiSignalANRDetector.A09, "Resuming error state checks");
            AnonymousClass02E r2 = this.A00.A00.A07;
            synchronized (r2) {
                if (r2.A01 != Constants.ZERO) {
                    AnonymousClass02B r0 = r2.A00;
                    synchronized (r0.A06) {
                        r0.A01 = false;
                        r0.A06.notifyAll();
                    }
                }
            }
            this.A00.A00.A0G = false;
        }
    }
}
