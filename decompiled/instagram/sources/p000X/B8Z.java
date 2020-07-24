package p000X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.B8Z */
public final class B8Z {
    public static B8Y A00() {
        Set<C25216B8b> set = B91.A0x;
        Set set2 = BAO.A00;
        HashMap hashMap = new HashMap();
        for (C25216B8b put : set) {
            hashMap.put(put, Collections.unmodifiableSet(set2));
        }
        return new B8Y(Collections.unmodifiableMap(hashMap));
    }

    public static B8Y A01(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashMap.put((C25216B8b) it.next(), Collections.unmodifiableSet(new HashSet(Collections.singletonList("*|all_packages|*"))));
        }
        return new B8Y(Collections.unmodifiableMap(hashMap));
    }

    public static B8Y A02(Set set, Set set2) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashMap.put((C25216B8b) it.next(), Collections.unmodifiableSet(set2));
        }
        return new B8Y(Collections.unmodifiableMap(hashMap));
    }
}
