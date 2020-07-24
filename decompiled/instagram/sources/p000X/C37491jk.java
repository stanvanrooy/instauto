package p000X;

import java.io.IOException;

/* renamed from: X.1jk  reason: invalid class name and case insensitive filesystem */
public final class C37491jk extends C15190mU {
    public boolean A00 = false;
    public final /* synthetic */ C16430oa A01;

    public final void onFailed(AnonymousClass1C4 r2, IOException iOException) {
        this.A00 = false;
    }

    public final void onSucceeded(AnonymousClass1C4 r2) {
        this.A00 = true;
    }

    public C37491jk(C16430oa r2) {
        this.A01 = r2;
    }

    public final void onRequestCallbackDone(AnonymousClass1C4 r3, C256019m r4) {
        C38171kq.A00().B74(r3, r4, this.A00);
        synchronized (this.A01.A01) {
            this.A01.A00.A00(r4);
            C16430oa.A00(this.A01);
        }
    }
}
