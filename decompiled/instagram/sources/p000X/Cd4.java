package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cd4 */
public final class Cd4 {
    public static C28360Cfe A00(C28196Ccy ccy, C28429Cgl cgl) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < ccy.A00.size(); i++) {
            Object obj = ccy.A00.get(i);
            if (obj instanceof C28287CeT) {
                C28287CeT ceT = (C28287CeT) obj;
                C28259Ce0 ce0 = (C28259Ce0) ccy.A01.get(i);
                if (cgl.Bn4(ce0)) {
                    arrayList.add(ceT.A02());
                    arrayList2.add(ceT.A03());
                    arrayList3.add(Long.valueOf((long) ce0.A00));
                    arrayList4.add(ce0.A04);
                }
            }
        }
        return new C28360Cfe(arrayList, arrayList2, arrayList3, arrayList4, (List) null);
    }
}
