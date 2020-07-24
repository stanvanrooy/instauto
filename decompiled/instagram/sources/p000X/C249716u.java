package p000X;

import java.util.Comparator;

/* renamed from: X.16u  reason: invalid class name and case insensitive filesystem */
public final class C249716u implements Comparator {
    public final int compare(Object obj, Object obj2) {
        Long l;
        C39941no r5 = (C39941no) obj;
        C39941no r6 = (C39941no) obj2;
        long j = Long.MAX_VALUE;
        if (r5 != null) {
            l = Long.valueOf(r5.A03());
        } else {
            l = Long.MAX_VALUE;
        }
        if (r6 != null) {
            j = Long.valueOf(r6.A03());
        }
        return l.compareTo(j);
    }
}
