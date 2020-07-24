package p000X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.0gu  reason: invalid class name and case insensitive filesystem */
public final class C12540gu {
    public Context A00;
    public C12140gF A01;
    public final C12100gB A02;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r1.contains(java.lang.Integer.valueOf(r8)) == false) goto L_0x0027;
     */
    public final void A00(int i, int i2) {
        boolean z;
        C12230gP A04 = this.A02.A04(i);
        for (AnonymousClass299 r2 : A04.A05) {
            Set set = r2.A02;
            if (set != null) {
                z = true;
            }
            z = false;
            if (!z) {
                C12390gf A002 = C12230gP.A00(A04, r2);
                try {
                    if (A002.BaM(false)) {
                        A04.A04.A00(A002, A04.A02, i2, false);
                    }
                } catch (Exception e) {
                    A04.A00.A05(A002, e);
                    A04.A00.A04(A002);
                }
            }
        }
    }

    public C12540gu(C12100gB r4, C12140gF r5, Context context) {
        this.A02 = r4;
        this.A01 = r5;
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        this.A02.A08(applicationContext, this.A01.A00());
    }
}
