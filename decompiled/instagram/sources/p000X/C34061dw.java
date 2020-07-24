package p000X;

import java.util.concurrent.Future;

/* renamed from: X.1dw  reason: invalid class name and case insensitive filesystem */
public final class C34061dw extends AnonymousClass0L1 {
    public final /* synthetic */ C27321Hj A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34061dw(C27321Hj r3) {
        super("prefetchLocation", 540);
        this.A00 = r3;
    }

    public final void A00() {
        C27321Hj r2 = this.A00;
        Future future = r2.A0b;
        if (future == null || future.isDone()) {
            r2.A0b = C16230oG.prefetchLocationLazy(r2.A0V, "MainFeedFragment");
        }
    }
}
