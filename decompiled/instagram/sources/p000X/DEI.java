package p000X;

import java.util.Comparator;

/* renamed from: X.DEI */
public final class DEI implements Comparator {
    public final int compare(Object obj, Object obj2) {
        int i = ((C29841DDc) obj).A04.A0J;
        int i2 = ((C29841DDc) obj2).A04.A0J;
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }
}
