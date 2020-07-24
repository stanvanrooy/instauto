package p000X;

import java.util.List;
import java.util.Objects;

/* renamed from: X.0jK  reason: invalid class name and case insensitive filesystem */
public final class C13850jK {
    public static Boolean A02;
    public String A00;
    public List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C13850jK r5 = (C13850jK) obj;
            if (!Objects.equals(this.A00, r5.A00) || !Objects.equals(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A00, this.A01});
    }
}
