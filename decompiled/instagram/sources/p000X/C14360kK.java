package p000X;

import java.util.Iterator;

/* renamed from: X.0kK  reason: invalid class name and case insensitive filesystem */
public abstract class C14360kK {
    public abstract C14360kK A03(Object obj);

    public static int A01(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public C14360kK A02(Iterable iterable) {
        for (Object A03 : iterable) {
            A03(A03);
        }
        return this;
    }

    public C14360kK A04(Iterator it) {
        while (it.hasNext()) {
            A03(it.next());
        }
        return this;
    }
}
