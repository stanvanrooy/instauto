package p000X;

/* renamed from: X.ACE */
public final class ACE implements A9W {
    public final ACF A00 = new ACF();
    public final ACF A01 = new ACF();
    public final ACF A02 = new ACF();
    public final ACF A03 = new ACF();
    public volatile boolean A04 = true;

    public final synchronized void BVi() {
        this.A02.A01(System.nanoTime());
    }

    public final synchronized void BVj() {
        this.A03.A01(System.nanoTime());
    }

    public static void A00(ACF acf, long j) {
        int i = acf.A00;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (acf.A00(i4) < j) {
                i3++;
            }
        }
        if (i3 > 0) {
            while (i2 < i - i3) {
                long A002 = acf.A00(i2 + i3);
                int i5 = acf.A00;
                if (i2 < i5) {
                    acf.A01[i2] = A002;
                    i2++;
                } else {
                    throw new IndexOutOfBoundsException(AnonymousClass000.A07("", i2, " >= ", i5));
                }
            }
            int i6 = acf.A00;
            if (i3 <= i6) {
                acf.A00 = i6 - i3;
                return;
            }
            throw new IndexOutOfBoundsException(AnonymousClass000.A07("Trying to drop ", i3, " items from array of length ", i6));
        }
    }
}
