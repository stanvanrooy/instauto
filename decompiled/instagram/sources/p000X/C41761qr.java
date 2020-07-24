package p000X;

import android.util.Pair;

/* renamed from: X.1qr  reason: invalid class name and case insensitive filesystem */
public final class C41761qr {
    public Pair A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C41761qr)) {
            return false;
        }
        C41761qr r4 = (C41761qr) obj;
        if (!r4.A00.equals(this.A00) || r4.A01 != this.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.A00.hashCode()) * 31) + (this.A01 ? 1 : 0);
    }

    public final String toString() {
        return "[" + this.A00.first + "," + this.A00.second + "] ";
    }

    public C41761qr(Pair pair, boolean z) {
        this.A00 = pair;
        this.A01 = z;
    }
}
