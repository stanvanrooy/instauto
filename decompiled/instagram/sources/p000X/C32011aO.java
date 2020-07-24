package p000X;

import android.net.Uri;
import java.util.Objects;

/* renamed from: X.1aO  reason: invalid class name and case insensitive filesystem */
public final class C32011aO {
    public Uri A00;
    public final String A01;
    public final String A02;

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A02, this.A01, this.A00});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r1.equals(r6.A01) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r1.equals(r6.A00) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1.equals(r6.A02) == false) goto L_0x0014;
     */
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!(obj instanceof C32011aO)) {
            return false;
        }
        C32011aO r6 = (C32011aO) obj;
        String str = this.A02;
        if (str != null) {
            z = true;
        }
        z = false;
        String str2 = this.A01;
        if (str2 != null) {
            z2 = true;
        }
        z2 = false;
        Uri uri = this.A00;
        if (uri != null) {
            z3 = true;
        }
        z3 = false;
        if (z || z2 || z3) {
            return true;
        }
        return false;
    }

    public C32011aO(String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
    }
}
