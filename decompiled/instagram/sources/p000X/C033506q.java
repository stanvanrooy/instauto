package p000X;

/* renamed from: X.06q  reason: invalid class name and case insensitive filesystem */
public final class C033506q {
    public final long A00;
    public final long A01;
    public final String A02;

    public C033506q(long j, long j2, String str) {
        long j3 = j;
        if (j >= 0) {
            long j4 = j2;
            if (j2 < 0) {
                throw new IllegalArgumentException("maxDelayMs < 0");
            } else if (j <= j2) {
                this.A01 = j;
                this.A00 = j2;
                this.A02 = str;
            } else {
                throw new IllegalArgumentException(AnonymousClass000.A0D("minDelay=", j3, "; maxDelay=", j4));
            }
        } else {
            throw new IllegalArgumentException("minDelayMs < 0");
        }
    }
}
