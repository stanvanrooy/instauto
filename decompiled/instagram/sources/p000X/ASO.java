package p000X;

import java.util.ArrayList;

/* renamed from: X.ASO */
public final class ASO {
    public static ASO A02;
    public ArrayList A00 = new ArrayList(8);
    public final ATL A01 = ATL.A00();

    public final void A00() {
        boolean z = false;
        if (this.A01.A01 != null) {
            z = true;
        }
        if (z) {
            this.A00.add(Long.valueOf(System.currentTimeMillis()));
            if (this.A00.size() >= 8) {
                ATL atl = this.A01;
                ATL.A02(atl, new AS0(atl, A01()));
            }
        }
    }

    public final long[] A01() {
        long[] jArr = new long[this.A00.size()];
        for (int i = 0; i < this.A00.size(); i++) {
            jArr[i] = ((Long) this.A00.get(i)).longValue();
        }
        this.A00.clear();
        return jArr;
    }
}
