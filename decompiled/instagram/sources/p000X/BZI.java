package p000X;

/* renamed from: X.BZI */
public final class BZI implements AnonymousClass2TQ {
    public final /* synthetic */ BZF A00;
    public final /* synthetic */ C29016CqU A01;

    public BZI(BZF bzf, C29016CqU cqU) {
        this.A00 = bzf;
        this.A01 = cqU;
    }

    public final void B46(Throwable th) {
        C29016CqU cqU = this.A01;
        if (cqU != null) {
            cqU.B0N(new BZN("Showreel Native Animation Resource API call failed", th));
        }
    }

    public final /* bridge */ /* synthetic */ void BPi(Object obj) {
        C29016CqU cqU = this.A01;
        if (cqU != null) {
            cqU.B0P("network");
        }
    }
}
