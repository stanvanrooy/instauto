package p000X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.01u  reason: invalid class name and case insensitive filesystem */
public final class C022901u implements Runnable {
    public final /* synthetic */ AnonymousClass08W A00;

    public C022901u(AnonymousClass08W r1) {
        this.A00 = r1;
    }

    public final void run() {
        this.A00.A00.A04(AnonymousClass027.DIALOG_DISMISSED, false, false);
        MultiSignalANRDetector.A02(this.A00.A00);
    }
}
