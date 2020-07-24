package p000X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CNM */
public final class CNM {
    public static final int A00(List list) {
        C13150hy.A02(list, "$this$collectionCount");
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            boolean z = false;
            if (CNO.A00(((C27702CNw) it.next()).A03) == Constants.A0N) {
                z = true;
            }
            if (z && (i = i + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }
}
