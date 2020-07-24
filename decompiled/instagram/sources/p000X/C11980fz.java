package p000X;

import java.util.Objects;

/* renamed from: X.0fz  reason: invalid class name and case insensitive filesystem */
public final class C11980fz {
    public int A00;
    public long A01;
    public long A02;
    public boolean A03;
    public boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C11980fz r7 = (C11980fz) obj;
            if (!(this.A04 == r7.A04 && this.A03 == r7.A03 && this.A01 == r7.A01 && this.A02 == r7.A02 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.A04), Boolean.valueOf(this.A03), Long.valueOf(this.A01), Long.valueOf(this.A02), Integer.valueOf(this.A00)});
    }

    public static void A00(C11980fz r2, C11980fz r3) {
        r2.A04 = r3.A04;
        r2.A03 = r3.A03;
        r2.A01 = r3.A01;
        r2.A02 = r3.A02;
        r2.A00 = r3.A00;
    }

    public C11980fz() {
        this.A04 = true;
        this.A03 = false;
        this.A01 = -1;
        this.A02 = -1;
        this.A00 = 0;
    }

    public C11980fz(C11980fz r1) {
        A00(this, r1);
    }
}
