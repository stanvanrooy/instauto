package p000X;

/* renamed from: X.BTE */
public final class BTE implements Runnable {
    public final /* synthetic */ BTD A00;

    public BTE(BTD btd) {
        this.A00 = btd;
    }

    public final void run() {
        try {
            this.A00.A01(3);
        } catch (RuntimeException e) {
            AnonymousClass0DB.A0I("PeriodicEventHandler", "Exception happened within maybeLog", e);
        }
    }
}
