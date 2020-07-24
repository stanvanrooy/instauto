package p000X;

/* renamed from: X.BSA */
public final class BSA {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BSA)) {
            return false;
        }
        BSA bsa = (BSA) obj;
        return this.A01.equals(bsa.A01) && this.A02.equals(bsa.A02) && this.A00 == bsa.A00;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00;
    }

    public BSA(String str, String str2, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
