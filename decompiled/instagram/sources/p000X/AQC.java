package p000X;

/* renamed from: X.AQC */
public final class AQC implements AS8 {
    public final /* synthetic */ AQ5 A00;

    public AQC(AQ5 aq5) {
        this.A00 = aq5;
    }

    public final void BOw() {
        long j;
        AQ5 aq5 = this.A00;
        AnonymousClass79M r7 = aq5.A0R;
        AVQ avq = aq5.A0E;
        long j2 = 0;
        if (avq != null) {
            j = avq.AYh();
        } else {
            j = 0;
        }
        C23674AXl aXl = this.A00.A0C;
        if (aXl != null) {
            j2 = aXl.AYh();
        }
        AnonymousClass0P4 A01 = AnonymousClass79M.A01(r7, Constants.A08);
        A01.A0F("rtmp_duration", Long.valueOf(j));
        A01.A0F("rtc_duration", Long.valueOf(j2));
        AnonymousClass0WN.A01(r7.A0N).BcG(A01);
    }
}
