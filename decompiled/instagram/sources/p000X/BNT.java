package p000X;

import java.util.ArrayList;

/* renamed from: X.BNT */
public final class BNT implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BNT(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        String[] strArr = bng.A06;
        if (strArr == null) {
            return bng.A05(Constants.A0C);
        }
        ArrayList arrayList = new ArrayList();
        int min = Math.min(strArr.length, bng.A03.A03);
        for (int i = 0; i < min; i++) {
            arrayList.add(this.A00.A06[i]);
        }
        return this.A00.A08(arrayList);
    }
}
