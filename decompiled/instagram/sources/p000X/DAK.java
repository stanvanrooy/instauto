package p000X;

import java.util.Arrays;

/* renamed from: X.DAK */
public final class DAK {
    public int A00;
    public final int A01;
    public final D4t[] A02;

    public final D4t[] A00() {
        return (D4t[]) this.A02.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((DAK) obj).A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = 527 + Arrays.hashCode(this.A02);
        }
        return this.A00;
    }

    public DAK(D4t... d4tArr) {
        this.A02 = d4tArr;
        this.A01 = d4tArr.length;
    }
}
