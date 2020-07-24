package p000X;

/* renamed from: X.DFA */
public final class DFA {
    public static int A00(C29886DEv dEv, boolean z) {
        int i;
        int i2;
        byte b;
        if (z) {
            i = dEv.A00;
        } else {
            i = dEv.A01;
        }
        if (z) {
            i2 = dEv.A01;
        } else {
            i2 = dEv.A00;
        }
        byte[][] bArr = dEv.A02;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = 0;
            byte b2 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                if (z) {
                    b = bArr[i4][i6];
                } else {
                    b = bArr[i6][i4];
                }
                if (b == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    i5 = 1;
                    b2 = b;
                }
            }
            if (i5 >= 5) {
                i3 += (i5 - 5) + 3;
            }
        }
        return i3;
    }
}
