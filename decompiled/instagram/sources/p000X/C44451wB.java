package p000X;

import java.util.Arrays;

/* renamed from: X.1wB  reason: invalid class name and case insensitive filesystem */
public final class C44451wB {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final int A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C44451wB)) {
            return false;
        }
        C44451wB r7 = (C44451wB) obj;
        if (this.A00) {
            return r7.A05.equals(this.A05);
        }
        if (r7.A03 == this.A03 && r7.A01 == this.A01 && r7.A02 == this.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00) {
            return this.A04;
        }
        return toString().hashCode();
    }

    public final String toString() {
        if (this.A00) {
            return this.A05;
        }
        return this.A03 + ":" + this.A01 + ":" + this.A02;
    }

    public C44451wB(boolean z, long j, int i, int i2) {
        this.A03 = j;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = z;
        this.A05 = j + ":" + i + ":" + i2;
        this.A04 = Arrays.hashCode(new Object[]{Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
    }
}
