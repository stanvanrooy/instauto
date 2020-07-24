package p000X;

/* renamed from: X.DQV */
public enum DQV implements DRQ {
    ;

    public static boolean A01(DRQ drq, DRQ drq2) {
        if (drq2 == null) {
            AnonymousClass1J9.A03(new NullPointerException("next is null"));
            return false;
        } else if (drq == null) {
            return true;
        } else {
            drq2.cancel();
            AnonymousClass1J9.A03(new DRR("Subscription already set!"));
            return false;
        }
    }

    public final void BdE(long j) {
    }

    public final void cancel() {
    }

    /* access modifiers changed from: public */
    DQV() {
    }

    public static boolean A00(long j) {
        if (j > 0) {
            return true;
        }
        AnonymousClass1J9.A03(new IllegalArgumentException(AnonymousClass000.A0B("n > 0 required but it was ", j)));
        return false;
    }
}
