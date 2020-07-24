package p000X;

import android.os.SystemClock;
import com.facebook.forker.Process;
import java.util.HashMap;

/* renamed from: X.BO8 */
public final class BO8 implements C25584BQq {
    public final /* synthetic */ BO6 A00;
    public final /* synthetic */ HashMap A01;

    public BO8(BO6 bo6, HashMap hashMap) {
        this.A00 = bo6;
        this.A01 = hashMap;
    }

    public final C25521BOf ADg() {
        BO6 bo6 = this.A00;
        HashMap hashMap = this.A01;
        if (bo6.A00 == null) {
            return bo6.A05(Constants.A0C);
        }
        HashMap hashMap2 = new HashMap();
        for (String str : hashMap.keySet()) {
            hashMap2.put(str, Integer.valueOf(bo6.A00.getIntExtra((String) hashMap.get(str), Process.WAIT_RESULT_TIMEOUT)));
        }
        return new C25502BNm(SystemClock.elapsedRealtime(), bo6.A01(), hashMap2);
    }
}
