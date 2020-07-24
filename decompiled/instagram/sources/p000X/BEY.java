package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BEY */
public final class BEY implements C25323BEd {
    public final /* synthetic */ int A00;

    public BEY(int i) {
        this.A00 = i;
    }

    public final C25325BEf A24(C25325BEf bEf) {
        int i;
        if (bEf != null && (i = this.A00) == bEf.A03() && bEf.A04() == 1) {
            int A02 = bEf.A02();
            long A05 = bEf.A05();
            long A06 = bEf.A06();
            List A0B = bEf.A0B();
            List A09 = bEf.A09();
            return C25325BEf.A00(i, 7, A02, A05, A06, A0B, A09 != null ? new ArrayList(A09) : new ArrayList());
        }
        throw new BFb(-3);
    }
}
