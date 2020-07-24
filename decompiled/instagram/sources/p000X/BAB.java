package p000X;

import java.util.Comparator;

/* renamed from: X.BAB */
public final class BAB implements Comparator {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0 != false) goto L_0x000e;
     */
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C25245B9v b9v = (C25245B9v) obj;
        C25245B9v b9v2 = (C25245B9v) obj2;
        boolean z = b9v.A06;
        boolean z2 = b9v2.A06;
        if (z != z2) {
            if (z) {
                return -1;
            }
        }
        int A00 = A00(b9v.A03);
        int A002 = A00(b9v2.A03);
        if (A00 < A002) {
            return -1;
        }
        if (A00 != A002) {
            return 1;
        }
        return 0;
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 2;
            default:
                return Integer.MAX_VALUE;
        }
    }
}
