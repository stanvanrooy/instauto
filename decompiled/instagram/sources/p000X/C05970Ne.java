package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0Ne  reason: invalid class name and case insensitive filesystem */
public final class C05970Ne {
    public static List A02(List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public static List A03(List list, C28261La r5) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object next : list) {
            if (r5.apply(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static boolean A05(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static Object A00(List list) {
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public static Object A01(List list, C28261La r4) {
        Object obj;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            obj = list.get(size);
        } while (!r4.apply(obj));
        return obj;
    }

    public static List A04(List list, List list2, Comparator comparator) {
        int size = list.size();
        int size2 = list2.size();
        ArrayList arrayList = new ArrayList(size + size2);
        int i = 0;
        int i2 = 0;
        while (i < size && i2 < size2) {
            Object obj = list.get(i);
            Object obj2 = list2.get(i2);
            int compare = comparator.compare(obj, obj2);
            if (compare == 0) {
                arrayList.add(obj);
                i++;
            } else if (compare < 0) {
                arrayList.add(obj);
                i++;
            } else {
                arrayList.add(obj2);
            }
            i2++;
        }
        while (i < size) {
            arrayList.add(list.get(i));
            i++;
        }
        while (i2 < size2) {
            arrayList.add(list2.get(i2));
            i2++;
        }
        return arrayList;
    }
}
