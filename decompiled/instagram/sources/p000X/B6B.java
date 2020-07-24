package p000X;

/* renamed from: X.B6B */
public final class B6B extends B66 {
    public long A00 = -1;
    public long A01 = -1;

    public B6B() {
        super(false);
    }

    public final void A01() {
        super.A01();
        long j = this.A01;
        if (j != -1) {
            long j2 = this.A00;
            if (j2 != -1) {
                if (j < 0 || j2 < 0) {
                    throw new IllegalArgumentException("Window start and end cannot be negative.");
                } else if (j >= j2) {
                    throw new IllegalArgumentException("Window start must be shorter than window end.");
                } else {
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
    }
}
