package p000X;

import java.util.Arrays;

/* renamed from: X.C9D */
public final class C9D implements Comparable {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9D c9d = (C9D) obj;
            if (this.A00 != c9d.A00 || !AnonymousClass17M.A00(this.A01, c9d.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00)});
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00 - ((C9D) obj).A00;
    }

    public C9D(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
