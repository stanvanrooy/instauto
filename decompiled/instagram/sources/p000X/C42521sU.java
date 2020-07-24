package p000X;

/* renamed from: X.1sU  reason: invalid class name and case insensitive filesystem */
public final class C42521sU implements AnonymousClass1GJ {
    public final /* synthetic */ boolean A00;
    public final /* synthetic */ boolean A01;

    public C42521sU(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r4 <= 0.0d) goto L_0x0039;
     */
    public final int Bdo(int i, AnonymousClass18O r9) {
        double d;
        int i2;
        if (this.A00 && !r9.A01.contains(".jpg?")) {
            return -1;
        }
        if (this.A01) {
            C15700nO A002 = C15700nO.A00();
            synchronized (A002) {
                d = A002.A01;
            }
        } else {
            d = C15700nO.A00().A01();
        }
        if (d < 125.0d) {
            i2 = 6;
        }
        i2 = -1;
        if (i2 == -1) {
            return i;
        }
        if (i != -1) {
            return Math.min(i, i2);
        }
        return i2;
    }
}
