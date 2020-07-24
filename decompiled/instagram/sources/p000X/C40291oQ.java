package p000X;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1oQ  reason: invalid class name and case insensitive filesystem */
public final class C40291oQ {
    public static C40291oQ A03;
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    public final synchronized void A01(String str) {
        Set<C26211Cc> set = (Set) this.A02.get(str);
        if (set != null) {
            for (C26211Cc cancel : set) {
                cancel.cancel();
            }
        }
        this.A02.remove(str);
    }

    public final synchronized void A02(String str, boolean z) {
        C256019m r0;
        Set<C26211Cc> set = (Set) this.A00.get(str);
        if (set != null) {
            for (C26211Cc r2 : set) {
                if (!z || ((r0 = (C256019m) this.A01.get(r2)) != null && r0.A00() == Constants.ONE)) {
                    r2.cancel();
                }
            }
        }
        this.A00.remove(str);
    }

    public final synchronized void A03(String str, boolean z) {
        Integer num;
        Set<C26211Cc> set = (Set) this.A02.get(str);
        if (set != null) {
            for (C26211Cc r1 : set) {
                if (z) {
                    num = Constants.A0C;
                } else {
                    num = Constants.ONE;
                }
                r1.BsT(num);
            }
        }
        this.A02.remove(str);
    }

    public static synchronized C40291oQ A00() {
        C40291oQ r0;
        synchronized (C40291oQ.class) {
            if (A03 == null) {
                A03 = new C40291oQ();
            }
            r0 = A03;
        }
        return r0;
    }
}
