package p000X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.01v  reason: invalid class name and case insensitive filesystem */
public final class C023001v implements Runnable {
    public final /* synthetic */ AnonymousClass08W A00;

    public C023001v(AnonymousClass08W r1) {
        this.A00 = r1;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A00.A00;
        if (multiSignalANRDetector.A0E) {
            multiSignalANRDetector.A0N.A06.Amj(multiSignalANRDetector.A03, 3);
        }
    }
}
