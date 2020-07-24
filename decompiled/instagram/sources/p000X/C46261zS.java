package p000X;

import java.util.Comparator;

/* renamed from: X.1zS  reason: invalid class name and case insensitive filesystem */
public final class C46261zS implements Comparator {
    public final int compare(Object obj, Object obj2) {
        C46281zU r3 = (C46281zU) obj;
        C46281zU r4 = (C46281zU) obj2;
        int i = r3.A01 - r4.A01;
        if (i == 0) {
            return r3.A02 - r4.A02;
        }
        return i;
    }
}
