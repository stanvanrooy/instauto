package p000X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CWR */
public final class CWR extends C27291Hg {
    public int A00;
    public long A01;
    public long A02;
    public final C27371Ho A03;
    public final AnonymousClass0C1 A04;
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();
    public final boolean A08;
    public final List A09 = new ArrayList();

    public final void A02(String str) {
        if (this.A05.containsKey(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            Integer num = (Integer) this.A06.get(str);
            if (num == null) {
                num = 0;
            }
            Integer valueOf = Integer.valueOf(num.intValue() + Math.max(0, (int) (currentTimeMillis - ((C27918CWg) this.A05.get(str)).A00.longValue())));
            this.A05.remove(str);
            this.A06.put(str, valueOf);
        }
    }

    public CWR(C27371Ho r2, boolean z, AnonymousClass0C1 r4) {
        this.A03 = r2;
        this.A08 = z;
        this.A04 = r4;
    }

    public static void A00(CWR cwr) {
        long currentTimeMillis = System.currentTimeMillis();
        cwr.A01 += currentTimeMillis - cwr.A02;
        cwr.A02 = currentTimeMillis;
        ArrayList<String> arrayList = new ArrayList<>(cwr.A05.keySet());
        for (String A022 : arrayList) {
            cwr.A02(A022);
        }
        cwr.A09.addAll(arrayList);
    }

    public final void A01() {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = currentTimeMillis;
        for (String put : this.A09) {
            this.A05.put(put, new C27918CWg(Long.valueOf(currentTimeMillis)));
        }
        this.A09.clear();
    }

    public final void BE0() {
        A00(this);
    }

    public final void BJx() {
        A01();
    }
}
