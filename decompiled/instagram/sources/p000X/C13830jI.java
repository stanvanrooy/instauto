package p000X;

import java.util.HashMap;
import java.util.Objects;

/* renamed from: X.0jI  reason: invalid class name and case insensitive filesystem */
public final class C13830jI {
    public HashMap A00 = new HashMap();

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A00});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.A00, ((C13830jI) obj).A00);
    }
}
