package p000X;

import android.content.Context;
import android.os.Handler;
import java.util.Set;

/* renamed from: X.BIH */
public final class BIH implements C25441BKg {
    public final BHH Be8(BIG big) {
        Context A03 = big.A03();
        C229419xo.A00.A00("Revoking access", new Object[0]);
        C229369xj.A01(C229369xj.A00(A03), "refreshToken");
        C229389xl.A00(A03).A01();
        Set<BIG> set = BIG.A00;
        synchronized (set) {
            try {
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        for (BIG A0C : set) {
            A0C.A0C();
        }
        synchronized (C25368BGg.A0E) {
            try {
                C25368BGg bGg = C25368BGg.A0B;
                if (bGg != null) {
                    bGg.A09.incrementAndGet();
                    Handler handler = bGg.A03;
                    AnonymousClass0ZA.A05(handler, handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                    break;
                }
            }
        }
        return big.A09(new BIP(big));
        throw th;
    }
}
