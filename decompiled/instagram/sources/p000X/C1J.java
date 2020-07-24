package p000X;

/* renamed from: X.C1J */
public final class C1J {
    public int A00;
    public C0L A01;
    public Class A02;
    public boolean A03;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj == this) {
                return true;
            }
            if (obj.getClass() == getClass()) {
                C1J c1j = (C1J) obj;
                if (c1j.A03 == this.A03) {
                    Class cls = this.A02;
                    if (cls == null) {
                        return this.A01.equals(c1j.A01);
                    }
                    if (c1j.A02 == cls) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb;
        Class cls = this.A02;
        if (cls != null) {
            sb = new StringBuilder("{class: ");
            sb.append(cls.getName());
        } else {
            sb = new StringBuilder("{type: ");
            sb.append(this.A01);
        }
        sb.append(", typed? ");
        sb.append(this.A03);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        return this.A00;
    }

    public C1J(C0L c0l, boolean z) {
        this.A01 = c0l;
        this.A02 = null;
        this.A03 = z;
        int hashCode = c0l.hashCode() - 1;
        this.A00 = z ? hashCode - 1 : hashCode;
    }

    public C1J(Class cls, boolean z) {
        this.A02 = cls;
        this.A01 = null;
        this.A03 = z;
        int hashCode = cls.getName().hashCode();
        this.A00 = z ? hashCode + 1 : hashCode;
    }
}
