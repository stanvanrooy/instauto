package p000X;

import android.util.Pair;

/* renamed from: X.1k0  reason: invalid class name and case insensitive filesystem */
public class C37651k0 {
    public final Pair A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C37651k0)) {
            return false;
        }
        return ((C37651k0) obj).A00.equals(this.A00);
    }

    public int hashCode() {
        return 527 + this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C37651k0(Pair pair, Integer num) {
        this.A00 = pair;
        this.A01 = num;
    }
}
