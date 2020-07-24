package p000X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1Lz  reason: invalid class name and case insensitive filesystem */
public final class C28501Lz {
    public static final C28501Lz A03 = new C28501Lz(0, 0, Collections.emptyList());
    public final int A00;
    public final int A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C28501Lz r5 = (C28501Lz) obj;
            if (this.A01 == r5.A01 && this.A00 == r5.A00) {
                List list = this.A02;
                if (list != null) {
                    return list.equals(r5.A02);
                }
                return r5.A02 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = ((this.A01 * 31) + this.A00) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        return "EntryCriteria{initialContentIndex=" + this.A01 + ", entryPointIndex=" + this.A00 + ", organicContentIds=" + this.A02 + '}';
    }

    public C28501Lz(int i, int i2, List list) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = Collections.unmodifiableList(list);
    }
}
