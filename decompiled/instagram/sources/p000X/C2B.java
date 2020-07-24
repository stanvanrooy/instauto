package p000X;

import java.io.Serializable;

/* renamed from: X.C2B */
public final class C2B implements Serializable {
    public static final C2B A01 = new C2B(new String("#disabled"));
    public static final C2B A02 = new C2B("");
    public final String A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C2B c2b = (C2B) obj;
                String str = this.A00;
                if (str == null) {
                    if (c2b.A00 != null) {
                        return false;
                    }
                } else if (!str.equals(c2b.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C2B(String str) {
        this.A00 = str == null ? "" : str;
    }

    public final String toString() {
        return this.A00;
    }
}
