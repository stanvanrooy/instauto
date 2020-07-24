package p000X;

import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.CZB */
public final class CZB implements C30391Tq {
    public final /* synthetic */ CZ3 A00;

    public final void BKw(C38511lO r1, AnonymousClass1NJ r2, C36841ih r3, int i, MediaFrameLayout mediaFrameLayout) {
    }

    public final void BNe(AnonymousClass1NJ r1, C36841ih r2, int i, C32151ag r4) {
    }

    public CZB(CZ3 cz3) {
        this.A00 = cz3;
    }

    public final void B0e(AnonymousClass1NJ r7, C36841ih r8, int i, C32151ag r10) {
        CZ3 cz3 = this.A00;
        if (cz3.A09 == null) {
            cz3.A09 = (Boolean) AnonymousClass0L6.A02(cz3.A0M, AnonymousClass0L7.EXPLORE_PEEK_REDESIGN, "allow_doubletap", false, (AnonymousClass04H) null);
        }
        CZ3 cz32 = this.A00;
        if (cz32.A09.booleanValue()) {
            boolean A0K = C26611Ee.A00(cz32.A0M).A0K(this.A00.A05);
            if (!A0K) {
                CZ3.A04(this.A00, Constants.ZERO);
                CZ3.A02(this.A00);
            }
            r8.A0P(A0K, true, true);
        }
    }
}
