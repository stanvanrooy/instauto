package p000X;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.ALT */
public class ALT extends ALU {
    public static final Set A00(Set set, Iterable iterable) {
        Integer num;
        int size;
        C13150hy.A02(set, "$this$plus");
        C13150hy.A02(iterable, "elements");
        C13150hy.A02(iterable, "$this$collectionSizeOrNull");
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            size = set.size() + num.intValue();
        } else {
            size = set.size() << 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13360iP.A00(size));
        linkedHashSet.addAll(set);
        AnonymousClass10Q.A0H(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static final Set A01(Set set, Object obj) {
        C13150hy.A02(set, "$this$minus");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13360iP.A00(set.size()));
        boolean z = false;
        for (Object next : set) {
            boolean z2 = true;
            if (!z && C13150hy.A05(next, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    public static final Set A02(Set set, Object obj) {
        C13150hy.A02(set, "$this$plus");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13360iP.A00(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
