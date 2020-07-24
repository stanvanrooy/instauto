package p000X;

import android.content.Context;

/* renamed from: X.1pw  reason: invalid class name and case insensitive filesystem */
public final class C41211pw extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41211pw(C37531jo r3) {
        super("checkAndMonitorCacheAsync", 378);
        this.A00 = r3;
    }

    public final void A00() {
        Context context = this.A00.A06;
        if (C58132fR.A02 == null) {
            C58132fR.A02 = new C58132fR(context);
        }
        C58132fR r2 = C58132fR.A02;
        if (r2.A00 == null) {
            C05700Lp.A00().ADc(new C58142fS(r2));
        }
    }
}
