package p000X;

import java.io.Serializable;

/* renamed from: X.C1n */
public final class C1n implements Serializable {
    public String A00;
    public final Class A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && obj.getClass() == getClass() && this.A01 == ((C1n) obj).A01;
        }
        return true;
    }

    public final String toString() {
        String A0J;
        String name = this.A01.getName();
        String str = this.A00;
        if (str == null) {
            A0J = "null";
        } else {
            A0J = AnonymousClass000.A0J("'", str, "'");
        }
        return AnonymousClass000.A0O("[NamedType, class ", name, ", name: ", A0J, "]");
    }

    public C1n(Class cls, String str) {
        this.A01 = cls;
        this.A02 = cls.getName().hashCode();
        this.A00 = (str == null || str.length() == 0) ? null : str;
    }

    public final int hashCode() {
        return this.A02;
    }
}
