package p000X;

import java.util.Arrays;

/* renamed from: X.BJP */
public final class BJP {
    public final int A00 = 129;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BJP) {
                BJP bjp = (BJP) obj;
                if (!C228589vH.A00(this.A01, bjp.A01) || !C228589vH.A00(this.A02, bjp.A02) || !C228589vH.A00((Object) null, (Object) null) || this.A00 != bjp.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, null, Integer.valueOf(this.A00)});
    }

    public BJP(String str, String str2) {
        AnonymousClass0a2.A04(str);
        this.A01 = str;
        AnonymousClass0a2.A04(str2);
        this.A02 = str2;
    }

    public final String toString() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        throw null;
    }
}
