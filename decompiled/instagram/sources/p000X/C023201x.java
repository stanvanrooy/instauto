package p000X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.01x  reason: invalid class name and case insensitive filesystem */
public final class C023201x implements Runnable {
    public final /* synthetic */ AnonymousClass08W A00;

    public C023201x(AnonymousClass08W r1) {
        this.A00 = r1;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A00.A00;
        if (multiSignalANRDetector.A0F) {
            int i = multiSignalANRDetector.A00 + 1;
            multiSignalANRDetector.A00 = i;
            if (i % multiSignalANRDetector.A0N.A02 == 0) {
                AnonymousClass0DB.A0E(multiSignalANRDetector.A09, "Pausing error state checks");
                this.A00.A00.A07.A00();
                this.A00.A00.A0G = true;
            }
        }
    }
}
