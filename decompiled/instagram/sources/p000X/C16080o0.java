package p000X;

import android.content.Context;

/* renamed from: X.0o0  reason: invalid class name and case insensitive filesystem */
public final class C16080o0 extends C16100o2 {
    public Context A00;
    public C197518cl A01;

    public final C197518cl A00() {
        if (this.A01 == null) {
            this.A01 = new C197518cl();
        }
        return this.A01;
    }

    public final void A01(AnonymousClass0C1 r3) {
        AnonymousClass11X.A00(this.A00, r3).A03.A00(AnonymousClass13G.BACKGROUND);
    }

    public final void A02(AnonymousClass0C1 r3) {
        AnonymousClass11X.A00(this.A00, r3).A03.A00(AnonymousClass13G.FOREGROUND);
    }

    public final void A03(AnonymousClass0C1 r3) {
        AnonymousClass11X.A00(this.A00, r3).A03.A00(AnonymousClass13G.VOIP_START);
    }

    public final void A04(AnonymousClass0C1 r3) {
        AnonymousClass11X.A00(this.A00, r3).A03.A00(AnonymousClass13G.VOIP_END);
    }

    public C16080o0(Context context) {
        this.A00 = context;
    }
}
