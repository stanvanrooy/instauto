package p000X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.BNN */
public final class BNN implements C25584BQq {
    public final /* synthetic */ BNO A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ List A02;

    public BNN(BNO bno, List list, Integer num) {
        this.A00 = bno;
        this.A02 = list;
        this.A01 = num;
    }

    public final C25521BOf ADg() {
        HashMap hashMap = new HashMap();
        for (BNK bnk : this.A02) {
            if (bnk.A00()) {
                String str = (String) bnk.A02;
                hashMap.put(str, new AGO(this.A00.A00, str, this.A01));
            }
        }
        return new C25500BNk(SystemClock.elapsedRealtime(), this.A00.A01(), hashMap, Constants.A0N);
    }
}
