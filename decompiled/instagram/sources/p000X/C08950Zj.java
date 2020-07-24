package p000X;

import java.util.Locale;

/* renamed from: X.0Zj  reason: invalid class name and case insensitive filesystem */
public final class C08950Zj implements Comparable {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r5.A02) == false) goto L_0x001e;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C08950Zj r5 = (C08950Zj) obj;
            String str = this.A02;
            if (str == null) {
                if (r5.A02 != null) {
                    return false;
                }
            }
            if (this.A03.equals(r5.A03) && this.A01.equals(r5.A01)) {
                String str2 = this.A00;
                if (str2 != null) {
                    if (!str2.equals(r5.A00)) {
                        return false;
                    }
                } else if (r5.A00 != null) {
                    return false;
                }
                String str3 = this.A04;
                String str4 = r5.A04;
                if (str3 != null) {
                    return str3.equals(str4);
                }
                return str4 == null;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C08950Zj r3 = (C08950Zj) obj;
        int compareTo = this.A03.compareTo(r3.A03);
        if (compareTo == 0) {
            return this.A01.compareTo(r3.A01);
        }
        return compareTo;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.A02;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((((i * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (hashCode + i2) * 31;
        String str3 = this.A04;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        return String.format(Locale.US, "[name: %s, hash: %s, id: %s, downloadUri: %s, path: %s]", new Object[]{this.A03, this.A01, this.A02, this.A00, this.A04});
    }

    public C08950Zj(String str, String str2, String str3, String str4, String str5) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = str4;
        this.A04 = str5;
    }
}
