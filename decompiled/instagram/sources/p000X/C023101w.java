package p000X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.01w  reason: invalid class name and case insensitive filesystem */
public final class C023101w implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass08W A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C023101w(AnonymousClass08W r1, String str, String str2, String str3, long j) {
        this.A01 = r1;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A00 = j;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A01.A00;
        if (multiSignalANRDetector.A0E) {
            multiSignalANRDetector.A0N.A06.Ama(this.A03, this.A02, this.A04, this.A00);
        }
    }
}
