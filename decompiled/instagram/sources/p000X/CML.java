package p000X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.CML */
public final class CML {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CML)) {
            return false;
        }
        return this.A01.equals(((CML) obj).A01);
    }
}
