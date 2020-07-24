package p000X;

import java.util.List;

/* renamed from: X.1eN  reason: invalid class name and case insensitive filesystem */
public final class C34261eN {
    public Integer A00;
    public String A01;
    public String A02;
    public List A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r1.equals(r5.A01) == false) goto L_0x0028;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34261eN) {
            C34261eN r5 = (C34261eN) obj;
            if (this.A07 == r5.A07 && this.A06 == r5.A06 && this.A05 == r5.A05) {
                String str = this.A01;
                if (str == null) {
                    if (r5.A01 != null) {
                        return false;
                    }
                }
                String str2 = this.A02;
                if (str2 != null) {
                    if (!str2.equals(r5.A02)) {
                        return false;
                    }
                } else if (r5.A02 != null) {
                    return false;
                }
                Integer num = this.A00;
                if (num != null) {
                    if (!num.equals(r5.A00)) {
                        return false;
                    }
                } else if (r5.A00 != null) {
                    return false;
                }
                List list = this.A03;
                if (list != null) {
                    if (!list.equals(r5.A03)) {
                        return false;
                    }
                } else if (r5.A03 != null) {
                    return false;
                }
                List list2 = this.A04;
                if (list2 != null) {
                    return list2.equals(r5.A04);
                }
                return r5.A04 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.A01;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        Integer num = this.A00;
        if (num != null) {
            i3 = num.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (((i7 + i3) * 31) + (this.A07 ? 1 : 0)) * 31;
        List list = this.A03;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        List list2 = this.A04;
        if (list2 != null) {
            i5 = list2.hashCode();
        }
        return ((((i9 + i5) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0);
    }

    public C34261eN() {
    }

    public C34261eN(String str, String str2, int i, boolean z, List list, List list2, boolean z2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = Integer.valueOf(i);
        this.A07 = z;
        this.A03 = list;
        this.A04 = list2;
        this.A06 = z2;
    }
}
