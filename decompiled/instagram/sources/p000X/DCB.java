package p000X;

import java.util.Comparator;

/* renamed from: X.DCB */
public final class DCB implements Comparator {
    public final int compare(Object obj, Object obj2) {
        float f = ((DCC) obj).A00;
        float f2 = ((DCC) obj2).A00;
        if (f < f2) {
            return -1;
        }
        if (f2 < f) {
            return 1;
        }
        return 0;
    }
}
