package p000X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BQD */
public abstract class BQD {
    public final Context A00;
    public final BQH A01;

    public final synchronized void A01(BQK bqk, List list) {
        C25584BQq bQq;
        C25521BOf bOf;
        C25521BOf bOf2;
        Map map = BQL.A00().A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25527BOl bOl = (C25527BOl) it.next();
            if (bOl.A00(bqk)) {
                bQq = bOl.A01;
            } else {
                bQq = null;
            }
            if (bQq != null) {
                try {
                    bOf = bQq.ADg();
                } catch (Throwable th) {
                    bOf = BQC.A01(this.A00.getPackageName(), th);
                }
                if (!(bOf == null || bOf.A03 == null)) {
                    if (!bOl.A02.contains(C25520BOe.DYNAMIC) || !map.containsKey(Integer.valueOf(bOl.A00))) {
                        BQM bqm = new BQM(A00(this.A01, bOl));
                        bqm.A02(bOf);
                        BQL.A00().A01(bOl.A00, bqm, bOf.A01());
                    } else {
                        BQM bqm2 = (BQM) map.get(Integer.valueOf(bOl.A00));
                        if (bqm2 != null) {
                            bOf2 = (C25521BOf) bqm2.A00();
                        } else {
                            bOf2 = null;
                        }
                        if (bqm2 == null) {
                            bqm2 = new BQM(A00(this.A01, bOl));
                        }
                        if (bOf2 == null || !bOf.A05(bOf2, bOl.A02)) {
                            bqm2.A02(bOf);
                            BQL.A00().A01(bOl.A00, bqm2, bOf.A01());
                        }
                    }
                }
            }
        }
    }

    public static int A00(BQH bqh, C25527BOl bOl) {
        if (bqh.A00(bOl.A00) != null) {
            return bqh.A00(bOl.A00).intValue();
        }
        if (bOl.A02.contains(C25520BOe.DYNAMIC)) {
            return bqh.A01;
        }
        if (bOl.A02.contains(C25520BOe.BIOMETRIC)) {
            return bqh.A00;
        }
        return bqh.A04;
    }

    public BQD(Context context, BQH bqh) {
        this.A00 = context;
        this.A01 = bqh;
    }
}
