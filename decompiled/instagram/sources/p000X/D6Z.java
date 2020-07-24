package p000X;

/* renamed from: X.D6Z */
public final class D6Z extends D8G implements Comparable {
    public long A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        D6Z d6z = (D6Z) obj;
        boolean A02 = A02();
        if (A02 == d6z.A02()) {
            long j = this.A00 - d6z.A00;
            if (j == 0) {
                j = this.A00 - d6z.A00;
                if (j == 0) {
                    return 0;
                }
            }
            if (j > 0) {
                return 1;
            }
            return -1;
        } else if (A02) {
            return 1;
        } else {
            return -1;
        }
    }
}
