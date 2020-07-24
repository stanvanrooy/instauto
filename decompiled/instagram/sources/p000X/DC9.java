package p000X;

/* renamed from: X.DC9 */
public final class DC9 extends DC8 {
    public final long A00;

    public DC9(long j, long j2, long j3, long j4) {
        super(j3, j4);
        this.A00 = (j3 * 8000) / (j2 - j);
    }
}
