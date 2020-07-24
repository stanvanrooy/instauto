package p000X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.0El  reason: invalid class name and case insensitive filesystem */
public final class C04560El implements Runnable {
    public final /* synthetic */ MultiSignalANRDetector A00;
    public final /* synthetic */ AnonymousClass0aN A01;

    public C04560El(AnonymousClass0aN r1, MultiSignalANRDetector multiSignalANRDetector) {
        this.A01 = r1;
        this.A00 = multiSignalANRDetector;
    }

    public final void run() {
        try {
            synchronized (AnonymousClass0aN.A03) {
                AnonymousClass0Y1.A08("sigquit");
            }
            this.A00.ApJ(true);
        } catch (UnsatisfiedLinkError e) {
            AnonymousClass0DB.A0N("lacrima", e, "Failed to load sigquit");
        }
    }
}
