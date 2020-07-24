package p000X;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;

/* renamed from: X.BNR */
public final class BNR implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BNR(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        ActivityInfo[] activityInfoArr = bng.A04;
        if (activityInfoArr == null) {
            return bng.A05(Constants.A0C);
        }
        ArrayList arrayList = new ArrayList();
        int min = Math.min(activityInfoArr.length, bng.A03.A03);
        for (int i = 0; i < min; i++) {
            arrayList.add(this.A00.A04[i].name);
        }
        return this.A00.A08(arrayList);
    }
}
