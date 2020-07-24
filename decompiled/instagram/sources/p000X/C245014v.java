package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.14v  reason: invalid class name and case insensitive filesystem */
public final class C245014v {
    public final C243314e A00;

    public final List A00(C105814hT r9, List list) {
        boolean z;
        ArrayList arrayList = new ArrayList(list);
        HashSet hashSet = new HashSet(arrayList);
        int i = 0;
        while (i < arrayList.size()) {
            AnonymousClass15G r3 = (AnonymousClass15G) arrayList.get(i);
            C105944hg A002 = C105944hg.A00(this.A00.AOd(r9.A04, r3));
            C105944hg r7 = C105944hg.SUCCESS;
            if (A002 == r7) {
                arrayList.remove(i);
                for (AnonymousClass15G r1 : r9.A04(r3)) {
                    if (!hashSet.contains(r1)) {
                        arrayList.add(r1);
                        hashSet.add(r1);
                    }
                }
            } else {
                if (C105944hg.A00(this.A00.AOd(r9.A04, r3)) == C105944hg.WAITING) {
                    Iterator it = r9.A03(r3).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        if (C105944hg.A00(this.A00.AOd(r9.A04, (AnonymousClass15G) it.next())) != r7) {
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    i++;
                } else {
                    arrayList.remove(i);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public C245014v(C243314e r1) {
        this.A00 = r1;
    }
}
