package p000X;

import java.util.Comparator;

/* renamed from: X.BWD */
public final class BWD implements Comparator {
    public final int compare(Object obj, Object obj2) {
        C28726Clh clh = (C28726Clh) obj;
        C28726Clh clh2 = (C28726Clh) obj2;
        int i = clh.A01;
        int i2 = clh2.A01;
        float f = clh.A00;
        float f2 = clh2.A00;
        if (i != i2) {
            return i - i2;
        }
        if (f != f2) {
            return (int) Math.signum(f - f2);
        }
        return clh.A05 - clh2.A05;
    }
}
