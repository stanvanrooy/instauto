package p000X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.CNL */
public final class CNL {
    public static int A00(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer A00 = CNO.A00(((C27702CNw) it.next()).A03);
            if (A00 == Constants.ONE || A00 == Constants.A0C) {
                i++;
            }
        }
        return i;
    }
}
