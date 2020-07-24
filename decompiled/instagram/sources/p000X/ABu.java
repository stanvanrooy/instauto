package p000X;

/* renamed from: X.ABu */
public final class ABu implements Runnable {
    public final /* synthetic */ C23185ABn A00;

    public ABu(C23185ABn aBn) {
        this.A00 = aBn;
    }

    public final void run() {
        C23185ABn aBn = this.A00;
        if (!aBn.A01) {
            aBn.A01 = true;
            AnonymousClass0FY.A01(ACK.A06, "ReactChoreographer needs to be initialized.");
            ACK.A06.A01(Constants.A0N, aBn.A02.A06);
        }
    }
}
