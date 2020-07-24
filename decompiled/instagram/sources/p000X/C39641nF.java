package p000X;

import android.util.Pair;
import java.util.Comparator;

/* renamed from: X.1nF  reason: invalid class name and case insensitive filesystem */
public final class C39641nF implements Comparator {
    public C37651k0 A00;
    public final boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        if (r3 == 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007f, code lost:
        if (r0 == false) goto L_0x0081;
     */
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C37651k0 r6 = (C37651k0) ((C37461jh) obj).A02;
        Pair pair = r6.A00;
        Integer num = (Integer) pair.second;
        int intValue = num.intValue();
        C37651k0 r5 = (C37651k0) ((C37461jh) obj2).A02;
        Pair pair2 = r5.A00;
        Object obj3 = pair2.second;
        int intValue2 = ((Integer) obj3).intValue();
        boolean z = true;
        boolean z2 = false;
        if (intValue < 0) {
            z2 = true;
        }
        boolean z3 = false;
        if (intValue2 < 0) {
            z3 = true;
        }
        if (z2 == z3) {
            z = false;
        }
        int i = 1;
        if (!z) {
            if (num.equals(obj3)) {
                int intValue3 = ((Integer) pair.first).intValue();
                int intValue4 = ((Integer) this.A00.A00.first).intValue();
                intValue = intValue3 - intValue4;
                intValue2 = ((Integer) pair2.first).intValue() - intValue4;
                boolean z4 = true;
                boolean z5 = false;
                if (intValue < 0) {
                    z5 = true;
                }
                boolean z6 = false;
                if (intValue2 < 0) {
                    z6 = true;
                }
                if (z5 == z6) {
                    z4 = false;
                }
                if (!z4) {
                    if (this.A01) {
                        Integer num2 = r6.A01;
                        Integer num3 = Constants.A0C;
                        boolean z7 = false;
                        if (num2 == num3) {
                            z7 = true;
                        }
                        boolean z8 = false;
                        if (r5.A01 == num3) {
                            z8 = true;
                        }
                        if (z7 && !z8) {
                            i = -1;
                        } else if (!z7) {
                            i = 1;
                        }
                    }
                    i = 0;
                }
            }
            return Math.abs(intValue) - Math.abs(intValue2);
        }
        if (intValue >= 0) {
            return -1;
        }
        return i;
    }

    public C39641nF(C37651k0 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
