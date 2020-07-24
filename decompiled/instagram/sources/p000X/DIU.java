package p000X;

/* renamed from: X.DIU */
public final class DIU {
    public static final DIU A04 = new DIU(-1, -1, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.A03 + ", channelCount=" + this.A01 + ", encoding=" + this.A02 + ']';
    }

    public DIU(int i, int i2, int i3) {
        int i4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (C25948Bd0.A0B(i3)) {
            i4 = C25948Bd0.A01(i3, i2);
        } else {
            i4 = -1;
        }
        this.A00 = i4;
    }
}
