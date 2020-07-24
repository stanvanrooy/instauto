package p000X;

import android.content.Context;

/* renamed from: X.1pk  reason: invalid class name and case insensitive filesystem */
public final class C41091pk extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41091pk(C37531jo r3) {
        super("initCCUPlugin", 368);
        this.A00 = r3;
    }

    public final void A00() {
        C37531jo r3 = this.A00;
        if (AnonymousClass287.A00(r3.A06, r3.A07)) {
            if (AnonymousClass28C.A01 == null) {
                AnonymousClass28C.A01 = new AnonymousClass28C();
            }
            AnonymousClass28C r0 = AnonymousClass28C.A01;
            Context context = r3.A06;
            AnonymousClass0C1 r1 = r3.A07;
            AnonymousClass28I r02 = r0.A00;
            if (r02 != null) {
                r02.initScheduler(context, r1);
            }
        }
    }
}
