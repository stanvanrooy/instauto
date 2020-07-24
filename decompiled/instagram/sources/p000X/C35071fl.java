package p000X;

/* renamed from: X.1fl  reason: invalid class name and case insensitive filesystem */
public abstract class C35071fl {
    public int A00 = 600;
    public boolean A01 = false;
    public boolean A02 = false;
    public boolean A03 = true;
    public final String A04;
    public final short A05;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C35071fl)) {
            return false;
        }
        return ((C35071fl) obj).A04.equals(this.A04);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public C35071fl(String str) {
        this.A04 = str;
        this.A05 = (short) str.hashCode();
    }
}
