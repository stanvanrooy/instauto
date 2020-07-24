package p000X;

/* renamed from: X.D4u */
public final class D4u {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final boolean A04;

    public final String toString() {
        String format = String.format("<S t=\"%d\" d=\"%d\"/>", new Object[]{Long.valueOf(this.A03), Long.valueOf(this.A02)});
        if (this.A04) {
            return AnonymousClass000.A0E(format, " (p) ");
        }
        return format;
    }

    public D4u(long j, long j2, boolean z, int i, int i2) {
        this.A03 = j;
        this.A02 = j2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = z;
    }
}
