package p000X;

import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.BNQ */
public final class BNQ implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BNQ(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        ServiceInfo[] serviceInfoArr = bng.A05;
        if (serviceInfoArr == null) {
            return bng.A05(Constants.A0C);
        }
        ArrayList arrayList = new ArrayList();
        int min = Math.min(serviceInfoArr.length, bng.A03.A03);
        for (int i = 0; i < min; i++) {
            arrayList.add(this.A00.A05[i].name);
        }
        Collections.sort(arrayList);
        return this.A00.A08(arrayList);
    }
}
