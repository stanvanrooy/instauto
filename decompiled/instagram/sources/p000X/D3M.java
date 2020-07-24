package p000X;

/* renamed from: X.D3M */
public final class D3M {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public final String toString() {
        return "SegmentInfo -> size: " + this.A02 + ", duration: " + this.A01 + ", bitrate: " + this.A00;
    }

    public D3M(long j, long j2, long j3, long j4) {
        this.A03 = j2;
        this.A01 = j3;
        if (j > 0) {
            this.A02 = j;
            this.A00 = (j * 8000000) / j3;
        } else if (j4 > 0) {
            this.A02 = (j3 * j4) / 8000000;
            this.A00 = j4;
        } else {
            this.A02 = j;
            this.A00 = j4;
        }
    }
}
