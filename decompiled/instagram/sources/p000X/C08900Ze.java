package p000X;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* renamed from: X.0Ze  reason: invalid class name and case insensitive filesystem */
public final class C08900Ze {
    public static C08900Ze A05;
    public final ArrayList A00 = new ArrayList();
    public final BitSet A01 = new BitSet(13);
    public final BitSet A02 = new BitSet(13);
    public final Integer[] A03;
    public final String[] A04 = new String[13];

    public final synchronized void A03(int i, Integer num) {
        if (C09050Zv.A02(i)) {
            Integer[] numArr = this.A03;
            if (numArr[i] != num) {
                numArr[i] = num;
                Iterator it = this.A00.iterator();
                if (it.hasNext()) {
                    it.next();
                    AnonymousClass0ZV.A02(i);
                    throw null;
                } else if (AnonymousClass0DB.A0S()) {
                    AnonymousClass0ZV.A02(i);
                }
            }
        }
    }

    public C08900Ze() {
        Integer[] numArr = new Integer[13];
        this.A03 = numArr;
        for (int i = 0; i < 13; i++) {
            numArr[i] = Constants.ZERO;
        }
    }

    public static synchronized C08900Ze A00() {
        C08900Ze r0;
        synchronized (C08900Ze.class) {
            if (A05 == null) {
                A05 = new C08900Ze();
            }
            r0 = A05;
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r3 >= 13) goto L_0x000d;
     */
    public final Integer A01(String str) {
        boolean z;
        Integer num;
        int A002 = C09050Zv.A00(str);
        synchronized (this) {
            if (A002 >= 0) {
                z = true;
            }
            z = false;
            if (z) {
                num = this.A03[A002];
            } else {
                num = Constants.ONE;
            }
        }
        return num;
    }

    public final String A02(String str) {
        String str2;
        int A002 = C09050Zv.A00(str);
        synchronized (this) {
            str2 = null;
            if (!(A002 == -3 || A002 == -2 || A002 == -1)) {
                if (C09050Zv.A02(A002)) {
                    str2 = this.A04[A002];
                }
            }
        }
        return str2;
    }

    public final void A04(String str, Integer num) {
        A03(C09050Zv.A00(str), num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0024, code lost:
        return false;
     */
    public final boolean A05(String str) {
        int A002 = C09050Zv.A00(str);
        synchronized (this) {
            if (!(A002 == -3 || A002 == -2)) {
                if (A002 == -1) {
                    return true;
                }
                if (C09050Zv.A02(A002)) {
                    boolean z = this.A02.get(A002);
                    return z;
                }
            }
        }
    }
}
