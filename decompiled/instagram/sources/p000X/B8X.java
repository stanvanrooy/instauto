package p000X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.B8X */
public final class B8X {
    public final int A00;
    public final C25216B8b A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final String A00() {
        if (!this.A04.isEmpty()) {
            return (String) this.A04.iterator().next();
        }
        throw new IllegalStateException("Invalid AppIdentity object: no package names");
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("AppIdentity{uid=");
        sb.append(this.A00);
        sb.append(", packageNames=");
        sb.append(this.A04);
        sb.append(", sha1=");
        C25216B8b b8b = this.A01;
        if (b8b == null) {
            str = "null";
        } else {
            str = b8b.A00;
        }
        sb.append(str);
        sb.append(", sha2=");
        if (b8b == null) {
            str2 = "null";
        } else {
            str2 = b8b.A01;
        }
        sb.append(str2);
        sb.append(AnonymousClass40t.$const$string(10));
        String str3 = this.A03;
        if (str3 == null) {
            str3 = "null";
        }
        sb.append(str3);
        sb.append(", domain=");
        String str4 = this.A02;
        if (str4 == null) {
            str4 = "null";
        }
        sb.append(str4);
        sb.append('}');
        return sb.toString();
    }

    public B8X(int i, List list, C25216B8b b8b, String str, String str2) {
        this.A00 = i;
        this.A04 = Collections.unmodifiableList(list);
        this.A01 = b8b;
        this.A03 = str;
        this.A02 = str2;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one package name is required");
        }
    }
}
