package p000X;

/* renamed from: X.B6A */
public final class B6A extends B66 {
    public long A00 = -1;
    public long A01 = -1;

    public B6A() {
        super(true);
    }

    public final void A01() {
        super.A01();
        long j = this.A01;
        if (j == -1) {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        } else if (j > 0) {
            long j2 = this.A00;
            if (j2 == -1) {
                this.A00 = (long) (((float) j) * 0.1f);
            } else if (j2 < 0) {
                throw new IllegalArgumentException(AnonymousClass000.A0E("Flex set cannot be less than 0: ", Long.toString(j2)));
            } else if (j2 > j) {
                this.A00 = j;
            }
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A0E("Period set cannot be less than or equal to 0: ", Long.toString(j)));
        }
    }
}
