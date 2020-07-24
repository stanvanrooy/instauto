package p000X;

/* renamed from: X.0hu  reason: invalid class name and case insensitive filesystem */
public abstract class C13110hu {
    public int A00;
    public int A01;

    public final String A00() {
        int i = this.A01;
        if (i == 0) {
            return "ROOT";
        }
        if (i == 1) {
            return "ARRAY";
        }
        if (i != 2) {
            return "?";
        }
        return "OBJECT";
    }

    public final boolean A01() {
        if (this.A01 == 2) {
            return true;
        }
        return false;
    }
}
