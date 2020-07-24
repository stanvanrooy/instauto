package p000X;

import java.util.Set;

/* renamed from: X.22h  reason: invalid class name and case insensitive filesystem */
public final class C471122h {
    public final Integer A00;
    public final Integer A01;
    public final Set A02;
    public final Set A03;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r1.equals(r5.A03) == false) goto L_0x002a;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C471122h r5 = (C471122h) obj;
            if (this.A01 == r5.A01 && this.A00 == r5.A00) {
                Set set = this.A03;
                if (set == null) {
                    if (r5.A03 != null) {
                        return false;
                    }
                }
                Set set2 = this.A02;
                if (set2 != null) {
                    return set2.equals(r5.A02);
                }
                return r5.A02 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        Integer num = this.A01;
        int i4 = 0;
        if (num != null) {
            i = AnonymousClass2NA.A00(num).hashCode() + num.intValue();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        Integer num2 = this.A00;
        if (num2 != null) {
            i2 = AnonymousClass2NB.A00(num2).hashCode() + num2.intValue();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Set set = this.A03;
        if (set != null) {
            i3 = set.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Set set2 = this.A02;
        if (set2 != null) {
            i4 = set2.hashCode();
        }
        return i7 + i4;
    }

    public C471122h(Integer num, Integer num2, Set set, Set set2) {
        this.A01 = num;
        this.A00 = num2;
        this.A03 = set;
        this.A02 = set2;
    }
}
