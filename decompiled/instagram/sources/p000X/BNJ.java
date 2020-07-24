package p000X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.BNJ */
public final class BNJ implements C25584BQq {
    public final /* synthetic */ BND A00;
    public final /* synthetic */ List A01;

    public BNJ(BND bnd, List list) {
        this.A00 = bnd;
        this.A01 = list;
    }

    public final C25521BOf ADg() {
        HashMap hashMap = new HashMap();
        for (BNK bnk : this.A01) {
            if (bnk.A00()) {
                String str = (String) bnk.A02;
                hashMap.put(str, new BNC(str));
            }
        }
        return new C25500BNk(SystemClock.elapsedRealtime(), this.A00.A01(), hashMap, Constants.A0N);
    }
}
