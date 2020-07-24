package p000X;

import java.util.Comparator;

/* renamed from: X.ACQ */
public final class ACQ implements Comparator {
    public final int compare(Object obj, Object obj2) {
        C23091A6e a6e = (C23091A6e) obj;
        C23091A6e a6e2 = (C23091A6e) obj2;
        if (!(a6e == null && a6e2 == null)) {
            if (a6e != null) {
                if (a6e2 != null) {
                    long j = a6e.A02 - a6e2.A02;
                    if (j != 0) {
                        if (j < 0) {
                            return -1;
                        }
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }
}
