package p000X;

import java.util.ArrayList;

/* renamed from: X.BEX */
public final class BEX implements C25323BEd {
    public final /* synthetic */ C25333BEo A00;

    public BEX(C25333BEo bEo) {
        this.A00 = bEo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 == 7) goto L_0x0012;
     */
    public final C25325BEf A24(C25325BEf bEf) {
        boolean z;
        if (bEf != null) {
            int A04 = bEf.A04();
            if (!(A04 == 0 || A04 == 5 || A04 == 6)) {
                z = false;
            }
            z = true;
            if (!z) {
                throw new BFb(-1);
            }
        }
        int i = 1;
        if (bEf != null) {
            i = 1 + bEf.A03();
        }
        return C25325BEf.A00(i, 1, 0, 0, 0, this.A00.A00, new ArrayList());
    }
}
