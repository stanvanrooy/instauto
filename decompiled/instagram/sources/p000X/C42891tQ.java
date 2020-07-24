package p000X;

import java.util.Arrays;

/* renamed from: X.1tQ  reason: invalid class name and case insensitive filesystem */
public final class C42891tQ {
    public int A00;
    public int A01;
    public int A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42891tQ)) {
            return false;
        }
        C42891tQ r4 = (C42891tQ) obj;
        return this.A00 == r4.A00 && this.A02 == r4.A02 && this.A01 == r4.A01;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A02), Integer.valueOf(this.A01)});
    }

    public C42891tQ() {
    }

    public C42891tQ(int i, int i2) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = 0;
    }
}
