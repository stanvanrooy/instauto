package p000X;

import android.content.Context;

/* renamed from: X.AN3 */
public final class AN3 {
    public AN2 A00;
    public final Context A01;
    public final AnonymousClass0C1 A02;
    public final AN4 A03;

    public final void A00() {
        C31221Wz A012 = C31201Wx.A01(this.A01);
        if (A012 != null) {
            A012.A0B();
        }
    }

    public final boolean A01() {
        C31221Wz A012 = C31201Wx.A01(this.A01);
        if (A012 == null || !A012.A0Q()) {
            return false;
        }
        return true;
    }

    public AN3(AnonymousClass0C1 r1, Context context, AN4 an4) {
        this.A02 = r1;
        this.A01 = context;
        this.A03 = an4;
    }
}
