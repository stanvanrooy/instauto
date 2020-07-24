package p000X;

/* renamed from: X.07s  reason: invalid class name and case insensitive filesystem */
public final class C036207s {
    public long A00;
    public long A01;
    public long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C036207s r7 = (C036207s) obj;
            if (!(this.A00 == r7.A00 && this.A02 == r7.A02 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = this.A02;
        long j3 = this.A01;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C036207s() {
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public C036207s(C036207s r3) {
        this.A00 = r3.A00;
        this.A02 = r3.A02;
        this.A01 = r3.A01;
    }
}
